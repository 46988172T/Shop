package com.momentumvinum.shop.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.momentumvinum.shop.R;
import com.momentumvinum.shop.adapters.CategoriesAdapter;
import com.momentumvinum.shop.pojo.categories.Category;
import com.momentumvinum.shop.pojo.categories.Category_;

import java.util.ArrayList;

public class Categories extends AppCompatActivity {

    public static ArrayList<Category> listaCategories;
    public static ArrayList<Category> listaCategoriesVinos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ArrayList<Category_> listaAsociacionCategoria= (ArrayList)listaCategories.get(1).getAssociations().getCategories();

        Log.e("PRUEBA CATS", String.valueOf(listaCategories.get(1).getAssociations().getCategories().size()));

        for(int i = 0; i<listaCategories.size(); i++){
            for(int j = 0; j<listaAsociacionCategoria.size(); j++) {
                if (String.valueOf(listaCategories.get(i).getId()).equals(listaAsociacionCategoria.get(j).getId())){
                    listaCategoriesVinos.add(listaCategories.get(i));
                }
            }
        }

        Log.e("PRUEBA vinos", String.valueOf(listaCategoriesVinos.size()));

        GridView gridView = (GridView)findViewById(R.id.gridview);
        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(this, listaCategoriesVinos);
        gridView.setAdapter(categoriesAdapter);
    }
}
