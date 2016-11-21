package com.momentumvinum.shop.destilados_activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Creador por Leonardo Martínez Ubal el 21/11/2016 a las 10:30.
 * Contacto: leonardomartinezubal3@gmail.com
 */

public class ViewPagerAdapterDestilados extends FragmentStatePagerAdapter{
    int numDeTabs;

    public ViewPagerAdapterDestilados(FragmentManager fm, int numDeTabs) {
        super(fm);
        this.numDeTabs = numDeTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentTiposDestilados frTiposDestilados = new FragmentTiposDestilados();
                return frTiposDestilados;
            case 1:
                FragmentPrecioDestilados frPrecioDestilados = new FragmentPrecioDestilados();
                return frPrecioDestilados;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numDeTabs;
    }
}
