
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Stock_available {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("id_product_attribute")
    @Expose
    private String id_product_attribute;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stock_available() {
    }

    /**
     * 
     * @param id
     * @param id_product_attribute
     */
    public Stock_available(String id, String id_product_attribute) {
        this.id = id;
        this.id_product_attribute = id_product_attribute;
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
     *     The id_product_attribute
     */
    public String getId_product_attribute() {
        return id_product_attribute;
    }

    /**
     * 
     * @param id_product_attribute
     *     The id_product_attribute
     */
    public void setId_product_attribute(String id_product_attribute) {
        this.id_product_attribute = id_product_attribute;
    }

}
