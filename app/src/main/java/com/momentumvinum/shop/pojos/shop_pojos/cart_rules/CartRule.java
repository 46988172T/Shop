
package com.momentumvinum.shop.pojos.shop_pojos.cart_rules;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CartRule {

    private int id;
    private String idCustomer;
    private String dateFrom;
    private String dateTo;
    private String description;
    private String quantity;
    private String quantityPerUser;
    private String priority;
    private String partialUse;
    private String code;
    private String minimumAmount;
    private String minimumAmountTax;
    private String minimumAmountCurrency;
    private String minimumAmountShipping;
    private String countryRestriction;
    private String carrierRestriction;
    private String groupRestriction;
    private String cartRuleRestriction;
    private String productRestriction;
    private String shopRestriction;
    private String freeShipping;
    private String reductionPercent;
    private String reductionAmount;
    private String reductionTax;
    private String reductionCurrency;
    private String reductionProduct;
    private String giftProduct;
    private String giftProductAttribute;
    private String highlight;
    private String active;
    private String dateAdd;
    private String dateUpd;
    private List<Name> name = new ArrayList<Name>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CartRule() {
    }

    /**
     * 
     * @param reductionProduct
     * @param minimumAmountCurrency
     * @param freeShipping
     * @param groupRestriction
     * @param countryRestriction
     * @param highlight
     * @param id
     * @param idCustomer
     * @param dateUpd
     * @param priority
     * @param description
     * @param name
     * @param giftProductAttribute
     * @param giftProduct
     * @param quantity
     * @param partialUse
     * @param dateFrom
     * @param shopRestriction
     * @param minimumAmount
     * @param reductionPercent
     * @param dateTo
     * @param productRestriction
     * @param minimumAmountShipping
     * @param cartRuleRestriction
     * @param code
     * @param quantityPerUser
     * @param dateAdd
     * @param reductionTax
     * @param reductionCurrency
     * @param reductionAmount
     * @param active
     * @param minimumAmountTax
     * @param carrierRestriction
     */
    public CartRule(int id, String idCustomer, String dateFrom, String dateTo, String description, String quantity, String quantityPerUser, String priority, String partialUse, String code, String minimumAmount, String minimumAmountTax, String minimumAmountCurrency, String minimumAmountShipping, String countryRestriction, String carrierRestriction, String groupRestriction, String cartRuleRestriction, String productRestriction, String shopRestriction, String freeShipping, String reductionPercent, String reductionAmount, String reductionTax, String reductionCurrency, String reductionProduct, String giftProduct, String giftProductAttribute, String highlight, String active, String dateAdd, String dateUpd, List<Name> name) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.description = description;
        this.quantity = quantity;
        this.quantityPerUser = quantityPerUser;
        this.priority = priority;
        this.partialUse = partialUse;
        this.code = code;
        this.minimumAmount = minimumAmount;
        this.minimumAmountTax = minimumAmountTax;
        this.minimumAmountCurrency = minimumAmountCurrency;
        this.minimumAmountShipping = minimumAmountShipping;
        this.countryRestriction = countryRestriction;
        this.carrierRestriction = carrierRestriction;
        this.groupRestriction = groupRestriction;
        this.cartRuleRestriction = cartRuleRestriction;
        this.productRestriction = productRestriction;
        this.shopRestriction = shopRestriction;
        this.freeShipping = freeShipping;
        this.reductionPercent = reductionPercent;
        this.reductionAmount = reductionAmount;
        this.reductionTax = reductionTax;
        this.reductionCurrency = reductionCurrency;
        this.reductionProduct = reductionProduct;
        this.giftProduct = giftProduct;
        this.giftProductAttribute = giftProductAttribute;
        this.highlight = highlight;
        this.active = active;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The idCustomer
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * 
     * @param idCustomer
     *     The id_customer
     */
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * 
     * @return
     *     The dateFrom
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * 
     * @param dateFrom
     *     The date_from
     */
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * 
     * @return
     *     The dateTo
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * 
     * @param dateTo
     *     The date_to
     */
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * 
     * @return
     *     The quantityPerUser
     */
    public String getQuantityPerUser() {
        return quantityPerUser;
    }

    /**
     * 
     * @param quantityPerUser
     *     The quantity_per_user
     */
    public void setQuantityPerUser(String quantityPerUser) {
        this.quantityPerUser = quantityPerUser;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The partialUse
     */
    public String getPartialUse() {
        return partialUse;
    }

    /**
     * 
     * @param partialUse
     *     The partial_use
     */
    public void setPartialUse(String partialUse) {
        this.partialUse = partialUse;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The minimumAmount
     */
    public String getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * 
     * @param minimumAmount
     *     The minimum_amount
     */
    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    /**
     * 
     * @return
     *     The minimumAmountTax
     */
    public String getMinimumAmountTax() {
        return minimumAmountTax;
    }

    /**
     * 
     * @param minimumAmountTax
     *     The minimum_amount_tax
     */
    public void setMinimumAmountTax(String minimumAmountTax) {
        this.minimumAmountTax = minimumAmountTax;
    }

    /**
     * 
     * @return
     *     The minimumAmountCurrency
     */
    public String getMinimumAmountCurrency() {
        return minimumAmountCurrency;
    }

    /**
     * 
     * @param minimumAmountCurrency
     *     The minimum_amount_currency
     */
    public void setMinimumAmountCurrency(String minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
    }

    /**
     * 
     * @return
     *     The minimumAmountShipping
     */
    public String getMinimumAmountShipping() {
        return minimumAmountShipping;
    }

    /**
     * 
     * @param minimumAmountShipping
     *     The minimum_amount_shipping
     */
    public void setMinimumAmountShipping(String minimumAmountShipping) {
        this.minimumAmountShipping = minimumAmountShipping;
    }

    /**
     * 
     * @return
     *     The countryRestriction
     */
    public String getCountryRestriction() {
        return countryRestriction;
    }

    /**
     * 
     * @param countryRestriction
     *     The country_restriction
     */
    public void setCountryRestriction(String countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    /**
     * 
     * @return
     *     The carrierRestriction
     */
    public String getCarrierRestriction() {
        return carrierRestriction;
    }

    /**
     * 
     * @param carrierRestriction
     *     The carrier_restriction
     */
    public void setCarrierRestriction(String carrierRestriction) {
        this.carrierRestriction = carrierRestriction;
    }

    /**
     * 
     * @return
     *     The groupRestriction
     */
    public String getGroupRestriction() {
        return groupRestriction;
    }

    /**
     * 
     * @param groupRestriction
     *     The group_restriction
     */
    public void setGroupRestriction(String groupRestriction) {
        this.groupRestriction = groupRestriction;
    }

    /**
     * 
     * @return
     *     The cartRuleRestriction
     */
    public String getCartRuleRestriction() {
        return cartRuleRestriction;
    }

    /**
     * 
     * @param cartRuleRestriction
     *     The cart_rule_restriction
     */
    public void setCartRuleRestriction(String cartRuleRestriction) {
        this.cartRuleRestriction = cartRuleRestriction;
    }

    /**
     * 
     * @return
     *     The productRestriction
     */
    public String getProductRestriction() {
        return productRestriction;
    }

    /**
     * 
     * @param productRestriction
     *     The product_restriction
     */
    public void setProductRestriction(String productRestriction) {
        this.productRestriction = productRestriction;
    }

    /**
     * 
     * @return
     *     The shopRestriction
     */
    public String getShopRestriction() {
        return shopRestriction;
    }

    /**
     * 
     * @param shopRestriction
     *     The shop_restriction
     */
    public void setShopRestriction(String shopRestriction) {
        this.shopRestriction = shopRestriction;
    }

    /**
     * 
     * @return
     *     The freeShipping
     */
    public String getFreeShipping() {
        return freeShipping;
    }

    /**
     * 
     * @param freeShipping
     *     The free_shipping
     */
    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    /**
     * 
     * @return
     *     The reductionPercent
     */
    public String getReductionPercent() {
        return reductionPercent;
    }

    /**
     * 
     * @param reductionPercent
     *     The reduction_percent
     */
    public void setReductionPercent(String reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    /**
     * 
     * @return
     *     The reductionAmount
     */
    public String getReductionAmount() {
        return reductionAmount;
    }

    /**
     * 
     * @param reductionAmount
     *     The reduction_amount
     */
    public void setReductionAmount(String reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    /**
     * 
     * @return
     *     The reductionTax
     */
    public String getReductionTax() {
        return reductionTax;
    }

    /**
     * 
     * @param reductionTax
     *     The reduction_tax
     */
    public void setReductionTax(String reductionTax) {
        this.reductionTax = reductionTax;
    }

    /**
     * 
     * @return
     *     The reductionCurrency
     */
    public String getReductionCurrency() {
        return reductionCurrency;
    }

    /**
     * 
     * @param reductionCurrency
     *     The reduction_currency
     */
    public void setReductionCurrency(String reductionCurrency) {
        this.reductionCurrency = reductionCurrency;
    }

    /**
     * 
     * @return
     *     The reductionProduct
     */
    public String getReductionProduct() {
        return reductionProduct;
    }

    /**
     * 
     * @param reductionProduct
     *     The reduction_product
     */
    public void setReductionProduct(String reductionProduct) {
        this.reductionProduct = reductionProduct;
    }

    /**
     * 
     * @return
     *     The giftProduct
     */
    public String getGiftProduct() {
        return giftProduct;
    }

    /**
     * 
     * @param giftProduct
     *     The gift_product
     */
    public void setGiftProduct(String giftProduct) {
        this.giftProduct = giftProduct;
    }

    /**
     * 
     * @return
     *     The giftProductAttribute
     */
    public String getGiftProductAttribute() {
        return giftProductAttribute;
    }

    /**
     * 
     * @param giftProductAttribute
     *     The gift_product_attribute
     */
    public void setGiftProductAttribute(String giftProductAttribute) {
        this.giftProductAttribute = giftProductAttribute;
    }

    /**
     * 
     * @return
     *     The highlight
     */
    public String getHighlight() {
        return highlight;
    }

    /**
     * 
     * @param highlight
     *     The highlight
     */
    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    /**
     * 
     * @return
     *     The active
     */
    public String getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The dateAdd
     */
    public String getDateAdd() {
        return dateAdd;
    }

    /**
     * 
     * @param dateAdd
     *     The date_add
     */
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    /**
     * 
     * @return
     *     The dateUpd
     */
    public String getDateUpd() {
        return dateUpd;
    }

    /**
     * 
     * @param dateUpd
     *     The date_upd
     */
    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }

    /**
     * 
     * @return
     *     The name
     */
    public List<Name> getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(List<Name> name) {
        this.name = name;
    }

}
