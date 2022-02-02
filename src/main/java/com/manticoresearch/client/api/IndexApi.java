package com.manticoresearch.client.api;

import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiResponse;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.Pair;

import javax.ws.rs.core.GenericType;

import com.manticoresearch.client.model.BulkResponse;
import com.manticoresearch.client.model.DeleteDocumentRequest;
import com.manticoresearch.client.model.DeleteResponse;
import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.InsertDocumentRequest;
import com.manticoresearch.client.model.SuccessResponse;
import com.manticoresearch.client.model.UpdateDocumentRequest;
import com.manticoresearch.client.model.UpdateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IndexApi {
  private ApiClient apiClient;

  public IndexApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IndexApi(ApiClient apiClient) {
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
   * Bulk index operations
   * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {&#39;items&#39;:[{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}},{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}}],&#39;errors&#39;:false}   &#x60;&#x60;&#x60;   
   * @param body  (required)
   * @return BulkResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Bulk index operations Documentation</a>
   */
  public BulkResponse bulk(String body) throws ApiException {
    return bulkWithHttpInfo(body).getData();
  }

  /**
   * Bulk index operations
   * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {&#39;items&#39;:[{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}},{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}}],&#39;errors&#39;:false}   &#x60;&#x60;&#x60;   
   * @param body  (required)
   * @return ApiResponse&lt;BulkResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Bulk index operations Documentation</a>
   */
  public ApiResponse<BulkResponse> bulkWithHttpInfo(String body) throws ApiException {
      Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling bulk");
    }
    
    // create path and map variables
    String localVarPath = "/json/bulk";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-ndjson"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BulkResponse> localVarReturnType = new GenericType<BulkResponse>() {};

    return apiClient.invokeAPI("IndexApi.bulk", localVarPath, "POST", localVarQueryParams, localVarPostBody,
    	localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a document in an index
   * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
   * @param deleteDocumentRequest  (required)
   * @return DeleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Delete a document in an index Documentation</a>
   */
  public DeleteResponse delete(DeleteDocumentRequest deleteDocumentRequest) throws ApiException {
    return deleteWithHttpInfo(deleteDocumentRequest).getData();
  }

  /**
   * Delete a document in an index
   * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
   * @param deleteDocumentRequest  (required)
   * @return ApiResponse&lt;DeleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Delete a document in an index Documentation</a>
   */
  public ApiResponse<DeleteResponse> deleteWithHttpInfo(DeleteDocumentRequest deleteDocumentRequest) throws ApiException {
      Object localVarPostBody = deleteDocumentRequest;
    
    // verify the required parameter 'deleteDocumentRequest' is set
    if (deleteDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteDocumentRequest' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/json/delete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DeleteResponse> localVarReturnType = new GenericType<DeleteResponse>() {};

    return apiClient.invokeAPI("IndexApi.delete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
    	localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a new document in an index
   * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:701,&#39;doc&#39;:{&#39;title&#39;:&#39;This is an old movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:1950,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;title&#39;:&#39;This is a new movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:2020,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
   * @param insertDocumentRequest  (required)
   * @return SuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Adding_documents_to_an_index/Adding_documents_to_a_real-time_index#Adding-documents-to-a-real-time-index">Create a new document in an index Documentation</a>
   */
  public SuccessResponse insert(InsertDocumentRequest insertDocumentRequest) throws ApiException {
    return insertWithHttpInfo(insertDocumentRequest).getData();
  }

  /**
   * Create a new document in an index
   * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:701,&#39;doc&#39;:{&#39;title&#39;:&#39;This is an old movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:1950,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;title&#39;:&#39;This is a new movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:2020,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
   * @param insertDocumentRequest  (required)
   * @return ApiResponse&lt;SuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Adding_documents_to_an_index/Adding_documents_to_a_real-time_index#Adding-documents-to-a-real-time-index">Create a new document in an index Documentation</a>
   */
  public ApiResponse<SuccessResponse> insertWithHttpInfo(InsertDocumentRequest insertDocumentRequest) throws ApiException {
      Object localVarPostBody = insertDocumentRequest;
    
    // verify the required parameter 'insertDocumentRequest' is set
    if (insertDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'insertDocumentRequest' when calling insert");
    }
    
    // create path and map variables
    String localVarPath = "/json/insert";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessResponse> localVarReturnType = new GenericType<SuccessResponse>() {};

    return apiClient.invokeAPI("IndexApi.insert", localVarPath, "POST", localVarQueryParams, localVarPostBody,
    	localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Replace new document in an index
   * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. &lt;br/&gt; Responds with an object in format: &lt;br/&gt;    &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
   * @param insertDocumentRequest  (required)
   * @return SuccessResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Adding_documents_to_an_index/Adding_documents_to_a_real-time_index#Adding-documents-to-a-real-time-index">Replace new document in an index Documentation</a>
   */
  public SuccessResponse replace(InsertDocumentRequest insertDocumentRequest) throws ApiException {
    return replaceWithHttpInfo(insertDocumentRequest).getData();
  }

  /**
   * Replace new document in an index
   * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. &lt;br/&gt; Responds with an object in format: &lt;br/&gt;    &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
   * @param insertDocumentRequest  (required)
   * @return ApiResponse&lt;SuccessResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Adding_documents_to_an_index/Adding_documents_to_a_real-time_index#Adding-documents-to-a-real-time-index">Replace new document in an index Documentation</a>
   */
  public ApiResponse<SuccessResponse> replaceWithHttpInfo(InsertDocumentRequest insertDocumentRequest) throws ApiException {
      Object localVarPostBody = insertDocumentRequest;
    
    // verify the required parameter 'insertDocumentRequest' is set
    if (insertDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'insertDocumentRequest' when calling replace");
    }
    
    // create path and map variables
    String localVarPath = "/json/replace";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessResponse> localVarReturnType = new GenericType<SuccessResponse>() {};

    return apiClient.invokeAPI("IndexApi.replace", localVarPath, "POST", localVarQueryParams, localVarPostBody,
    	localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a document in an index
   * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
   * @param updateDocumentRequest  (required)
   * @return UpdateResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Update a document in an index Documentation</a>
   */
  public UpdateResponse update(UpdateDocumentRequest updateDocumentRequest) throws ApiException {
    return updateWithHttpInfo(updateDocumentRequest).getData();
  }

  /**
   * Update a document in an index
   * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
   * @param updateDocumentRequest  (required)
   * @return ApiResponse&lt;UpdateResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Updating_documents/UPDATE">Update a document in an index Documentation</a>
   */
  public ApiResponse<UpdateResponse> updateWithHttpInfo(UpdateDocumentRequest updateDocumentRequest) throws ApiException {
      Object localVarPostBody = updateDocumentRequest;
    
    // verify the required parameter 'updateDocumentRequest' is set
    if (updateDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDocumentRequest' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/json/update";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UpdateResponse> localVarReturnType = new GenericType<UpdateResponse>() {};

    return apiClient.invokeAPI("IndexApi.update", localVarPath, "POST", localVarQueryParams, localVarPostBody,
    	localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType, false);
  }
}
