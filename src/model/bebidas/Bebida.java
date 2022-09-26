package model.bebidas;

import constantes.Constantes.*;
import model.Productos;


public class Bebida extends Productos {


    public Bebida(String nombre, Float costo, TiposDeProductos tipoDeProductos, TiposDeComida tipoDeComida, TiposDeBebida tipoDeBebida,  int tiempoDeElaboracion, String descripcion) {
        super(nombre, costo, tipoDeProductos, tipoDeComida, tipoDeBebida, tiempoDeElaboracion, descripcion);
    }

    @Override
    public void imprimirProducto() {
        System.out.println(super.getNombre() + " -      $" + super.getCosto());
        System.out.println("Tiempo de elaboración: " + super.getTiempoDeElaboracion() + "minutos");
        if (super.getDescripcion() != null) {
            System.out.println("Descripción: " + super.getDescripcion());
        }
        if (super.getToppings() != null) {
            System.out.print("Toppings: ");
            for (String topping: super.getToppings()) {
                System.out.print(topping + " / ");
            }
        }
    }

    @Override
    public void duplicarTamanio() {
        setCosto(getCosto()*1.5f);
        setTiempoDeElaboracion( (int)Math.floor(getTiempoDeElaboracion()*1.5) );
        setIstamanioDoble();
    }



    /*

    @Override
    public void imprimirProducto(){





    }
    */



}
