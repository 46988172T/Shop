
package com.momentumvinum.shop.pojo.products.product_features_values;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ModelProductFeatureValues {

    @SerializedName("product_feature_values")
    @Expose
    private List<ProductFeatureValue> productFeatureValues = new ArrayList<ProductFeatureValue>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelProductFeatureValues() {
    }

    /**
     * 
     * @param productFeatureValues
     */
    public ModelProductFeatureValues(List<ProductFeatureValue> productFeatureValues) {
        this.productFeatureValues = productFeatureValues;
    }

    /**
     * 
     * @return
     *     The productFeatureValues
     */
    public List<ProductFeatureValue> getProductFeatureValues() {
        return productFeatureValues;
    }

    /**
     * 
     * @param productFeatureValues
     *     The product_feature_values
     */
    public void setProductFeatureValues(List<ProductFeatureValue> productFeatureValues) {
        this.productFeatureValues = productFeatureValues;
    }

}
