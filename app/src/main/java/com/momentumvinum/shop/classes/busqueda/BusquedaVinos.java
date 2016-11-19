package com.momentumvinum.shop.classes.busqueda;

import com.momentumvinum.shop.pojos.content_pojos.categories.Category;
import com.momentumvinum.shop.pojos.content_pojos.categories.Product_;
import com.momentumvinum.shop.pojos.content_pojos.products.Product;

import java.util.ArrayList;

/**
 * Created by Leosss on 19/11/2016.
 */

public class BusquedaVinos {

    public static ArrayList<Category> responseCategorias;
    public static ArrayList<Product> responseProductos;

    /**
     * Busqueda de productos por categoría. Se le pasa la categoría de la cual queremos los productos
     * y nos devuelve un ArrayList de Productos (y muchas cosas asociadas) con toda la info EXCEPTO la imagen.
     * @param idCat
     * @return
     */
    public static ArrayList<Product> busquedaProductos(String idCat){
        Category categoriaSolicitada = new Category();
        for(int i = 0; i<responseCategorias.size(); i++){
            if(responseCategorias.get(i).getId() == Integer.parseInt(idCat)){
                categoriaSolicitada = responseCategorias.get(i);
            }
        }
        ArrayList<Product_> asociacionesProductos = new ArrayList<>();
        asociacionesProductos = (ArrayList)categoriaSolicitada.getAssociations().getProducts();
        ArrayList<Product> productosResult = new ArrayList<>();
        for(int j = 0; j<responseProductos.size();j++){
            for(int k = 0; k<asociacionesProductos.size();k++){
                if(responseProductos.get(j).getId() == Integer.parseInt(asociacionesProductos.get(k).getId())){
                    productosResult.add(responseProductos.get(j));
                }
            }
        }
        return productosResult;
    }


}
