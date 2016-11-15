
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
    private String id_manufacturer;
    @SerializedName("id_supplier")
    @Expose
    private String id_supplier;
    @SerializedName("id_category_default")
    @Expose
    private String id_category_default;
    @SerializedName("new")
    @Expose
    private Object _new;
    @SerializedName("cache_default_attribute")
    @Expose
    private String cache_default_attribute;
    @SerializedName("id_default_image")
    @Expose
    private String id_default_image;
    @SerializedName("id_default_combination")
    @Expose
    private Integer id_default_combination;
    @SerializedName("id_tax_rules_group")
    @Expose
    private String id_tax_rules_group;
    @SerializedName("position_in_category")
    @Expose
    private String position_in_category;
    @SerializedName("manufacturer_name")
    @Expose
    private Boolean manufacturer_name;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id_shop_default")
    @Expose
    private String id_shop_default;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("supplier_reference")
    @Expose
    private String supplier_reference;
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
    private String quantity_discount;
    @SerializedName("ean13")
    @Expose
    private String ean13;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("cache_is_pack")
    @Expose
    private String cache_is_pack;
    @SerializedName("cache_has_attachments")
    @Expose
    private String cache_has_attachments;
    @SerializedName("is_virtual")
    @Expose
    private String is_virtual;
    @SerializedName("on_sale")
    @Expose
    private String on_sale;
    @SerializedName("online_only")
    @Expose
    private String online_only;
    @SerializedName("ecotax")
    @Expose
    private String ecotax;
    @SerializedName("minimal_quantity")
    @Expose
    private String minimal_quantity;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("wholesale_price")
    @Expose
    private String wholesale_price;
    @SerializedName("unity")
    @Expose
    private String unity;
    @SerializedName("unit_price_ratio")
    @Expose
    private String unit_price_ratio;
    @SerializedName("additional_shipping_cost")
    @Expose
    private String additional_shipping_cost;
    @SerializedName("customizable")
    @Expose
    private String customizable;
    @SerializedName("text_fields")
    @Expose
    private String text_fields;
    @SerializedName("uploadable_files")
    @Expose
    private String uploadable_files;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("redirect_type")
    @Expose
    private String redirect_type;
    @SerializedName("id_product_redirected")
    @Expose
    private String id_product_redirected;
    @SerializedName("available_for_order")
    @Expose
    private String available_for_order;
    @SerializedName("available_date")
    @Expose
    private String available_date;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("show_price")
    @Expose
    private String show_price;
    @SerializedName("indexed")
    @Expose
    private String indexed;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("advanced_stock_management")
    @Expose
    private String advanced_stock_management;
    @SerializedName("date_add")
    @Expose
    private String date_add;
    @SerializedName("date_upd")
    @Expose
    private String date_upd;
    @SerializedName("pack_stock_type")
    @Expose
    private String pack_stock_type;
    @SerializedName("nameProduct")
    @Expose
    private List<NameProduct> nameProduct = new ArrayList<NameProduct>();
    @SerializedName("descriptionProduct")
    @Expose
    private List<DescriptionProduct> descriptionProduct = new ArrayList<DescriptionProduct>();
    @SerializedName("description_short")
    @Expose
    private List<DescriptionShortProduct> description_short = new ArrayList<DescriptionShortProduct>();
    @SerializedName("available_now")
    @Expose
    private List<Available_now> available_now = new ArrayList<Available_now>();
    @SerializedName("available_later")
    @Expose
    private List<Available_later> available_later = new ArrayList<Available_later>();
    @SerializedName("associationsProduct")
    @Expose
    private AssociationsProduct associationsProduct;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param customizable
     * @param id_default_combination
     * @param date_upd
     * @param id_supplier
     * @param available_date
     * @param meta_keywords
     * @param location
     * @param additional_shipping_cost
     * @param visibility
     * @param type
     * @param available_now
     * @param id_shop_default
     * @param redirect_type
     * @param ecotax
     * @param height
     * @param descriptionProduct
     * @param id_manufacturer
     * @param quantity
     * @param show_price
     * @param available_later
     * @param cache_default_attribute
     * @param condition
     * @param width
     * @param advanced_stock_management
     * @param manufacturer_name
     * @param depth
     * @param quantity_discount
     * @param is_virtual
     * @param id_tax_rules_group
     * @param price
     * @param id_default_image
     * @param associationsProduct
     * @param _new
     * @param active
     * @param online_only
     * @param uploadable_files
     * @param id_category_default
     * @param weight
     * @param indexed
     * @param date_add
     * @param id
     * @param available_for_order
     * @param description_short
     * @param pack_stock_type
     * @param nameProduct
     * @param minimal_quantity
     * @param position_in_category
     * @param link_rewrite
     * @param cache_is_pack
     * @param text_fields
     * @param supplier_reference
     * @param on_sale
     * @param upc
     * @param reference
     * @param cache_has_attachments
     * @param meta_description
     * @param wholesale_price
     * @param unity
     * @param meta_title
     * @param unit_price_ratio
     * @param ean13
     * @param id_product_redirected
     */
    public Product(Integer id, String id_manufacturer, String id_supplier, String id_category_default, Object _new, String cache_default_attribute, String id_default_image, Integer id_default_combination, String id_tax_rules_group, String position_in_category, Boolean manufacturer_name, String quantity, String type, String id_shop_default, String reference, String supplier_reference, String location, String width, String height, String depth, String weight, String quantity_discount, String ean13, String upc, String cache_is_pack, String cache_has_attachments, String is_virtual, String on_sale, String online_only, String ecotax, String minimal_quantity, String price, String wholesale_price, String unity, String unit_price_ratio, String additional_shipping_cost, String customizable, String text_fields, String uploadable_files, String active, String redirect_type, String id_product_redirected, String available_for_order, String available_date, String condition, String show_price, String indexed, String visibility, String advanced_stock_management, String date_add, String date_upd, String pack_stock_type, List<NameProduct> nameProduct, List<DescriptionProduct> descriptionProduct, List<DescriptionShortProduct> description_short, List<Available_now> available_now, List<Available_later> available_later, AssociationsProduct associationsProduct) {
        this.id = id;
        this.id_manufacturer = id_manufacturer;
        this.id_supplier = id_supplier;
        this.id_category_default = id_category_default;
        this._new = _new;
        this.cache_default_attribute = cache_default_attribute;
        this.id_default_image = id_default_image;
        this.id_default_combination = id_default_combination;
        this.id_tax_rules_group = id_tax_rules_group;
        this.position_in_category = position_in_category;
        this.manufacturer_name = manufacturer_name;
        this.quantity = quantity;
        this.type = type;
        this.id_shop_default = id_shop_default;
        this.reference = reference;
        this.supplier_reference = supplier_reference;
        this.location = location;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.quantity_discount = quantity_discount;
        this.ean13 = ean13;
        this.upc = upc;
        this.cache_is_pack = cache_is_pack;
        this.cache_has_attachments = cache_has_attachments;
        this.is_virtual = is_virtual;
        this.on_sale = on_sale;
        this.online_only = online_only;
        this.ecotax = ecotax;
        this.minimal_quantity = minimal_quantity;
        this.price = price;
        this.wholesale_price = wholesale_price;
        this.unity = unity;
        this.unit_price_ratio = unit_price_ratio;
        this.additional_shipping_cost = additional_shipping_cost;
        this.customizable = customizable;
        this.text_fields = text_fields;
        this.uploadable_files = uploadable_files;
        this.active = active;
        this.redirect_type = redirect_type;
        this.id_product_redirected = id_product_redirected;
        this.available_for_order = available_for_order;
        this.available_date = available_date;
        this.condition = condition;
        this.show_price = show_price;
        this.indexed = indexed;
        this.visibility = visibility;
        this.advanced_stock_management = advanced_stock_management;
        this.date_add = date_add;
        this.date_upd = date_upd;
        this.pack_stock_type = pack_stock_type;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.description_short = description_short;
        this.available_now = available_now;
        this.available_later = available_later;
        this.associationsProduct = associationsProduct;
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
     *     The id_manufacturer
     */
    public String getId_manufacturer() {
        return id_manufacturer;
    }

    /**
     * 
     * @param id_manufacturer
     *     The id_manufacturer
     */
    public void setId_manufacturer(String id_manufacturer) {
        this.id_manufacturer = id_manufacturer;
    }

    /**
     * 
     * @return
     *     The id_supplier
     */
    public String getId_supplier() {
        return id_supplier;
    }

    /**
     * 
     * @param id_supplier
     *     The id_supplier
     */
    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    /**
     * 
     * @return
     *     The id_category_default
     */
    public String getId_category_default() {
        return id_category_default;
    }

    /**
     * 
     * @param id_category_default
     *     The id_category_default
     */
    public void setId_category_default(String id_category_default) {
        this.id_category_default = id_category_default;
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
     *     The cache_default_attribute
     */
    public String getCache_default_attribute() {
        return cache_default_attribute;
    }

    /**
     * 
     * @param cache_default_attribute
     *     The cache_default_attribute
     */
    public void setCache_default_attribute(String cache_default_attribute) {
        this.cache_default_attribute = cache_default_attribute;
    }

    /**
     * 
     * @return
     *     The id_default_image
     */
    public String getId_default_image() {
        return id_default_image;
    }

    /**
     * 
     * @param id_default_image
     *     The id_default_image
     */
    public void setId_default_image(String id_default_image) {
        this.id_default_image = id_default_image;
    }

    /**
     * 
     * @return
     *     The id_default_combination
     */
    public Integer getId_default_combination() {
        return id_default_combination;
    }

    /**
     * 
     * @param id_default_combination
     *     The id_default_combination
     */
    public void setId_default_combination(Integer id_default_combination) {
        this.id_default_combination = id_default_combination;
    }

    /**
     * 
     * @return
     *     The id_tax_rules_group
     */
    public String getId_tax_rules_group() {
        return id_tax_rules_group;
    }

    /**
     * 
     * @param id_tax_rules_group
     *     The id_tax_rules_group
     */
    public void setId_tax_rules_group(String id_tax_rules_group) {
        this.id_tax_rules_group = id_tax_rules_group;
    }

    /**
     * 
     * @return
     *     The position_in_category
     */
    public String getPosition_in_category() {
        return position_in_category;
    }

    /**
     * 
     * @param position_in_category
     *     The position_in_category
     */
    public void setPosition_in_category(String position_in_category) {
        this.position_in_category = position_in_category;
    }

    /**
     * 
     * @return
     *     The manufacturer_name
     */
    public Boolean getManufacturer_name() {
        return manufacturer_name;
    }

    /**
     * 
     * @param manufacturer_name
     *     The manufacturer_name
     */
    public void setManufacturer_name(Boolean manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
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
     *     The supplier_reference
     */
    public String getSupplier_reference() {
        return supplier_reference;
    }

    /**
     * 
     * @param supplier_reference
     *     The supplier_reference
     */
    public void setSupplier_reference(String supplier_reference) {
        this.supplier_reference = supplier_reference;
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
     *     The quantity_discount
     */
    public String getQuantity_discount() {
        return quantity_discount;
    }

    /**
     * 
     * @param quantity_discount
     *     The quantity_discount
     */
    public void setQuantity_discount(String quantity_discount) {
        this.quantity_discount = quantity_discount;
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
     *     The cache_is_pack
     */
    public String getCache_is_pack() {
        return cache_is_pack;
    }

    /**
     * 
     * @param cache_is_pack
     *     The cache_is_pack
     */
    public void setCache_is_pack(String cache_is_pack) {
        this.cache_is_pack = cache_is_pack;
    }

    /**
     * 
     * @return
     *     The cache_has_attachments
     */
    public String getCache_has_attachments() {
        return cache_has_attachments;
    }

    /**
     * 
     * @param cache_has_attachments
     *     The cache_has_attachments
     */
    public void setCache_has_attachments(String cache_has_attachments) {
        this.cache_has_attachments = cache_has_attachments;
    }

    /**
     * 
     * @return
     *     The is_virtual
     */
    public String getIs_virtual() {
        return is_virtual;
    }

    /**
     * 
     * @param is_virtual
     *     The is_virtual
     */
    public void setIs_virtual(String is_virtual) {
        this.is_virtual = is_virtual;
    }

    /**
     * 
     * @return
     *     The on_sale
     */
    public String getOn_sale() {
        return on_sale;
    }

    /**
     * 
     * @param on_sale
     *     The on_sale
     */
    public void setOn_sale(String on_sale) {
        this.on_sale = on_sale;
    }

    /**
     * 
     * @return
     *     The online_only
     */
    public String getOnline_only() {
        return online_only;
    }

    /**
     * 
     * @param online_only
     *     The online_only
     */
    public void setOnline_only(String online_only) {
        this.online_only = online_only;
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
     *     The minimal_quantity
     */
    public String getMinimal_quantity() {
        return minimal_quantity;
    }

    /**
     * 
     * @param minimal_quantity
     *     The minimal_quantity
     */
    public void setMinimal_quantity(String minimal_quantity) {
        this.minimal_quantity = minimal_quantity;
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
     *     The wholesale_price
     */
    public String getWholesale_price() {
        return wholesale_price;
    }

    /**
     * 
     * @param wholesale_price
     *     The wholesale_price
     */
    public void setWholesale_price(String wholesale_price) {
        this.wholesale_price = wholesale_price;
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
     *     The unit_price_ratio
     */
    public String getUnit_price_ratio() {
        return unit_price_ratio;
    }

    /**
     * 
     * @param unit_price_ratio
     *     The unit_price_ratio
     */
    public void setUnit_price_ratio(String unit_price_ratio) {
        this.unit_price_ratio = unit_price_ratio;
    }

    /**
     * 
     * @return
     *     The additional_shipping_cost
     */
    public String getAdditional_shipping_cost() {
        return additional_shipping_cost;
    }

    /**
     * 
     * @param additional_shipping_cost
     *     The additional_shipping_cost
     */
    public void setAdditional_shipping_cost(String additional_shipping_cost) {
        this.additional_shipping_cost = additional_shipping_cost;
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
     *     The text_fields
     */
    public String getText_fields() {
        return text_fields;
    }

    /**
     * 
     * @param text_fields
     *     The text_fields
     */
    public void setText_fields(String text_fields) {
        this.text_fields = text_fields;
    }

    /**
     * 
     * @return
     *     The uploadable_files
     */
    public String getUploadable_files() {
        return uploadable_files;
    }

    /**
     * 
     * @param uploadable_files
     *     The uploadable_files
     */
    public void setUploadable_files(String uploadable_files) {
        this.uploadable_files = uploadable_files;
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
     *     The redirect_type
     */
    public String getRedirect_type() {
        return redirect_type;
    }

    /**
     * 
     * @param redirect_type
     *     The redirect_type
     */
    public void setRedirect_type(String redirect_type) {
        this.redirect_type = redirect_type;
    }

    /**
     * 
     * @return
     *     The id_product_redirected
     */
    public String getId_product_redirected() {
        return id_product_redirected;
    }

    /**
     * 
     * @param id_product_redirected
     *     The id_product_redirected
     */
    public void setId_product_redirected(String id_product_redirected) {
        this.id_product_redirected = id_product_redirected;
    }

    /**
     * 
     * @return
     *     The available_for_order
     */
    public String getAvailable_for_order() {
        return available_for_order;
    }

    /**
     * 
     * @param available_for_order
     *     The available_for_order
     */
    public void setAvailable_for_order(String available_for_order) {
        this.available_for_order = available_for_order;
    }

    /**
     * 
     * @return
     *     The available_date
     */
    public String getAvailable_date() {
        return available_date;
    }

    /**
     * 
     * @param available_date
     *     The available_date
     */
    public void setAvailable_date(String available_date) {
        this.available_date = available_date;
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
     *     The show_price
     */
    public String getShow_price() {
        return show_price;
    }

    /**
     * 
     * @param show_price
     *     The show_price
     */
    public void setShow_price(String show_price) {
        this.show_price = show_price;
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
     *     The advanced_stock_management
     */
    public String getAdvanced_stock_management() {
        return advanced_stock_management;
    }

    /**
     * 
     * @param advanced_stock_management
     *     The advanced_stock_management
     */
    public void setAdvanced_stock_management(String advanced_stock_management) {
        this.advanced_stock_management = advanced_stock_management;
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
     *     The pack_stock_type
     */
    public String getPack_stock_type() {
        return pack_stock_type;
    }

    /**
     * 
     * @param pack_stock_type
     *     The pack_stock_type
     */
    public void setPack_stock_type(String pack_stock_type) {
        this.pack_stock_type = pack_stock_type;
    }

    /**
     * 
     * @return
     *     The nameProduct
     */
    public List<NameProduct> getNameProduct() {
        return nameProduct;
    }

    /**
     * 
     * @param nameProduct
     *     The nameProduct
     */
    public void setNameProduct(List<NameProduct> nameProduct) {
        this.nameProduct = nameProduct;
    }

    /**
     * 
     * @return
     *     The descriptionProduct
     */
    public List<DescriptionProduct> getDescriptionProduct() {
        return descriptionProduct;
    }

    /**
     * 
     * @param descriptionProduct
     *     The descriptionProduct
     */
    public void setDescriptionProduct(List<DescriptionProduct> descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    /**
     * 
     * @return
     *     The description_short
     */
    public List<DescriptionShortProduct> getDescription_short() {
        return description_short;
    }

    /**
     * 
     * @param description_short
     *     The description_short
     */
    public void setDescription_short(List<DescriptionShortProduct> description_short) {
        this.description_short = description_short;
    }

    /**
     * 
     * @return
     *     The available_now
     */
    public List<Available_now> getAvailable_now() {
        return available_now;
    }

    /**
     * 
     * @param available_now
     *     The available_now
     */
    public void setAvailable_now(List<Available_now> available_now) {
        this.available_now = available_now;
    }

    /**
     * 
     * @return
     *     The available_later
     */
    public List<Available_later> getAvailable_later() {
        return available_later;
    }

    /**
     * 
     * @param available_later
     *     The available_later
     */
    public void setAvailable_later(List<Available_later> available_later) {
        this.available_later = available_later;
    }

    /**
     * 
     * @return
     *     The associationsProduct
     */
    public AssociationsProduct getAssociationsProduct() {
        return associationsProduct;
    }

    /**
     * 
     * @param associationsProduct
     *     The associationsProduct
     */
    public void setAssociationsProduct(AssociationsProduct associationsProduct) {
        this.associationsProduct = associationsProduct;
    }

}
