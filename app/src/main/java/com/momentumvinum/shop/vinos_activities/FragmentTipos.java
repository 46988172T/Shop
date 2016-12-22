package com.momentumvinum.shop.vinos_activities;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.momentumvinum.shop.R;
import com.momentumvinum.shop.adapters.ProductsAdapterRecycler;
import com.momentumvinum.shop.classes.GridSpacingItemDecoration;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTipos extends Fragment {
    String todos = "TODOS";
    String tintos = "TINTOS";
    String blancos = "BLANCOS";
    String rosados = "ROSADOS";
    String espumosos = "ESPUMOSOS";
    String fortificados = "FORTIFICADOS";
    public static ArrayList<Product> productos = new ArrayList<>();
    int idCatSegunPosicion;

    RecyclerView gridProducts;
    ProductsAdapterRecycler productosAdapter;
    public FragmentTipos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tipos, container, false);
        gridProducts = (RecyclerView) v.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        gridProducts.setLayoutManager(mLayoutManager);
        gridProducts.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        gridProducts.setItemAnimator(new DefaultItemAnimator());

        //por defecto, TODOS
        idCatSegunPosicion = 1000;
        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        ProductsAdapterRecycler.productosInsert.clear();
        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
        gridProducts.setAdapter(productosAdapter);

        MaterialSpinner spinner = (MaterialSpinner) v.findViewById(R.id.spinner);
        spinner.setItems(todos, tintos, blancos, rosados, espumosos, fortificados);
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                switch (position){
                    case 0:
                        idCatSegunPosicion = 1000;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría TODOS tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 1:
                        idCatSegunPosicion = 1002;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría tintos tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 2:
                        idCatSegunPosicion = 1003;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría blancos tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 3:
                        idCatSegunPosicion = 1004;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría rosados tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 4:
                        idCatSegunPosicion = 1005;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría espumosos tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 5:
                        idCatSegunPosicion = 1106;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        ProductsAdapterRecycler.productosInsert.clear();
                        productosAdapter = new ProductsAdapterRecycler(getContext(), productos);
                        gridProducts.setAdapter(productosAdapter);

                        Snackbar.make(view, "La categoría fortificados tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                }


            }
        });
        return v;
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
