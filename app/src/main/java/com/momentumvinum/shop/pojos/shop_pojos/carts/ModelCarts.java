
package com.momentumvinum.shop.pojos.shop_pojos.carts;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCarts {

    private List<Cart> carts = new ArrayList<Cart>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCarts() {
    }

    /**
     * 
     * @param carts
     */
    public ModelCarts(List<Cart> carts) {
        this.carts = carts;
    }

    /**
     * 
     * @return
     *     The carts
     */
    public List<Cart> getCarts() {
        return carts;
    }

    /**
     * 
     * @param carts
     *     The carts
     */
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

}
