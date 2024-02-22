# IndexApi

All URIs are relative to *http://127.0.0.1:9308*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulk**](IndexApi.md#bulk) | **POST** /bulk | Bulk index operations |
| [**delete**](IndexApi.md#delete) | **POST** /delete | Delete a document in an index |
| [**insert**](IndexApi.md#insert) | **POST** /insert | Create a new document in an index |
| [**replace**](IndexApi.md#replace) | **POST** /replace | Replace new document in an index |
| [**update**](IndexApi.md#update) | **POST** /update | Update a document in an index |



## bulk

> BulkResponse bulk(body)

Bulk index operations

Sends multiple operatons like inserts, updates, replaces or deletes. 
For each operation it's object must have same format as in their dedicated method. 
The method expects a raw string as the batch in NDJSON.
 Each operation object needs to be serialized to 
 JSON and separated by endline (\n). 
 
  An example of raw input:
  
  ```
  {"insert": {"index": "movies", "doc": {"plot": "A secret team goes to North Pole", "rating": 9.5, "language": [2, 3], "title": "This is an older movie", "lon": 51.99, "meta": {"keywords":["travel","ice"],"genre":["adventure"]}, "year": 1950, "lat": 60.4, "advise": "PG-13"}}}
  \n
  {"delete": {"index": "movies","id":700}}
  ```
  
  Responds with an object telling whenever any errors occured and an array with status for each operation:
  
  ```
  {
    'items':
    [
      {
        'update':{'_index':'products','_id':1,'result':'updated'}
      },
      {
        'update':{'_index':'products','_id':2,'result':'updated'}
      }
    ],
    'errors':false
  }
  ```
 


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        IndexApi apiInstance = new IndexApi(defaultClient);
        String body = ["'{\"insert\": {\"index\": \"test\", \"id\": 1, \"doc\": {\"title\": \"Title 1\"}}},\\n{\"insert\": {\"index\": \"test\", \"id\": 2, \"doc\": {\"title\": \"Title 2\"}}}'"]; // String | 
        try {
            BulkResponse result = apiInstance.bulk(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#bulk");
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
| **body** | **String**|  | |

### Return type

[**BulkResponse**](BulkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-ndjson
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | item updated |  -  |
| **0** | error |  -  |


## delete

> DeleteResponse delete(deleteDocumentRequest)

Delete a document in an index

Delete one or several documents.
The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete .
Example of input to delete by id:

  ```
  {'index':'movies','id':100}
  ```

Example of input to delete using a query:

  ```
  {
    'index':'movies',
    'query':
    {
      'bool':
      {
        'must':
        [
          {'query_string':'new movie'}
        ]
      }
    }
  }
  ```

The match query has same syntax as in for searching.
Responds with an object telling how many documents got deleted: 

  ```
  {'_index':'products','updated':1}
  ```


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        IndexApi apiInstance = new IndexApi(defaultClient);
        DeleteDocumentRequest deleteDocumentRequest = new DeleteDocumentRequest(); // DeleteDocumentRequest | 
        try {
            DeleteResponse result = apiInstance.delete(deleteDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#delete");
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
| **deleteDocumentRequest** | [**DeleteDocumentRequest**](DeleteDocumentRequest.md)|  | |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | item updated |  -  |
| **0** | error |  -  |


## insert

> SuccessResponse insert(insertDocumentRequest)

Create a new document in an index

Insert a document. 
Expects an object like:
 
  ```
  {
    'index':'movies',
    'id':701,
    'doc':
    {
      'title':'This is an old movie',
      'plot':'A secret team goes to North Pole',
      'year':1950,
      'rating':9.5,
      'lat':60.4,
      'lon':51.99,
      'advise':'PG-13',
      'meta':'{"keywords":{"travel","ice"},"genre":{"adventure"}}',
      'language':[2,3]
    }
  }
  ```
 
The document id can also be missing, in which case an autogenerated one will be used:
         
  ```
  {
    'index':'movies',
    'doc':
    {
      'title':'This is a new movie',
      'plot':'A secret team goes to North Pole',
      'year':2020,
      'rating':9.5,
      'lat':60.4,
      'lon':51.99,
      'advise':'PG-13',
      'meta':'{"keywords":{"travel","ice"},"genre":{"adventure"}}',
      'language':[2,3]
    }
  }
  ```
 
It responds with an object in format:
  
  ```
  {'_index':'products','_id':701,'created':true,'result':'created','status':201}
  ```


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        IndexApi apiInstance = new IndexApi(defaultClient);
        InsertDocumentRequest insertDocumentRequest = new InsertDocumentRequest(); // InsertDocumentRequest | 
        try {
            SuccessResponse result = apiInstance.insert(insertDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#insert");
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
| **insertDocumentRequest** | [**InsertDocumentRequest**](InsertDocumentRequest.md)|  | |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | error |  -  |


## replace

> SuccessResponse replace(insertDocumentRequest)

Replace new document in an index

Replace an existing document. Input has same format as `insert` operation. <br/>
Responds with an object in format: <br/>

  ```
  {'_index':'products','_id':1,'created':false,'result':'updated','status':200}
  ```


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        IndexApi apiInstance = new IndexApi(defaultClient);
        InsertDocumentRequest insertDocumentRequest = new InsertDocumentRequest(); // InsertDocumentRequest | 
        try {
            SuccessResponse result = apiInstance.replace(insertDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#replace");
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
| **insertDocumentRequest** | [**InsertDocumentRequest**](InsertDocumentRequest.md)|  | |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | error |  -  |


## update

> UpdateResponse update(updateDocumentRequest)

Update a document in an index

Update one or several documents.
The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:

  ```
  {'index':'movies','doc':{'rating':9.49},'id':100}
  ```

And update by using a match query:

  ```
  {
    'index':'movies',
    'doc':{'rating':9.49},
    'query':
    {
      'bool':
      {
        'must':
        [
          {'query_string':'new movie'}
        ]
      }
    }
  }
  ``` 

The match query has same syntax as for searching.
Responds with an object that tells how many documents where updated in format: 

  ```
  {'_index':'products','updated':1}
  ```


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        IndexApi apiInstance = new IndexApi(defaultClient);
        UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest(); // UpdateDocumentRequest | 
        try {
            UpdateResponse result = apiInstance.update(updateDocumentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IndexApi#update");
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
| **updateDocumentRequest** | [**UpdateDocumentRequest**](UpdateDocumentRequest.md)|  | |

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | item updated |  -  |
| **0** | error |  -  |

