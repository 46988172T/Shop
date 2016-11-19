package com.momentumvinum.shop.api;

import com.momentumvinum.shop.FragmentMain;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.categories.ModelCategories;
import com.momentumvinum.shop.pojos.content_pojos.products.ModelProducts;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Creador por Leonardo Martínez Ubal el 15/11/2016 a las 21:23.
 * Contacto: leonardomartinezubal3@gmail.com
 */

public class MomentumApi {
    private final MomentumInterface servicio;
    private static String BASE_URL = Config.BASE_API;
    private static String APPID = Config.TOKEN_API;

    public MomentumApi (){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        servicio = retrofit.create(MomentumInterface.class);
    }

    /**
     * Conecta a la API de MomentumVinum y 'hace una foto' de todas las categorias, creando un arraylist, que lo pasamos a classes.busqueda.BusquedaVinos.class
     */
    public void mostrarCategorias(){
        String format = "JSON";
        String display = "full";
        Call<ModelCategories> llamadaModelCategories = servicio.getCategories(APPID, format, display );
        llamadaModelCategories.enqueue(new Callback<ModelCategories>() {
            @Override
            public void onResponse(Call<ModelCategories> call, Response<ModelCategories> response) {
                ModelCategories categories = response.body();
                BusquedaVinos.responseCategorias = (ArrayList)categories.getCategories();
                FragmentMain.connOkCats();
            }

            @Override
            public void onFailure(Call<ModelCategories> call, Throwable t) {
                FragmentMain.connFailCats();
            }
        });
    }

    /**
     * Conecta a la API de MomentumVinum y 'hace una foto' de todos los productos, creando un arraylist, que lo pasamos a classes.busqueda.BusquedaVinos.class
     */
    public void mostrarProductos(){
        String format = "JSON";
        String display = "full";
        Call<ModelProducts> llamadaModelProducs = servicio.getProducts(APPID, format, display);
        llamadaModelProducs.enqueue(new Callback<ModelProducts>() {
            @Override
            public void onResponse(Call<ModelProducts> call, Response<ModelProducts> response) {
                ModelProducts products = response.body();
                BusquedaVinos.responseProductos = (ArrayList) products.getProducts();
                FragmentMain.connOkProds();
            }

            @Override
            public void onFailure(Call<ModelProducts> call, Throwable t) {
                FragmentMain.connFailProds();
            }
        });
    }

}
