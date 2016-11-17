
package com.momentumvinum.shop.pojos.shop_pojos.orders;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class OrderRow {

    private String id;
    private String productId;
    private String productAttributeId;
    private String productQuantity;
    private String productName;
    private String productReference;
    private String productEan13;
    private String productUpc;
    private String productPrice;
    private String unitPriceTaxIncl;
    private String unitPriceTaxExcl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderRow() {
    }

    /**
     * 
     * @param id
     * @param productUpc
     * @param unitPriceTaxExcl
     * @param productAttributeId
     * @param productQuantity
     * @param unitPriceTaxIncl
     * @param productReference
     * @param productPrice
     * @param productEan13
     * @param productName
     * @param productId
     */
    public OrderRow(String id, String productId, String productAttributeId, String productQuantity, String productName, String productReference, String productEan13, String productUpc, String productPrice, String unitPriceTaxIncl, String unitPriceTaxExcl) {
        this.id = id;
        this.productId = productId;
        this.productAttributeId = productAttributeId;
        this.productQuantity = productQuantity;
        this.productName = productName;
        this.productReference = productReference;
        this.productEan13 = productEan13;
        this.productUpc = productUpc;
        this.productPrice = productPrice;
        this.unitPriceTaxIncl = unitPriceTaxIncl;
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The productAttributeId
     */
    public String getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * 
     * @param productAttributeId
     *     The product_attribute_id
     */
    public void setProductAttributeId(String productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    /**
     * 
     * @return
     *     The productQuantity
     */
    public String getProductQuantity() {
        return productQuantity;
    }

    /**
     * 
     * @param productQuantity
     *     The product_quantity
     */
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * 
     * @return
     *     The productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param productName
     *     The product_name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 
     * @return
     *     The productReference
     */
    public String getProductReference() {
        return productReference;
    }

    /**
     * 
     * @param productReference
     *     The product_reference
     */
    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    /**
     * 
     * @return
     *     The productEan13
     */
    public String getProductEan13() {
        return productEan13;
    }

    /**
     * 
     * @param productEan13
     *     The product_ean13
     */
    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }

    /**
     * 
     * @return
     *     The productUpc
     */
    public String getProductUpc() {
        return productUpc;
    }

    /**
     * 
     * @param productUpc
     *     The product_upc
     */
    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }

    /**
     * 
     * @return
     *     The productPrice
     */
    public String getProductPrice() {
        return productPrice;
    }

    /**
     * 
     * @param productPrice
     *     The product_price
     */
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 
     * @return
     *     The unitPriceTaxIncl
     */
    public String getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    /**
     * 
     * @param unitPriceTaxIncl
     *     The unit_price_tax_incl
     */
    public void setUnitPriceTaxIncl(String unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    /**
     * 
     * @return
     *     The unitPriceTaxExcl
     */
    public String getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    /**
     * 
     * @param unitPriceTaxExcl
     *     The unit_price_tax_excl
     */
    public void setUnitPriceTaxExcl(String unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

}
