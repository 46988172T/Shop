package com.momentumvinum.shop.vinos_activities;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.momentumvinum.shop.R;
import com.momentumvinum.shop.classes.busqueda.BusquedaVinos;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDo extends Fragment {
    String todasDo = "TODAS LAS D.O.";
    String binissalem = "BINISSALEM - MALLORCA";
    String calatayud = "CALATAYUD";
    String campoDeBorja = "CAMPO DE BORJA";
    String cariñena = "CARIÑENA";
    String catalunya = "CATALUÑA";
    String cava = "CAVA";
    String costersSegre = "COSTERS DEL SEGRE";
    String emporda = "EMPORDÀ";
    String manchuela = "MANCHUELA";
    String monterrei = "MONTERREI";
    String montsant = "MONTSANT";
    String navarra = "NAVARRA";
    String pagoOtazu = "PAGO DE OTAZU";
    String penedes = "PENEDÈS";
    String priorat = "PRIORAT";
    String riasBaixas = "RIAS BAIXAS";
    String ribeiraSacra = "RIBEIRA SACRA";
    String riberaDuero = "RIBERA DEL DUERO";
    String rioja = "RIOJA";
    String rueda = "RUEDA";
    String somontano = "SOMONTANO";
    String terraAlta = "TERRA ALTA";
    String valencia = "VALENCIA";
    public static ArrayList<Product> productos = new ArrayList<>();
    int idCatSegunPosicion;

    public FragmentDo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_do, container, false);

        MaterialSpinner spinner = (MaterialSpinner) v.findViewById(R.id.spinner);
        spinner.setItems(todasDo,binissalem,calatayud,campoDeBorja,cariñena,catalunya,cava,
                costersSegre,emporda,manchuela,monterrei,montsant,navarra,pagoOtazu,
                penedes,priorat,riasBaixas,ribeiraSacra,riberaDuero,rioja,rueda,somontano,
                terraAlta,valencia);
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));
        spinner.setDropdownMaxHeight(950);

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                switch (position){
                    case 0:
                        idCatSegunPosicion = 1088;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría TODAS LAS DO tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 1:
                        idCatSegunPosicion = 1019;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría binissalem tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 2:
                        idCatSegunPosicion = 1021;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría calatayud tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 3:
                        idCatSegunPosicion = 1022;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría campoDeBorja tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 4:
                        idCatSegunPosicion = 1024;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría cariñena tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 5:
                        idCatSegunPosicion = 1025;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría catalunya tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 6:
                        idCatSegunPosicion = 1026;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría cava tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 7:
                        idCatSegunPosicion = 1033;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría costersSegre tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 8:
                        idCatSegunPosicion = 1035;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría emporda tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 9:
                        idCatSegunPosicion = 1044;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría manchuela tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 10:
                        idCatSegunPosicion = 1048;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría monterrei tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 11:
                        idCatSegunPosicion = 1050;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría montsant tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 12:
                        idCatSegunPosicion = 1051;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría navarra tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 13:
                        idCatSegunPosicion = 1109;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría pagoOtazu tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 14:
                        idCatSegunPosicion = 1052;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría penedes tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 15:
                        idCatSegunPosicion = 1055;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría priorat tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 16:
                        idCatSegunPosicion = 1056;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría riasBaixas tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 17:
                        idCatSegunPosicion = 1057;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría ribeiraSacra tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 18:
                        idCatSegunPosicion = 1059;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría riberaDuero tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 19:
                        idCatSegunPosicion = 1062;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría rioja tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 20:
                        idCatSegunPosicion = 1063;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría rueda tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 21:
                        idCatSegunPosicion = 1065;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría somontano tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 22:
                        idCatSegunPosicion = 1068;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría terraAlta tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                    case 23:
                        idCatSegunPosicion = 1076;
                        productos = BusquedaVinos.busquedaProductos(String.valueOf(idCatSegunPosicion));
                        Snackbar.make(view, "La categoría valencia tiene " + productos.size() +" productos", Snackbar.LENGTH_LONG).show();
                        return;
                }
            }
        });
        return v;
    }

}
