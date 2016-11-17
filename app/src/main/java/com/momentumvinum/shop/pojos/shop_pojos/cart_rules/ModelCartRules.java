
package com.momentumvinum.shop.pojos.shop_pojos.cart_rules;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ModelCartRules {

    private List<CartRule> cartRules = new ArrayList<CartRule>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ModelCartRules() {
    }

    /**
     * 
     * @param cartRules
     */
    public ModelCartRules(List<CartRule> cartRules) {
        this.cartRules = cartRules;
    }

    /**
     * 
     * @return
     *     The cartRules
     */
    public List<CartRule> getCartRules() {
        return cartRules;
    }

    /**
     * 
     * @param cartRules
     *     The cart_rules
     */
    public void setCartRules(List<CartRule> cartRules) {
        this.cartRules = cartRules;
    }

}
