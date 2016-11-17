
package com.momentumvinum.shop.pojos.shop_pojos.orders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelOrders {

    private List<Order> orders = new ArrayList<Order>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelOrders() {
    }

    /**
     * 
     * @param orders
     */
    public ModelOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * 
     * @return
     *     The orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * 
     * @param orders
     *     The orders
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
