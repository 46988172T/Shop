
package com.momentumvinum.shop.pojos.shop_pojos.carts;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cart {

    private int id;
    private String idAddressDelivery;
    private String idAddressInvoice;
    private String idCurrency;
    private String idCustomer;
    private String idGuest;
    private String idLang;
    private String idShopGroup;
    private String idShop;
    private String idCarrier;
    private String recyclable;
    private String gift;
    private String giftMessage;
    private String mobileTheme;
    private String deliveryOption;
    private String secureKey;
    private String allowSeperatedPackage;
    private String dateAdd;
    private String dateUpd;
    private Associations associations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cart() {
    }

    /**
     * 
     * @param deliveryOption
     * @param idAddressDelivery
     * @param mobileTheme
     * @param giftMessage
     * @param idLang
     * @param gift
     * @param secureKey
     * @param allowSeperatedPackage
     * @param idCurrency
     * @param idShop
     * @param recyclable
     * @param dateAdd
     * @param id
     * @param idGuest
     * @param idShopGroup
     * @param idCustomer
     * @param dateUpd
     * @param associations
     * @param idCarrier
     * @param idAddressInvoice
     */
    public Cart(int id, String idAddressDelivery, String idAddressInvoice, String idCurrency, String idCustomer, String idGuest, String idLang, String idShopGroup, String idShop, String idCarrier, String recyclable, String gift, String giftMessage, String mobileTheme, String deliveryOption, String secureKey, String allowSeperatedPackage, String dateAdd, String dateUpd, Associations associations) {
        this.id = id;
        this.idAddressDelivery = idAddressDelivery;
        this.idAddressInvoice = idAddressInvoice;
        this.idCurrency = idCurrency;
        this.idCustomer = idCustomer;
        this.idGuest = idGuest;
        this.idLang = idLang;
        this.idShopGroup = idShopGroup;
        this.idShop = idShop;
        this.idCarrier = idCarrier;
        this.recyclable = recyclable;
        this.gift = gift;
        this.giftMessage = giftMessage;
        this.mobileTheme = mobileTheme;
        this.deliveryOption = deliveryOption;
        this.secureKey = secureKey;
        this.allowSeperatedPackage = allowSeperatedPackage;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
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
     *     The idGuest
     */
    public String getIdGuest() {
        return idGuest;
    }

    /**
     * 
     * @param idGuest
     *     The id_guest
     */
    public void setIdGuest(String idGuest) {
        this.idGuest = idGuest;
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
     *     The deliveryOption
     */
    public String getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * 
     * @param deliveryOption
     *     The delivery_option
     */
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
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
     *     The allowSeperatedPackage
     */
    public String getAllowSeperatedPackage() {
        return allowSeperatedPackage;
    }

    /**
     * 
     * @param allowSeperatedPackage
     *     The allow_seperated_package
     */
    public void setAllowSeperatedPackage(String allowSeperatedPackage) {
        this.allowSeperatedPackage = allowSeperatedPackage;
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
