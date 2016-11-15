
package com.momentumvinum.shop.pojo.languages;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Language {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("iso_code")
    @Expose
    private String isoCode;
    @SerializedName("language_code")
    @Expose
    private String languageCode;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("is_rtl")
    @Expose
    private String isRtl;
    @SerializedName("date_format_lite")
    @Expose
    private String dateFormatLite;
    @SerializedName("date_format_full")
    @Expose
    private String dateFormatFull;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Language() {
    }

    /**
     * 
     * @param id
     * @param dateFormatFull
     * @param languageCode
     * @param name
     * @param active
     * @param dateFormatLite
     * @param isoCode
     * @param isRtl
     */
    public Language(Integer id, String name, String isoCode, String languageCode, String active, String isRtl, String dateFormatLite, String dateFormatFull) {
        this.id = id;
        this.name = name;
        this.isoCode = isoCode;
        this.languageCode = languageCode;
        this.active = active;
        this.isRtl = isRtl;
        this.dateFormatLite = dateFormatLite;
        this.dateFormatFull = dateFormatFull;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
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
     *     The languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 
     * @param languageCode
     *     The language_code
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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
     *     The isRtl
     */
    public String getIsRtl() {
        return isRtl;
    }

    /**
     * 
     * @param isRtl
     *     The is_rtl
     */
    public void setIsRtl(String isRtl) {
        this.isRtl = isRtl;
    }

    /**
     * 
     * @return
     *     The dateFormatLite
     */
    public String getDateFormatLite() {
        return dateFormatLite;
    }

    /**
     * 
     * @param dateFormatLite
     *     The date_format_lite
     */
    public void setDateFormatLite(String dateFormatLite) {
        this.dateFormatLite = dateFormatLite;
    }

    /**
     * 
     * @return
     *     The dateFormatFull
     */
    public String getDateFormatFull() {
        return dateFormatFull;
    }

    /**
     * 
     * @param dateFormatFull
     *     The date_format_full
     */
    public void setDateFormatFull(String dateFormatFull) {
        this.dateFormatFull = dateFormatFull;
    }

}
