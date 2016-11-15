
package com.momentumvinum.shop.pojo.products.product_features;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ProductFeature {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("name")
    @Expose
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
    public ProductFeature(Integer id, String position, List<Name> name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
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
