
package com.momentumvinum.shop.pojos.content_pojos.languages;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelLanguages {

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
