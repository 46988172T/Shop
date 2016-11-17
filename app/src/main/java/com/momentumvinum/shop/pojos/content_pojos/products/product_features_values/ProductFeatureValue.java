
package com.momentumvinum.shop.pojos.content_pojos.products.product_features_values;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ProductFeatureValue {

    private int id;
    private String idFeature;
    private String custom;
    private List<Value> value = new ArrayList<Value>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductFeatureValue() {
    }

    /**
     * 
     * @param id
     * @param idFeature
     * @param value
     * @param custom
     */
    public ProductFeatureValue(int id, String idFeature, String custom, List<Value> value) {
        this.id = id;
        this.idFeature = idFeature;
        this.custom = custom;
        this.value = value;
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
     *     The idFeature
     */
    public String getIdFeature() {
        return idFeature;
    }

    /**
     * 
     * @param idFeature
     *     The id_feature
     */
    public void setIdFeature(String idFeature) {
        this.idFeature = idFeature;
    }

    /**
     * 
     * @return
     *     The custom
     */
    public String getCustom() {
        return custom;
    }

    /**
     * 
     * @param custom
     *     The custom
     */
    public void setCustom(String custom) {
        this.custom = custom;
    }

    /**
     * 
     * @return
     *     The value
     */
    public List<Value> getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(List<Value> value) {
        this.value = value;
    }

}
