
package com.momentumvinum.shop.pojo.products;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ImageProduct {

    @SerializedName("id")
    @Expose
    private String id;
    //esta id se refiere a la id de la imagen, no del producto. Por ejemplo:
    //http://www.momentumvinum.com/api/images/products/500/5120?output_format=JSON
    //500 hace referencia a la id del producto.
    //5120 a la id de esta clase

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageProduct() {
    }

    /**
     * 
     * @param id
     */
    public ImageProduct(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

}
