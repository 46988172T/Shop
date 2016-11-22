package com.momentumvinum.shop.otros_activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.momentumvinum.shop.R;
import com.momentumvinum.shop.adapters.ProductosAdapter;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAceites extends Fragment {

    public static ArrayList<Product> productosAceite = new ArrayList<>();
    int idCatSegunPosicion;

    GridView gridProducts;
    ProductosAdapter productosAdapter;

    public FragmentAceites() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_aceites, container, false);
        gridProducts = (GridView)v.findViewById(R.id.gridProducts);

        ProductosAdapter.productosInsert.clear();
        idCatSegunPosicion = 1108;
        productosAceite = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        productosAdapter = new ProductosAdapter(getContext(), productosAceite);
        gridProducts.setAdapter(productosAdapter);

        return v;
    }
}
