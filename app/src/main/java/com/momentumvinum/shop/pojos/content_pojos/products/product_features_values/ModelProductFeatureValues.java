
package com.momentumvinum.shop.pojos.content_pojos.products.product_features_values;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelProductFeatureValues {

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
