
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StockAvailable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("id_product_attribute")
    @Expose
    private String idProductAttribute;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StockAvailable() {
    }

    /**
     * 
     * @param id
     * @param idProductAttribute
     */
    public StockAvailable(String id, String idProductAttribute) {
        this.id = id;
        this.idProductAttribute = idProductAttribute;
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
     *     The idProductAttribute
     */
    public String getIdProductAttribute() {
        return idProductAttribute;
    }

    /**
     * 
     * @param idProductAttribute
     *     The id_product_attribute
     */
    public void setIdProductAttribute(String idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

}
