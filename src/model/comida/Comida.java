package model.comida;

import constantes.Constantes.*;
import model.Productos;

public class Comida extends Productos {


    public Comida(String nombre, Float costo, TiposDeProductos tipoDeProductos, TiposDeComida tipoDeComida, TiposDeBebida tipoDeBebida, int tiempoDeElaboracion, String descripcion) {
        super(nombre, costo, tipoDeProductos, tipoDeComida, tipoDeBebida, tiempoDeElaboracion, descripcion);
    }
    public Comida(Productos producto){
        super(producto);
    }



    @Override
    public void duplicarTamanio() {
    }
}
