
package com.momentumvinum.shop.pojo.categories;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Name {

    private String id;
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
