# SearchApi

All URIs are relative to *http://127.0.0.1:9308*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **POST** /search | Performs a search
[**percolate**](SearchApi.md#percolate) | **POST** /pq/{table}/search | Perform a reverse search on a percolate table
[**autocomplete**](SearchApi.md#autocomplete) | **POST** /autocomplete | Performs an autocomplete search on a table

## search

> SearchResponse search(searchRequest)

Performs a search on a table. 

The method expects a SearchRequest object with the following mandatory properties:
        
* the name of the table to search | string
        
For details, see the documentation on [**SearchRequest**](SearchRequest.md)

The method returns an object with the following properties:
        
- hits: an object with the following properties:
  - hits: an array of hit objects, where each hit object represents a matched document. Each hit object has the following properties:
    - _id: the ID of the matched document.
    - _score: the score of the matched document.
    - _source: the source data of the matched document.
  - total: the total number of hits found.
- timed_out: a boolean indicating whether the query timed out.
- took: the time taken to execute the search query.

In addition, if profiling is enabled, the response will include an additional array with profiling information attached.

Here is an example search response:
```
{
  'took':10,
  'timed_out':false,
  'hits':
  {
    'total':2,
    'hits':
    [
      {
        '_id':'1',
        '_score':1,
        '_source':{'gid':11}
      },
      {
        '_id':'2',
        '_score':1,
        '_source':{'gid':12}
      }
    ]
  }
}
```

For more information about the match query syntax, additional parameters that can be set to request and response, please check: https://manual.manticoresearch.com/Searching/Full_text_matching/Basic_usage#HTTP-JSON.


### Example
```java

import java.util.*;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.SearchApi;

public class SearchApiExample {

    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath("http://127.0.0.1:9308");
        SearchApi searchApi = new SearchApi(client);
        try {
            // Create SearchRequest
            SearchRequest searchRequest = new SearchRequest();
            searchRequest.setTable("test");
            SearchQuery query = new SearchQuery();
			query.setQueryString("find smth");
			
			// Perform a search
			SearchResponse searchResponse = searchApi.search(searchRequest);
			System.out.println( searchResponse.toString() );
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#search");
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)|  |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description |
|-------------|-------------|
| **200** | Success, query processed |
| **500** | Server error |


## percolate

> SearchResponse percolate(table, percolateRequest)

Perform a reverse search on a percolate table

This method must be used only on percolate tables.

Expects two parameters: the table name and an object with a document or an array of documents to search by.
Here is an example of the object with a single document:

```
{
  "query":
  {
    "percolate":
    {
      "document":
      {
        "content":"sample content"
      }
    }
  }
}
```

Responds with an object with matched stored queries: 

```
{
  'timed_out':false,
  'hits':
  {
    'total':2,
    'max_score':1,
    'hits':
    [
      {
        'table':'idx_pq_1',
        '_type':'doc',
        '_id':'2',
        '_score':'1',
        '_source':
        {
          'query':
          {
            'match':{'title':'some'}
          }
        }
      },
      {
        'table':'idx_pq_1',
        '_type':'doc',
        '_id':'5',
        '_score':'1',
        '_source':
        {
          'query':{'ql':'some | none'}
        }
      }
    ]
  }
}
```

And here is an example of the object with multiple documents:

```
{
  "query":
  {
    "percolate":
    {
      "documents": [
        {
          "content":"sample content"
        },
        {
          "content":"another sample content"
        }
      ]
    }
  }
}
```


### Example

```java
// Import classes:
import java.util.*;
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        SearchApi searchApi = new SearchApi(defaultClient);

        try {
            PercolateRequest percolateRequest = new PercolateRequest();
            Map<String,Object> query = new HashMap<String,Object>(){{
                put("percolate",new HashMap<String,Object >(){{
                    put("document", new HashMap<String,Object >(){{ 
                        put("title","what a nice bag");
                    }});
                }});
            }};
            percolateRequest.query(query);
            Object result =  searchApi.percolate("products",percolateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#percolate");
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
 **table** | **String**| Name of the percolate table |
 **percolateRequest** | [**PercolateRequest**](PercolateRequest.md)|  |

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description |
|-------------|-------------|
| **200** | Success, query processed |
| **500** | Server error |


## autocomplete

> List&lt;Object&gt; autocomplete(autocompleteRequest)

Performs an autocomplete search on a table


The method expects an object with the following mandatory properties:
* the name of the table to search
* the query string to autocomplete
For details, see the documentation on [**Autocomplete**](Autocomplete.md)
An example: ``` {
  "table":"table_name",
  "query":"query_beginning"
}         ```
An example of the method's response:

 ```
 [
   {
     "total": 3,
     "error": "",
     "warning": "",
     "columns": [
       {
         "query": {
           "type": "string"
         }
       }
     ],
     "data": [
       {
         "query": "hello"
       },
       {
         "query": "helio"
       },
       {
         "query": "hell"
       }
     ]
   }
 ] 
 ```

For more detailed information about the autocomplete queries, please refer to the documentation [here](https://manual.manticoresearch.com/Searching/Autocomplete).


### Example

```java
// Import classes:
import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://127.0.0.1:9308");

        SearchApi searchApi = new SearchApi(defaultClient);
        AutocompleteRequest autocompleteRequest = new AutocompleteRequest(); // AutocompleteRequest | 
        try {
            List<Object> result = searchApi.autocomplete(autocompleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#autocomplete");
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
| **autocompleteRequest** | [**AutocompleteRequest**](AutocompleteRequest.md)|  | |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | error |  -  |

