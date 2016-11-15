
package com.momentumvinum.shop.pojo.categories;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Category_no_vale {

    @SerializedName("category")
    @Expose
    private Category category;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category_no_vale() {
    }

    /**
     * 
     * @param category
     */
    public Category_no_vale(Category category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

}
