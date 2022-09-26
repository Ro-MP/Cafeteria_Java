package model;

import com.sun.xml.internal.bind.v2.model.core.EnumConstant;
import constantes.Constantes;
import constantes.Constantes.*;

import java.util.ArrayList;

/*
    Clase abstracta para todos los productos que se venden en la cafetería
 */

public abstract class Productos {
    private final String  nombre;
    private float   costo;
    private final TiposDeProductos tipoDeProductos;
    private final TiposDeComida tipoDeComida;
    private final TiposDeBebida tipoDeBebida;
    private int     tiempoDeElaboracion;
    private final String  descripcion;
    private ArrayList<String>   toppings = new ArrayList<>();
    boolean istamanioDoble = false;     // Variable para identificar el producto que el cliente quiere con doble porcion


    // Constructor
    public Productos(String nombre, Float costo, TiposDeProductos tipoDeProductos, TiposDeComida tipoDeComida, TiposDeBebida tipoDeBebida,  int tiempoDeElaboracion, String descripcion) {
        this.nombre = nombre;
        this.costo = costo;
        this.tiempoDeElaboracion = tiempoDeElaboracion;
        this.tipoDeProductos = tipoDeProductos;
        this.tipoDeComida = tipoDeComida;
        this.tipoDeBebida = tipoDeBebida;
        this.descripcion = descripcion;
    }

    // Metodos para agregar toppings al producto. Sobrecarga dependiendo si es comida o bebida
    public void addTopping(ToppingsComidas toppingsComida) {
        this.toppings.add(toppingsComida.toString());
    }
    public void addTopping(ToppingsPostres toppingsPostre) {
        this.toppings.add(toppingsPostre.toString());
    }
    public void addTopping(ToppingsBebidas toppingBebida) {
        this.toppings.add(toppingBebida.toString());
    }

    /*
        Metodo para imprimir el producto junto con sus caracteristicas
        descricion y toppings al no estar en el constructor, generamos condicionales en caso de ser null
        implementado en cada hijo
     */
    public abstract  void imprimirProducto();

    public abstract void duplicarTamanio();


    // Getters
    public String getNombre() {
        return nombre;
    }
    public float getCosto(){
        return costo;
    }
    public TiposDeProductos getTipoDeProductos() {
        return tipoDeProductos;
    }
    public TiposDeComida getTipoDeComida() {
        return tipoDeComida;
    }
    public TiposDeBebida getTipoDeBebida() {
        return tipoDeBebida;
    }
    public int getTiempoDeElaboracion() {
        return tiempoDeElaboracion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isTamanioDoble() {
        return istamanioDoble;
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

    // Setters
    protected void setCosto(float costo){
        this.costo = costo;
    }
    protected void setTiempoDeElaboracion(int tiempoDeElaboracion) {
        this.tiempoDeElaboracion = tiempoDeElaboracion;
    }
    protected void setIstamanioDoble() {
        this.istamanioDoble = true;
    }
    protected void deleteToppingBebida(int itemTopping){
        this.toppings.remove(itemTopping);
    }









}

