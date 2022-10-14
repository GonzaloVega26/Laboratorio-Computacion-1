/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_5;

import java.util.Scanner;
import static tp_5.Algoritmo_burbuja.burbujaASC;
import static tp_5.Algoritmo_burbuja.burbujaDESC;
import static tp_5.Ordenamiento_por_insercion.insercionASC;
import static tp_5.Ordenamiento_por_insercion.insercionDESC;
import static tp_5.Ordenamiento_por_seleccion.seleccionASC;
import static tp_5.Ordenamiento_por_seleccion.seleccionDESC;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_04 {

    /*4- Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos
enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se
desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento
aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el
algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el
array original desordenado y su resultante ordenado según las opciones elegidas
     */
    public static void main(String[] args) {
        int[] arrayNumeros = new int[20];
        //llenarArray(arrayNumeros);
        llenarArrayAutomatico(arrayNumeros);
        mostrarArray(arrayNumeros);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el orden de ordenamiento (ASC ó DESC)");
        seleccionMetodo(arrayNumeros, sc.nextLine());
        mostrarArray(arrayNumeros);
    }

    public static void seleccionMetodo(int[] array, String orden) {
        Scanner sc = new Scanner(System.in);
        mostrarMenuAlgortimos();
        int algortimo = sc.nextInt();
        if (orden.equalsIgnoreCase("ASC")) {
            switch (algortimo) {
                case 1:
                    burbujaASC(array);
                    break;
                case 2:
                    seleccionASC(array);
                    break;
                case 3:
                    insercionASC(array);
                    break;
            }
        } else {
            switch (algortimo) {
                case 1:
                    burbujaDESC(array);
                    break;
                case 2:
                    seleccionDESC(array);
                    break;
                case 3:
                    insercionDESC(array);
                    break;
            }

        }

    }

    public static void mostrarMenuAlgortimos() {
        System.out.println("Seleccione una opción");
        System.out.println("1. Ordenamiento por Burbuja \n"
                + "2. Ordenamiento por Selección \n"
                + "3. Ordenamiento por Inserción");
    }

    public static void llenarArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void llenarArrayAutomatico(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }
}
