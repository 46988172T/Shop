
package com.momentumvinum.shop.pojo.products.product_features;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Name {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Name() {
    }

    /**
     * 
     * @param id
     * @param value
     */
    public Name(String id, String value) {
        this.id = id;
        this.value = value;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The value
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(String value) {
        this.value = value;
    }

}