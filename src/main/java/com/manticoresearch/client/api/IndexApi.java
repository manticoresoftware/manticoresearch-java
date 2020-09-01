/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.ApiCallback;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.ApiResponse;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.Pair;
import com.manticoresearch.client.ProgressRequestBody;
import com.manticoresearch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.manticoresearch.client.model.BulkResponse;
import com.manticoresearch.client.model.DeleteDocumentRequest;
import com.manticoresearch.client.model.DeleteResponse;
import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.InsertDocumentRequest;
import com.manticoresearch.client.model.SuccessResponse;
import com.manticoresearch.client.model.UpdateDocumentRequest;
import com.manticoresearch.client.model.UpdateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexApi {
    private ApiClient localVarApiClient;

    public IndexApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IndexApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for bulk
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Bulk index operations Documentation</a>
     */
    public okhttp3.Call bulkCall(String body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/json/bulk";

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
            "application/x-ndjson"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkValidateBeforeCall(String body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling bulk(Async)");
        }
        

        okhttp3.Call localVarCall = bulkCall(body, _callback);
        return localVarCall;

    }

    /**
     * Bulk index operations
     * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {&#39;items&#39;:[{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}},{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}}],&#39;errors&#39;:false}   &#x60;&#x60;&#x60;   
     * @param body  (required)
     * @return BulkResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Bulk index operations Documentation</a>
     */
    public BulkResponse bulk(String body) throws ApiException {
        ApiResponse<BulkResponse> localVarResp = bulkWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Bulk index operations
     * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {&#39;items&#39;:[{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}},{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}}],&#39;errors&#39;:false}   &#x60;&#x60;&#x60;   
     * @param body  (required)
     * @return ApiResponse&lt;BulkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Bulk index operations Documentation</a>
     */
    public ApiResponse<BulkResponse> bulkWithHttpInfo(String body) throws ApiException {
        okhttp3.Call localVarCall = bulkValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<BulkResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Bulk index operations (asynchronously)
     * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;index\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {&#39;items&#39;:[{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}},{&#39;update&#39;:{&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}}],&#39;errors&#39;:false}   &#x60;&#x60;&#x60;   
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Bulk index operations Documentation</a>
     */
    public okhttp3.Call bulkAsync(String body, final ApiCallback<BulkResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<BulkResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param deleteDocumentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Delete a document in an index Documentation</a>
     */
    public okhttp3.Call deleteCall(DeleteDocumentRequest deleteDocumentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = deleteDocumentRequest;

        // create path and map variables
        String localVarPath = "/json/delete";

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
    private okhttp3.Call deleteValidateBeforeCall(DeleteDocumentRequest deleteDocumentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'deleteDocumentRequest' is set
        if (deleteDocumentRequest == null) {
            throw new ApiException("Missing the required parameter 'deleteDocumentRequest' when calling delete(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCall(deleteDocumentRequest, _callback);
        return localVarCall;

    }

    /**
     * Delete a document in an index
     * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param deleteDocumentRequest  (required)
     * @return DeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Delete a document in an index Documentation</a>
     */
    public DeleteResponse delete(DeleteDocumentRequest deleteDocumentRequest) throws ApiException {
        ApiResponse<DeleteResponse> localVarResp = deleteWithHttpInfo(deleteDocumentRequest);
        return localVarResp.getData();
    }

    /**
     * Delete a document in an index
     * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param deleteDocumentRequest  (required)
     * @return ApiResponse&lt;DeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Delete a document in an index Documentation</a>
     */
    public ApiResponse<DeleteResponse> deleteWithHttpInfo(DeleteDocumentRequest deleteDocumentRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(deleteDocumentRequest, null);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a document in an index (asynchronously)
     * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param deleteDocumentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Delete a document in an index Documentation</a>
     */
    public okhttp3.Call deleteAsync(DeleteDocumentRequest deleteDocumentRequest, final ApiCallback<DeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(deleteDocumentRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for insert
     * @param insertDocumentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Create a new document in an index Documentation</a>
     */
    public okhttp3.Call insertCall(InsertDocumentRequest insertDocumentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = insertDocumentRequest;

        // create path and map variables
        String localVarPath = "/json/insert";

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
    private okhttp3.Call insertValidateBeforeCall(InsertDocumentRequest insertDocumentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'insertDocumentRequest' is set
        if (insertDocumentRequest == null) {
            throw new ApiException("Missing the required parameter 'insertDocumentRequest' when calling insert(Async)");
        }
        

        okhttp3.Call localVarCall = insertCall(insertDocumentRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a new document in an index
     * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:701,&#39;doc&#39;:{&#39;title&#39;:&#39;This is an old movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:1950,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;title&#39;:&#39;This is a new movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:2020,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @return SuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Create a new document in an index Documentation</a>
     */
    public SuccessResponse insert(InsertDocumentRequest insertDocumentRequest) throws ApiException {
        ApiResponse<SuccessResponse> localVarResp = insertWithHttpInfo(insertDocumentRequest);
        return localVarResp.getData();
    }

    /**
     * Create a new document in an index
     * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:701,&#39;doc&#39;:{&#39;title&#39;:&#39;This is an old movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:1950,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;title&#39;:&#39;This is a new movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:2020,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @return ApiResponse&lt;SuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Create a new document in an index Documentation</a>
     */
    public ApiResponse<SuccessResponse> insertWithHttpInfo(InsertDocumentRequest insertDocumentRequest) throws ApiException {
        okhttp3.Call localVarCall = insertValidateBeforeCall(insertDocumentRequest, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new document in an index (asynchronously)
     * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;id&#39;:701,&#39;doc&#39;:{&#39;title&#39;:&#39;This is an old movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:1950,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;title&#39;:&#39;This is a new movie&#39;,&#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,&#39;year&#39;:2020,&#39;rating&#39;:9.5,&#39;lat&#39;:60.4,&#39;lon&#39;:51.99,&#39;advise&#39;:&#39;PG-13&#39;,&#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,&#39;language&#39;:[2,3]}}   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Create a new document in an index Documentation</a>
     */
    public okhttp3.Call insertAsync(InsertDocumentRequest insertDocumentRequest, final ApiCallback<SuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = insertValidateBeforeCall(insertDocumentRequest, _callback);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for replace
     * @param insertDocumentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Replace new document in an index Documentation</a>
     */
    public okhttp3.Call replaceCall(InsertDocumentRequest insertDocumentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = insertDocumentRequest;

        // create path and map variables
        String localVarPath = "/json/replace";

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
    private okhttp3.Call replaceValidateBeforeCall(InsertDocumentRequest insertDocumentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'insertDocumentRequest' is set
        if (insertDocumentRequest == null) {
            throw new ApiException("Missing the required parameter 'insertDocumentRequest' when calling replace(Async)");
        }
        

        okhttp3.Call localVarCall = replaceCall(insertDocumentRequest, _callback);
        return localVarCall;

    }

    /**
     * Replace new document in an index
     * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. &lt;br/&gt; Responds with an object in format: &lt;br/&gt;    &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @return SuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Replace new document in an index Documentation</a>
     */
    public SuccessResponse replace(InsertDocumentRequest insertDocumentRequest) throws ApiException {
        ApiResponse<SuccessResponse> localVarResp = replaceWithHttpInfo(insertDocumentRequest);
        return localVarResp.getData();
    }

    /**
     * Replace new document in an index
     * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. &lt;br/&gt; Responds with an object in format: &lt;br/&gt;    &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @return ApiResponse&lt;SuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Replace new document in an index Documentation</a>
     */
    public ApiResponse<SuccessResponse> replaceWithHttpInfo(InsertDocumentRequest insertDocumentRequest) throws ApiException {
        okhttp3.Call localVarCall = replaceValidateBeforeCall(insertDocumentRequest, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Replace new document in an index (asynchronously)
     * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. &lt;br/&gt; Responds with an object in format: &lt;br/&gt;    &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
     * @param insertDocumentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_insert.html">Replace new document in an index Documentation</a>
     */
    public okhttp3.Call replaceAsync(InsertDocumentRequest insertDocumentRequest, final ApiCallback<SuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceValidateBeforeCall(insertDocumentRequest, _callback);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param updateDocumentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Update a document in an index Documentation</a>
     */
    public okhttp3.Call updateCall(UpdateDocumentRequest updateDocumentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateDocumentRequest;

        // create path and map variables
        String localVarPath = "/json/update";

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
    private okhttp3.Call updateValidateBeforeCall(UpdateDocumentRequest updateDocumentRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'updateDocumentRequest' is set
        if (updateDocumentRequest == null) {
            throw new ApiException("Missing the required parameter 'updateDocumentRequest' when calling update(Async)");
        }
        

        okhttp3.Call localVarCall = updateCall(updateDocumentRequest, _callback);
        return localVarCall;

    }

    /**
     * Update a document in an index
     * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param updateDocumentRequest  (required)
     * @return UpdateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Update a document in an index Documentation</a>
     */
    public UpdateResponse update(UpdateDocumentRequest updateDocumentRequest) throws ApiException {
        ApiResponse<UpdateResponse> localVarResp = updateWithHttpInfo(updateDocumentRequest);
        return localVarResp.getData();
    }

    /**
     * Update a document in an index
     * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param updateDocumentRequest  (required)
     * @return ApiResponse&lt;UpdateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Update a document in an index Documentation</a>
     */
    public ApiResponse<UpdateResponse> updateWithHttpInfo(UpdateDocumentRequest updateDocumentRequest) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(updateDocumentRequest, null);
        Type localVarReturnType = new TypeToken<UpdateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a document in an index (asynchronously)
     * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {&#39;index&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;query&#39;:{&#39;bool&#39;:{&#39;must&#39;:[{&#39;query_string&#39;:&#39;new movie&#39;}]}}}   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;_index&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     * @param updateDocumentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> item updated </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
     * 
     * @see <a href="https://docs.manticoresearch.com/latest/html/http_reference/json_update.html">Update a document in an index Documentation</a>
     */
    public okhttp3.Call updateAsync(UpdateDocumentRequest updateDocumentRequest, final ApiCallback<UpdateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(updateDocumentRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
