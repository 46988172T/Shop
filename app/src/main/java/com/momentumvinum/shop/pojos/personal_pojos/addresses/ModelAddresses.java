
package com.momentumvinum.shop.pojos.personal_pojos.addresses;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelAddresses {

    private List<Address> addresses = new ArrayList<Address>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelAddresses() {
    }

    /**
     * 
     * @param addresses
     */
    public ModelAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * 
     * @return
     *     The addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * 
     * @param addresses
     *     The addresses
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
