
package com.momentumvinum.shop.pojo.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Category {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_parent")
    @Expose
    private String idParent;
    @SerializedName("level_depth")
    @Expose
    private String levelDepth;
    @SerializedName("nb_products_recursive")
    @Expose
    private String nbProductsRecursive;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("id_shop_default")
    @Expose
    private String idShopDefault;
    @SerializedName("is_root_category")
    @Expose
    private String isRootCategory;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("date_add")
    @Expose
    private String dateAdd;
    @SerializedName("date_upd")
    @Expose
    private String dateUpd;
    @SerializedName("name")
    @Expose
    private List<Name> name = new ArrayList<Name>();
    @SerializedName("link_rewrite")
    @Expose
    private List<LinkRewrite> linkRewrite = new ArrayList<LinkRewrite>();
    @SerializedName("description")
    @Expose
    private List<Description> description = new ArrayList<Description>();
    @SerializedName("meta_title")
    @Expose
    private List<MetaTitle> metaTitle = new ArrayList<MetaTitle>();
    @SerializedName("meta_description")
    @Expose
    private List<MetaDescription> metaDescription = new ArrayList<MetaDescription>();
    @SerializedName("meta_keywords")
    @Expose
    private List<MetaKeyword> metaKeywords = new ArrayList<MetaKeyword>();
    @SerializedName("associations")
    @Expose
    private Associations associations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param levelDepth
     * @param position
     * @param idShopDefault
     * @param metaKeywords
     * @param metaDescription
     * @param metaTitle
     * @param id
     * @param dateAdd
     * @param nbProductsRecursive
     * @param dateUpd
     * @param description
     * @param name
     * @param associations
     * @param idParent
     * @param active
     * @param isRootCategory
     * @param linkRewrite
     */
    public Category(Integer id, String idParent, String levelDepth, String nbProductsRecursive, String active, String idShopDefault, String isRootCategory, String position, String dateAdd, String dateUpd, List<Name> name, List<LinkRewrite> linkRewrite, List<Description> description, List<MetaTitle> metaTitle, List<MetaDescription> metaDescription, List<MetaKeyword> metaKeywords, Associations associations) {
        this.id = id;
        this.idParent = idParent;
        this.levelDepth = levelDepth;
        this.nbProductsRecursive = nbProductsRecursive;
        this.active = active;
        this.idShopDefault = idShopDefault;
        this.isRootCategory = isRootCategory;
        this.position = position;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
        this.name = name;
        this.linkRewrite = linkRewrite;
        this.description = description;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.associations = associations;
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
     *     The idParent
     */
    public String getIdParent() {
        return idParent;
    }

    /**
     * 
     * @param idParent
     *     The id_parent
     */
    public void setIdParent(String idParent) {
        this.idParent = idParent;
    }

    /**
     * 
     * @return
     *     The levelDepth
     */
    public String getLevelDepth() {
        return levelDepth;
    }

    /**
     * 
     * @param levelDepth
     *     The level_depth
     */
    public void setLevelDepth(String levelDepth) {
        this.levelDepth = levelDepth;
    }

    /**
     * 
     * @return
     *     The nbProductsRecursive
     */
    public String getNbProductsRecursive() {
        return nbProductsRecursive;
    }

    /**
     * 
     * @param nbProductsRecursive
     *     The nb_products_recursive
     */
    public void setNbProductsRecursive(String nbProductsRecursive) {
        this.nbProductsRecursive = nbProductsRecursive;
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
     *     The idShopDefault
     */
    public String getIdShopDefault() {
        return idShopDefault;
    }

    /**
     * 
     * @param idShopDefault
     *     The id_shop_default
     */
    public void setIdShopDefault(String idShopDefault) {
        this.idShopDefault = idShopDefault;
    }

    /**
     * 
     * @return
     *     The isRootCategory
     */
    public String getIsRootCategory() {
        return isRootCategory;
    }

    /**
     * 
     * @param isRootCategory
     *     The is_root_category
     */
    public void setIsRootCategory(String isRootCategory) {
        this.isRootCategory = isRootCategory;
    }

    /**
     * 
     * @return
     *     The position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(String position) {
        this.position = position;
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

    /**
     * 
     * @return
     *     The linkRewrite
     */
    public List<LinkRewrite> getLinkRewrite() {
        return linkRewrite;
    }

    /**
     * 
     * @param linkRewrite
     *     The link_rewrite
     */
    public void setLinkRewrite(List<LinkRewrite> linkRewrite) {
        this.linkRewrite = linkRewrite;
    }

    /**
     * 
     * @return
     *     The description
     */
    public List<Description> getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(List<Description> description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The metaTitle
     */
    public List<MetaTitle> getMetaTitle() {
        return metaTitle;
    }

    /**
     * 
     * @param metaTitle
     *     The meta_title
     */
    public void setMetaTitle(List<MetaTitle> metaTitle) {
        this.metaTitle = metaTitle;
    }

    /**
     * 
     * @return
     *     The metaDescription
     */
    public List<MetaDescription> getMetaDescription() {
        return metaDescription;
    }

    /**
     * 
     * @param metaDescription
     *     The meta_description
     */
    public void setMetaDescription(List<MetaDescription> metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * 
     * @return
     *     The metaKeywords
     */
    public List<MetaKeyword> getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * 
     * @param metaKeywords
     *     The meta_keywords
     */
    public void setMetaKeywords(List<MetaKeyword> metaKeywords) {
        this.metaKeywords = metaKeywords;
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
