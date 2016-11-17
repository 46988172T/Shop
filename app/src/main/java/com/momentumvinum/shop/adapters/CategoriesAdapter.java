package com.momentumvinum.shop.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.momentumvinum.shop.activities.Categories;
import com.momentumvinum.shop.pojos.content_pojos.categories.Category;

import java.util.ArrayList;

/**
 * Creador por Leonardo Martínez Ubal el 16/11/2016 a las 22:47.
 * Contacto: leonardomartinezubal3@gmail.com
 */

public class CategoriesAdapter extends BaseAdapter{

    private final Context mContext;
    public static ArrayList<Category> listaCategorias = new ArrayList<>();

    public CategoriesAdapter(Context context, ArrayList listaCategorias){
        this.mContext = context;
        this.listaCategorias = listaCategorias;
    }


    @Override
    public int getCount() {
        return listaCategorias.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(Categories.listaCategoriesVinos.get(position).getName().get(2).getValue());
        return dummyTextView;
    }
}
