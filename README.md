# Manticore Java client

❗ WARNING: this is a development version of the client. The latest release's readme is https://github.com/manticoresoftware/manticoresearch-java/tree/6.0.0

❗ WARNING: the current version has breaking changes compared to the previous release https://github.com/manticoresoftware/manticoresearch-java/tree/5.0.0

Manticore Search Client

- API version: 6.0.0

- Build date: 2025-01-31T13:59:29.723520242Z[Etc/UTC]


## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle


## Compatibility Table

| **manticoresearch-java**       | **Manticore Search**                |  **Compatibility**       |
| ------------------------------ | ----------------------------------- |  ------------------------|
| `dev`                          | `dev` (latest development version)  |  ✅ Fully Compatible     |
| 6.0.0 or newer                 | 7.0.0 or newer                      |  ✅ Fully Compatible     |
| 6.0.0 or newer                 | 2.5.1 to 7.0.0                      |  ⚠️ Partially Compatible |
| 5.0.0 to 6.0.0                 | 6.3.6 to 7.0.0                      |  ✅ Fully Compatible     |
| 5.0.0 to 6.0.0                 | 2.5.1 to 6.3.6                      |  ⚠️ Partially Compatible |
| 3.3.1 to 5.0.0                 | 6.2.0 to 6.3.6                      |  ✅ Fully Compatible     |
| 3.3.1 to 5.0.0                 | 2.5.1 to 6.2.0                      |  ⚠️ Partially Compatible |
| 2.0.2 to 3.3.1                 | 2.5.1 to 6.2.0                      |  ✅ Fully Compatible     |


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
  <artifactId>manticoresearch</artifactId>
  <version>6.0.0</version>
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
     implementation "com.manticoresearch:manticoresearch:6.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/manticoresearch-6.0.0.jar`
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
        String body = "body_example"; // String | 

		# Perform insert and search operations        
        SearchApi searchApi = new SearchApi(client);
        IndexApi indexApi = new IndexApi(client);
        try {
        	String tableName = "products";

			InsertDocumentRequest indexRequest = new InsertDocumentRequest();
        	HashMap<String,Object> doc = new HashMap<String,Object>();
        	indexRequest.index(tableName).id(1L).setDoc(doc); 
        	indexApi.insert(indexRequest);
        
            Highlight highlight = new Highlight();
			List<String> highlightFields = new ArrayList<String>();
	    	highlightFields.add("title");
			highlight.setFields(highlightFields);

			SearchQuery query = new SearchQuery();
			query.setQueryString("@title Bag");

			SearchRequest searchRequest = new SearchRequest();
			searchRequest.index(tableName).query(query).setHighlight(highlight);
					
			SearchResponse searchResponse = searchApi.search(searchRequest);
			System.out.println(searchResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling Api function");
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
*IndexApi* | [**partialReplace**](docs/IndexApi.md#partialReplace) | **POST** /{index}/_update/{id} | Partially replaces a document in an index
*IndexApi* | [**replace**](docs/IndexApi.md#replace) | **POST** /replace | Replace new document in an index
*IndexApi* | [**update**](docs/IndexApi.md#update) | **POST** /update | Update a document in an index
*SearchApi* | [**percolate**](docs/SearchApi.md#percolate) | **POST** /pq/{index}/search | Perform reverse search on a percolate index
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /search | Performs a search on an index
*UtilsApi* | [**sql**](docs/UtilsApi.md#sql) | **POST** /sql | Perform SQL requests


## Documentation for Models

 - [AggComposite](docs/AggComposite.md)
 - [AggCompositeSource](docs/AggCompositeSource.md)
 - [AggCompositeTerm](docs/AggCompositeTerm.md)
 - [AggTerms](docs/AggTerms.md)
 - [Aggregation](docs/Aggregation.md)
 - [BoolFilter](docs/BoolFilter.md)
 - [BulkResponse](docs/BulkResponse.md)
 - [DeleteDocumentRequest](docs/DeleteDocumentRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FulltextFilter](docs/FulltextFilter.md)
 - [GeoDistance](docs/GeoDistance.md)
 - [GeoDistanceLocationAnchor](docs/GeoDistanceLocationAnchor.md)
 - [Highlight](docs/Highlight.md)
 - [HighlightFieldOption](docs/HighlightFieldOption.md)
 - [InsertDocumentRequest](docs/InsertDocumentRequest.md)
 - [Join](docs/Join.md)
 - [JoinCond](docs/JoinCond.md)
 - [JoinOn](docs/JoinOn.md)
 - [KnnQuery](docs/KnnQuery.md)
 - [Match](docs/Match.md)
 - [MatchAll](docs/MatchAll.md)
 - [PercolateRequest](docs/PercolateRequest.md)
 - [PercolateRequestQuery](docs/PercolateRequestQuery.md)
 - [QueryFilter](docs/QueryFilter.md)
 - [Range](docs/Range.md)
 - [ReplaceDocumentRequest](docs/ReplaceDocumentRequest.md)
 - [ResponseError](docs/ResponseError.md)
 - [ResponseErrorDetails](docs/ResponseErrorDetails.md)
 - [SearchQuery](docs/SearchQuery.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchResponse](docs/SearchResponse.md)
 - [SearchResponseHits](docs/SearchResponseHits.md)
 - [SourceRules](docs/SourceRules.md)
 - [SqlResponse](docs/SqlResponse.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [UpdateDocumentRequest](docs/UpdateDocumentRequest.md)
 - [UpdateResponse](docs/UpdateResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
