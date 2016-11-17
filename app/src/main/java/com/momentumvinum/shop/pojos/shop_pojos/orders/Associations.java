
package com.momentumvinum.shop.pojos.shop_pojos.orders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Associations {

    private List<OrderRow> orderRows = new ArrayList<OrderRow>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Associations() {
    }

    /**
     * 
     * @param orderRows
     */
    public Associations(List<OrderRow> orderRows) {
        this.orderRows = orderRows;
    }

    /**
     * 
     * @return
     *     The orderRows
     */
    public List<OrderRow> getOrderRows() {
        return orderRows;
    }

    /**
     * 
     * @param orderRows
     *     The order_rows
     */
    public void setOrderRows(List<OrderRow> orderRows) {
        this.orderRows = orderRows;
    }

}
