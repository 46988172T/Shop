
package com.momentumvinum.shop.pojo.categories;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Product {

    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param id
     */
    public Product(String id) {
        this.id = id;
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

}
