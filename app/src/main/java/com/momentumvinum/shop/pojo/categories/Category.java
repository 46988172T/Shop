
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
    private String id_parent;
    @SerializedName("level_depth")
    @Expose
    private String level_depth;
    @SerializedName("nb_products_recursive")
    @Expose
    private String nb_products_recursive;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("id_shop_default")
    @Expose
    private String id_shop_default;
    @SerializedName("is_root_category")
    @Expose
    private String is_root_category;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("date_add")
    @Expose
    private String date_add;
    @SerializedName("date_upd")
    @Expose
    private String date_upd;
    @SerializedName("nameCategory")
    @Expose
    private List<NameCategory> nameCategory = new ArrayList<NameCategory>();
    @SerializedName("descriptionCategory")
    @Expose
    private List<DescriptionCategory> descriptionCategory = new ArrayList<DescriptionCategory>();
    @SerializedName("associationsCategories")
    @Expose
    private AssociationsCategory associationsCategories;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param position
     * @param level_depth
     * @param date_upd
     * @param link_rewrite
     * @param meta_keywords
     * @param date_add
     * @param id_shop_default
     * @param is_root_category
     * @param id
     * @param meta_description
     * @param id_parent
     * @param descriptionCategory
     * @param nb_products_recursive
     * @param nameCategory
     * @param associationsCategories
     * @param active
     * @param meta_title
     */
    public Category(Integer id, String id_parent, String level_depth, String nb_products_recursive, String active, String id_shop_default, String is_root_category, String position, String date_add, String date_upd, List<NameCategory> nameCategory, List<DescriptionCategory> descriptionCategory, AssociationsCategory associationsCategories) {
        this.id = id;
        this.id_parent = id_parent;
        this.level_depth = level_depth;
        this.nb_products_recursive = nb_products_recursive;
        this.active = active;
        this.id_shop_default = id_shop_default;
        this.is_root_category = is_root_category;
        this.position = position;
        this.date_add = date_add;
        this.date_upd = date_upd;
        this.nameCategory = nameCategory;
        this.descriptionCategory = descriptionCategory;
        this.associationsCategories = associationsCategories;
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
     *     The id_parent
     */
    public String getId_parent() {
        return id_parent;
    }

    /**
     * 
     * @param id_parent
     *     The id_parent
     */
    public void setId_parent(String id_parent) {
        this.id_parent = id_parent;
    }

    /**
     * 
     * @return
     *     The level_depth
     */
    public String getLevel_depth() {
        return level_depth;
    }

    /**
     * 
     * @param level_depth
     *     The level_depth
     */
    public void setLevel_depth(String level_depth) {
        this.level_depth = level_depth;
    }

    /**
     * 
     * @return
     *     The nb_products_recursive
     */
    public String getNb_products_recursive() {
        return nb_products_recursive;
    }

    /**
     * 
     * @param nb_products_recursive
     *     The nb_products_recursive
     */
    public void setNb_products_recursive(String nb_products_recursive) {
        this.nb_products_recursive = nb_products_recursive;
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
     *     The id_shop_default
     */
    public String getId_shop_default() {
        return id_shop_default;
    }

    /**
     * 
     * @param id_shop_default
     *     The id_shop_default
     */
    public void setId_shop_default(String id_shop_default) {
        this.id_shop_default = id_shop_default;
    }

    /**
     * 
     * @return
     *     The is_root_category
     */
    public String getIs_root_category() {
        return is_root_category;
    }

    /**
     * 
     * @param is_root_category
     *     The is_root_category
     */
    public void setIs_root_category(String is_root_category) {
        this.is_root_category = is_root_category;
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
     *     The date_add
     */
    public String getDate_add() {
        return date_add;
    }

    /**
     * 
     * @param date_add
     *     The date_add
     */
    public void setDate_add(String date_add) {
        this.date_add = date_add;
    }

    /**
     * 
     * @return
     *     The date_upd
     */
    public String getDate_upd() {
        return date_upd;
    }

    /**
     * 
     * @param date_upd
     *     The date_upd
     */
    public void setDate_upd(String date_upd) {
        this.date_upd = date_upd;
    }

    /**
     * 
     * @return
     *     The nameCategory
     */
    public List<NameCategory> getNameCategory() {
        return nameCategory;
    }

    /**
     * 
     * @param nameCategory
     *     The nameCategory
     */
    public void setNameCategory(List<NameCategory> nameCategory) {
        this.nameCategory = nameCategory;
    }

    /**
     * 
     * @return
     *     The descriptionCategory
     */
    public List<DescriptionCategory> getDescriptionCategory() {
        return descriptionCategory;
    }

    /**
     * 
     * @param descriptionCategory
     *     The descriptionCategory
     */
    public void setDescriptionCategory(List<DescriptionCategory> descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }

    /**
     * 
     * @param meta_description
     *     The meta_description
     */


    /**
     * 
     * @return
     *     The associationsCategories
     */
    public AssociationsCategory getAssociationsCategories() {
        return associationsCategories;
    }

    /**
     * 
     * @param associationsCategories
     *     The associationsCategories
     */
    public void setAssociationsCategories(AssociationsCategory associationsCategories) {
        this.associationsCategories = associationsCategories;
    }

}
