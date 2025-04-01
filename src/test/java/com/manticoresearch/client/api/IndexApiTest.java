/*
 * Manticore Search Client
 * Сlient for Manticore Search. 
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: info@manticoresearch.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.BulkResponse;
import com.manticoresearch.client.model.DeleteDocumentRequest;
import com.manticoresearch.client.model.DeleteResponse;
import com.manticoresearch.client.model.ErrorResponse;
import com.manticoresearch.client.model.InsertDocumentRequest;
import com.manticoresearch.client.model.ReplaceDocumentRequest;
import com.manticoresearch.client.model.SuccessResponse;
import com.manticoresearch.client.model.UpdateDocumentRequest;
import com.manticoresearch.client.model.UpdateResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndexApi
 */
public class IndexApiTest {

    private final IndexApi api = new IndexApi();

    /**
     * Bulk table operations
     *
     * Sends multiple operatons like inserts, updates, replaces or deletes.  For each operation it&#39;s object must have same format as in their dedicated method.  The method expects a raw string as the batch in NDJSON.  Each operation object needs to be serialized to   JSON and separated by endline (\\n).      An example of raw input:      &#x60;&#x60;&#x60;   {\&quot;insert\&quot;: {\&quot;table\&quot;: \&quot;movies\&quot;, \&quot;doc\&quot;: {\&quot;plot\&quot;: \&quot;A secret team goes to North Pole\&quot;, \&quot;rating\&quot;: 9.5, \&quot;language\&quot;: [2, 3], \&quot;title\&quot;: \&quot;This is an older movie\&quot;, \&quot;lon\&quot;: 51.99, \&quot;meta\&quot;: {\&quot;keywords\&quot;:[\&quot;travel\&quot;,\&quot;ice\&quot;],\&quot;genre\&quot;:[\&quot;adventure\&quot;]}, \&quot;year\&quot;: 1950, \&quot;lat\&quot;: 60.4, \&quot;advise\&quot;: \&quot;PG-13\&quot;}}}   \\n   {\&quot;delete\&quot;: {\&quot;table\&quot;: \&quot;movies\&quot;,\&quot;id\&quot;:700}}   &#x60;&#x60;&#x60;      Responds with an object telling whenever any errors occured and an array with status for each operation:      &#x60;&#x60;&#x60;   {     &#39;items&#39;:     [       {         &#39;update&#39;:{&#39;table&#39;:&#39;products&#39;,&#39;id&#39;:1,&#39;result&#39;:&#39;updated&#39;}       },       {         &#39;update&#39;:{&#39;table&#39;:&#39;products&#39;,&#39;id&#39;:2,&#39;result&#39;:&#39;updated&#39;}       }     ],     &#39;errors&#39;:false   }   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkTest() throws ApiException {
        //String body = null;
        //BulkResponse response = api.bulk(body);
        // TODO: test validations
    }

    /**
     * Delete a document in a table
     *
     * Delete one or several documents. The method has 2 ways of deleting: either by id, in case only one document is deleted or by using a  match query, in which case multiple documents can be delete . Example of input to delete by id:    &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;movies&#39;,&#39;id&#39;:100}   &#x60;&#x60;&#x60;  Example of input to delete using a query:    &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;query&#39;:     {       &#39;bool&#39;:       {         &#39;must&#39;:         [           {&#39;query_string&#39;:&#39;new movie&#39;}         ]       }     }   }   &#x60;&#x60;&#x60;  The match query has same syntax as in for searching. Responds with an object telling how many documents got deleted:     &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        //DeleteDocumentRequest deleteDocumentRequest = null;
        //DeleteResponse response = api.delete(deleteDocumentRequest);
        // TODO: test validations
    }

    /**
     * Create a new document in a table
     *
     * Insert a document.  Expects an object like:     &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;id&#39;:701,     &#39;doc&#39;:     {       &#39;title&#39;:&#39;This is an old movie&#39;,       &#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,       &#39;year&#39;:1950,       &#39;rating&#39;:9.5,       &#39;lat&#39;:60.4,       &#39;lon&#39;:51.99,       &#39;advise&#39;:&#39;PG-13&#39;,       &#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,       &#39;language&#39;:[2,3]     }   }   &#x60;&#x60;&#x60;   The document id can also be missing, in which case an autogenerated one will be used:             &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;doc&#39;:     {       &#39;title&#39;:&#39;This is a new movie&#39;,       &#39;plot&#39;:&#39;A secret team goes to North Pole&#39;,       &#39;year&#39;:2020,       &#39;rating&#39;:9.5,       &#39;lat&#39;:60.4,       &#39;lon&#39;:51.99,       &#39;advise&#39;:&#39;PG-13&#39;,       &#39;meta&#39;:&#39;{\&quot;keywords\&quot;:{\&quot;travel\&quot;,\&quot;ice\&quot;},\&quot;genre\&quot;:{\&quot;adventure\&quot;}}&#39;,       &#39;language&#39;:[2,3]     }   }   &#x60;&#x60;&#x60;   It responds with an object in format:      &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;id&#39;:701,&#39;created&#39;:true,&#39;result&#39;:&#39;created&#39;,&#39;status&#39;:201}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void insertTest() throws ApiException {
        //InsertDocumentRequest insertDocumentRequest = null;
        //SuccessResponse response = api.insert(insertDocumentRequest);
        // TODO: test validations
    }

    /**
     * Partially replaces a document in a table
     *
     * Partially replaces a document with given id in a table Responds with an object of the following format:     &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void partialReplaceTest() throws ApiException {
        //String table = null;
        //Long id = null;
        //ReplaceDocumentRequest replaceDocumentRequest = null;
        //UpdateResponse response = api.partialReplace(table, id, replaceDocumentRequest);
        // TODO: test validations
    }

    /**
     * Replace new document in a table
     *
     * Replace an existing document. Input has same format as &#x60;insert&#x60; operation. Responds with an object in format:    &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;id&#39;:1,&#39;created&#39;:false,&#39;result&#39;:&#39;updated&#39;,&#39;status&#39;:200}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replaceTest() throws ApiException {
        //InsertDocumentRequest insertDocumentRequest = null;
        //SuccessResponse response = api.replace(insertDocumentRequest);
        // TODO: test validations
    }

    /**
     * Update a document in a table
     *
     * Update one or several documents. The update can be made by passing the id or by using a match query in case multiple documents can be updated.  For example update a document using document id:    &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;movies&#39;,&#39;doc&#39;:{&#39;rating&#39;:9.49},&#39;id&#39;:100}   &#x60;&#x60;&#x60;  And update by using a match query:    &#x60;&#x60;&#x60;   {     &#39;table&#39;:&#39;movies&#39;,     &#39;doc&#39;:{&#39;rating&#39;:9.49},     &#39;query&#39;:     {       &#39;bool&#39;:       {         &#39;must&#39;:         [           {&#39;query_string&#39;:&#39;new movie&#39;}         ]       }     }   }   &#x60;&#x60;&#x60;   The match query has same syntax as for searching. Responds with an object that tells how many documents where updated in format:     &#x60;&#x60;&#x60;   {&#39;table&#39;:&#39;products&#39;,&#39;updated&#39;:1}   &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        //UpdateDocumentRequest updateDocumentRequest = null;
        //UpdateResponse response = api.update(updateDocumentRequest);
        // TODO: test validations
    }

}
