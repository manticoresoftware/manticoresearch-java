package com.manticoresearch.client.api;

import com.manticoresearch.client.JSON;
import com.manticoresearch.client.model.AggBucketsResult;
import com.manticoresearch.client.model.SearchResponse;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * `aggregations` carries two kinds of result, and the client must read both.
 *
 * A BUCKET aggregation (`terms`, `histogram`, `date_histogram`, `range`, `date_range`,
 * `composite`) answers with `buckets`; a METRIC aggregation (`min`, `max`, `sum`, `avg`,
 * `median_absolute_deviation`, `percentiles`, `percentile_ranks`) answers with `value` or
 * `values` and no `buckets` at all.
 *
 * The bodies below are verbatim responses from Manticore Search 29.0.2. A field absent from the
 * schema is unreadable at best; on the client as published, whose mapper rejects unknown
 * properties, a metric result costs the caller the whole search response rather than that one
 * aggregation.
 */
public class AggregationResultDeserializationTest {

    private static final String HEAD =
        "{\"took\":0,\"timed_out\":false,"
            + "\"hits\":{\"total\":5,\"total_relation\":\"eq\",\"hits\":[]},"
            + "\"aggregations\":{";

    private SearchResponse deserialize(String aggregations) throws Exception {
        return JSON.getDefault().getMapper().readValue(HEAD + aggregations + "}}", SearchResponse.class);
    }

    private AggBucketsResult aggregation(String body) throws Exception {
        SearchResponse response = deserialize("\"a\":" + body);
        assertNotNull(response.getAggregations(), "the response carries no aggregations at all");
        AggBucketsResult result = response.getAggregations().get("a");
        assertNotNull(result, "aggregation \"a\" is missing from the response");
        return result;
    }

    @Test
    public void percentilesAndPercentileRanksReturnValuesAsAnArray() throws Exception {
        AggBucketsResult result = aggregation(
            "{\"values\":[{\"key\":25,\"value\":18,\"value_as_string\":\"18\"},"
                + "{\"key\":50,\"value\":30.5,\"value_as_string\":\"30.5\"}]}");

        List<?> values = assertInstanceOf(List.class, result.getValues());
        assertEquals(2, values.size());
        Map<?, ?> first = assertInstanceOf(Map.class, values.get(0));
        assertEquals(25, first.get("key"));
        assertEquals("18", first.get("value_as_string"));
        assertNull(result.getBuckets(), "a metric result carries no buckets");
    }

    @Test
    public void keyedPercentilesReturnValuesAsAMap() throws Exception {
        AggBucketsResult result = aggregation("{\"values\":{\"25\":18,\"50\":30.5}}");

        Map<?, ?> values = assertInstanceOf(Map.class, result.getValues());
        assertEquals(18, values.get("25"));
    }

    @Test
    public void singleMetricsReturnAValue() throws Exception {
        AggBucketsResult result = aggregation("{\"value\":30.5}");

        assertEquals(30.5, result.getValue());
        assertNull(result.getValueAsString());
    }

    @Test
    public void medianAbsoluteDeviationAlsoReturnsValueAsString() throws Exception {
        AggBucketsResult result = aggregation("{\"value\":10,\"value_as_string\":\"10\"}");

        assertEquals(10, result.getValue());
        assertEquals("10", result.getValueAsString());
    }

    /**
     * An integer aggregation returns an exact integer, and `sum` or `max` over an int64 attribute
     * can leave the range a double represents exactly. Measured on Manticore Search 29.0.2:
     * `sum` over three int64 rows answered 18014398526259203, which is 2^54 + 3. Typing `value` as
     * a number would round it here, and would cost far more in the clients whose generator maps an
     * unformatted number to a 32-bit float.
     */
    @Test
    public void integerMetricsKeepTheirExactValue() throws Exception {
        AggBucketsResult result = aggregation("{\"value\":18014398526259203}");

        assertEquals(18014398526259203L, result.getValue());
    }

    @Test
    public void bucketResultsStillDeserialize() throws Exception {
        AggBucketsResult result = aggregation(
            "{\"buckets\":[{\"key\":\"x\",\"doc_count\":2},{\"key\":\"y\",\"doc_count\":2}]}");

        assertEquals(2, assertInstanceOf(List.class, result.getBuckets()).size());
        assertNull(result.getValue(), "a bucket result carries no metric value");
    }

    @Test
    public void compositeBucketsKeepTheirAfterKey() throws Exception {
        AggBucketsResult result = aggregation(
            "{\"after_key\":{\"c\":\"y\"},\"buckets\":[{\"key\":{\"c\":\"x\"},\"doc_count\":2}]}");

        assertEquals(Collections.singletonMap("c", "y"), result.getAfterKey());
    }

    @Test
    public void bucketAndMetricAggregationsCoexistInOneResponse() throws Exception {
        SearchResponse response = deserialize(
            "\"by_cat\":{\"buckets\":[{\"key\":\"x\",\"doc_count\":2}]},"
                + "\"avg_price\":{\"value\":30.5},"
                + "\"price_percentiles\":{\"values\":[{\"key\":50,\"value\":30.5,"
                + "\"value_as_string\":\"30.5\"}]}");

        assertEquals(3, response.getAggregations().size());
        assertNotNull(response.getAggregations().get("by_cat").getBuckets());
        assertEquals(30.5, response.getAggregations().get("avg_price").getValue());
        assertNotNull(response.getAggregations().get("price_percentiles").getValues());
    }
}
