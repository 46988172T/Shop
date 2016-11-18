package com.momentumvinum.shop.vinos_activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Leosss on 18/11/2016.
 */

public class ViewPagerAdapterVinos extends FragmentStatePagerAdapter {

    int numDeTabs;

    public ViewPagerAdapterVinos(FragmentManager fm, int numDeTabs) {
        super(fm);
        this.numDeTabs = numDeTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentTipos frTipos = new FragmentTipos();
                return frTipos;
            case 1:
                FragmentDo frDo = new FragmentDo();
                return frDo;
            case 2:
                FragmentPrecioVinos frPrecio = new FragmentPrecioVinos();
                return frPrecio;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numDeTabs;
    }
}
