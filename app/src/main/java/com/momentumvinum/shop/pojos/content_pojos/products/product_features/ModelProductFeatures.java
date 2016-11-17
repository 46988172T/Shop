
package com.momentumvinum.shop.pojos.content_pojos.products.product_features;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelProductFeatures {

    private List<ProductFeature> productFeatures = new ArrayList<ProductFeature>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelProductFeatures() {
    }

    /**
     * 
     * @param productFeatures
     */
    public ModelProductFeatures(List<ProductFeature> productFeatures) {
        this.productFeatures = productFeatures;
    }

    /**
     * 
     * @return
     *     The productFeatures
     */
    public List<ProductFeature> getProductFeatures() {
        return productFeatures;
    }

    /**
     * 
     * @param productFeatures
     *     The product_features
     */
    public void setProductFeatures(List<ProductFeature> productFeatures) {
        this.productFeatures = productFeatures;
    }

}
