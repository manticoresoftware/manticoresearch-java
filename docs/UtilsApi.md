# UtilsApi

All URIs are relative to *http://127.0.0.1:9308*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sql**](UtilsApi.md#sql) | **POST** /sql | Perform SQL requests |



## sql

> SqlResponse sql(body, rawResponse)

Perform SQL requests

Run a query in SQL format.
Expects a query string passed through `body` parameter and optional `raw_response` parameter that defines a format of response.
`raw_response` can be set to `False` for Select queries only, e.g., `SELECT * FROM myindex`
The query string must stay as it is, no URL encoding is needed.
The response object depends on the query executed. In select mode the response has same format as `/search` operation.


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.UtilsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        UtilsApi apiInstance = new UtilsApi(defaultClient);
        String body = SHOW TABLES; // String | A query parameter string. 
        Boolean rawResponse = true; // Boolean | Optional parameter, defines a format of response. Can be set to `False` for Select only queries and set to `True` for any type of queries. Default value is 'True'. 
        try {
            SqlResponse result = apiInstance.sql(body, rawResponse);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilsApi#sql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**| A query parameter string.  | |
| **rawResponse** | **Boolean**| Optional parameter, defines a format of response. Can be set to &#x60;False&#x60; for Select only queries and set to &#x60;True&#x60; for any type of queries. Default value is &#39;True&#39;.  | [optional] [default to true] |

### Return type

[**SqlResponse**](SqlResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; or &#x60;raw_response&#x3D;true&#x60; the response depends on the query executed.  |  -  |
| **0** | error |  -  |

