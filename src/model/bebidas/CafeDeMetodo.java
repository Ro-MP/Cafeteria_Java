package model.bebidas;

import constantes.Constantes.*;

public class CafeDeMetodo extends Cafe implements IBebidas {

    boolean isfrio = false;

    public CafeDeMetodo(String nombre, Float costo, int tiempoDeElaboracion, TiposDeProductos tiposDeProductos, int tamanioDeTaza) {
        super(nombre, costo, tiempoDeElaboracion, tiposDeProductos, tamanioDeTaza);
    }

    @Override
    public void enfriar() {
        isfrio = true;
        setTiempoDeElaboracion(Math.round(getTiempoDeElaboracion()*1.5f));
    }

    @Override
    public void duplicarTamanio() {
        setCosto(getCosto()*2);
        setTamanioDeTaza(getTamanioDeTaza()*2);
        setTiempoDeElaboracion(getTiempoDeElaboracion()*2);
        setIstamanioDoble(true);
    }

}
