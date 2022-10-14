/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.gonzalo.practica_integrador_1;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class P5_Ejercicio06 {

    /*
    c- Desarrolla un programa java para ser usado por los camareros de un
restaurante, que sirva para tomar nota de los menús que los clientes van a
tomar.
Tenemos tres menús: #1, #2 y #3. Puedes identificar cada menú por el
número: menú 1, menú 2 o menú1 3.
Los costos del menú son
Menú 1-> $2500
Menú 2-> $3200
Menú 3-> $4500
Primer dato a introducir por el camarero es el número de comensales que
tendrá que estar en el rango de 1-6, ya que no hay mesas de más de seis
comensales. El valor introducido debe asegurarse de que se encuentra en el
rango definido.
    Entonces el camarero tiene que introducir el menú seleccionado por cada
cliente y almacenarlo en un array.
Una vez introducidos todos los datos, el programa imprimirá por pantalla
los menús solicitados por cada comensal con su respectivo precio y el costo
total correspondiente a la suma de los cotos de todos los menús.
La dimensión de array tendrá que definirse en ejecución, ya que no
sabemos a priori cuantos comensales vamos a tener.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int comensales = verificarComensales();
        int[] menusPedidos = new int[comensales];
        pedirMenu(menusPedidos);
        mostrarCostos(menusPedidos);
    }

    public static int verificarComensales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de comensales (mínimo 1, máximo 6):");
        int numero = sc.nextInt();
        if (numero >= 1 && numero <= 6) {
            return numero;
        }

        System.out.println("Debe estar entre 1 y 6 personas");
        return verificarComensales();
    }

    public static void pedirMenu(int[] menus) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menus.length; i++) {
            
            int menuElegido = verificarMenu(i);
            menus[i] = menuElegido;
        }
    }

    public static int verificarMenu(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el menú pedido por el comensal " + (i + 1) + ":");
        int numero = sc.nextInt();
        if (numero >= 1 && numero <= 3) {
            return numero;
        }

        System.out.println("Elija entre el menu 1, 2 o 3");
        return verificarMenu(i);
    }

    public static void mostrarArray(int[] array) {
        System.out.println("El array es:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void mostrarCostos(int[] menus){
        int precioMenu;
        int precioTotal = 0;
        for (int i = 0; i < menus.length; i++) {
            switch(menus[i]){
                case 1: precioMenu = 2500; 
                break;
                case 2: precioMenu = 3200; 
                break;
                default: precioMenu = 4500; 
            }
            precioTotal += precioMenu;
            System.out.println("Comensal "+  (i+1) + " va a tomar el menú " + menus[i] + " con precio $" + precioMenu);
        }
            System.out.println("El costo total a pagar por la mesa es de $" + precioTotal);
    }

}
