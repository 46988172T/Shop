
package com.momentumvinum.shop.pojo.tags;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Tag {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_lang")
    @Expose
    private String idLang;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tag() {
    }

    /**
     * 
     * @param id
     * @param idLang
     * @param name
     */
    public Tag(Integer id, String idLang, String name) {
        this.id = id;
        this.idLang = idLang;
        this.name = name;
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

}
