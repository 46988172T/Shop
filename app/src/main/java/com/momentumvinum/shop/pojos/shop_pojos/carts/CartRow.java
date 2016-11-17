
package com.momentumvinum.shop.pojos.shop_pojos.carts;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CartRow {

    private String idProduct;
    private String idProductAttribute;
    private String idAddressDelivery;
    private String quantity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CartRow() {
    }

    /**
     * 
     * @param idAddressDelivery
     * @param idProductAttribute
     * @param quantity
     * @param idProduct
     */
    public CartRow(String idProduct, String idProductAttribute, String idAddressDelivery, String quantity) {
        this.idProduct = idProduct;
        this.idProductAttribute = idProductAttribute;
        this.idAddressDelivery = idAddressDelivery;
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The idProduct
     */
    public String getIdProduct() {
        return idProduct;
    }

    /**
     * 
     * @param idProduct
     *     The id_product
     */
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * 
     * @return
     *     The idProductAttribute
     */
    public String getIdProductAttribute() {
        return idProductAttribute;
    }

    /**
     * 
     * @param idProductAttribute
     *     The id_product_attribute
     */
    public void setIdProductAttribute(String idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }

    /**
     * 
     * @return
     *     The idAddressDelivery
     */
    public String getIdAddressDelivery() {
        return idAddressDelivery;
    }

    /**
     * 
     * @param idAddressDelivery
     *     The id_address_delivery
     */
    public void setIdAddressDelivery(String idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
