
package com.momentumvinum.shop.pojos.shop_pojos.orders;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Order {

    private int id;
    private String idAddressDelivery;
    private String idAddressInvoice;
    private String idCart;
    private String idCurrency;
    private String idLang;
    private String idCustomer;
    private String idCarrier;
    private String currentState;
    private String module;
    private String invoiceNumber;
    private String invoiceDate;
    private String deliveryNumber;
    private String deliveryDate;
    private String valid;
    private String dateAdd;
    private String dateUpd;
    private String shippingNumber;
    private String idShopGroup;
    private String idShop;
    private String secureKey;
    private String payment;
    private String recyclable;
    private String gift;
    private String giftMessage;
    private String mobileTheme;
    private String totalDiscounts;
    private String totalDiscountsTaxIncl;
    private String totalDiscountsTaxExcl;
    private String totalPaid;
    private String totalPaidTaxIncl;
    private String totalPaidTaxExcl;
    private String totalPaidReal;
    private String totalProducts;
    private String totalProductsWt;
    private String totalShipping;
    private String totalShippingTaxIncl;
    private String totalShippingTaxExcl;
    private String carrierTaxRate;
    private String totalWrapping;
    private String totalWrappingTaxIncl;
    private String totalWrappingTaxExcl;
    private String roundMode;
    private String roundType;
    private String conversionRate;
    private String reference;
    private Associations associations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param totalShippingTaxIncl
     * @param invoiceDate
     * @param idAddressDelivery
     * @param valid
     * @param gift
     * @param shippingNumber
     * @param currentState
     * @param totalWrappingTaxIncl
     * @param idCurrency
     * @param idShop
     * @param id
     * @param idShopGroup
     * @param idCustomer
     * @param totalDiscounts
     * @param dateUpd
     * @param idCarrier
     * @param deliveryDate
     * @param deliveryNumber
     * @param totalShipping
     * @param idAddressInvoice
     * @param totalPaidTaxIncl
     * @param roundType
     * @param totalPaidReal
     * @param mobileTheme
     * @param giftMessage
     * @param module
     * @param idLang
     * @param carrierTaxRate
     * @param totalShippingTaxExcl
     * @param payment
     * @param totalWrappingTaxExcl
     * @param invoiceNumber
     * @param totalProducts
     * @param secureKey
     * @param reference
     * @param totalWrapping
     * @param recyclable
     * @param totalPaidTaxExcl
     * @param dateAdd
     * @param idCart
     * @param associations
     * @param totalDiscountsTaxIncl
     * @param roundMode
     * @param totalProductsWt
     * @param totalPaid
     * @param totalDiscountsTaxExcl
     * @param conversionRate
     */
    public Order(int id, String idAddressDelivery, String idAddressInvoice, String idCart, String idCurrency, String idLang, String idCustomer, String idCarrier, String currentState, String module, String invoiceNumber, String invoiceDate, String deliveryNumber, String deliveryDate, String valid, String dateAdd, String dateUpd, String shippingNumber, String idShopGroup, String idShop, String secureKey, String payment, String recyclable, String gift, String giftMessage, String mobileTheme, String totalDiscounts, String totalDiscountsTaxIncl, String totalDiscountsTaxExcl, String totalPaid, String totalPaidTaxIncl, String totalPaidTaxExcl, String totalPaidReal, String totalProducts, String totalProductsWt, String totalShipping, String totalShippingTaxIncl, String totalShippingTaxExcl, String carrierTaxRate, String totalWrapping, String totalWrappingTaxIncl, String totalWrappingTaxExcl, String roundMode, String roundType, String conversionRate, String reference, Associations associations) {
        this.id = id;
        this.idAddressDelivery = idAddressDelivery;
        this.idAddressInvoice = idAddressInvoice;
        this.idCart = idCart;
        this.idCurrency = idCurrency;
        this.idLang = idLang;
        this.idCustomer = idCustomer;
        this.idCarrier = idCarrier;
        this.currentState = currentState;
        this.module = module;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.deliveryNumber = deliveryNumber;
        this.deliveryDate = deliveryDate;
        this.valid = valid;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
        this.shippingNumber = shippingNumber;
        this.idShopGroup = idShopGroup;
        this.idShop = idShop;
        this.secureKey = secureKey;
        this.payment = payment;
        this.recyclable = recyclable;
        this.gift = gift;
        this.giftMessage = giftMessage;
        this.mobileTheme = mobileTheme;
        this.totalDiscounts = totalDiscounts;
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
        this.totalPaid = totalPaid;
        this.totalPaidTaxIncl = totalPaidTaxIncl;
        this.totalPaidTaxExcl = totalPaidTaxExcl;
        this.totalPaidReal = totalPaidReal;
        this.totalProducts = totalProducts;
        this.totalProductsWt = totalProductsWt;
        this.totalShipping = totalShipping;
        this.totalShippingTaxIncl = totalShippingTaxIncl;
        this.totalShippingTaxExcl = totalShippingTaxExcl;
        this.carrierTaxRate = carrierTaxRate;
        this.totalWrapping = totalWrapping;
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
        this.roundMode = roundMode;
        this.roundType = roundType;
        this.conversionRate = conversionRate;
        this.reference = reference;
        this.associations = associations;
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
     *     The idAddressInvoice
     */
    public String getIdAddressInvoice() {
        return idAddressInvoice;
    }

    /**
     * 
     * @param idAddressInvoice
     *     The id_address_invoice
     */
    public void setIdAddressInvoice(String idAddressInvoice) {
        this.idAddressInvoice = idAddressInvoice;
    }

    /**
     * 
     * @return
     *     The idCart
     */
    public String getIdCart() {
        return idCart;
    }

    /**
     * 
     * @param idCart
     *     The id_cart
     */
    public void setIdCart(String idCart) {
        this.idCart = idCart;
    }

    /**
     * 
     * @return
     *     The idCurrency
     */
    public String getIdCurrency() {
        return idCurrency;
    }

    /**
     * 
     * @param idCurrency
     *     The id_currency
     */
    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }

    /**
     * 
     * @return
     *     The idLang
     */
    public String getIdLang() {
        return idLang;
    }

    /**
     * 
     * @param idLang
     *     The id_lang
     */
    public void setIdLang(String idLang) {
        this.idLang = idLang;
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
     *     The idCarrier
     */
    public String getIdCarrier() {
        return idCarrier;
    }

    /**
     * 
     * @param idCarrier
     *     The id_carrier
     */
    public void setIdCarrier(String idCarrier) {
        this.idCarrier = idCarrier;
    }

    /**
     * 
     * @return
     *     The currentState
     */
    public String getCurrentState() {
        return currentState;
    }

    /**
     * 
     * @param currentState
     *     The current_state
     */
    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    /**
     * 
     * @return
     *     The module
     */
    public String getModule() {
        return module;
    }

    /**
     * 
     * @param module
     *     The module
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * 
     * @return
     *     The invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 
     * @param invoiceNumber
     *     The invoice_number
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 
     * @return
     *     The invoiceDate
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * 
     * @param invoiceDate
     *     The invoice_date
     */
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * 
     * @return
     *     The deliveryNumber
     */
    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    /**
     * 
     * @param deliveryNumber
     *     The delivery_number
     */
    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    /**
     * 
     * @return
     *     The deliveryDate
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 
     * @param deliveryDate
     *     The delivery_date
     */
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * 
     * @return
     *     The valid
     */
    public String getValid() {
        return valid;
    }

    /**
     * 
     * @param valid
     *     The valid
     */
    public void setValid(String valid) {
        this.valid = valid;
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
     *     The shippingNumber
     */
    public String getShippingNumber() {
        return shippingNumber;
    }

    /**
     * 
     * @param shippingNumber
     *     The shipping_number
     */
    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }

    /**
     * 
     * @return
     *     The idShopGroup
     */
    public String getIdShopGroup() {
        return idShopGroup;
    }

    /**
     * 
     * @param idShopGroup
     *     The id_shop_group
     */
    public void setIdShopGroup(String idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    /**
     * 
     * @return
     *     The idShop
     */
    public String getIdShop() {
        return idShop;
    }

    /**
     * 
     * @param idShop
     *     The id_shop
     */
    public void setIdShop(String idShop) {
        this.idShop = idShop;
    }

    /**
     * 
     * @return
     *     The secureKey
     */
    public String getSecureKey() {
        return secureKey;
    }

    /**
     * 
     * @param secureKey
     *     The secure_key
     */
    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }

    /**
     * 
     * @return
     *     The payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * 
     * @param payment
     *     The payment
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * 
     * @return
     *     The recyclable
     */
    public String getRecyclable() {
        return recyclable;
    }

    /**
     * 
     * @param recyclable
     *     The recyclable
     */
    public void setRecyclable(String recyclable) {
        this.recyclable = recyclable;
    }

    /**
     * 
     * @return
     *     The gift
     */
    public String getGift() {
        return gift;
    }

    /**
     * 
     * @param gift
     *     The gift
     */
    public void setGift(String gift) {
        this.gift = gift;
    }

    /**
     * 
     * @return
     *     The giftMessage
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * 
     * @param giftMessage
     *     The gift_message
     */
    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    /**
     * 
     * @return
     *     The mobileTheme
     */
    public String getMobileTheme() {
        return mobileTheme;
    }

    /**
     * 
     * @param mobileTheme
     *     The mobile_theme
     */
    public void setMobileTheme(String mobileTheme) {
        this.mobileTheme = mobileTheme;
    }

    /**
     * 
     * @return
     *     The totalDiscounts
     */
    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    /**
     * 
     * @param totalDiscounts
     *     The total_discounts
     */
    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    /**
     * 
     * @return
     *     The totalDiscountsTaxIncl
     */
    public String getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    /**
     * 
     * @param totalDiscountsTaxIncl
     *     The total_discounts_tax_incl
     */
    public void setTotalDiscountsTaxIncl(String totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }

    /**
     * 
     * @return
     *     The totalDiscountsTaxExcl
     */
    public String getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    /**
     * 
     * @param totalDiscountsTaxExcl
     *     The total_discounts_tax_excl
     */
    public void setTotalDiscountsTaxExcl(String totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }

    /**
     * 
     * @return
     *     The totalPaid
     */
    public String getTotalPaid() {
        return totalPaid;
    }

    /**
     * 
     * @param totalPaid
     *     The total_paid
     */
    public void setTotalPaid(String totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * 
     * @return
     *     The totalPaidTaxIncl
     */
    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    /**
     * 
     * @param totalPaidTaxIncl
     *     The total_paid_tax_incl
     */
    public void setTotalPaidTaxIncl(String totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }

    /**
     * 
     * @return
     *     The totalPaidTaxExcl
     */
    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    /**
     * 
     * @param totalPaidTaxExcl
     *     The total_paid_tax_excl
     */
    public void setTotalPaidTaxExcl(String totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }

    /**
     * 
     * @return
     *     The totalPaidReal
     */
    public String getTotalPaidReal() {
        return totalPaidReal;
    }

    /**
     * 
     * @param totalPaidReal
     *     The total_paid_real
     */
    public void setTotalPaidReal(String totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
    }

    /**
     * 
     * @return
     *     The totalProducts
     */
    public String getTotalProducts() {
        return totalProducts;
    }

    /**
     * 
     * @param totalProducts
     *     The total_products
     */
    public void setTotalProducts(String totalProducts) {
        this.totalProducts = totalProducts;
    }

    /**
     * 
     * @return
     *     The totalProductsWt
     */
    public String getTotalProductsWt() {
        return totalProductsWt;
    }

    /**
     * 
     * @param totalProductsWt
     *     The total_products_wt
     */
    public void setTotalProductsWt(String totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }

    /**
     * 
     * @return
     *     The totalShipping
     */
    public String getTotalShipping() {
        return totalShipping;
    }

    /**
     * 
     * @param totalShipping
     *     The total_shipping
     */
    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }

    /**
     * 
     * @return
     *     The totalShippingTaxIncl
     */
    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    /**
     * 
     * @param totalShippingTaxIncl
     *     The total_shipping_tax_incl
     */
    public void setTotalShippingTaxIncl(String totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    /**
     * 
     * @return
     *     The totalShippingTaxExcl
     */
    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    /**
     * 
     * @param totalShippingTaxExcl
     *     The total_shipping_tax_excl
     */
    public void setTotalShippingTaxExcl(String totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    /**
     * 
     * @return
     *     The carrierTaxRate
     */
    public String getCarrierTaxRate() {
        return carrierTaxRate;
    }

    /**
     * 
     * @param carrierTaxRate
     *     The carrier_tax_rate
     */
    public void setCarrierTaxRate(String carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }

    /**
     * 
     * @return
     *     The totalWrapping
     */
    public String getTotalWrapping() {
        return totalWrapping;
    }

    /**
     * 
     * @param totalWrapping
     *     The total_wrapping
     */
    public void setTotalWrapping(String totalWrapping) {
        this.totalWrapping = totalWrapping;
    }

    /**
     * 
     * @return
     *     The totalWrappingTaxIncl
     */
    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    /**
     * 
     * @param totalWrappingTaxIncl
     *     The total_wrapping_tax_incl
     */
    public void setTotalWrappingTaxIncl(String totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }

    /**
     * 
     * @return
     *     The totalWrappingTaxExcl
     */
    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    /**
     * 
     * @param totalWrappingTaxExcl
     *     The total_wrapping_tax_excl
     */
    public void setTotalWrappingTaxExcl(String totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }

    /**
     * 
     * @return
     *     The roundMode
     */
    public String getRoundMode() {
        return roundMode;
    }

    /**
     * 
     * @param roundMode
     *     The round_mode
     */
    public void setRoundMode(String roundMode) {
        this.roundMode = roundMode;
    }

    /**
     * 
     * @return
     *     The roundType
     */
    public String getRoundType() {
        return roundType;
    }

    /**
     * 
     * @param roundType
     *     The round_type
     */
    public void setRoundType(String roundType) {
        this.roundType = roundType;
    }

    /**
     * 
     * @return
     *     The conversionRate
     */
    public String getConversionRate() {
        return conversionRate;
    }

    /**
     * 
     * @param conversionRate
     *     The conversion_rate
     */
    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**
     * 
     * @return
     *     The reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * 
     * @return
     *     The associations
     */
    public Associations getAssociations() {
        return associations;
    }

    /**
     * 
     * @param associations
     *     The associations
     */
    public void setAssociations(Associations associations) {
        this.associations = associations;
    }

}
