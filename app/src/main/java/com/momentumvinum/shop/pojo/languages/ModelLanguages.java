
package com.momentumvinum.shop.pojo.languages;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ModelLanguages {

    @SerializedName("languages")
    @Expose
    private List<Language> languages = new ArrayList<Language>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelLanguages() {
    }

    /**
     * 
     * @param languages
     */
    public ModelLanguages(List<Language> languages) {
        this.languages = languages;
    }

    /**
     * 
     * @return
     *     The languages
     */
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * 
     * @param languages
     *     The languages
     */
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

}
