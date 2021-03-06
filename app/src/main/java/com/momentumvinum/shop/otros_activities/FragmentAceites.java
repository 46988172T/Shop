package com.momentumvinum.shop.otros_activities;


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

import com.momentumvinum.shop.R;
import com.momentumvinum.shop.adapters.ProductsAdapterRecycler;
import com.momentumvinum.shop.classes.GridSpacingItemDecoration;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAceites extends Fragment {

    public static ArrayList<Product> productosAceite = new ArrayList<>();
    int idCatSegunPosicion;

    RecyclerView gridProducts;
    ProductsAdapterRecycler productosAdapter;

    public FragmentAceites() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_aceites, container, false);
        gridProducts = (RecyclerView) v.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        gridProducts.setLayoutManager(mLayoutManager);
        gridProducts.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        gridProducts.setItemAnimator(new DefaultItemAnimator());

        ProductsAdapterRecycler.productosInsert.clear();
        idCatSegunPosicion = 1108;
        productosAceite = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
        productosAdapter = new ProductsAdapterRecycler(getContext(), productosAceite);
        gridProducts.setAdapter(productosAdapter);

        return v;
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
