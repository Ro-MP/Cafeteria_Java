package ui;

import constantes.Constantes;
import model.Productos;
import model.bebidas.Bebida;
import model.comida.Comida;
import constantes.Constantes.*;
import model.order.OrderList;

import java.util.ArrayList;
import java.util.Scanner;


public class UIMenu {

    public static ArrayList<Productos> menu = new ArrayList<>();
    static OrderList listaDePedido = new OrderList();

    public static void showMenu() {

        int response;

        // Bienvenida y despliegue de productos
        System.out.println("## Bienvenido a  Cachito de Coco Cafe ##");
        System.out.println("\nPor favor selecciona tu producto deseado\n");


        do {
            imprimirOpcionesMenu();
            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());
            listaDePedido.addOrderItem(response);
            listaDePedido.imprimirOpcionesDeBebida();
        } while (quiereOtroProducto());


        listaDePedido.imprimirOrderList();




    }

    private static void imprimirOpcionesMenu(){
        int contador = 1;

        // Impresion de Comida
        System.out.println("## Comida ##");
        for (TiposDeComida tiposDeComida: Constantes.TiposDeComida.values()){
            System.out.println("  " + tiposDeComida.toString());
            for (Comida comida: CreacionDeProductos.comidaTreeMap.values()) {
                if (comida.getTipoDeComida() == tiposDeComida){
                    menu.add(comida);
                    System.out.println("\t" + contador + ".  " + comida.getNombre() + " - " + comida.getDescripcion());
                    contador++;
                }
            }
        }
        // Impresion de Bebida
        System.out.println("## Bebida ##");
        for (TiposDeBebida tiposDeBebida: Constantes.TiposDeBebida.values()){
            System.out.println("  " + tiposDeBebida.toString());
            for (Bebida bebida: CreacionDeProductos.bebidaTreeMap.values()) {
                if (bebida.getTipoDeBebida() == tiposDeBebida){
                    menu.add(bebida);
                    System.out.println("\t" + contador + ".  " + bebida.getNombre() + " - " + bebida.getDescripcion());
                    contador++;
                }
            }
        }
    }

    private static boolean quiereOtroProducto(){
        boolean eleccion = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Gusta otro producto?");
        System.out.println("1. Si, por favor");
        System.out.println("0. No, gracias");
        int response = Integer.parseInt(scanner.nextLine());
        boolean ciclo;
        do {
            switch (response){
                case 1:
                    eleccion = true;
                    ciclo = false;
                break;
                case 0:
                    eleccion =  false;
                    ciclo = false;
                break;
                default:
                    System.out.println("Inserta opcion deseada");
                    ciclo = true;
            }
        }while (ciclo);
        return eleccion;
    }




}
