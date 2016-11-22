package com.momentumvinum.shop.otros_activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.momentumvinum.shop.R;

public class OtrosActivity extends AppCompatActivity {

    TabLayout tab_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otros);

        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        tab_layout.addTab(tab_layout.newTab().setText("VERMUT"));
        tab_layout.addTab(tab_layout.newTab().setText("CERVEZA"));
        tab_layout.addTab(tab_layout.newTab().setText("VINAGRE"));
        tab_layout.addTab(tab_layout.newTab().setText("ACEITE"));

        final ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        final ViewPagerAdapterOtros viewPagerAdapterOtros = new ViewPagerAdapterOtros(getSupportFragmentManager(),tab_layout.getTabCount());
        viewPager.setAdapter(viewPagerAdapterOtros);
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
