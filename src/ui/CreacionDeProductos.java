package ui;

import model.bebidas.CafeClasico;
import model.bebidas.CafeDeMetodo;
import constantes.Constantes.*;

import java.util.TreeMap;

public class CreacionDeProductos {

    static TreeMap<String, CafeDeMetodo> cafesDeMetodo = new TreeMap<>();
    public static TreeMap<String, CafeClasico> cafesClasicos = new TreeMap<>();


    public static void crearProductos(){

        /*
           Creacion de Collection de Cafe
        */

        for (CaracteristicasDeCafe cafe: CaracteristicasDeCafe.values()) {

            // Collection Cafe Clasico
            if (cafe.getTipoDeCafe() == TiposDeCafe.CAFE_CLASICO) {
                cafesClasicos.put(
                        cafe.toString(),        // Key - Nombre del cafe
                        new CafeClasico(        // Objeto
                                cafe.toString(),
                                cafe.getCosto(),
                                cafe.getTiempoDePreparacion(),
                                cafe.getTipoDeProducto(),
                                cafe.getTamañoDeTaza()
                        )
                );
            }

            // Collection Cafe de Metodo
            if (cafe.getTipoDeCafe() == TiposDeCafe.CAFE_METODO) {
                cafesDeMetodo.put(
                        cafe.toString(),        // Key - Nombre del cafe
                        new CafeDeMetodo(        // Objeto
                                cafe.toString(),
                                cafe.getCosto(),
                                cafe.getTiempoDePreparacion(),
                                cafe.getTipoDeProducto(),
                                cafe.getTamañoDeTaza()
                        )
                );
            }
        }



    }
}
