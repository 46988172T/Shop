package com.momentumvinum.shop.otros_activities;


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
public class FragmentVermut extends Fragment {

    public static ArrayList<Product> productosVermut = new ArrayList<>();
    int idCatSegunPosicion;

    GridView gridProducts;
    ProductosAdapter productosAdapter;
    public FragmentVermut() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_vermut, container, false);
        gridProducts = (GridView)v.findViewById(R.id.gridProducts);

        ProductosAdapter.productosInsert.clear();
        idCatSegunPosicion = 1008;
        productosVermut = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        productosAdapter = new ProductosAdapter(getContext(), productosVermut);
        gridProducts.setAdapter(productosAdapter);

        return v;
    }
}
