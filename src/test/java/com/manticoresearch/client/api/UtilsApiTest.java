/*
 * Manticore Search Client
 * Experimental low-level client for Manticore Search. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package com.manticoresearch.client.api;

import com.manticoresearch.client.*;
import com.manticoresearch.client.auth.*;
import com.manticoresearch.client.model.ErrorResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilsApi
 */
public class UtilsApiTest {

    private final UtilsApi api = new UtilsApi();

    /**
     * Perform SQL requests
     *
     * Run a query in SQL format. Expects a query parameters string that can be in two modes: * Select only query as &#x60;query&#x3D;SELECT * FROM myindex&#x60;. The query string MUST be URL encoded * any type of query in format &#x60;mode&#x3D;raw&amp;query&#x3D;SHOW TABLES&#x60;. The string must be as is (no URL encoding) and &#x60;mode&#x60; must be first. The response object depends on the query executed. In select mode the response has same format as &#x60;/search&#x60; operation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sqlTest() throws ApiException {
        //String body = null;
        //Map<String, Object> response = api.sql(body);
        // TODO: test validations
    }

}
