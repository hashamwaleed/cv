/*
 * BitcasaLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.cloudfs.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UploadFileResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5600692379474472607L;
    private String error;
    private ResultUpload result;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("error")
    public String getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("error")
    public void setError (String value) { 
        this.error = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("result")
    public ResultUpload getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("result")
    public void setResult (ResultUpload value) { 
        this.result = value;
    }
 
}
 