package com.manticoresearch.client.api;

import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiResponse;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.Pair;

import javax.ws.rs.core.GenericType;

import com.manticoresearch.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T16:12:17.895346Z[Etc/UTC]")
public class UtilsApi {
  private ApiClient apiClient;

  public UtilsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UtilsApi(ApiClient apiClient) {
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
   * Perform SQL requests
   * Run a query in SQL format. Expects a query string passed through &#x60;body&#x60; parameter and optional &#x60;raw_response&#x60; parameter that defines a format of response. &#x60;raw_response&#x60; can be set to &#x60;False&#x60; for Select queries only, e.g., &#x60;SELECT * FROM myindex&#x60; The query string must stay as it is, no URL encoding is needed. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
   * @param body A query parameter string.  (required)
   * @param rawResponse Optional parameter, defines a format of response. Can be set to &#x60;False&#x60; for Select only queries and set to &#x60;True&#x60; or omitted for any type of queries:  (optional, default to true)
   * @return List&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Connecting_to_the_server/HTTP#sql-api">Perform SQL requests Documentation</a>
   */
  public List<Object> sql(String body, Boolean rawResponse) throws ApiException {
    return sqlWithHttpInfo(body, rawResponse).getData();
  }

  /**
   * Perform SQL requests
   * Run a query in SQL format. Expects a query string passed through &#x60;body&#x60; parameter and optional &#x60;raw_response&#x60; parameter that defines a format of response. &#x60;raw_response&#x60; can be set to &#x60;False&#x60; for Select queries only, e.g., &#x60;SELECT * FROM myindex&#x60; The query string must stay as it is, no URL encoding is needed. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
   * @param body A query parameter string.  (required)
   * @param rawResponse Optional parameter, defines a format of response. Can be set to &#x60;False&#x60; for Select only queries and set to &#x60;True&#x60; or omitted for any type of queries:  (optional, default to true)
   * @return ApiResponse&lt;List&lt;Object&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> error </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://manual.manticoresearch.com/Connecting_to_the_server/HTTP#sql-api">Perform SQL requests Documentation</a>
   */
  public ApiResponse<List<Object>> sqlWithHttpInfo(String body, Boolean rawResponse) throws ApiException {
    // Check required parameters
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling sql");
    }
    
    if  (!rawResponse) {
		body = "query=" + apiClient.escapeString(body); 
	} else {
		body = "mode=raw&query=" + apiClient.escapeString(body);
	}

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "raw_response", rawResponse)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("text/plain");
    GenericType<List<Object>> localVarReturnType = new GenericType<List<Object>>() {};
    if (!rawResponse) {
    	ApiResponse<Map<String, Object>> res = apiClient.invokeAPI("UtilsApi.sql", "/sql", "POST", localVarQueryParams, body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, new GenericType<Map<String, Object>>() {}, false);
    	/*ApiResponse<Map<String, Object>> res = apiClient.invokeAPI("UtilsApi.sql", "/sql", "POST", localVarQueryParams, body,
            new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
        	null, new GenericType<Map<String, Object>>() {}, false);*/
        List<Object> resList = new ArrayList<Object>();
        resList.add(res.getData());
    	return new ApiResponse<List<Object>>(res.getStatusCode(), res.getHeaders(), resList);
    }
    return apiClient.invokeAPI("UtilsApi.sql", "/sql", "POST", localVarQueryParams, body,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
