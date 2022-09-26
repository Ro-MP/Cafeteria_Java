package model.order;

import constantes.Constantes;
import model.bebidas.Bebida;
import ui.UIMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderList {
    private ArrayList<OrdenItem> orderList = new ArrayList<>();


    public void addOrderItem (int opcionSelecionada) {
        int itemMenu = opcionSelecionada - 1;
        orderList.add(new OrdenItem(UIMenu.menu.get(itemMenu)));
    }


    public void imprimirOpcionesDeBebida(){
        boolean ciclo = false;
        int response = 0;
        Scanner scanner = new Scanner(System.in);

        // Pregunta si le gustaría Doble el tamaño de su bebida
        if (orderList.get(orderList.size()-1).getProducto().getTipoDeProductos() == Constantes.TiposDeProductos.BEBIDA) {
            System.out.println("Te gustaría que tu " + orderList.get(orderList.size()-1).getProducto().getNombre() + " fuera doble :");
            System.out.println("1. Si, por favor, deseo más de ese exquisito sabor");
            System.out.println("0. No");
            do {
                response = Integer.parseInt(scanner.nextLine());
                switch (response){
                    case 0:
                        ciclo = false;
                        break;
                    case 1:
                        orderList.get(orderList.size()-1).getProducto().duplicarTamanio();
                        ciclo = false;
                        break;
                    default:
                        System.out.println("Introduce opcion valida");
                        ciclo = true;
                }
            }while (ciclo);
        }


        // Pregunta por si gusta topping
        System.out.println("¿Gustas agregar algun topping?");

        if (orderList.get(orderList.size()-1).getProducto().getTipoDeProductos() == Constantes.TiposDeProductos.COMIDA){
            if (orderList.get((orderList.size()-1)).getProducto().getTipoDeComida() == Constantes.TiposDeComida.POSTRE){    // Condicion para Toppings de Postre
                do {
                    int contador = 1;
                    ArrayList<Constantes.ToppingsPostres> opcionesToppings = new ArrayList<>();
                    for (int i=0; i<Constantes.ToppingsPostres.values().length; i++){
                        if (!orderList.get(orderList.size()-1).getProducto().getToppings().contains(Constantes.ToppingsPostres.values()[i].toString()) ){
                            System.out.println(contador + ". " + Constantes.ToppingsPostres.values()[i].toString());
                            contador++;
                            opcionesToppings.add(Constantes.ToppingsPostres.values()[i]);
                            //orderList.get(orderList.size()-1).getProducto().addTopping(Constantes.ToppingsBebidas.values()[i]);
                        }
                    }
                    System.out.println("0. Ninguno, gracias.");
                    response = Integer.parseInt(scanner.nextLine());
                    if (response > 0 && response <= opcionesToppings.size()){
                        orderList.get(orderList.size()-1).getProducto().addTopping(opcionesToppings.get(response - 1));
                        if (orderList.get(orderList.size()-1).getProducto().getToppings().size() < Constantes.ToppingsPostres.values().length){
                            System.out.println("¿Te gustaria agregar otro?");
                            System.out.println("1. Si");
                            System.out.println("0. No");
                            response = Integer.parseInt(scanner.nextLine());
                            if (response == 1) ciclo = true;
                            else ciclo = false;
                        } else ciclo = false;
                    } else ciclo = false;
                }while (ciclo);

            } else {            // Condicion para Toppings de Comida _sin contar postre
                do {
                    int contador = 1;
                    ArrayList<Constantes.ToppingsComidas> opcionesToppings = new ArrayList<>();
                    for (int i=0; i<Constantes.ToppingsComidas.values().length; i++){
                        if (!orderList.get(orderList.size()-1).getProducto().getToppings().contains(Constantes.ToppingsComidas.values()[i].toString()) ){
                            System.out.println(contador + ". " + Constantes.ToppingsComidas.values()[i].toString());
                            contador++;
                            opcionesToppings.add(Constantes.ToppingsComidas.values()[i]);
                            //orderList.get(orderList.size()-1).getProducto().addTopping(Constantes.ToppingsBebidas.values()[i]);
                        }
                    }
                    System.out.println("0. Ninguno, gracias.");
                    response = Integer.parseInt(scanner.nextLine());
                    if (response > 0 && response <= opcionesToppings.size()){
                        orderList.get(orderList.size()-1).getProducto().addTopping(opcionesToppings.get(response - 1));
                        if (orderList.get(orderList.size()-1).getProducto().getToppings().size() < Constantes.ToppingsBebidas.values().length){
                            System.out.println("¿Te gustaria agregar otro?");
                            System.out.println("1. Si");
                            System.out.println("0. No");
                            response = Integer.parseInt(scanner.nextLine());
                            if (response == 1) ciclo = true;
                            else ciclo = false;
                        } else ciclo = false;
                    } else ciclo = false;
                }while (ciclo);
            }

        } else {            // Condicion para Toppings de Bebidas
            do {
                int contador = 1;
                ArrayList<Constantes.ToppingsBebidas> opcionesToppings = new ArrayList<>();
                for (int i=0; i<Constantes.ToppingsBebidas.values().length; i++){
                    if (!orderList.get(orderList.size()-1).getProducto().getToppings().contains(Constantes.ToppingsBebidas.values()[i].toString()) ){
                        System.out.println(contador + ". " + Constantes.ToppingsBebidas.values()[i].toString());
                        contador++;
                        opcionesToppings.add(Constantes.ToppingsBebidas.values()[i]);
                        //orderList.get(orderList.size()-1).getProducto().addTopping(Constantes.ToppingsBebidas.values()[i]);
                    }
                }
                System.out.println("0. Ninguno, gracias.");
                response = Integer.parseInt(scanner.nextLine());
                if (response > 0 && response <= opcionesToppings.size()){
                    orderList.get(orderList.size()-1).getProducto().addTopping(opcionesToppings.get(response - 1));
                    if (orderList.get(orderList.size()-1).getProducto().getToppings().size() < Constantes.ToppingsBebidas.values().length){
                        System.out.println("¿Te gustaria agregar otro?");
                        System.out.println("1. Si");
                        System.out.println("0. No");
                        response = Integer.parseInt(scanner.nextLine());
                        if (response == 1) ciclo = true;
                        else ciclo = false;
                    } else ciclo = false;
                } else ciclo = false;
            }while (ciclo);
        }


        // Imprime Producto seleccionado
        System.out.println("  -  -  -  -  -  ");
        System.out.print("\nProducto seleccionado:  " + orderList.get(orderList.size()-1).getProducto().getNombre());
        if (orderList.get(orderList.size()-1).getProducto().isTamanioDoble()) System.out.print("  Doble");
        //Imprime Toppings seleccionados
        if (orderList.get(orderList.size()-1).getProducto().getToppings().size() != 0) {
            System.out.print("\nToppings:  ");
            for (String topping : orderList.get(orderList.size() - 1).getProducto().getToppings()) {
                System.out.print(topping + " ");
            }
        }
        //Imprime Costo del producto
        String costo = String.valueOf(orderList.get(orderList.size()-1).getProducto().getCosto());
        System.out.println("\nCosto: " + costo );

        // Agregar mas unidades del pruducto
        System.out.print("¿Cuantas unidades gustas del producto?   ");
        response = Integer.parseInt(scanner.nextLine());
        orderList.get(orderList.size()-1).setUnidadesDeProductos(response);
    }


    public void imprimirOrderList(){

        System.out.println("\n ############ \n  Tu pedido");
        for (OrdenItem item : orderList){
            System.out.print(" - " + item.getUnidadesDeProductos() + " " + item.getProducto().getNombre() + " ");
            if (item.getProducto().isTamanioDoble()) System.out.print("Doble  ");
            if (item.getProducto().getToppings().size() != 0) System.out.print("con " + item.getProducto().getToppingsString());
            System.out.println("  $" + item.getCostoItem());
        }
        System.out.println("\t\t Total:   $ " + getCostoTotal());
    }

    public String getCostoTotal(){
        float costoTotal = 0f;
        for (OrdenItem item : orderList){
            costoTotal += item.getCostoItem();
        }
        return String.valueOf(costoTotal);
    }

}
