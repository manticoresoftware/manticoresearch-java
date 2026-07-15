# IndexApi

All URIs are relative to *http://127.0.0.1:9308*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk**](IndexApi.md#bulk) | **POST** /json/bulk | Bulk index operations
[**delete**](IndexApi.md#delete) | **POST** /json/delete | Delete a document in a table
[**insert**](IndexApi.md#insert) | **POST** /json/insert | Create a new document in a table
[**replace**](IndexApi.md#replace) | **POST** /json/replace | Replace new document in a table
[**update**](IndexApi.md#update) | **POST** /json/update | Update a document in a table



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
  {"insert": {"table": "movies", "doc": {"plot": "A secret team goes to North Pole", "rating": 9.5, "language": [2, 3], "title": "This is an older movie", "lon": 51.99, "meta": {"keywords":["travel","ice"],"genre":["adventure"]}, "year": 1950, "lat": 60.4, "advise": "PG-13"}}}
  \n
  {"delete": {"table": "movies","id":700}}
  ```
  
  Responds with an object telling whenever any errors occured and an array with status for each operation:
  
  ```
  {'items':[{'update':{'table':'products','_id':1,'result':'updated'}},{'update':{'table':'products','_id':2,'result':'updated'}}],'errors':false}
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
        IndexApi indexApi = new IndexApi(defaultClient);
        try {
             String body = "{\"insert\": {\"table\" : \"products\", \"id\" : 3, \"doc\" : {\"title\" : \"Crossbody Bag with Tassel\", \"price\" : 19.85}}}" +"\n"+"{\"delete\":{\"index\" : \"movies\", \"id\" : 701}}"+"\n"+
                      "{\"insert\": {\"table\" : \"products\", \"id\" : 4, \"doc\" : {\"title\" : \"microfiber sheet set\", \"price\" : 19.99}}}"+"\n"+
                      "{\"insert\": {\"table\" : \"products\", \"id\" : 5, \"doc\" : {\"title\" : \"CPet Hair Remover Glove\", \"price\" : 7.99}}}"+"\n";         
            BulkResponse bulkresult = indexApi.bulk(body);
        
            System.out.println(bulkresult);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  |

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

Delete a document in a table

Delete one or several documents.
The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete .
Example of input to delete by id:

  ```
  {'table':'movies','id':100}
  ```

Example of input to delete using a query:

  ```
  {'table':'movies','query':{'bool':{'must':[{'query_string':'new movie'}]}}}
  ```

The match query has same syntax as in for searching.
Responds with an object telling how many documents got deleted: 

  ```
  {'table':'products','updated':1}
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

        IndexApi indexApi = new IndexApi(defaultClient);

        try {
            DeleteDocumentRequest deleteRequest = new DeleteDocumentRequest();
            query = new HashMap<String,Object>();
            query.put("match",new HashMap<String,Object>(){{
                put("*","dummy");
            }});
            deleteRequest.table("products").setQuery(query); 
            Oject result = indexApi.delete(deleteRequest);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteDocumentRequest** | [**DeleteDocumentRequest**](DeleteDocumentRequest.md)|  |

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

Create a new document in a table

Insert a document. 
Expects an object like:
 
  ```
  {'table':'movies','id':701,'doc':{'title':'This is an old movie','plot':'A secret team goes to North Pole','year':1950,'rating':9.5,'lat':60.4,'lon':51.99,'advise':'PG-13','meta':'{"keywords":{"travel","ice"},"genre":{"adventure"}}','language':[2,3]}}
  ```
 
The document id can also be missing, in which case an autogenerated one will be used:
         
  ```
  {'table':'movies','doc':{'title':'This is a new movie','plot':'A secret team goes to North Pole','year':2020,'rating':9.5,'lat':60.4,'lon':51.99,'advise':'PG-13','meta':'{"keywords":{"travel","ice"},"genre":{"adventure"}}','language':[2,3]}}
  ```
 
It responds with an object in format:
  
  ```
  {'table':'products','_id':701,'created':true,'result':'created','status':201}
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

        IndexApi indexApi = new IndexApi(defaultClient);
        try {
            InsertDocumentRequest newdoc = new InsertDocumentRequest();
            HashMap<String,Object> doc = new HashMap<String,Object>(){{
                put("title","first");
                put("tags1",new int[] {4,2,1,3});
            }};
            newdoc.table("products").id(1L).setDoc(doc); 
            Object result = indexApi.insert(newdoc);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertDocumentRequest** | [**InsertDocumentRequest**](InsertDocumentRequest.md)|  |

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

Replace new document in a table

Replace an existing document. Input has same format as `insert` operation. <br/>
Responds with an object in format: <br/>

  ```
  {'table':'products','_id':1,'created':false,'result':'updated','status':200}
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

        IndexApi indexApi = new IndexApi(defaultClient);

        try {
            InsertDocumentRequest docRequest = new InsertDocumentRequest();
            doc = new HashMap<String,Object>(){{
                put("title","document one");
                put("price",10);
            }};
            docRequest.table("products").id(1L).setDoc(doc); 
            Object result = indexApi.replace(docRequest);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertDocumentRequest** | [**InsertDocumentRequest**](InsertDocumentRequest.md)|  |

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

Update a document in a table

Update one or several documents.
The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:

  ```
  {'table':'movies','doc':{'rating':9.49},'id':100}
  ```

And update by using a match query:

  ```
  {'table':'movies','doc':{'rating':9.49},'query':{'bool':{'must':[{'query_string':'new movie'}]}}}
  ``` 

The match query has same syntax as for searching.
Responds with an object that tells how many documents where updated in format: 

  ```
  {'table':'products','updated':1}
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

        IndexApi indexApi = new IndexApi(defaultClient);
        
        try {
            UpdateDocumentRequest updatedoc = new UpdateDocumentRequest();
            doc = new HashMap<String,Object >(){{
                put("price",10);
            }};
            updatedoc.table("products").id(1L).setDoc(doc); 
            Object result =  indexApi.update(updatedoc);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDocumentRequest** | [**UpdateDocumentRequest**](UpdateDocumentRequest.md)|  |

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

