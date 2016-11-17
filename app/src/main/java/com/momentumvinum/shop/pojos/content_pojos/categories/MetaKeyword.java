
package com.momentumvinum.shop.pojos.content_pojos.categories;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MetaKeyword {

    private String id;
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetaKeyword() {
    }

    /**
     * 
     * @param id
     * @param value
     */
    public MetaKeyword(String id, String value) {
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
