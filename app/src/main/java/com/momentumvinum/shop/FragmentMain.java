package com.momentumvinum.shop;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.momentumvinum.shop.api.MomentumApi;
import com.momentumvinum.shop.fragmentsPrincipal.FragmentBlog;
import com.momentumvinum.shop.fragmentsPrincipal.FragmentNovedades;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMain extends Fragment {

    private FragmentTabHost mTabHost;
    private static View rootView;
    public FragmentMain() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        /*View v = inflater.inflate(R.layout.fragment_main, container, false);
        Button buttonApi;
        buttonApi = (Button)v.findViewById(R.id.buttonApi);
        buttonApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activamos la api
                MomentumApi momentumApi = new MomentumApi();
                momentumApi.mostrarCategorias();
            }
        });
        return v;*/

        rootView = inflater.inflate(R.layout.fragment_main,container, false);


        mTabHost = (FragmentTabHost)rootView.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("fragmentb").setIndicator("Novedades"),
                FragmentNovedades.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("fragmentc").setIndicator("Blog"),
                FragmentBlog.class, null);


        return rootView;
    }

    public static void connOkCats(){
        Snackbar.make(rootView, "Descarga de categorías correcta", Snackbar.LENGTH_LONG).show();
    }

    public static void connOkProds(){
        Snackbar.make(rootView, "Descarga de productos correcta", Snackbar.LENGTH_LONG).show();
    }

    public static void connFailCats(){
        Snackbar.make(rootView, "Descarga de categorías NO correcta", Snackbar.LENGTH_LONG).show();
    }

    public static void connFailProds(){
        Snackbar.make(rootView, "Descarga de productos NO correcta", Snackbar.LENGTH_LONG).show();
    }

}
