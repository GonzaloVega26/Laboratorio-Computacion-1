/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_5;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Algoritmo_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 5, 10, 3, 2, 7, 9, 4, 8, 6};
        mostrarArray(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el orden en que quiere ordenar el array (ASC ó DESC)");
        seleccionMetodo(array, sc.nextLine());
    }

    public static void seleccionMetodo(int[] array, String orden) {
        if (orden.equalsIgnoreCase("ASC")) {
            burbujaASC(array);
        } else if (orden.equalsIgnoreCase("DESC")) {
            burbujaDESC(array);
        } else {
            System.out.println("Opción no válida");
        }
        mostrarArray(array);
    }

    public static void burbujaASC(int[] array) {
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    public static void burbujaDESC(int[] array) {
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] < array[i]) {
                    int aux = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado);
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }
    /*
    INICIO burbuja (A: lista de elementos) 
n = longitud(A) 
HACER: 
intercambiado = falso 
PARA (ENTERO i = 1; i < n; i++) 
// si este par no está ordenado 
SI (A[i-1] > A[i]) ENTONCES: 
// los intercambiamos y recordamos que algo ha cambiado 
ENTERO aux = A[i-1] 
A[i-1] = A[i] 
A[i] = aux 
intercambiado = verdadero 
FIN_SI 
FIN_PARA 
MIENTRAS (intercambiado == verdadero) 
FIN
     */

}
