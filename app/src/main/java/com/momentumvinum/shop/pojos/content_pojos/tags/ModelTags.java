
package com.momentumvinum.shop.pojos.content_pojos.tags;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelTags {

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
