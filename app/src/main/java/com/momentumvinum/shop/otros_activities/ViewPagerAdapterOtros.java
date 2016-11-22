package com.momentumvinum.shop.otros_activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Leosss on 22/11/2016.
 */

public class ViewPagerAdapterOtros extends FragmentStatePagerAdapter {
    int numDeTabs;

    public ViewPagerAdapterOtros(FragmentManager fm, int numDeTabs) {
        super(fm);
        this.numDeTabs = numDeTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentVermut fragmentVermut = new FragmentVermut();
                return fragmentVermut;
            case 1:
                FragmentCerveza fragmentCerveza = new FragmentCerveza();
                return fragmentCerveza;
            case 2:
                FragmentVinagre fragmentVinagre = new FragmentVinagre();
                return fragmentVinagre;
            case 3:
                FragmentAceites fragmentAceites = new FragmentAceites();
                return fragmentAceites;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numDeTabs;
    }
}
