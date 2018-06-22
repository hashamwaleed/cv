/*
 * BitcasaLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.cloudfs.models;

import java.util.*;

public class BrowseShareResponseBuilder {
    //the instance to build
    private BrowseShareResponse browseShareResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BrowseShareResponseBuilder() {
        browseShareResponse = new BrowseShareResponse();
    }

    public BrowseShareResponseBuilder error(String error) {
        browseShareResponse.setError(error);
        return this;
    }

    public BrowseShareResponseBuilder result(BrowseShareResult result) {
        browseShareResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BrowseShareResponse build() {
        return browseShareResponse;
    }
}