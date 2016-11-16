
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Tag {

    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag() {
    }

    /**
     * 
     * @param id
     */
    public Tag(String id) {
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
