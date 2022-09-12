package pruebas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HijosFavoritos> listaHijosFavoritos = new ArrayList<>();

        HijoRapero hijoNegroFavorito1 = new HijoRapero();
        HijoFit hijoFitFavorito1 = new HijoFit();

        listaHijosFavoritos.add(new HijosFavoritos(hijoNegroFavorito1));
        listaHijosFavoritos.add(new HijosFavoritos(hijoFitFavorito1));

        listaHijosFavoritos.get(0).hijoRapero.rapear();
        listaHijosFavoritos.get(0).hijoFit.irAlGym();

    }
}

abstract class Padre {
    private String nombre;

    void saludar(){ System.out.println("Hola"); }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}


class HijoRapero extends Padre{

    void rapear(){ System.out.println("Rapeando..."); }
}


class HijoFit extends Padre{

    void irAlGym(){ System.out.println("En el Gym"); }
}


class HijosFavoritos {
    public HijoRapero hijoRapero;
    public HijoFit hijoFit;
    HijosFavoritos(HijoRapero hijo){
        hijoRapero = hijo;
    }
    HijosFavoritos(HijoFit hijo){
        hijoFit = hijo;
    }
}