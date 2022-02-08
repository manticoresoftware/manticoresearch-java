# manticoresearch

Low-level client for Manticore Search.


  For more information, please visit [https://manticoresearch.com/contact-us/](https://manticoresearch.com/contact-us/)


## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

Minimum Manticore Search version is > 4.0.2 with HTTP protocol enabled.

## Installation

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.manticoresearch</groupId>
  <artifactId>manticoresearch</artifactId>
  <version>3.0.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.manticoresearch:manticoresearch:3.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/manticoresearch-3.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.manticoresearch.client.ApiClient;
import com.manticoresearch.client.ApiException;
import com.manticoresearch.client.Configuration;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.IndexApi;
import com.manticoresearch.client.api.UtilsApi;
import com.manticoresearch.client.api.SearchApi;

public class SearchApiExample {

    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setBasePath("http://127.0.0.1:9308");
        SearchApi searchApi = new SearchApi(client);
        try {
            HashMap<String,Object> query = new HashMap<String,Object>();
            query.put("query_string","@title way* @content hey");
            searchRequest = new SearchRequest();
            searchRequest.setIndex("forum");
            searchRequest.setQuery(query);
            SearchResponse searchResponse =  searchApi.search(searchRequest);
            System.out.println(searchResponse);
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

## Documentation 

Full documentation is available in  [docs](https://github.com/manticoresoftware/manticoresearch-java/tree/master/docs) folder.

Manticore Search server documentation: https://manual.manticoresearch.com.

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:9308*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IndexApi* | [**bulk**](docs/IndexApi.md#bulk) | **POST** /json/bulk | Bulk index operations
*IndexApi* | [**delete**](docs/IndexApi.md#delete) | **POST** /json/delete | Delete a document in an index
*IndexApi* | [**insert**](docs/IndexApi.md#insert) | **POST** /json/insert | Create a new document in an index
*IndexApi* | [**replace**](docs/IndexApi.md#replace) | **POST** /json/replace | Replace new document in an index
*IndexApi* | [**update**](docs/IndexApi.md#update) | **POST** /json/update | Update a document in an index
*SearchApi* | [**percolate**](docs/SearchApi.md#percolate) | **POST** /json/pq/{index}/search | Perform reverse search on a percolate index
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /json/search | Performs a search
*UtilsApi* | [**sql**](docs/UtilsApi.md#sql) | **POST** /sql | Perform SQL requests


## Documentation for Models

 - [BulkResponse](docs/BulkResponse.md)
 - [DeleteDocumentRequest](docs/DeleteDocumentRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [InsertDocumentRequest](docs/InsertDocumentRequest.md)
 - [PercolateRequest](docs/PercolateRequest.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResponseHits](docs/SearchResponseHits.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [UpdateDocumentRequest](docs/UpdateDocumentRequest.md)
 - [UpdateResponse](docs/UpdateResponse.md)


## Author

info@manticoresearch.com

