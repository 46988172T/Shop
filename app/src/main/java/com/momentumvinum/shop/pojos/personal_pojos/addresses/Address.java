
package com.momentumvinum.shop.pojos.personal_pojos.addresses;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Address {

    private int id;
    private String idCustomer;
    private String idManufacturer;
    private String idSupplier;
    private String idWarehouse;
    private String idCountry;
    private String idState;
    private String alias;
    private String company;
    private String lastname;
    private String firstname;
    private String vatNumber;
    private String address1;
    private String address2;
    private String postcode;
    private String city;
    private String other;
    private String phone;
    private String phoneMobile;
    private String dni;
    private String deleted;
    private String dateAdd;
    private String dateUpd;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param phone
     * @param other
     * @param idSupplier
     * @param alias
     * @param idState
     * @param address1
     * @param idCountry
     * @param lastname
     * @param address2
     * @param firstname
     * @param postcode
     * @param deleted
     * @param city
     * @param dateAdd
     * @param id
     * @param phoneMobile
     * @param idCustomer
     * @param dateUpd
     * @param idWarehouse
     * @param company
     * @param vatNumber
     * @param dni
     * @param idManufacturer
     */
    public Address(int id, String idCustomer, String idManufacturer, String idSupplier, String idWarehouse, String idCountry, String idState, String alias, String company, String lastname, String firstname, String vatNumber, String address1, String address2, String postcode, String city, String other, String phone, String phoneMobile, String dni, String deleted, String dateAdd, String dateUpd) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idManufacturer = idManufacturer;
        this.idSupplier = idSupplier;
        this.idWarehouse = idWarehouse;
        this.idCountry = idCountry;
        this.idState = idState;
        this.alias = alias;
        this.company = company;
        this.lastname = lastname;
        this.firstname = firstname;
        this.vatNumber = vatNumber;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.city = city;
        this.other = other;
        this.phone = phone;
        this.phoneMobile = phoneMobile;
        this.dni = dni;
        this.deleted = deleted;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
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
     *     The idManufacturer
     */
    public String getIdManufacturer() {
        return idManufacturer;
    }

    /**
     * 
     * @param idManufacturer
     *     The id_manufacturer
     */
    public void setIdManufacturer(String idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    /**
     * 
     * @return
     *     The idSupplier
     */
    public String getIdSupplier() {
        return idSupplier;
    }

    /**
     * 
     * @param idSupplier
     *     The id_supplier
     */
    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    /**
     * 
     * @return
     *     The idWarehouse
     */
    public String getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * 
     * @param idWarehouse
     *     The id_warehouse
     */
    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    /**
     * 
     * @return
     *     The idCountry
     */
    public String getIdCountry() {
        return idCountry;
    }

    /**
     * 
     * @param idCountry
     *     The id_country
     */
    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * 
     * @return
     *     The idState
     */
    public String getIdState() {
        return idState;
    }

    /**
     * 
     * @param idState
     *     The id_state
     */
    public void setIdState(String idState) {
        this.idState = idState;
    }

    /**
     * 
     * @return
     *     The alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 
     * @param alias
     *     The alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 
     * @return
     *     The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(String company) {
        this.company = company;
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
     *     The vatNumber
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * 
     * @param vatNumber
     *     The vat_number
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * 
     * @return
     *     The address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * @return
     *     The address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     * @param address2
     *     The address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 
     * @return
     *     The postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 
     * @param postcode
     *     The postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The other
     */
    public String getOther() {
        return other;
    }

    /**
     * 
     * @param other
     *     The other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * 
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The phoneMobile
     */
    public String getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * 
     * @param phoneMobile
     *     The phone_mobile
     */
    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    /**
     * 
     * @return
     *     The dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * 
     * @param dni
     *     The dni
     */
    public void setDni(String dni) {
        this.dni = dni;
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

}
