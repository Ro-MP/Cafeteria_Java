package ui;

import model.Productos;
import model.bebidas.Cafe;
import model.bebidas.CafeClasico;
import model.bebidas.CafeDeMetodo;
import model.order.OrdenItem;

import static ui.CreacionDeProductos.*;
import constantes.Constantes.*;

import java.util.ArrayList;
import java.util.Scanner;


public class UIMenu {

    private static ArrayList<OrdenItem> orderList = new ArrayList<>();

    public static void showMenu() {

        int response = 0;
        int indexAllOrderLists = 0;


        System.out.println("## Bienvenido a  Cachito de Coco Cafe ##");
        System.out.println("\nPor favor selecciona tu producto deseado");
        imprimirOpcionesMenu();
        Scanner scanner = new Scanner(System.in);
        response = Integer.parseInt(scanner.nextLine());
        switch (response){
            case 1:
                imprimirOpcionesDeBebida(cafesClasicos.get(CaracteristicasDeCafe.AMERICANO.toString()));
                break;
            case 2:
                imprimirOpcionesDeBebida(cafesClasicos.get(CaracteristicasDeCafe.CAPPUCCINO.toString()));
                break;
            case 3:
                imprimirOpcionesDeBebida(cafesClasicos.get(CaracteristicasDeCafe.ESPRESSO.toString()));
                break;
            case 4:
                imprimirOpcionesDeBebida(cafesDeMetodo.get(CaracteristicasDeCafe.ARABIC.toString()));
                break;
            case 5:
                imprimirOpcionesDeBebida(cafesDeMetodo.get(CaracteristicasDeCafe.CHEMEX.toString()));
                break;
            case 6:
                imprimirOpcionesDeBebida(cafesDeMetodo.get(CaracteristicasDeCafe.COLDBREW.toString()));
                break;
            default:
                System.out.println("Introduce opcion valida");
        }



    }

    private static void imprimirOpcionesMenu(){
        int contador = 1;

        // Impresion de Cafes clasicos
        System.out.println("-- Cafe Clasico --");
        for (CafeClasico cafe: CreacionDeProductos.cafesClasicos.values()) {
            System.out.println("\t" + contador + ".  " + cafe.getNombre());
            contador++;
        }
        // Impresion de Cafes de Metodo
        System.out.println("-- Cafe de Metodo --");
        for (CafeDeMetodo cafe: CreacionDeProductos.cafesDeMetodo.values()) {
            System.out.println("\t" + contador + ".  " + cafe.getNombre());
            contador ++;
        }
    }

    private static void imprimirOpcionesDeBebida(Cafe cafe){
        addItem(new OrdenItem(cafe));
        boolean ciclo = false;
        int response = 0;
        Scanner scanner = new Scanner(System.in);

        // Pregunta por tamaño de la bebida
        System.out.println("El tamaño de tu cafe " + cafe.getNombre() + " lo gustas Sencillo o Doble :");
        System.out.println("1. Sencillo");
        System.out.println("2. Doble");
        do {
            response = Integer.parseInt(scanner.nextLine());
            switch (response){
                case 1:
                    ciclo = false;
                    break;
                case 2:
                    Productos pr = (orderList.get(orderList.size()-1).getProducto());   // ###########################
                    //pr.
                    ciclo = false;
                    break;
                default:
                    System.out.println("Introduce opcion valida");
                    ciclo = true;
            }
        }while (ciclo);

        // Pregunta por si gusta topping
        if (CaracteristicasDeCafe.valueOf(cafe.getNombre()).getTipoDeCafe() == TiposDeCafe.CAFE_CLASICO){
            System.out.println("¿Gustas agregar algun topping?");
            ArrayList<ToppingsBebidas> toppingsElegidos = new ArrayList<>();
            do {
                for (int i=0; i<ToppingsBebidas.values().length; i++){
                    int indice = i+1;
                    if (!toppingsElegidos.contains(ToppingsBebidas.values()[i]))
                        System.out.println(indice + ". " + ToppingsBebidas.values()[i]);
                }
                System.out.println("0. Ninguno, gracias.");
                response = Integer.parseInt(scanner.nextLine());
                response--;
                if (response>=0 && response<=(ToppingsBebidas.values().length-1)){
                    orderList.get(orderList.size()-1).getProducto().addTopping(ToppingsBebidas.values()[response]);
                    toppingsElegidos.add(ToppingsBebidas.values()[response]);
                    if (toppingsElegidos.size() < ToppingsBebidas.values().length){
                        System.out.println("¿Te gustaria agregar otro?");
                        System.out.println("1. Si");
                        System.out.println("0. No");
                        response = Integer.parseInt(scanner.nextLine());
                        if (response == 1) ciclo = true;
                    } else ciclo = false;
                } else ciclo = false;
            }while (ciclo);
        } else System.out.println("Los cafes de metodo no llevan toppings, solo los clasicos");

        // Pregunta por si gusta que lo enfrien
        System.out.println("¿Gustarias que enfriemos tu bebida?");
        System.out.println("1. Si");
        System.out.println("0. No");
        response = Integer.parseInt(scanner.nextLine());
        do {
            switch (response){
                case 1:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Introduce opcion valida");
                    ciclo = true;
            }
        }while (ciclo);



    }


    /*
        Funciones para la orderList,  agregar y borrar OrderItem
        y retornar un string del OrderItem con todas sus caracteristicas en una linea
     */
    private static void addItem(OrdenItem orderItem){
        orderList.add(orderItem);
    }

    private static void deleteItem(int indexItem){
        orderList.remove(indexItem);
    }

    private static String getListString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (OrdenItem orderItem: orderList) {

            stringBuilder.append(orderItem.getCantidadDeProductos()).append("\t")
                    .append(orderItem.getProducto().getNombre()).append(" \t");

            if (orderItem.getProducto().isTamanioDoble()){
                stringBuilder.append(" Doble ");
            }

            if(orderItem.getProducto().getToppings() != null){
                stringBuilder.append(" toppings: ").append(orderItem.getProducto().getToppingsString()).append("\t");
            }else stringBuilder.append("\t\t");

            stringBuilder.append(orderItem.getCostoItem());


        }

        return stringBuilder.toString();
    }


}
