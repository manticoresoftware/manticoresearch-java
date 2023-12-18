package com.manticoresearch.client.api;

import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiResponse;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.Pair;

import jakarta.ws.rs.core.GenericType;

import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.PercolateRequest;
import com.manticoresearch.client.model.SearchRequest;
import com.manticoresearch.client.model.SearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:24:55.908019234Z[Etc/UTC]")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Perform reverse search on a percolate index
   * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two parameters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {     \&quot;query\&quot;:     {       \&quot;percolate\&quot;:       {         \&quot;document\&quot;:         {           \&quot;content\&quot;:\&quot;sample content\&quot;         }       }     }   }   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;max_score&#39;:1,       &#39;hits&#39;:       [         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;2&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;match&#39;:{&#39;title&#39;:&#39;some&#39;}             }           }         },         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;5&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;ql&#39;:&#39;some | none&#39;             }           }         }       ]     }   }   &#x60;&#x60;&#x60; 
   * @param index Name of the percolate index (required)
   * @param percolateRequest  (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Perform reverse search on a percolate index Documentation</a>
   */
  public SearchResponse percolate(String index, PercolateRequest percolateRequest) throws ApiException {
    return percolateWithHttpInfo(index, percolateRequest).getData();
  }

  /**
   * Perform reverse search on a percolate index
   * Performs a percolate search.  This method must be used only on percolate indexes.  Expects two parameters: the index name and an object with array of documents to be tested. An example of the documents object:    &#x60;&#x60;&#x60;   {     \&quot;query\&quot;:     {       \&quot;percolate\&quot;:       {         \&quot;document\&quot;:         {           \&quot;content\&quot;:\&quot;sample content\&quot;         }       }     }   }   &#x60;&#x60;&#x60;  Responds with an object with matched stored queries:     &#x60;&#x60;&#x60;   {     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;max_score&#39;:1,       &#39;hits&#39;:       [         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;2&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;match&#39;:{&#39;title&#39;:&#39;some&#39;}             }           }         },         {           &#39;_index&#39;:&#39;idx_pq_1&#39;,           &#39;_type&#39;:&#39;doc&#39;,           &#39;_id&#39;:&#39;5&#39;,           &#39;_score&#39;:&#39;1&#39;,           &#39;_source&#39;:           {             &#39;query&#39;:             {               &#39;ql&#39;:&#39;some | none&#39;             }           }         }       ]     }   }   &#x60;&#x60;&#x60; 
   * @param index Name of the percolate index (required)
   * @param percolateRequest  (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> items found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Perform reverse search on a percolate index Documentation</a>
   */
  public ApiResponse<SearchResponse> percolateWithHttpInfo(String index, PercolateRequest percolateRequest) throws ApiException {
      Object localVarPostBody = percolateRequest;
    // Check required parameters
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling percolate");
    }
    if (percolateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'percolateRequest' when calling percolate");
    }

    // Path parameters
    String localVarPath = "/pq/{index}/search"
            .replaceAll("\\{index}", apiClient.escapeString(index));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
    return apiClient.invokeAPI("SearchApi.percolate", localVarPath, "POST", new ArrayList<>(), localVarPostBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Performs a search on an index
   *  The method expects an object with the following mandatory properties: * the name of the index to search * the match query object For details, see the documentation on [**SearchRequest**](SearchRequest.md) The method returns an object with the following properties: - took: the time taken to execute the search query. - timed_out: a boolean indicating whether the query timed out. - hits: an object with the following properties:    - total: the total number of hits found.    - hits: an array of hit objects, where each hit object represents a matched document. Each hit object has the following properties:      - _id: the ID of the matched document.      - _score: the score of the matched document.      - _source: the source data of the matched document.  In addition, if profiling is enabled, the response will include an additional array with profiling information attached. Here is an example search response:    &#x60;&#x60;&#x60;   {     &#39;took&#39;:10,     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;hits&#39;:       [         {&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},         {&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}       ]     }   }   &#x60;&#x60;&#x60;  For more information about the match query syntax and additional parameters that can be added to request and response, please see the documentation [here](https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON). 
   * @param searchRequest  (required)
   * @return SearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON">Performs a search on an index Documentation</a>
   */
  public SearchResponse search(SearchRequest searchRequest) throws ApiException {
    return searchWithHttpInfo(searchRequest).getData();
  }

  /**
   * Performs a search on an index
   *  The method expects an object with the following mandatory properties: * the name of the index to search * the match query object For details, see the documentation on [**SearchRequest**](SearchRequest.md) The method returns an object with the following properties: - took: the time taken to execute the search query. - timed_out: a boolean indicating whether the query timed out. - hits: an object with the following properties:    - total: the total number of hits found.    - hits: an array of hit objects, where each hit object represents a matched document. Each hit object has the following properties:      - _id: the ID of the matched document.      - _score: the score of the matched document.      - _source: the source data of the matched document.  In addition, if profiling is enabled, the response will include an additional array with profiling information attached. Here is an example search response:    &#x60;&#x60;&#x60;   {     &#39;took&#39;:10,     &#39;timed_out&#39;:false,     &#39;hits&#39;:     {       &#39;total&#39;:2,       &#39;hits&#39;:       [         {&#39;_id&#39;:&#39;1&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:11}},         {&#39;_id&#39;:&#39;2&#39;,&#39;_score&#39;:1,&#39;_source&#39;:{&#39;gid&#39;:12}}       ]     }   }   &#x60;&#x60;&#x60;  For more information about the match query syntax and additional parameters that can be added to request and response, please see the documentation [here](https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON). 
   * @param searchRequest  (required)
   * @return ApiResponse&lt;SearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Ok </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON">Performs a search on an index Documentation</a>
   */
  public ApiResponse<SearchResponse> searchWithHttpInfo(SearchRequest searchRequest) throws ApiException {
      Object localVarPostBody = searchRequest;
    // Check required parameters
    if (searchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'searchRequest' when calling search");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<SearchResponse> localVarReturnType = new GenericType<SearchResponse>() {};
    return apiClient.invokeAPI("SearchApi.search", "/search", "POST", new ArrayList<>(), localVarPostBody,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
