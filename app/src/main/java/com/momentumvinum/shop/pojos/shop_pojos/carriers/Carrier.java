
package com.momentumvinum.shop.pojos.shop_pojos.carriers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Carrier {

    private int id;
    private String deleted;
    private String isModule;
    private String idTaxRulesGroup;
    private String idReference;
    private String name;
    private String active;
    private String isFree;
    private String url;
    private String shippingHandling;
    private String shippingExternal;
    private String rangeBehavior;
    private String shippingMethod;
    private String maxWidth;
    private String maxHeight;
    private String maxDepth;
    private String maxWeight;
    private String grade;
    private String externalModuleName;
    private String needRange;
    private String position;
    private List<Delay> delay = new ArrayList<Delay>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Carrier() {
    }

    /**
     * 
     * @param position
     * @param idTaxRulesGroup
     * @param isModule
     * @param shippingMethod
     * @param deleted
     * @param url
     * @param needRange
     * @param idReference
     * @param id
     * @param maxWeight
     * @param maxDepth
     * @param isFree
     * @param name
     * @param maxHeight
     * @param maxWidth
     * @param grade
     * @param active
     * @param externalModuleName
     * @param delay
     * @param rangeBehavior
     * @param shippingExternal
     * @param shippingHandling
     */
    public Carrier(int id, String deleted, String isModule, String idTaxRulesGroup, String idReference, String name, String active, String isFree, String url, String shippingHandling, String shippingExternal, String rangeBehavior, String shippingMethod, String maxWidth, String maxHeight, String maxDepth, String maxWeight, String grade, String externalModuleName, String needRange, String position, List<Delay> delay) {
        this.id = id;
        this.deleted = deleted;
        this.isModule = isModule;
        this.idTaxRulesGroup = idTaxRulesGroup;
        this.idReference = idReference;
        this.name = name;
        this.active = active;
        this.isFree = isFree;
        this.url = url;
        this.shippingHandling = shippingHandling;
        this.shippingExternal = shippingExternal;
        this.rangeBehavior = rangeBehavior;
        this.shippingMethod = shippingMethod;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.maxDepth = maxDepth;
        this.maxWeight = maxWeight;
        this.grade = grade;
        this.externalModuleName = externalModuleName;
        this.needRange = needRange;
        this.position = position;
        this.delay = delay;
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
     *     The isModule
     */
    public String getIsModule() {
        return isModule;
    }

    /**
     * 
     * @param isModule
     *     The is_module
     */
    public void setIsModule(String isModule) {
        this.isModule = isModule;
    }

    /**
     * 
     * @return
     *     The idTaxRulesGroup
     */
    public String getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    /**
     * 
     * @param idTaxRulesGroup
     *     The id_tax_rules_group
     */
    public void setIdTaxRulesGroup(String idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    /**
     * 
     * @return
     *     The idReference
     */
    public String getIdReference() {
        return idReference;
    }

    /**
     * 
     * @param idReference
     *     The id_reference
     */
    public void setIdReference(String idReference) {
        this.idReference = idReference;
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
     *     The isFree
     */
    public String getIsFree() {
        return isFree;
    }

    /**
     * 
     * @param isFree
     *     The is_free
     */
    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The shippingHandling
     */
    public String getShippingHandling() {
        return shippingHandling;
    }

    /**
     * 
     * @param shippingHandling
     *     The shipping_handling
     */
    public void setShippingHandling(String shippingHandling) {
        this.shippingHandling = shippingHandling;
    }

    /**
     * 
     * @return
     *     The shippingExternal
     */
    public String getShippingExternal() {
        return shippingExternal;
    }

    /**
     * 
     * @param shippingExternal
     *     The shipping_external
     */
    public void setShippingExternal(String shippingExternal) {
        this.shippingExternal = shippingExternal;
    }

    /**
     * 
     * @return
     *     The rangeBehavior
     */
    public String getRangeBehavior() {
        return rangeBehavior;
    }

    /**
     * 
     * @param rangeBehavior
     *     The range_behavior
     */
    public void setRangeBehavior(String rangeBehavior) {
        this.rangeBehavior = rangeBehavior;
    }

    /**
     * 
     * @return
     *     The shippingMethod
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * 
     * @param shippingMethod
     *     The shipping_method
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     * 
     * @return
     *     The maxWidth
     */
    public String getMaxWidth() {
        return maxWidth;
    }

    /**
     * 
     * @param maxWidth
     *     The max_width
     */
    public void setMaxWidth(String maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * 
     * @return
     *     The maxHeight
     */
    public String getMaxHeight() {
        return maxHeight;
    }

    /**
     * 
     * @param maxHeight
     *     The max_height
     */
    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * 
     * @return
     *     The maxDepth
     */
    public String getMaxDepth() {
        return maxDepth;
    }

    /**
     * 
     * @param maxDepth
     *     The max_depth
     */
    public void setMaxDepth(String maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * 
     * @return
     *     The maxWeight
     */
    public String getMaxWeight() {
        return maxWeight;
    }

    /**
     * 
     * @param maxWeight
     *     The max_weight
     */
    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * 
     * @return
     *     The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 
     * @param grade
     *     The grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return
     *     The externalModuleName
     */
    public String getExternalModuleName() {
        return externalModuleName;
    }

    /**
     * 
     * @param externalModuleName
     *     The external_module_name
     */
    public void setExternalModuleName(String externalModuleName) {
        this.externalModuleName = externalModuleName;
    }

    /**
     * 
     * @return
     *     The needRange
     */
    public String getNeedRange() {
        return needRange;
    }

    /**
     * 
     * @param needRange
     *     The need_range
     */
    public void setNeedRange(String needRange) {
        this.needRange = needRange;
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
     *     The delay
     */
    public List<Delay> getDelay() {
        return delay;
    }

    /**
     * 
     * @param delay
     *     The delay
     */
    public void setDelay(List<Delay> delay) {
        this.delay = delay;
    }

}
