
package com.momentumvinum.shop.pojos.other_pojos.currencies;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCurrencies {

    private List<Currency> currencies = new ArrayList<Currency>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCurrencies() {
    }

    /**
     * 
     * @param currencies
     */
    public ModelCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    /**
     * 
     * @return
     *     The currencies
     */
    public List<Currency> getCurrencies() {
        return currencies;
    }

    /**
     * 
     * @param currencies
     *     The currencies
     */
    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

}
