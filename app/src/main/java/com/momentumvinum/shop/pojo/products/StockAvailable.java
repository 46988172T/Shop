
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class StockAvailable {

    private String id;
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
