package com.momentumvinum.shop.destilados_activities;


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
public class FragmentTiposDestilados extends Fragment {


    String todos = "TODOS";
    String ginebra = "GINEBRA";
    String whisky = "WHISKY";
    String vodka = "VODKA";
    String licores = "LICORES";
    String ron = "RON";
    public static ArrayList<Product> productos = new ArrayList<>();
    int idCatSegunPosicion;

    GridView gridProducts;
    ProductosAdapter productosAdapter;
    public FragmentTiposDestilados() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tipos_destilados, container, false);
        gridProducts = (GridView)v.findViewById(R.id.gridProducts);

        //por defecto, TODOS
        idCatSegunPosicion = 1082;
        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        ProductosAdapter.productosInsert.clear();
        productosAdapter = new ProductosAdapter(getContext(), productos);
        gridProducts.setAdapter(productosAdapter);

        MaterialSpinner spinner = (MaterialSpinner) v.findViewById(R.id.spinner);
        spinner.setItems(todos, ginebra, whisky, vodka, licores, ron);
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                switch (position){
                    case 0:
                        idCatSegunPosicion = 1082;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría TODOS tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 1:
                        idCatSegunPosicion = 1083;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría ginebra tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 2:
                        idCatSegunPosicion = 1084;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría whisky tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 3:
                        idCatSegunPosicion = 1085;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría vodkas tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 4:
                        idCatSegunPosicion = 1086;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría licores tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 5:
                        idCatSegunPosicion = 1087;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductosAdapter.productosInsert.clear();
                        productosAdapter = new ProductosAdapter(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría ron tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                }


            }
        });
        return v;
    }

}