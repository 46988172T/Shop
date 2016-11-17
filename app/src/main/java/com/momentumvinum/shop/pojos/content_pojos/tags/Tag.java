
package com.momentumvinum.shop.pojos.content_pojos.tags;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Tag {

    private int id;
    private String idLang;
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
    public Tag(int id, String idLang, String name) {
        this.id = id;
        this.idLang = idLang;
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
