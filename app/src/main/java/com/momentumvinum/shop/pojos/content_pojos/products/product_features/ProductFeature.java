
package com.momentumvinum.shop.pojos.content_pojos.products.product_features;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ProductFeature {

    private int id;
    private String position;
    private List<Name> name = new ArrayList<Name>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductFeature() {
    }

    /**
     * 
     * @param position
     * @param id
     * @param name
     */
    public ProductFeature(int id, String position, List<Name> name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The name
     */
    public List<Name> getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(List<Name> name) {
        this.name = name;
    }

}
