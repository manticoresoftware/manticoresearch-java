package com.manticoresearch.client.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.manticoresearch.client.JSON;
import com.manticoresearch.client.model.Aggregation;
import com.manticoresearch.client.model.SearchRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchRequestSerializationTest {

    private JsonNode serialize(SearchRequest request) throws Exception {
        return JSON.getDefault().getMapper().readTree(
            JSON.getDefault().getMapper().writeValueAsString(request)
        );
    }

    @Test
    public void emptyAggregationsAreOmitted() throws Exception {
        SearchRequest request = new SearchRequest().table("products").limit(0);

        assertNotNull(request.getAggs());

        JsonNode json = serialize(request);
        assertFalse(json.has("aggs"));
        assertEquals(0, json.get("limit").asInt());
    }

    @Test
    public void populatedAggregationsAreSerialized() throws Exception {
        SearchRequest request = new SearchRequest().table("products");
        request.putAggsItem("by_category", new Aggregation());

        JsonNode json = serialize(request);
        assertTrue(json.has("aggs"));
        assertTrue(json.get("aggs").has("by_category"));
    }
}
