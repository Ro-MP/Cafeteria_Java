package model.order;

import constantes.Constantes;
import model.Productos;

import java.util.ArrayList;

public class OrdenItem {

    // Atributos de Order Item
    private final Productos producto;
    private int cantidadDeProductos;
    //private ArrayList<Constantes.ToppingsBebidas> toppingsBebida = new ArrayList<>();

    // Constructor
    public OrdenItem(Productos producto) {
        this.producto = producto;
    }

    // Solo getter de producto ya que no se podrá modificar, si se quiere otro producto se elije,
    // y si no se quiere este se elimina de la OrderList
    public Productos getProducto() {
        return producto;
    }

    // Getters y Setters de cantidadDeProducto y toppings ya sea de bebida o comida
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    /*
    public ArrayList<Constantes.ToppingsBebidas> getToppingsBebida() {
        return toppingsBebida;
    }
    */


    public float getCostoItem(){
        return producto.getCosto()*cantidadDeProductos;
    }

}
