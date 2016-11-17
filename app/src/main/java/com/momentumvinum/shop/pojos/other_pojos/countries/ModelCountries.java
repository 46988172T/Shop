
package com.momentumvinum.shop.pojos.other_pojos.countries;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCountries {

    private List<Country> countries = new ArrayList<Country>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCountries() {
    }

    /**
     * 
     * @param countries
     */
    public ModelCountries(List<Country> countries) {
        this.countries = countries;
    }

    /**
     * 
     * @return
     *     The countries
     */
    public List<Country> getCountries() {
        return countries;
    }

    /**
     * 
     * @param countries
     *     The countries
     */
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

}
