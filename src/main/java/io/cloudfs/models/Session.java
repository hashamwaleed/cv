/*
 * BitcasaLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.cloudfs.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Session 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5348497806616529517L;
    private String locale;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("locale")
    public String getLocale ( ) { 
        return this.locale;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("locale")
    public void setLocale (String value) { 
        this.locale = value;
    }
 
}
 