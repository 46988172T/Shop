
package com.momentumvinum.shop.pojo.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CategoriesList {

    @SerializedName("categories")
    @Expose
    private List<CategoryItemId> categories = new ArrayList<CategoryItemId>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CategoriesList() {
    }

    /**
     * 
     * @param categories
     */
    public CategoriesList(List<CategoryItemId> categories) {
        this.categories = categories;
    }

    /**
     * 
     * @return
     *     The categories
     */
    public List<CategoryItemId> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(List<CategoryItemId> categories) {
        this.categories = categories;
    }

}
