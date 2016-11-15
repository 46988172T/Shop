
package com.momentumvinum.shop.pojo.products;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.momentumvinum.shop.pojo.categories.Category;

@Generated("org.jsonschema2pojo")
public class AssociationsProduct {

    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("imageProducts")
    @Expose
    private List<ImageProduct> imageProducts = new ArrayList<ImageProduct>();
    @SerializedName("product_features")
    @Expose
    private List<Product_feature> product_features = new ArrayList<Product_feature>();
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = new ArrayList<Tag>();
    @SerializedName("stock_availables")
    @Expose
    private List<Stock_available> stock_availables = new ArrayList<Stock_available>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssociationsProduct() {
    }

    /**
     * 
     * @param tags
     * @param stock_availables
     * @param imageProducts
     * @param categories
     * @param product_features
     */
    public AssociationsProduct(List<Category> categories, List<ImageProduct> imageProducts, List<Product_feature> product_features, List<Tag> tags, List<Stock_available> stock_availables) {
        this.categories = categories;
        this.imageProducts = imageProducts;
        this.product_features = product_features;
        this.tags = tags;
        this.stock_availables = stock_availables;
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
     *     The imageProducts
     */
    public List<ImageProduct> getImageProducts() {
        return imageProducts;
    }

    /**
     * 
     * @param imageProducts
     *     The imageProducts
     */
    public void setImageProducts(List<ImageProduct> imageProducts) {
        this.imageProducts = imageProducts;
    }

    /**
     * 
     * @return
     *     The product_features
     */
    public List<Product_feature> getProduct_features() {
        return product_features;
    }

    /**
     * 
     * @param product_features
     *     The product_features
     */
    public void setProduct_features(List<Product_feature> product_features) {
        this.product_features = product_features;
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
     *     The stock_availables
     */
    public List<Stock_available> getStock_availables() {
        return stock_availables;
    }

    /**
     * 
     * @param stock_availables
     *     The stock_availables
     */
    public void setStock_availables(List<Stock_available> stock_availables) {
        this.stock_availables = stock_availables;
    }

}
