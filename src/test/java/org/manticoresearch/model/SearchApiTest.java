/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.model;

import org.manticoresearch.ApiException;
import org.manticoresearch.api.ErrorResponse;
import org.manticoresearch.api.PercolateRequest;
import org.manticoresearch.api.SearchRequest;
import org.manticoresearch.api.SearchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Perform reverse search on a percolate index
     *
     * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two paramenters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void percolateTest() throws ApiException {
        String index = null;
        PercolateRequest percolateRequest = null;
        SearchResponse response = api.percolate(index, percolateRequest);

        // TODO: test validations
    }
    
    /**
     * Performs a search
     *
     *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query timed out - an array with hits (matched documents) - additional, if profiling is enabled, an array with profiling information is attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  For more information about the match query syntax, additional paramaters that can be set to the input and response, please check: https://docs.manticoresearch.com/latest/html/http_reference/json_search.html. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        SearchRequest searchRequest = null;
        SearchResponse response = api.search(searchRequest);

        // TODO: test validations
    }
    
}
