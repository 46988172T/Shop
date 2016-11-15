
package com.momentumvinum.shop.pojo.tags;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ModelTags {

    @SerializedName("tags")
    @Expose
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelTags() {
    }

    /**
     * 
     * @param tags
     */
    public ModelTags(List<Tag> tags) {
        this.tags = tags;
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

}
