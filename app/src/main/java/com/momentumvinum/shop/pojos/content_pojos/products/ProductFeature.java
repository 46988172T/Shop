
package com.momentumvinum.shop.pojos.content_pojos.products;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ProductFeature {

    private String id;
    private String idFeatureValue;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductFeature() {
    }

    /**
     * 
     * @param id
     * @param idFeatureValue
     */
    public ProductFeature(String id, String idFeatureValue) {
        this.id = id;
        this.idFeatureValue = idFeatureValue;
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
     *     The idFeatureValue
     */
    public String getIdFeatureValue() {
        return idFeatureValue;
    }

    /**
     * 
     * @param idFeatureValue
     *     The id_feature_value
     */
    public void setIdFeatureValue(String idFeatureValue) {
        this.idFeatureValue = idFeatureValue;
    }

}
