# Manticore Java client

❗ WARNING: this is a development version of the client. The latest release's readme is https://github.com/manticoresoftware/manticoresearch-java/tree/5.0.0

- API version: 5.0.0

- Build date: 2024-02-22T08:36:02.662182043Z[Etc/UTC]

Сlient for Manticore Search.

## Requirements

Building the API client library requires:

1. Java 17+
2. Maven/Gradle

| Manticore Search  | manticoresearch-java    |
| ----------------- | ----------------------- |
| dev               | manticoresearch-dev     |
| >= 6.2.0          | >= 3.3.1                |
| >= 2.5.1          | >= 2.0.2                |


## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.manticoresearch</groupId>
  <artifactId>manticoresearch-dev</artifactId>
  <version>5.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'manticoresearch' jar has been published to maven central.
    mavenLocal()       // Needed if the 'manticoresearch' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.manticoresearch:manticoresearch:5.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/manticoresearch-5.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.api.*;

public class ApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:9308*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IndexApi* | [**bulk**](docs/IndexApi.md#bulk) | **POST** /bulk | Bulk index operations
*IndexApi* | [**delete**](docs/IndexApi.md#delete) | **POST** /delete | Delete a document in an index
*IndexApi* | [**insert**](docs/IndexApi.md#insert) | **POST** /insert | Create a new document in an index
*IndexApi* | [**replace**](docs/IndexApi.md#replace) | **POST** /replace | Replace new document in an index
*IndexApi* | [**update**](docs/IndexApi.md#update) | **POST** /update | Update a document in an index
*IndexApi* | [**update_0**](docs/IndexApi.md#update_0) | **POST** /{index}/_update/{id} | Partially replaces a document in an index
*SearchApi* | [**percolate**](docs/SearchApi.md#percolate) | **POST** /pq/{index}/search | Perform reverse search on a percolate index
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /search | Performs a search on an index
*UtilsApi* | [**sql**](docs/UtilsApi.md#sql) | **POST** /sql | Perform SQL requests


## Documentation for Models

 - [Aggregation](docs/Aggregation.md)
 - [AggregationComposite](docs/AggregationComposite.md)
 - [AggregationCompositeSourcesInnerValue](docs/AggregationCompositeSourcesInnerValue.md)
 - [AggregationCompositeSourcesInnerValueTerms](docs/AggregationCompositeSourcesInnerValueTerms.md)
 - [AggregationSortInnerValue](docs/AggregationSortInnerValue.md)
 - [AggregationTerms](docs/AggregationTerms.md)
 - [BoolFilter](docs/BoolFilter.md)
 - [BulkResponse](docs/BulkResponse.md)
 - [DeleteDocumentRequest](docs/DeleteDocumentRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [EqualsFilter](docs/EqualsFilter.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Facet](docs/Facet.md)
 - [FilterBoolean](docs/FilterBoolean.md)
 - [FilterNumber](docs/FilterNumber.md)
 - [FilterString](docs/FilterString.md)
 - [GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [GeoDistanceFilterLocationAnchor](docs/GeoDistanceFilterLocationAnchor.md)
 - [Highlight](docs/Highlight.md)
 - [HighlightField](docs/HighlightField.md)
 - [InFilter](docs/InFilter.md)
 - [InsertDocumentRequest](docs/InsertDocumentRequest.md)
 - [KnnQueryByDocId](docs/KnnQueryByDocId.md)
 - [KnnQueryByVector](docs/KnnQueryByVector.md)
 - [MatchFilter](docs/MatchFilter.md)
 - [MatchOp](docs/MatchOp.md)
 - [MatchOpFilter](docs/MatchOpFilter.md)
 - [MatchPhraseFilter](docs/MatchPhraseFilter.md)
 - [NotFilterBoolean](docs/NotFilterBoolean.md)
 - [NotFilterNumber](docs/NotFilterNumber.md)
 - [NotFilterString](docs/NotFilterString.md)
 - [PercolateRequest](docs/PercolateRequest.md)
 - [PercolateRequestQuery](docs/PercolateRequestQuery.md)
 - [QueryFilter](docs/QueryFilter.md)
 - [RangeFilter](docs/RangeFilter.md)
 - [RangeFilterValue](docs/RangeFilterValue.md)
 - [ReplaceDocumentRequest](docs/ReplaceDocumentRequest.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchRequestKnn](docs/SearchRequestKnn.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResponseHits](docs/SearchResponseHits.md)
 - [SortMVA](docs/SortMVA.md)
 - [SortMultiple](docs/SortMultiple.md)
 - [SortOrder](docs/SortOrder.md)
 - [SourceByRules](docs/SourceByRules.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [UpdateDocumentRequest](docs/UpdateDocumentRequest.md)
 - [UpdateResponse](docs/UpdateResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
