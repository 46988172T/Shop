
package com.momentumvinum.shop.pojos.content_pojos.products;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Category {

    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param id
     */
    public Category(String id) {
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
