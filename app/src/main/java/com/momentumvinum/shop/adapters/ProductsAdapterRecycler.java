package com.momentumvinum.shop.adapters;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.momentumvinum.shop.R;
import com.momentumvinum.shop.pojos.content_pojos.products.Image;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leosss on 22/12/2016.
 */

public class ProductsAdapterRecycler extends RecyclerView.Adapter<ProductsAdapterRecycler.MyViewHolder>{

    public Context mContext;
    public static ArrayList<Product> productosInsert = new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombreProducto, precioProducto;
        public ImageView imagenProducto, overflow;

        public MyViewHolder(View view) {
            super(view);
            imagenProducto = (ImageView) view.findViewById(R.id.imagen);
            nombreProducto = (TextView) view.findViewById(R.id.nombre);
            precioProducto = (TextView) view.findViewById(R.id.precio);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }

    public ProductsAdapterRecycler(Context mContext, ArrayList<Product> productosInsert) {
        this.mContext = mContext;
        this.productosInsert = productosInsert;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Product producto = productosInsert.get(position);
        holder.nombreProducto.setText(producto.getName().get(1).getValue());

        double precio = Double.parseDouble(productosInsert.get(position).getPrice());
        double precioIVAinc = precio*1.21;
        double precioIVAincRounded = (double)Math.round(precioIVAinc*100) / 100;
        String precioIVA = String.valueOf(precioIVAincRounded);
        holder.precioProducto.setText(precioIVA+" €");

        // loading album cover using Glide library
        String imagenId = "";
        if(!productosInsert.get(position).getAssociations().getImages().isEmpty()){
            Image imagen = productosInsert.get(position).getAssociations().getImages().get(0);
            imagenId = imagen.getId();
        }else {
            imagenId = "";
        }
        String imagenes = "http://www.momentumvinum.com/api/images/products/"+productosInsert.get(position).getId()+"/"+imagenId+"?ws_key=AGC1JAB183WBBUXPIGIDRLBS8TE2NNN7";
        Glide.with(mContext).load(imagenes).fitCenter().into(holder.imagenProducto);
        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_producto, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.deseado:
                    Toast.makeText(mContext, "Añadido a la lista de deseados", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.carrito:
                    Toast.makeText(mContext, "Añadido al carrito", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return productosInsert.size();
    }
}

