
package com.momentumvinum.shop.pojos.shop_pojos.carriers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCarriers {

    private List<Carrier> carriers = new ArrayList<Carrier>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCarriers() {
    }

    /**
     * 
     * @param carriers
     */
    public ModelCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    /**
     * 
     * @return
     *     The carriers
     */
    public List<Carrier> getCarriers() {
        return carriers;
    }

    /**
     * 
     * @param carriers
     *     The carriers
     */
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

}
