package com.momentumvinum.shop.retrofit;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.momentumvinum.shop.MainActivity;
import com.momentumvinum.shop.pojo.categories.CategoriesList;
import com.momentumvinum.shop.pojo.categories.Category;
import com.momentumvinum.shop.pojo.categories.CategoryItemId;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static android.content.ContentValues.TAG;

/**
 * Creador por Leonardo Martínez Ubal el 14/11/2016 a las 22:42.
 * Contacto: leonardomartinezubal3@gmail.com
 */

interface InterfaceMomentum{

    @GET("categories/{id}")
    Call<Category> getCategory(@Path("id") int id, @Header("Authorization") String apikey, @Query("output_format") String JSON);

}

public class RetrofitMomentum {

    private final String BASE_URL = "http://www.momentumvinum.com/api/";
    private final static String APIKEY_CATEGORIES = "KXU1WG9C1IM59M4U7TS4ZV1HK3GJFD4A";

    Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    private final InterfaceMomentum servicio = retrofit.create(InterfaceMomentum.class);

    public RetrofitMomentum() {
        super();
    }


    public void downloadCategories(final Context context){

            Call<Category> categoryCall = servicio.getCategory(1028,APIKEY_CATEGORIES, "JSON");
                categoryCall.enqueue(new Callback<Category>() {
                @Override
                public void onResponse(Call<Category> call, Response<Category> response) {

                    Category category = response.body();
                    //List<CategoryItemId> listaCategoriasId = categoriesList.getCategories();
                    Log.d(TAG, "Number of movies received: " + response.body());
                }

                @Override
                public void onFailure(Call<Category> call, Throwable t) {
                    Log.e(TAG, t.toString());
                }
            })
            ;
        //}

    }
}
