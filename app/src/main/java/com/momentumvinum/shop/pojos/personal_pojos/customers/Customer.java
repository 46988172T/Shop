
package com.momentumvinum.shop.pojos.personal_pojos.customers;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Customer {

    private int id;
    private String idDefaultGroup;
    private String idLang;
    private String newsletterDateAdd;
    private Object ipRegistrationNewsletter;
    private String lastPasswdGen;
    private String secureKey;
    private String deleted;
    private String passwd;
    private String lastname;
    private String firstname;
    private String email;
    private String idGender;
    private String birthday;
    private String newsletter;
    private String optin;
    private Object website;
    private Object company;
    private Object siret;
    private Object ape;
    private String outstandingAllowAmount;
    private String showPublicPrices;
    private String idRisk;
    private String maxPaymentDays;
    private String active;
    private Object note;
    private String isGuest;
    private String idShop;
    private String idShopGroup;
    private String dateAdd;
    private String dateUpd;
    private Associations associations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param passwd
     * @param birthday
     * @param idDefaultGroup
     * @param lastname
     * @param idRisk
     * @param idShop
     * @param idShopGroup
     * @param id
     * @param dateUpd
     * @param lastPasswdGen
     * @param ape
     * @param showPublicPrices
     * @param newsletterDateAdd
     * @param note
     * @param idLang
     * @param website
     * @param newsletter
     * @param maxPaymentDays
     * @param idGender
     * @param firstname
     * @param optin
     * @param secureKey
     * @param deleted
     * @param ipRegistrationNewsletter
     * @param dateAdd
     * @param isGuest
     * @param email
     * @param company
     * @param associations
     * @param active
     * @param outstandingAllowAmount
     * @param siret
     */
    public Customer(int id, String idDefaultGroup, String idLang, String newsletterDateAdd, Object ipRegistrationNewsletter, String lastPasswdGen, String secureKey, String deleted, String passwd, String lastname, String firstname, String email, String idGender, String birthday, String newsletter, String optin, Object website, Object company, Object siret, Object ape, String outstandingAllowAmount, String showPublicPrices, String idRisk, String maxPaymentDays, String active, Object note, String isGuest, String idShop, String idShopGroup, String dateAdd, String dateUpd, Associations associations) {
        this.id = id;
        this.idDefaultGroup = idDefaultGroup;
        this.idLang = idLang;
        this.newsletterDateAdd = newsletterDateAdd;
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
        this.lastPasswdGen = lastPasswdGen;
        this.secureKey = secureKey;
        this.deleted = deleted;
        this.passwd = passwd;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.idGender = idGender;
        this.birthday = birthday;
        this.newsletter = newsletter;
        this.optin = optin;
        this.website = website;
        this.company = company;
        this.siret = siret;
        this.ape = ape;
        this.outstandingAllowAmount = outstandingAllowAmount;
        this.showPublicPrices = showPublicPrices;
        this.idRisk = idRisk;
        this.maxPaymentDays = maxPaymentDays;
        this.active = active;
        this.note = note;
        this.isGuest = isGuest;
        this.idShop = idShop;
        this.idShopGroup = idShopGroup;
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
     *     The idDefaultGroup
     */
    public String getIdDefaultGroup() {
        return idDefaultGroup;
    }

    /**
     * 
     * @param idDefaultGroup
     *     The id_default_group
     */
    public void setIdDefaultGroup(String idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
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
     *     The newsletterDateAdd
     */
    public String getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    /**
     * 
     * @param newsletterDateAdd
     *     The newsletter_date_add
     */
    public void setNewsletterDateAdd(String newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    /**
     * 
     * @return
     *     The ipRegistrationNewsletter
     */
    public Object getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    /**
     * 
     * @param ipRegistrationNewsletter
     *     The ip_registration_newsletter
     */
    public void setIpRegistrationNewsletter(Object ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    /**
     * 
     * @return
     *     The lastPasswdGen
     */
    public String getLastPasswdGen() {
        return lastPasswdGen;
    }

    /**
     * 
     * @param lastPasswdGen
     *     The last_passwd_gen
     */
    public void setLastPasswdGen(String lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
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
     *     The deleted
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted
     *     The deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 
     * @return
     *     The passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 
     * @param passwd
     *     The passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 
     * @return
     *     The lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * @param lastname
     *     The lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return
     *     The firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @param firstname
     *     The firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The idGender
     */
    public String getIdGender() {
        return idGender;
    }

    /**
     * 
     * @param idGender
     *     The id_gender
     */
    public void setIdGender(String idGender) {
        this.idGender = idGender;
    }

    /**
     * 
     * @return
     *     The birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return
     *     The newsletter
     */
    public String getNewsletter() {
        return newsletter;
    }

    /**
     * 
     * @param newsletter
     *     The newsletter
     */
    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * 
     * @return
     *     The optin
     */
    public String getOptin() {
        return optin;
    }

    /**
     * 
     * @param optin
     *     The optin
     */
    public void setOptin(String optin) {
        this.optin = optin;
    }

    /**
     * 
     * @return
     *     The website
     */
    public Object getWebsite() {
        return website;
    }

    /**
     * 
     * @param website
     *     The website
     */
    public void setWebsite(Object website) {
        this.website = website;
    }

    /**
     * 
     * @return
     *     The company
     */
    public Object getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(Object company) {
        this.company = company;
    }

    /**
     * 
     * @return
     *     The siret
     */
    public Object getSiret() {
        return siret;
    }

    /**
     * 
     * @param siret
     *     The siret
     */
    public void setSiret(Object siret) {
        this.siret = siret;
    }

    /**
     * 
     * @return
     *     The ape
     */
    public Object getApe() {
        return ape;
    }

    /**
     * 
     * @param ape
     *     The ape
     */
    public void setApe(Object ape) {
        this.ape = ape;
    }

    /**
     * 
     * @return
     *     The outstandingAllowAmount
     */
    public String getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    /**
     * 
     * @param outstandingAllowAmount
     *     The outstanding_allow_amount
     */
    public void setOutstandingAllowAmount(String outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }

    /**
     * 
     * @return
     *     The showPublicPrices
     */
    public String getShowPublicPrices() {
        return showPublicPrices;
    }

    /**
     * 
     * @param showPublicPrices
     *     The show_public_prices
     */
    public void setShowPublicPrices(String showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }

    /**
     * 
     * @return
     *     The idRisk
     */
    public String getIdRisk() {
        return idRisk;
    }

    /**
     * 
     * @param idRisk
     *     The id_risk
     */
    public void setIdRisk(String idRisk) {
        this.idRisk = idRisk;
    }

    /**
     * 
     * @return
     *     The maxPaymentDays
     */
    public String getMaxPaymentDays() {
        return maxPaymentDays;
    }

    /**
     * 
     * @param maxPaymentDays
     *     The max_payment_days
     */
    public void setMaxPaymentDays(String maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
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
     *     The note
     */
    public Object getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    public void setNote(Object note) {
        this.note = note;
    }

    /**
     * 
     * @return
     *     The isGuest
     */
    public String getIsGuest() {
        return isGuest;
    }

    /**
     * 
     * @param isGuest
     *     The is_guest
     */
    public void setIsGuest(String isGuest) {
        this.isGuest = isGuest;
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
