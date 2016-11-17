package com.momentumvinum.shop.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.momentumvinum.shop.R;
import com.momentumvinum.shop.activities.Categories;
import com.momentumvinum.shop.pojos.content_pojos.categories.Category;
import com.squareup.picasso.Picasso;

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
    public Category getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        String imagen = "http://www.momentumvinum.com/api/images/categories/"+listaCategorias.get(position).getId()+"?ws_key=AGC1JAB183WBBUXPIGIDRLBS8TE2NNN7";
        Log.e("PRUEBA IMAGEN", String.valueOf(listaCategorias.get(position).getId()));
        Log.e("PRUEBA IMAGEN 2", "http://www.momentumvinum.com/api/images/categories/"+listaCategorias.get(position).getId()+"?ws_key=AGC1JAB183WBBUXPIGIDRLBS8TE2NNN7");
        //String imagen2 = "https://scontent-mad1-1.xx.fbcdn.net/v/t1.0-9/14962546_690919224409519_6179692106669420584_n.jpg?oh=5db4cc705b2e6d84f86cf8f7c8e38323&oe=58BE64D3";
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_gridview_categories, viewGroup, false);
        }


        ImageView imagenCategoria = (ImageView) view.findViewById(R.id.imagen_cat);
        TextView nombreCategoria = (TextView) view.findViewById(R.id.nombre_cat);


        nombreCategoria.setText(Categories.listaCategoriesVinos.get(position).getName().get(1).getValue());
        Picasso.with(mContext)
                .load(imagen)
                .fit()
                .into(imagenCategoria);

        return view;
    }
}
