
package com.momentumvinum.shop.pojos.other_pojos.countries;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Country {

    private int id;
    private String idZone;
    private String idCurrency;
    private String callPrefix;
    private String isoCode;
    private String active;
    private String containsStates;
    private String needIdentificationNumber;
    private String needZipCode;
    private String zipCodeFormat;
    private String displayTaxLabel;
    private List<Name> name = new ArrayList<Name>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Country() {
    }

    /**
     * 
     * @param id
     * @param needIdentificationNumber
     * @param zipCodeFormat
     * @param displayTaxLabel
     * @param name
     * @param idZone
     * @param needZipCode
     * @param active
     * @param isoCode
     * @param containsStates
     * @param callPrefix
     * @param idCurrency
     */
    public Country(int id, String idZone, String idCurrency, String callPrefix, String isoCode, String active, String containsStates, String needIdentificationNumber, String needZipCode, String zipCodeFormat, String displayTaxLabel, List<Name> name) {
        this.id = id;
        this.idZone = idZone;
        this.idCurrency = idCurrency;
        this.callPrefix = callPrefix;
        this.isoCode = isoCode;
        this.active = active;
        this.containsStates = containsStates;
        this.needIdentificationNumber = needIdentificationNumber;
        this.needZipCode = needZipCode;
        this.zipCodeFormat = zipCodeFormat;
        this.displayTaxLabel = displayTaxLabel;
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
     *     The idZone
     */
    public String getIdZone() {
        return idZone;
    }

    /**
     * 
     * @param idZone
     *     The id_zone
     */
    public void setIdZone(String idZone) {
        this.idZone = idZone;
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
     *     The callPrefix
     */
    public String getCallPrefix() {
        return callPrefix;
    }

    /**
     * 
     * @param callPrefix
     *     The call_prefix
     */
    public void setCallPrefix(String callPrefix) {
        this.callPrefix = callPrefix;
    }

    /**
     * 
     * @return
     *     The isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }

    /**
     * 
     * @param isoCode
     *     The iso_code
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
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
     *     The containsStates
     */
    public String getContainsStates() {
        return containsStates;
    }

    /**
     * 
     * @param containsStates
     *     The contains_states
     */
    public void setContainsStates(String containsStates) {
        this.containsStates = containsStates;
    }

    /**
     * 
     * @return
     *     The needIdentificationNumber
     */
    public String getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    /**
     * 
     * @param needIdentificationNumber
     *     The need_identification_number
     */
    public void setNeedIdentificationNumber(String needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }

    /**
     * 
     * @return
     *     The needZipCode
     */
    public String getNeedZipCode() {
        return needZipCode;
    }

    /**
     * 
     * @param needZipCode
     *     The need_zip_code
     */
    public void setNeedZipCode(String needZipCode) {
        this.needZipCode = needZipCode;
    }

    /**
     * 
     * @return
     *     The zipCodeFormat
     */
    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    /**
     * 
     * @param zipCodeFormat
     *     The zip_code_format
     */
    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }

    /**
     * 
     * @return
     *     The displayTaxLabel
     */
    public String getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    /**
     * 
     * @param displayTaxLabel
     *     The display_tax_label
     */
    public void setDisplayTaxLabel(String displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
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
