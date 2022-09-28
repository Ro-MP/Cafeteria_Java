package model.bebidas;

import constantes.Constantes.*;
import model.Productos;


public class Bebida extends Productos {


    public Bebida(String nombre, Float costo, TiposDeProductos tipoDeProductos, TiposDeComida tipoDeComida, TiposDeBebida tipoDeBebida,  int tiempoDeElaboracion, String descripcion) {
        super(nombre, costo, tipoDeProductos, tipoDeComida, tipoDeBebida, tiempoDeElaboracion, descripcion);
    }
    public Bebida(Productos producto){
        super(producto);
    }

    @Override
    public void duplicarTamanio() {
        setCosto(getCosto()*1.5f);
        setTiempoDeElaboracion( (int)Math.floor(getTiempoDeElaboracion()*1.5) );
        setIstamanioDoble();
    }

}
