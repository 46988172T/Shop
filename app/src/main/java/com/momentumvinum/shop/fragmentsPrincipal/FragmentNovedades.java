package com.momentumvinum.shop.fragmentsPrincipal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.momentumvinum.shop.R;
import com.momentumvinum.shop.api.MomentumApi;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentNovedades extends Fragment {


    public FragmentNovedades() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_novedades, container, false);
        Button buttonApi, buttonApi2;
        buttonApi = (Button)v.findViewById(R.id.buttonApi);
        buttonApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activamos la api
                MomentumApi momentumApi = new MomentumApi();
                momentumApi.mostrarCategorias();

            }
        });
        buttonApi2 = (Button)v.findViewById(R.id.buttonApi2);
        buttonApi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activamos la api
                MomentumApi momentumApi = new MomentumApi();
                momentumApi.mostrarProductos();
            }
        });

        return v;
    }

}
