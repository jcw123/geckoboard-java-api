package com.github.geckoboard.api.json.common;

import com.google.gson.annotations.SerializedName;

/**
 * Generic graph type
 * 
 * @author Paul van Assen
 */
public enum GraphType {
    /**
     * Standard graph
     */
    @SerializedName( "standard" )
    STANDARD,
    /**
     * Reverse graph
     */
    @SerializedName( "reverse" )
    REVERSE;
}