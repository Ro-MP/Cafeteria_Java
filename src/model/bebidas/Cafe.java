package model.bebidas;

import constantes.Constantes.*;
import model.Productos;


public abstract class Cafe extends Productos {

    private int tamanioDeTaza;


    public Cafe(String nombre,
                Float costo,
                int tiempoDeElaboracion,
                TiposDeProductos tiposDeProductos,
                int tamanioDeTaza
                ) {
        super(nombre, costo, tiempoDeElaboracion, tiposDeProductos);
        this.tamanioDeTaza = tamanioDeTaza;
    }


    public int getTamanioDeTaza() {
        return tamanioDeTaza;
    }

    public void setTamanioDeTaza(int tamanioDeTaza) {
        this.tamanioDeTaza = tamanioDeTaza;
    }


}
