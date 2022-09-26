package ui;

import constantes.Constantes.*;
import model.bebidas.Bebida;
import model.comida.Comida;

import java.util.TreeMap;

public class CreacionDeProductos {

    static TreeMap<String, Comida> comidaTreeMap = new TreeMap<>();
    static TreeMap<String, Bebida> bebidaTreeMap = new TreeMap<>();


    public static void crearProductos(){

        /*
           Creacion de Collection de Cafe
        */

        for (CaracteristicasDeProducto producto: CaracteristicasDeProducto.values()) {

            // Collection Comida
            if (producto.getTipoDeProducto() == TiposDeProductos.COMIDA) {
                comidaTreeMap.put(
                        producto.toString(),        // Key - Nombre del cafe
                        new Comida(        // Objeto
                                producto.getNombre(),
                                producto.getCosto(),
                                producto.getTipoDeProducto(),
                                producto.getTipoDeComida(),
                                producto.getTipoDeBebida(),
                                producto.getTiempoDePreparacion(),
                                producto.getDescripcion()
                        )
                );
            }

            // Collection Bebida
            if (producto.getTipoDeProducto() == TiposDeProductos.BEBIDA) {
                bebidaTreeMap.put(
                        producto.toString(),        // Key - Nombre del cafe
                        new Bebida(        // Objeto
                                producto.getNombre(),
                                producto.getCosto(),
                                producto.getTipoDeProducto(),
                                producto.getTipoDeComida(),
                                producto.getTipoDeBebida(),
                                producto.getTiempoDePreparacion(),
                                producto.getDescripcion()
                        )
                );
            }
        }



    }
}
