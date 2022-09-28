package model.order;

import constantes.Constantes;
import model.Productos;
import model.bebidas.Bebida;
import model.comida.Comida;

public class OrdenItem {

    // Atributos de Order Item
    private final Productos producto;
    private int unidadesDeProductos = 1;

    // Constructor
    public OrdenItem(Productos producto) {
        if (producto.getTipoDeProductos() == Constantes.TiposDeProductos.COMIDA){
            this.producto = new Comida(producto);
        } else this.producto = new Bebida(producto);

    }

    // Solo getter de producto ya que no se podrá modificar, si se quiere otro producto se elije,
    // y si no se quiere este se elimina de la OrderList
    public Productos getProducto() {
        return producto;
    }

    // Getters y Setters de cantidadDeProducto y toppings ya sea de bebida o comida
    public int getUnidadesDeProductos() {
        return unidadesDeProductos;
    }
    public void setUnidadesDeProductos(int unidadesDeProductos) {
        this.unidadesDeProductos = unidadesDeProductos;
    }




    public float getCostoItem(){
        return producto.getCosto()* unidadesDeProductos;
    }

}
