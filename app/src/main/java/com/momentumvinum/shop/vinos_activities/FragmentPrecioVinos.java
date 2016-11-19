package com.momentumvinum.shop.vinos_activities;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.momentumvinum.shop.R;
import com.momentumvinum.shop.adapters.ProductosAdapter;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPrecioVinos extends Fragment {

    String rango1 = "MENOS DE 10€";
    String rango2 = "DE 10€ HASTA 19,99€";
    String rango3 = "DE 20€ HASTA 49,99€";
    String rango4 = "MÁS DE 50€";
    public static ArrayList<Product> productos = new ArrayList<>();
    int idCatSegunPosicion;

    GridView gridProducts;
    ProductosAdapter productosAdapter;

    public FragmentPrecioVinos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_precio_vinos, container, false);
        gridProducts = (GridView)v.findViewById(R.id.gridProductsPrecio);

        idCatSegunPosicion = 1091;
        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        ProductosAdapter.productosInsert.clear();
        productosAdapter = new ProductosAdapter(getContext(), productos);
        gridProducts.setAdapter(productosAdapter);

        MaterialSpinner spinner = (MaterialSpinner) v.findViewById(R.id.spinner);
        spinner.setItems(rango1,rango2,rango3,rango4);
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                switch (position){
                    case 0:
                        idCatSegunPosicion = 1091;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría MENOS DE 10€ tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 1:
                        idCatSegunPosicion = 1092;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría DE 10€ HASTA 19,99€ tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 2:
                        idCatSegunPosicion = 1093;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría DE 20€ HASTA 49,99€ tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 3:
                        idCatSegunPosicion = 1094;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría MÁS DE 50€ tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                }
            }
        });
        return v;
    }

}
