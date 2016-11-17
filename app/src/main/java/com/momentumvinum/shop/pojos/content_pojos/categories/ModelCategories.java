
package com.momentumvinum.shop.pojos.content_pojos.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCategories {

    private List<Category> categories = new ArrayList<Category>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCategories() {
    }

    /**
     * 
     * @param categories
     */
    public ModelCategories(List<Category> categories) {
        this.categories = categories;
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

}
