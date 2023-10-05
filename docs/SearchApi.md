# SearchApi

All URIs are relative to *http://127.0.0.1:9308*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **POST** /search | Performs a search
[**percolate**](SearchApi.md#percolate) | **POST** /pq/{index}/search | Perform a reverse search on a percolate index

## search

> SearchResponse search(searchRequest)

Performs a search on an index. 

The method expects a SearchRequest object with the following mandatory properties:
        
* the name of the index to search | string
        
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
            searchRequest.setIndex("test");
            QueryFilter queryFilter = new QueryFilter();
			queryFilter.setQueryString("Title 1");								
			searchRequest.setFulltextFilter(queryFilter);
			
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

> SearchResponse percolate(index, percolateRequest)

Perform a reverse search on a percolate index

This method must be used only on percolate indexes.

Expects two parameters: the index name and an object with a document or an array of documents to search by.
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
        '_index':'idx_pq_1',
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
        '_index':'idx_pq_1',
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
 **index** | **String**| Name of the percolate index |
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

