/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 3.3.1
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.*;
import com.manticoresearch.client.model.BulkResponse;
import com.manticoresearch.client.model.DeleteDocumentRequest;
import com.manticoresearch.client.model.DeleteResponse;
import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.InsertDocumentRequest;
import com.manticoresearch.client.model.SuccessResponse;
import com.manticoresearch.client.model.UpdateDocumentRequest;
import com.manticoresearch.client.model.UpdateResponse;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.math.BigDecimal;
/**
 * API tests for IndexApi
 */
public class IndexApiTest {

    private static final String BASE_PATH = "http://localhost:9408";
    private IndexApi indexApi;
    private SearchApi searchApi;
    private UtilsApi utilsApi;
     
	@BeforeEach                                         
    public void setUp() {
    	try {
	        ApiClient client = Configuration.getDefaultApiClient();
		    client.setBasePath(BASE_PATH);
		    indexApi = new IndexApi(client);
		    searchApi = new SearchApi(client);
		    utilsApi = new UtilsApi(client);
		    utilsApi.sql("DROP TABLE IF EXISTS movies", true);
		    utilsApi.sql("DROP TABLE IF EXISTS products", true);
	    } catch (ApiException e) {
	      System.err.println("Exception when setting up tests");
	      System.err.println("Status code: " + e.getCode());
	      System.err.println("Reason: " + e.getResponseBody());
	      System.err.println("Response headers: " + e.getResponseHeaders());
	      e.printStackTrace();
	    }  
    }
    
    interface PercolateSubTests {
    	void BuildPercolateRequestData() throws ApiException;
    }
    
    interface SearchSubTests {
        void BuildSearchRequestData() throws ApiException;
        void TestBasicSearch(SearchRequest searchRequest) throws ApiException;
	    void TestSearchSort(SearchRequest searchRequest) throws ApiException;
	    void TestSearchExpressions(SearchRequest searchRequest) throws ApiException;
	    void TestSearchAggregations(SearchRequest searchRequest) throws ApiException;
	    void TestSearchHighlight(SearchRequest searchRequest) throws ApiException;
	    void TestSearchFulltextFilters(SearchRequest searchRequest) throws ApiException;
	    void TestSearchAttrFilters(SearchRequest searchRequest) throws ApiException;
	    void TestSearchBoolFilter(SearchRequest searchRequest) throws ApiException;
    }

    /**
     * Bulk index operations
     *
     * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;table\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;table\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {     &#39;items&#39;:     [       {         &#39;update&#39;:{&#39;table&#39;:&#39;products&#39;,&#39;_id&#39;:1,&#39;result&#39;:&#39;updated&#39;}       },       {         &#39;update&#39;:{&#39;table&#39;:&#39;products&#39;,&#39;_id&#39;:2,&#39;result&#39;:&#39;updated&#39;}       }     ],     &#39;errors&#39;:false   }   &#x60;&#x60;&#x60;   
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkTest() throws ApiException {
        //String body = null;
        //BulkResponse response = api.bulk(body);
        // TODO: test validations
        Object sqlresult = utilsApi.sql("CREATE TABLE IF NOT EXISTS products (title text, price float, sizes multi, meta json, coeff float, tags1 multi, tags2 multi)", true);
    	System.out.println(sqlresult);
    	
        String body = "{\"insert\": {\"table\" : \"products\", \"id\" : 3, \"doc\" : {\"title\" : \"Crossbody Bag with Tassel\", \"price\" : 19.85}}}" +"\n"+
	    "{\"insert\": {\"table\" : \"products\", \"id\" : 4, \"doc\" : {\"title\" : \"microfiber sheet set\", \"price\" : 19.99}}}"+"\n"+
	    "{\"insert\": {\"table\" : \"products\", \"id\" : 5, \"doc\" : {\"title\" : \"CPet Hair Remover Glove\", \"price\" : 7.99}}}"+"\n";         
	    BulkResponse bulkresult = indexApi.bulk(body);
	    System.out.println(bulkresult);
	    
	    body = "{ \"update\" : { \"table\" : \"products\", \"doc\": { \"coeff\" : 1000 }, \"query\": { \"range\": { \"price\": { \"gte\": 1000 } } } }} "+"\n"+
        "{ \"update\" : { \"table\" : \"products\", \"doc\": { \"coeff\" : 0 }, \"query\": { \"range\": { \"price\": { \"lt\": 1000 } } } } }"+"\n";         
        bulkresult = indexApi.bulk(body);
        System.out.println(bulkresult);

    }

    /**
     * Create a new document in a table
     *
     * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;id&#39;:701,     &#39;doc&#39;:     {       &#39;title&#39;:&#39;This is an old movie&#39;,       &#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,       &#39;year&#39;:1950,       &#39;rating&#39;:9.5,       &#39;lat&#39;:60.4,       &#39;lon&#39;:51.99,       &#39;advise&#39;:&#39;PG-13&#39;,       &#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,       &#39;language&#39;:[2,3]     }   }   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;doc&#39;:     {       &#39;title&#39;:&#39;This is a new movie&#39;,       &#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,       &#39;year&#39;:2020,       &#39;rating&#39;:9.5,       &#39;lat&#39;:60.4,       &#39;lon&#39;:51.99,       &#39;advise&#39;:&#39;PG-13&#39;,       &#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,       &#39;language&#39;:[2,3]     }   }   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;_id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void insertTest() throws ApiException {
        //InsertDocumentRequest insertDocumentRequest = null;
        //SuccessResponse response = api.insert(insertDocumentRequest);
        // TODO: test validations
        
        Object indexSqlresult = utilsApi.sql("CREATE TABLE IF NOT EXISTS products (title text, price float, sizes multi, meta json, coeff float, tags1 multi, tags2 multi)", true);
    	System.out.println(indexSqlresult);
    	
	    InsertDocumentRequest indexNewdoc = new InsertDocumentRequest();
        HashMap<String,Object> indexDoc = new HashMap<String,Object>(){{
            put("title","first");
            put("tags1",new int[] {4,2,1,3});
        }};
        indexNewdoc.table("products").id(1L).setDoc(indexDoc); 
        indexSqlresult = indexApi.insert(indexNewdoc);
        
        indexDoc = new HashMap<String,Object>();
        indexNewdoc.table("products").id(2L).setDoc(indexDoc); 
        indexSqlresult = indexApi.insert(indexNewdoc);
        System.out.println(indexSqlresult);              
        
        indexNewdoc = new InsertDocumentRequest();
        indexDoc = new HashMap<String,Object>();
        indexNewdoc.table("products").setDoc(indexDoc); 
        indexSqlresult = indexApi.insert(indexNewdoc);
        System.out.println(indexSqlresult);

    }
}
