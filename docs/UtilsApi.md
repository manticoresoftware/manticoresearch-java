# UtilsApi

All URIs are relative to *http://127.0.0.1:9308*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sql**](UtilsApi.md#sql) | **POST** /sql | Perform SQL requests



## sql

> Map&lt;String, Object&gt; sql(body)

Perform SQL requests

Run a query in SQL format.
Expects a query parameters string that can be in two modes:
* Select only query as `query=SELECT * FROM myindex`. The query string MUST be URL encoded
* any type of query in format `mode=raw&query=SHOW TABLES`. The string must be as is (no URL encoding) and `mode` must be first.
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
            Object sqlresult =  utilsApi.sql("mode=raw&query=SHOW TABLES");
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
 **body** | **String**| Expects is a query parameters string that can be in two modes:    * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded    * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first.  |

### Return type

**Map&lt;String, Object&gt;**

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

