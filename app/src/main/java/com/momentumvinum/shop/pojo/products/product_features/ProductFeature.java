
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
    @SerializedName("nameProductFeature")
    @Expose
    private List<NameProductFeature> nameProductFeature = new ArrayList<NameProductFeature>();

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
     * @param nameProductFeature
     */
    public ProductFeature(Integer id, String position, List<NameProductFeature> nameProductFeature) {
        this.id = id;
        this.position = position;
        this.nameProductFeature = nameProductFeature;
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
     *     The nameProductFeature
     */
    public List<NameProductFeature> getNameProductFeature() {
        return nameProductFeature;
    }

    /**
     * 
     * @param nameProductFeature
     *     The nameProductFeature
     */
    public void setNameProductFeature(List<NameProductFeature> nameProductFeature) {
        this.nameProductFeature = nameProductFeature;
    }

}
