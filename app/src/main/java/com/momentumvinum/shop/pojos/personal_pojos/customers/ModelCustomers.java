
package com.momentumvinum.shop.pojos.personal_pojos.customers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCustomers {

    private List<Customer> customers = new ArrayList<Customer>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCustomers() {
    }

    /**
     * 
     * @param customers
     */
    public ModelCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    /**
     * 
     * @return
     *     The customers
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * 
     * @param customers
     *     The customers
     */
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
