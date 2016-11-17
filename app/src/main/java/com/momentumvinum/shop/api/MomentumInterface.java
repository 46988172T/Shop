package com.momentumvinum.shop.api;

import com.momentumvinum.shop.pojos.content_pojos.categories.ModelCategories;
import com.momentumvinum.shop.pojos.content_pojos.products.ModelProducts;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Creador por Leonardo Martínez Ubal el 15/11/2016 a las 21:23.
 * Contacto: leonardomartinezubal3@gmail.com
 */

public interface MomentumInterface {

    @GET("categories")
    Call<ModelCategories> getCategories(@Query("ws_key") String api_key, @Query("output_format") String format, @Query("display") String display);

    @GET("products")
    Call<ModelProducts> getProducts(@Query("ws_key") String api_key, @Query("output_format") String format, @Query("display") String display);
}
