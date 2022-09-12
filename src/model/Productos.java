package model;

import com.sun.xml.internal.bind.v2.model.core.EnumConstant;
import constantes.Constantes;
import constantes.Constantes.*;

import java.util.ArrayList;

/*
    Clase abstracta para todos los productos que se venden en la cafetería
 */

public abstract class Productos {
    private String  nombre;
    private float   costo;
    private int     tiempoDeElaboracion;
    private TiposDeProductos    tiposDeProductos;
    private String  descripcion;
    private ArrayList<String>   toppings = new ArrayList<>();
    boolean istamanioDoble = false;     // Variable para identificar el producto que el cliente quiere con doble porcion

    // Constructor
    public Productos(String nombre, Float costo, int tiempoDeElaboracion, TiposDeProductos tiposDeProductos) {
        this.nombre = nombre;
        this.costo = costo;
        this.tiempoDeElaboracion = tiempoDeElaboracion;
        this.tiposDeProductos = tiposDeProductos;
    }

    // Metodos para agregar toppings al producto. Sobrecarga dependiendo si es comida o bebida
    public void addTopping(ToppingsBebidas toppingBebida) {
        this.toppings.add(toppingBebida.toString());
    }
    public void addTopping(ToppingsComida toppingsComida) {
        this.toppings.add(toppingsComida.toString());
    }

    /*
        Metodo para imprimir el producto junto con sus caracteristicas
        descricion y toppings al no estar en el constructor, generamos condicionales en caso de ser null
     */
    public void imprimirProducto(){
        System.out.println(nombre + " -      $" + costo);
        System.out.println("Tiempo de elaboración: " + tiempoDeElaboracion + "minutos");
        if (descripcion != null) {
            System.out.println("Descripción: " + descripcion);
        }
        if (toppings != null) {
            System.out.print("Toppings: ");
            for (String topping: toppings) {
                System.out.print(topping + " / ");
            }
        }

    }

    public void setCosto(float costo){
        this.costo = costo;
    }

    public float getCosto(){
        return costo;
    }

    public int getTiempoDeElaboracion() {
        return tiempoDeElaboracion;
    }

    public void setTiempoDeElaboracion(int tiempoDeElaboracion) {
        this.tiempoDeElaboracion = tiempoDeElaboracion;
    }

    public String getNombre() {
        return nombre;
    }

    public TiposDeProductos getTiposDeProductos() {
        return tiposDeProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isTamanioDoble() {
        return istamanioDoble;
    }

    public void setIstamanioDoble(boolean istamanioDoble) {
        this.istamanioDoble = istamanioDoble;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public String getToppingsString() {
        StringBuilder toppingsS = new StringBuilder();
        for (String topping: toppings) {
            toppingsS.append(topping.toString()).append(" ");
        }
        return toppingsS.toString();
    }
    public void addToppingBebida(EnumConstant topping) {
        this.toppings.add(topping.toString());
    }

    public void deleteToppingBebida(int itemTopping){
        this.toppings.remove(itemTopping);
    }

}

