
package com.momentumvinum.shop.pojos.shop_pojos.carts;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Associations {

    private List<CartRow> cartRows = new ArrayList<CartRow>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Associations() {
    }

    /**
     * 
     * @param cartRows
     */
    public Associations(List<CartRow> cartRows) {
        this.cartRows = cartRows;
    }

    /**
     * 
     * @return
     *     The cartRows
     */
    public List<CartRow> getCartRows() {
        return cartRows;
    }

    /**
     * 
     * @param cartRows
     *     The cart_rows
     */
    public void setCartRows(List<CartRow> cartRows) {
        this.cartRows = cartRows;
    }

}
