
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Product_no_vale {

    @SerializedName("product")
    @Expose
    private Product product;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product_no_vale() {
    }

    /**
     * 
     * @param product
     */
    public Product_no_vale(Product product) {
        this.product = product;
    }

    /**
     * 
     * @return
     *     The product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * 
     * @param product
     *     The product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

}
