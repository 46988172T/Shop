
package com.momentumvinum.shop.pojos.other_pojos.currencies;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Currency {

    private int id;
    private String name;
    private String isoCode;
    private String isoCodeNum;
    private String blank;
    private String sign;
    private String format;
    private String decimals;
    private String conversionRate;
    private String deleted;
    private String active;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Currency() {
    }

    /**
     * 
     * @param decimals
     * @param sign
     * @param id
     * @param blank
     * @param isoCodeNum
     * @param name
     * @param active
     * @param isoCode
     * @param format
     * @param deleted
     * @param conversionRate
     */
    public Currency(int id, String name, String isoCode, String isoCodeNum, String blank, String sign, String format, String decimals, String conversionRate, String deleted, String active) {
        this.id = id;
        this.name = name;
        this.isoCode = isoCode;
        this.isoCodeNum = isoCodeNum;
        this.blank = blank;
        this.sign = sign;
        this.format = format;
        this.decimals = decimals;
        this.conversionRate = conversionRate;
        this.deleted = deleted;
        this.active = active;
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
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
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
     *     The isoCodeNum
     */
    public String getIsoCodeNum() {
        return isoCodeNum;
    }

    /**
     * 
     * @param isoCodeNum
     *     The iso_code_num
     */
    public void setIsoCodeNum(String isoCodeNum) {
        this.isoCodeNum = isoCodeNum;
    }

    /**
     * 
     * @return
     *     The blank
     */
    public String getBlank() {
        return blank;
    }

    /**
     * 
     * @param blank
     *     The blank
     */
    public void setBlank(String blank) {
        this.blank = blank;
    }

    /**
     * 
     * @return
     *     The sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * 
     * @param sign
     *     The sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 
     * @return
     *     The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The decimals
     */
    public String getDecimals() {
        return decimals;
    }

    /**
     * 
     * @param decimals
     *     The decimals
     */
    public void setDecimals(String decimals) {
        this.decimals = decimals;
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

}
