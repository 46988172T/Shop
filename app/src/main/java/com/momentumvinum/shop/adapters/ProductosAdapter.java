package com.momentumvinum.shop.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.momentumvinum.shop.R;
import com.momentumvinum.shop.pojos.content_pojos.products.Image;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * Created by Leosss on 19/11/2016.
 */

public class ProductosAdapter extends BaseAdapter {

    private final Context mContext;
    public static ArrayList<Product> productosInsert = new ArrayList<>();

    public ProductosAdapter(Context mContext, ArrayList<Product> productosInsert) {
        this.mContext = mContext;
        this.productosInsert = productosInsert;
    }

    @Override
    public int getCount() {
        return productosInsert.size();
    }

    @Override
    public Product getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        String imagenId = "";
        if(!productosInsert.get(position).getAssociations().getImages().isEmpty()){
            Image imagen = productosInsert.get(position).getAssociations().getImages().get(0);
            imagenId = imagen.getId();
        }else {
            imagenId = "";
        }

        String imagenes = "http://www.momentumvinum.com/api/images/products/"+productosInsert.get(position).getId()+"/"+imagenId+"?ws_key=AGC1JAB183WBBUXPIGIDRLBS8TE2NNN7";
        String imagen2 = "http://www.momentumvinum.com/api/images/products/500/5120?ws_key=AGC1JAB183WBBUXPIGIDRLBS8TE2NNN7";
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.item_productos, viewGroup, false);
        }

        ImageView imagenProducto = (ImageView) view.findViewById(R.id.imagen_prod);
        TextView nombreProducto = (TextView) view.findViewById(R.id.nombre_prod);
        TextView precioProducto = (TextView) view.findViewById(R.id.precio_prod);

        Log.e(String.valueOf(productosInsert.get(position).getId())+"--->", productosInsert.get(position).getPrice());

        double precio = Double.parseDouble(productosInsert.get(position).getPrice());
        double precioIVAinc = precio*1.21;
        double precioIVAincRounded = (double)Math.round(precioIVAinc*100) / 100;
        String precioIVA = String.valueOf(precioIVAincRounded);


        Glide.with(mContext).load(imagenes).fitCenter().into(imagenProducto);
        nombreProducto.setText(productosInsert.get(position).getName().get(1).getValue());
        precioProducto.setText(precioIVA+" €");


        return view;
    }
}
