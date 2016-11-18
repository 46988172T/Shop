package com.momentumvinum.shop.vinos_activities;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.momentumvinum.shop.R;

public class VinosActivity extends AppCompatActivity {
    TabLayout tab_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinos);

        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        tab_layout.addTab(tab_layout.newTab().setText("TIPOS"));
        tab_layout.addTab(tab_layout.newTab().setText("D.O."));
        tab_layout.addTab(tab_layout.newTab().setText("PRECIOS"));

        final ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        final ViewPagerAdapterVinos viewPagerAdapterVinos = new ViewPagerAdapterVinos(getSupportFragmentManager(),tab_layout.getTabCount());
        viewPager.setAdapter(viewPagerAdapterVinos);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_layout));
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

}
