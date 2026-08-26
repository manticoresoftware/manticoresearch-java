package com.manticoresearch.client.api;

import com.manticoresearch.client.JSON;
import com.manticoresearch.client.model.SearchResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * A response property the client does not know must not be fatal.
 *
 * Manticore Search adds response fields between releases, and the compatibility table in the
 * README promises that an older client stays PARTIALLY compatible with a newer server. That
 * promise is only keepable if an unknown property is ignored rather than thrown on: with
 * FAIL_ON_UNKNOWN_PROPERTIES enabled, one new field costs the caller the entire response, not
 * just the field.
 *
 * The schema agrees — `searchResponse`, `aggBucketsResult` and `aggBucket` all declare
 * `additionalProperties: true` — and the generated Python client honours it. This test holds the
 * Java client to the same contract.
 */
public class UnknownResponsePropertyTest {

    @Test
    public void anUnknownTopLevelPropertyIsIgnored() throws Exception {
        SearchResponse response = JSON.getDefault().getMapper().readValue(
            "{\"took\":3,\"timed_out\":false,\"some_field_from_a_newer_server\":42,"
                + "\"hits\":{\"total\":1,\"total_relation\":\"eq\",\"hits\":[]}}",
            SearchResponse.class);

        assertEquals(3, response.getTook());
        assertNotNull(response.getHits());
        assertEquals(1, response.getHits().getTotal());
    }

    @Test
    public void anUnknownNestedPropertyIsIgnored() throws Exception {
        SearchResponse response = JSON.getDefault().getMapper().readValue(
            "{\"took\":0,\"timed_out\":false,"
                + "\"hits\":{\"total\":0,\"total_relation\":\"eq\",\"hits\":[]},"
                + "\"aggregations\":{\"a\":{\"buckets\":[],\"a_future_field\":\"x\"}}}",
            SearchResponse.class);

        assertNotNull(response.getAggregations().get("a"));
    }
}
