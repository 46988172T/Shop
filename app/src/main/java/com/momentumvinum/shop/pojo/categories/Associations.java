
package com.momentumvinum.shop.pojo.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Associations {

    private List<Category_> categories = new ArrayList<Category_>();
    private List<Product> products = new ArrayList<Product>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Associations() {
    }

    /**
     * 
     * @param categories
     * @param products
     */
    public Associations(List<Category_> categories, List<Product> products) {
        this.categories = categories;
        this.products = products;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<Category_> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<Category_> categories) {
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
