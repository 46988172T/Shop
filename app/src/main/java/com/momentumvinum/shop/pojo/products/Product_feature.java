
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Product_feature {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("id_feature_value")
    @Expose
    private String id_feature_value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product_feature() {
    }

    /**
     * 
     * @param id
     * @param id_feature_value
     */
    public Product_feature(String id, String id_feature_value) {
        this.id = id;
        this.id_feature_value = id_feature_value;
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
     *     The id_feature_value
     */
    public String getId_feature_value() {
        return id_feature_value;
    }

    /**
     * 
     * @param id_feature_value
     *     The id_feature_value
     */
    public void setId_feature_value(String id_feature_value) {
        this.id_feature_value = id_feature_value;
    }

}
