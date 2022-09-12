package model.bebidas;

import constantes.Constantes.*;

public class CafeClasico extends Cafe implements IBebidas{


    public CafeClasico(String nombre, Float costo, int tiempoDeElaboracion, TiposDeProductos tiposDeProductos, int tamanioDeTaza) {
        super(nombre, costo, tiempoDeElaboracion, tiposDeProductos, tamanioDeTaza);
    }

    @Override
    public void enfriar() {
        setTiempoDeElaboracion(Math.round(getTiempoDeElaboracion()*1.5f));
    }

    @Override
    public void duplicarTamanio() {
        setCosto(getCosto()*1.5f);
        setTamanioDeTaza(getTamanioDeTaza()*2);
        setIstamanioDoble(true);
    }


}
