/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.api;

import org.manticoresearch.ApiCallback;
import org.manticoresearch.ApiClient;
import org.manticoresearch.ApiException;
import org.manticoresearch.ApiResponse;
import org.manticoresearch.Configuration;
import org.manticoresearch.Pair;
import org.manticoresearch.ProgressRequestBody;
import org.manticoresearch.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.manticoresearch.model.ErrorResponse;
import org.manticoresearch.model.PercolateRequest;
import org.manticoresearch.model.SearchRequest;
import org.manticoresearch.model.SearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for percolate
     * @param index Name of the percolate index (required)
     * @param percolateRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Perform reverse search on a percolate index Documentation</a>
     */
    public okhttp3.Call percolateCall(String index, PercolateRequest percolateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = percolateRequest;

        // create path and map variables
        String localVarPath = "/json/pq/{index}/search"
            .replaceAll("\\{" + "index" + "\\}", localVarApiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call percolateValidateBeforeCall(String index, PercolateRequest percolateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling percolate(Async)");
        }
        
        // verify the required parameter 'percolateRequest' is set
        if (percolateRequest == null) {
            throw new ApiException("Missing the required parameter 'percolateRequest' when calling percolate(Async)");
        }
        

        okhttp3.Call localVarCall = percolateCall(index, percolateRequest, _callback);
        return localVarCall;

    }

    /**
     * Perform reverse search on a percolate index
     * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two paramenters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
     * @param index Name of the percolate index (required)
     * @param percolateRequest  (required)
     * @return SearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Perform reverse search on a percolate index Documentation</a>
     */
    public SearchResponse percolate(String index, PercolateRequest percolateRequest) throws ApiException {
        ApiResponse<SearchResponse> localVarResp = percolateWithHttpInfo(index, percolateRequest);
        return localVarResp.getData();
    }

    /**
     * Perform reverse search on a percolate index
     * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two paramenters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
     * @param index Name of the percolate index (required)
     * @param percolateRequest  (required)
     * @return ApiResponse&lt;SearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Perform reverse search on a percolate index Documentation</a>
     */
    public ApiResponse<SearchResponse> percolateWithHttpInfo(String index, PercolateRequest percolateRequest) throws ApiException {
        okhttp3.Call localVarCall = percolateValidateBeforeCall(index, percolateRequest, null);
        Type localVarReturnType = new TypeToken<SearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform reverse search on a percolate index (asynchronously)
     * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two paramenters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {\&quot;query\&quot;:{\&quot;percolate\&quot;:{\&quot;document\&quot;:{\&quot;content\&quot;:\&quot;sample content\&quot;}}}}   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;max_score&#39;:1,&#39;hits&#39;:[{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;match&#39;:{&#39;title&#39;:&#39;some&#39;},}}},{&#39;_index&#39;:&#39;idx_pq_1&#39;,&#39;_type&#39;:&#39;doc&#39;,&#39;_id&#39;:&#39;5&#39;,&#39;_score&#39;:&#39;1&#39;,&#39;_source&#39;:{&#39;query&#39;:{&#39;ql&#39;:&#39;some | none&#39;}}}]}}   &#x60;&#x60;&#x60; 
     * @param index Name of the percolate index (required)
     * @param percolateRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Perform reverse search on a percolate index Documentation</a>
     */
    public okhttp3.Call percolateAsync(String index, PercolateRequest percolateRequest, final ApiCallback<SearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = percolateValidateBeforeCall(index, percolateRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for search
     * @param searchRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_search.html">Performs a search Documentation</a>
     */
    public okhttp3.Call searchCall(SearchRequest searchRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = searchRequest;

        // create path and map variables
        String localVarPath = "/json/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchValidateBeforeCall(SearchRequest searchRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'searchRequest' is set
        if (searchRequest == null) {
            throw new ApiException("Missing the required parameter 'searchRequest' when calling search(Async)");
        }
        

        okhttp3.Call localVarCall = searchCall(searchRequest, _callback);
        return localVarCall;

    }

    /**
     * Performs a search
     *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query timed out - an array with hits (matched documents) - additional, if profiling is enabled, an array with profiling information is attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  For more information about the match query syntax, additional paramaters that can be set to the input and response, please check: https://docs.manticoresearch.com/latest/html/http_reference/json_search.html. 
     * @param searchRequest  (required)
     * @return SearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_search.html">Performs a search Documentation</a>
     */
    public SearchResponse search(SearchRequest searchRequest) throws ApiException {
        ApiResponse<SearchResponse> localVarResp = searchWithHttpInfo(searchRequest);
        return localVarResp.getData();
    }

    /**
     * Performs a search
     *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query timed out - an array with hits (matched documents) - additional, if profiling is enabled, an array with profiling information is attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  For more information about the match query syntax, additional paramaters that can be set to the input and response, please check: https://docs.manticoresearch.com/latest/html/http_reference/json_search.html. 
     * @param searchRequest  (required)
     * @return ApiResponse&lt;SearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_search.html">Performs a search Documentation</a>
     */
    public ApiResponse<SearchResponse> searchWithHttpInfo(SearchRequest searchRequest) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchRequest, null);
        Type localVarReturnType = new TypeToken<SearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Performs a search (asynchronously)
     *  Expects an object with mandatory properties: * the index name * the match query object Example :    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39; movie&#39;}]}},&#39;script_fields&#39;:{&#39;myexpr&#39;:{&#39;script&#39;:{&#39;inline&#39;:&#39;IF(rating&gt;8,1,0)&#39;}}},&#39;sort&#39;:[{&#39;myexpr&#39;:&#39;desc&#39;},{&#39;_score&#39;:&#39;desc&#39;}],&#39;profile&#39;:true}   &#x60;&#x60;&#x60;  It responds with an object with: - time of execution - if the query timed out - an array with hits (matched documents) - additional, if profiling is enabled, an array with profiling information is attached     &#x60;&#x60;&#x60;   {&#39;took&#39;:10,&#39;timed_out&#39;:false,&#39;hits&#39;:{&#39;total&#39;:2,&#39;hits&#39;:[{&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},{&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}]}}   &#x60;&#x60;&#x60;  For more information about the match query syntax, additional paramaters that can be set to the input and response, please check: https://docs.manticoresearch.com/latest/html/http_reference/json_search.html. 
     * @param searchRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_search.html">Performs a search Documentation</a>
     */
    public okhttp3.Call searchAsync(SearchRequest searchRequest, final ApiCallback<SearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchValidateBeforeCall(searchRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
