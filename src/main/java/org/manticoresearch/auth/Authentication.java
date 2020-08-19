/*
 * Manticore Search Client
 * Please note that this client is experimental. For full documentation of the API methods consult https://manual.manticoresearch.com/. 
 *
 * Contact: https://manticoresearch.com/contact-us/
 */


package org.manticoresearch.auth;

import org.manticoresearch.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams);
}
