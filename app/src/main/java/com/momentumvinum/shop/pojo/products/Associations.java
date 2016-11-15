
package com.momentumvinum.shop.pojo.products;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Associations {

    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("product_features")
    @Expose
    private List<ProductFeature> productFeatures = new ArrayList<ProductFeature>();
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = new ArrayList<Tag>();
    @SerializedName("stock_availables")
    @Expose
    private List<StockAvailable> stockAvailables = new ArrayList<StockAvailable>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Associations() {
    }

    /**
     * 
     * @param tags
     * @param productFeatures
     * @param images
     * @param categories
     * @param stockAvailables
     */
    public Associations(List<Category> categories, List<Image> images, List<ProductFeature> productFeatures, List<Tag> tags, List<StockAvailable> stockAvailables) {
        this.categories = categories;
        this.images = images;
        this.productFeatures = productFeatures;
        this.tags = tags;
        this.stockAvailables = stockAvailables;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
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

    /**
     * 
     * @return
     *     The tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The stockAvailables
     */
    public List<StockAvailable> getStockAvailables() {
        return stockAvailables;
    }

    /**
     * 
     * @param stockAvailables
     *     The stock_availables
     */
    public void setStockAvailables(List<StockAvailable> stockAvailables) {
        this.stockAvailables = stockAvailables;
    }

}
