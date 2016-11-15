
package com.momentumvinum.shop.pojo.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.momentumvinum.shop.pojo.products.Product;

@Generated("org.jsonschema2pojo")
public class AssociationsCategory {

    @SerializedName("categories")
    @Expose
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("products")
    @Expose
    private List<Product> products = new ArrayList<Product>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AssociationsCategory() {
    }

    /**
     * 
     * @param categories
     * @param products
     */
    public AssociationsCategory(List<Category> categories, List<Product> products) {
        this.categories = categories;
        this.products = products;
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
     *     The products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 
     * @param products
     *     The products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
