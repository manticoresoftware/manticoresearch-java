# UtilsApi

All URIs are relative to *http://127.0.0.1:9308*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sql**](UtilsApi.md#sql) | **POST** /sql | Perform SQL requests



## sql

> Map&lt;String, Array&gt; sql(body, rawResponse)

Perform SQL requests

Run a query in SQL format.
Expects a query string passed through `body` parameter and `rawResponse` parameter that defines a format of response:
* `rawResponse` parameter can be set to false for Select only queries, e.g., `SELECT * FROM mytable`.  
* `rawResponse` parameter can be set to true for any type of query (including Select qieries as well) , e.g., `SHOW TABLES`.
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

        UtilsApi utilsApi = new UtilsApi(defaultClient);
 
        try {
            Object sqlresult =  utilsApi.sql("SHOW TABLES");
            System.out.println(sqlresult);  
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| A query string.  |
 **rawResponse** | **Boolean**| Defines a format of response. Can be set to false for Select only queries or set to true for any queries (including Select queries).  |

### Return type

**Map&lt;String, Array&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: text/plain
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | In case of SELECT-only in mode none the response schema is the same as of &#x60;search&#x60;. In case of &#x60;mode&#x3D;raw&#x60; the response depends on the query executed.  |  -  |
| **0** | error |  -  |

