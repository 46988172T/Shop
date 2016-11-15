
package com.momentumvinum.shop.pojo.products;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Product {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_manufacturer")
    @Expose
    private String idManufacturer;
    @SerializedName("id_supplier")
    @Expose
    private String idSupplier;
    @SerializedName("id_category_default")
    @Expose
    private String idCategoryDefault;
    @SerializedName("new")
    @Expose
    private Object _new;
    @SerializedName("cache_default_attribute")
    @Expose
    private String cacheDefaultAttribute;
    @SerializedName("id_default_image")
    @Expose
    private String idDefaultImage;
    @SerializedName("id_default_combination")
    @Expose
    private Integer idDefaultCombination;
    @SerializedName("id_tax_rules_group")
    @Expose
    private String idTaxRulesGroup;
    @SerializedName("position_in_category")
    @Expose
    private String positionInCategory;
    @SerializedName("manufacturer_name")
    @Expose
    private Boolean manufacturerName;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id_shop_default")
    @Expose
    private String idShopDefault;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("supplier_reference")
    @Expose
    private String supplierReference;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("depth")
    @Expose
    private String depth;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("quantity_discount")
    @Expose
    private String quantityDiscount;
    @SerializedName("ean13")
    @Expose
    private String ean13;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("cache_is_pack")
    @Expose
    private String cacheIsPack;
    @SerializedName("cache_has_attachments")
    @Expose
    private String cacheHasAttachments;
    @SerializedName("is_virtual")
    @Expose
    private String isVirtual;
    @SerializedName("on_sale")
    @Expose
    private String onSale;
    @SerializedName("online_only")
    @Expose
    private String onlineOnly;
    @SerializedName("ecotax")
    @Expose
    private String ecotax;
    @SerializedName("minimal_quantity")
    @Expose
    private String minimalQuantity;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("wholesale_price")
    @Expose
    private String wholesalePrice;
    @SerializedName("unity")
    @Expose
    private String unity;
    @SerializedName("unit_price_ratio")
    @Expose
    private String unitPriceRatio;
    @SerializedName("additional_shipping_cost")
    @Expose
    private String additionalShippingCost;
    @SerializedName("customizable")
    @Expose
    private String customizable;
    @SerializedName("text_fields")
    @Expose
    private String textFields;
    @SerializedName("uploadable_files")
    @Expose
    private String uploadableFiles;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("redirect_type")
    @Expose
    private String redirectType;
    @SerializedName("id_product_redirected")
    @Expose
    private String idProductRedirected;
    @SerializedName("available_for_order")
    @Expose
    private String availableForOrder;
    @SerializedName("available_date")
    @Expose
    private String availableDate;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("show_price")
    @Expose
    private String showPrice;
    @SerializedName("indexed")
    @Expose
    private String indexed;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("advanced_stock_management")
    @Expose
    private String advancedStockManagement;
    @SerializedName("date_add")
    @Expose
    private String dateAdd;
    @SerializedName("date_upd")
    @Expose
    private String dateUpd;
    @SerializedName("pack_stock_type")
    @Expose
    private String packStockType;
    @SerializedName("meta_description")
    @Expose
    private List<MetaDescription> metaDescription = new ArrayList<MetaDescription>();
    @SerializedName("meta_keywords")
    @Expose
    private List<MetaKeyword> metaKeywords = new ArrayList<MetaKeyword>();
    @SerializedName("meta_title")
    @Expose
    private List<MetaTitle> metaTitle = new ArrayList<MetaTitle>();
    @SerializedName("link_rewrite")
    @Expose
    private List<LinkRewrite> linkRewrite = new ArrayList<LinkRewrite>();
    @SerializedName("name")
    @Expose
    private List<Name> name = new ArrayList<Name>();
    @SerializedName("description")
    @Expose
    private List<Description> description = new ArrayList<Description>();
    @SerializedName("description_short")
    @Expose
    private List<DescriptionShort> descriptionShort = new ArrayList<DescriptionShort>();
    @SerializedName("available_now")
    @Expose
    private List<AvailableNow> availableNow = new ArrayList<AvailableNow>();
    @SerializedName("available_later")
    @Expose
    private List<AvailableLater> availableLater = new ArrayList<AvailableLater>();
    @SerializedName("associations")
    @Expose
    private Associations associations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param availableNow
     * @param customizable
     * @param packStockType
     * @param uploadableFiles
     * @param textFields
     * @param location
     * @param idSupplier
     * @param visibility
     * @param type
     * @param positionInCategory
     * @param availableForOrder
     * @param cacheIsPack
     * @param ecotax
     * @param height
     * @param description
     * @param quantity
     * @param minimalQuantity
     * @param idProductRedirected
     * @param idShopDefault
     * @param wholesalePrice
     * @param condition
     * @param width
     * @param showPrice
     * @param cacheDefaultAttribute
     * @param depth
     * @param dateAdd
     * @param idDefaultCombination
     * @param price
     * @param associations
     * @param _new
     * @param active
     * @param idTaxRulesGroup
     * @param weight
     * @param idCategoryDefault
     * @param indexed
     * @param metaKeywords
     * @param onlineOnly
     * @param metaTitle
     * @param additionalShippingCost
     * @param id
     * @param availableDate
     * @param advancedStockManagement
     * @param cacheHasAttachments
     * @param dateUpd
     * @param name
     * @param idDefaultImage
     * @param descriptionShort
     * @param supplierReference
     * @param onSale
     * @param metaDescription
     * @param redirectType
     * @param isVirtual
     * @param upc
     * @param quantityDiscount
     * @param reference
     * @param unitPriceRatio
     * @param unity
     * @param availableLater
     * @param manufacturerName
     * @param linkRewrite
     * @param ean13
     * @param idManufacturer
     */
    public Product(Integer id, String idManufacturer, String idSupplier, String idCategoryDefault, Object _new, String cacheDefaultAttribute, String idDefaultImage, Integer idDefaultCombination, String idTaxRulesGroup, String positionInCategory, Boolean manufacturerName, String quantity, String type, String idShopDefault, String reference, String supplierReference, String location, String width, String height, String depth, String weight, String quantityDiscount, String ean13, String upc, String cacheIsPack, String cacheHasAttachments, String isVirtual, String onSale, String onlineOnly, String ecotax, String minimalQuantity, String price, String wholesalePrice, String unity, String unitPriceRatio, String additionalShippingCost, String customizable, String textFields, String uploadableFiles, String active, String redirectType, String idProductRedirected, String availableForOrder, String availableDate, String condition, String showPrice, String indexed, String visibility, String advancedStockManagement, String dateAdd, String dateUpd, String packStockType, List<MetaDescription> metaDescription, List<MetaKeyword> metaKeywords, List<MetaTitle> metaTitle, List<LinkRewrite> linkRewrite, List<Name> name, List<Description> description, List<DescriptionShort> descriptionShort, List<AvailableNow> availableNow, List<AvailableLater> availableLater, Associations associations) {
        this.id = id;
        this.idManufacturer = idManufacturer;
        this.idSupplier = idSupplier;
        this.idCategoryDefault = idCategoryDefault;
        this._new = _new;
        this.cacheDefaultAttribute = cacheDefaultAttribute;
        this.idDefaultImage = idDefaultImage;
        this.idDefaultCombination = idDefaultCombination;
        this.idTaxRulesGroup = idTaxRulesGroup;
        this.positionInCategory = positionInCategory;
        this.manufacturerName = manufacturerName;
        this.quantity = quantity;
        this.type = type;
        this.idShopDefault = idShopDefault;
        this.reference = reference;
        this.supplierReference = supplierReference;
        this.location = location;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.quantityDiscount = quantityDiscount;
        this.ean13 = ean13;
        this.upc = upc;
        this.cacheIsPack = cacheIsPack;
        this.cacheHasAttachments = cacheHasAttachments;
        this.isVirtual = isVirtual;
        this.onSale = onSale;
        this.onlineOnly = onlineOnly;
        this.ecotax = ecotax;
        this.minimalQuantity = minimalQuantity;
        this.price = price;
        this.wholesalePrice = wholesalePrice;
        this.unity = unity;
        this.unitPriceRatio = unitPriceRatio;
        this.additionalShippingCost = additionalShippingCost;
        this.customizable = customizable;
        this.textFields = textFields;
        this.uploadableFiles = uploadableFiles;
        this.active = active;
        this.redirectType = redirectType;
        this.idProductRedirected = idProductRedirected;
        this.availableForOrder = availableForOrder;
        this.availableDate = availableDate;
        this.condition = condition;
        this.showPrice = showPrice;
        this.indexed = indexed;
        this.visibility = visibility;
        this.advancedStockManagement = advancedStockManagement;
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
        this.packStockType = packStockType;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.metaTitle = metaTitle;
        this.linkRewrite = linkRewrite;
        this.name = name;
        this.description = description;
        this.descriptionShort = descriptionShort;
        this.availableNow = availableNow;
        this.availableLater = availableLater;
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
     *     The idCategoryDefault
     */
    public String getIdCategoryDefault() {
        return idCategoryDefault;
    }

    /**
     * 
     * @param idCategoryDefault
     *     The id_category_default
     */
    public void setIdCategoryDefault(String idCategoryDefault) {
        this.idCategoryDefault = idCategoryDefault;
    }

    /**
     * 
     * @return
     *     The _new
     */
    public Object getNew() {
        return _new;
    }

    /**
     * 
     * @param _new
     *     The new
     */
    public void setNew(Object _new) {
        this._new = _new;
    }

    /**
     * 
     * @return
     *     The cacheDefaultAttribute
     */
    public String getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    /**
     * 
     * @param cacheDefaultAttribute
     *     The cache_default_attribute
     */
    public void setCacheDefaultAttribute(String cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
    }

    /**
     * 
     * @return
     *     The idDefaultImage
     */
    public String getIdDefaultImage() {
        return idDefaultImage;
    }

    /**
     * 
     * @param idDefaultImage
     *     The id_default_image
     */
    public void setIdDefaultImage(String idDefaultImage) {
        this.idDefaultImage = idDefaultImage;
    }

    /**
     * 
     * @return
     *     The idDefaultCombination
     */
    public Integer getIdDefaultCombination() {
        return idDefaultCombination;
    }

    /**
     * 
     * @param idDefaultCombination
     *     The id_default_combination
     */
    public void setIdDefaultCombination(Integer idDefaultCombination) {
        this.idDefaultCombination = idDefaultCombination;
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
     *     The positionInCategory
     */
    public String getPositionInCategory() {
        return positionInCategory;
    }

    /**
     * 
     * @param positionInCategory
     *     The position_in_category
     */
    public void setPositionInCategory(String positionInCategory) {
        this.positionInCategory = positionInCategory;
    }

    /**
     * 
     * @return
     *     The manufacturerName
     */
    public Boolean getManufacturerName() {
        return manufacturerName;
    }

    /**
     * 
     * @param manufacturerName
     *     The manufacturer_name
     */
    public void setManufacturerName(Boolean manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
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
     *     The reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * 
     * @return
     *     The supplierReference
     */
    public String getSupplierReference() {
        return supplierReference;
    }

    /**
     * 
     * @param supplierReference
     *     The supplier_reference
     */
    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The width
     */
    public String getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The depth
     */
    public String getDepth() {
        return depth;
    }

    /**
     * 
     * @param depth
     *     The depth
     */
    public void setDepth(String depth) {
        this.depth = depth;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The quantityDiscount
     */
    public String getQuantityDiscount() {
        return quantityDiscount;
    }

    /**
     * 
     * @param quantityDiscount
     *     The quantity_discount
     */
    public void setQuantityDiscount(String quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }

    /**
     * 
     * @return
     *     The ean13
     */
    public String getEan13() {
        return ean13;
    }

    /**
     * 
     * @param ean13
     *     The ean13
     */
    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    /**
     * 
     * @return
     *     The upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * 
     * @param upc
     *     The upc
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * 
     * @return
     *     The cacheIsPack
     */
    public String getCacheIsPack() {
        return cacheIsPack;
    }

    /**
     * 
     * @param cacheIsPack
     *     The cache_is_pack
     */
    public void setCacheIsPack(String cacheIsPack) {
        this.cacheIsPack = cacheIsPack;
    }

    /**
     * 
     * @return
     *     The cacheHasAttachments
     */
    public String getCacheHasAttachments() {
        return cacheHasAttachments;
    }

    /**
     * 
     * @param cacheHasAttachments
     *     The cache_has_attachments
     */
    public void setCacheHasAttachments(String cacheHasAttachments) {
        this.cacheHasAttachments = cacheHasAttachments;
    }

    /**
     * 
     * @return
     *     The isVirtual
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * 
     * @param isVirtual
     *     The is_virtual
     */
    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    /**
     * 
     * @return
     *     The onSale
     */
    public String getOnSale() {
        return onSale;
    }

    /**
     * 
     * @param onSale
     *     The on_sale
     */
    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    /**
     * 
     * @return
     *     The onlineOnly
     */
    public String getOnlineOnly() {
        return onlineOnly;
    }

    /**
     * 
     * @param onlineOnly
     *     The online_only
     */
    public void setOnlineOnly(String onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    /**
     * 
     * @return
     *     The ecotax
     */
    public String getEcotax() {
        return ecotax;
    }

    /**
     * 
     * @param ecotax
     *     The ecotax
     */
    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }

    /**
     * 
     * @return
     *     The minimalQuantity
     */
    public String getMinimalQuantity() {
        return minimalQuantity;
    }

    /**
     * 
     * @param minimalQuantity
     *     The minimal_quantity
     */
    public void setMinimalQuantity(String minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The wholesalePrice
     */
    public String getWholesalePrice() {
        return wholesalePrice;
    }

    /**
     * 
     * @param wholesalePrice
     *     The wholesale_price
     */
    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    /**
     * 
     * @return
     *     The unity
     */
    public String getUnity() {
        return unity;
    }

    /**
     * 
     * @param unity
     *     The unity
     */
    public void setUnity(String unity) {
        this.unity = unity;
    }

    /**
     * 
     * @return
     *     The unitPriceRatio
     */
    public String getUnitPriceRatio() {
        return unitPriceRatio;
    }

    /**
     * 
     * @param unitPriceRatio
     *     The unit_price_ratio
     */
    public void setUnitPriceRatio(String unitPriceRatio) {
        this.unitPriceRatio = unitPriceRatio;
    }

    /**
     * 
     * @return
     *     The additionalShippingCost
     */
    public String getAdditionalShippingCost() {
        return additionalShippingCost;
    }

    /**
     * 
     * @param additionalShippingCost
     *     The additional_shipping_cost
     */
    public void setAdditionalShippingCost(String additionalShippingCost) {
        this.additionalShippingCost = additionalShippingCost;
    }

    /**
     * 
     * @return
     *     The customizable
     */
    public String getCustomizable() {
        return customizable;
    }

    /**
     * 
     * @param customizable
     *     The customizable
     */
    public void setCustomizable(String customizable) {
        this.customizable = customizable;
    }

    /**
     * 
     * @return
     *     The textFields
     */
    public String getTextFields() {
        return textFields;
    }

    /**
     * 
     * @param textFields
     *     The text_fields
     */
    public void setTextFields(String textFields) {
        this.textFields = textFields;
    }

    /**
     * 
     * @return
     *     The uploadableFiles
     */
    public String getUploadableFiles() {
        return uploadableFiles;
    }

    /**
     * 
     * @param uploadableFiles
     *     The uploadable_files
     */
    public void setUploadableFiles(String uploadableFiles) {
        this.uploadableFiles = uploadableFiles;
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
     *     The redirectType
     */
    public String getRedirectType() {
        return redirectType;
    }

    /**
     * 
     * @param redirectType
     *     The redirect_type
     */
    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }

    /**
     * 
     * @return
     *     The idProductRedirected
     */
    public String getIdProductRedirected() {
        return idProductRedirected;
    }

    /**
     * 
     * @param idProductRedirected
     *     The id_product_redirected
     */
    public void setIdProductRedirected(String idProductRedirected) {
        this.idProductRedirected = idProductRedirected;
    }

    /**
     * 
     * @return
     *     The availableForOrder
     */
    public String getAvailableForOrder() {
        return availableForOrder;
    }

    /**
     * 
     * @param availableForOrder
     *     The available_for_order
     */
    public void setAvailableForOrder(String availableForOrder) {
        this.availableForOrder = availableForOrder;
    }

    /**
     * 
     * @return
     *     The availableDate
     */
    public String getAvailableDate() {
        return availableDate;
    }

    /**
     * 
     * @param availableDate
     *     The available_date
     */
    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }

    /**
     * 
     * @return
     *     The condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * 
     * @param condition
     *     The condition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * 
     * @return
     *     The showPrice
     */
    public String getShowPrice() {
        return showPrice;
    }

    /**
     * 
     * @param showPrice
     *     The show_price
     */
    public void setShowPrice(String showPrice) {
        this.showPrice = showPrice;
    }

    /**
     * 
     * @return
     *     The indexed
     */
    public String getIndexed() {
        return indexed;
    }

    /**
     * 
     * @param indexed
     *     The indexed
     */
    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The advancedStockManagement
     */
    public String getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    /**
     * 
     * @param advancedStockManagement
     *     The advanced_stock_management
     */
    public void setAdvancedStockManagement(String advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
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
     *     The packStockType
     */
    public String getPackStockType() {
        return packStockType;
    }

    /**
     * 
     * @param packStockType
     *     The pack_stock_type
     */
    public void setPackStockType(String packStockType) {
        this.packStockType = packStockType;
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
     *     The descriptionShort
     */
    public List<DescriptionShort> getDescriptionShort() {
        return descriptionShort;
    }

    /**
     * 
     * @param descriptionShort
     *     The description_short
     */
    public void setDescriptionShort(List<DescriptionShort> descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    /**
     * 
     * @return
     *     The availableNow
     */
    public List<AvailableNow> getAvailableNow() {
        return availableNow;
    }

    /**
     * 
     * @param availableNow
     *     The available_now
     */
    public void setAvailableNow(List<AvailableNow> availableNow) {
        this.availableNow = availableNow;
    }

    /**
     * 
     * @return
     *     The availableLater
     */
    public List<AvailableLater> getAvailableLater() {
        return availableLater;
    }

    /**
     * 
     * @param availableLater
     *     The available_later
     */
    public void setAvailableLater(List<AvailableLater> availableLater) {
        this.availableLater = availableLater;
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
