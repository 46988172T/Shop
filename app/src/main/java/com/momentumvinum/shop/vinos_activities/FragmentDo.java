package com.momentumvinum.shop.vinos_activities;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.momentumvinum.shop.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDo extends Fragment {


    public FragmentDo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_do, container, false);

        MaterialSpinner spinner = (MaterialSpinner) v.findViewById(R.id.spinner);
        spinner.setItems("TODAS LAS D.O.", "BINISSALEM - MALLORCA", "CALATAYUD", "CAMPO DE BORJA", "CARIÑENA", "CATALUÑA",
                "CAVA", "COSTERS DEL SEGRE", "EMPORDÀ", "MANCHUELA", "MONTERREI", "MONTSANT", "NAVARRA",
                "PAGO DE OTAZU", "PENEDÈS", "PRIORAT", "RIAS BAIXAS", "RIBEIRA SACRA", "RIBERA DEL DUERO",
                "RIOJA", "RUEDA", "SOMONTANO", "TERRA ALTA", "VALENCIA");
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));
        spinner.setDropdownMaxHeight(950);

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
        return v;
    }

}
