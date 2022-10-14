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
public class Ordenamiento_por_seleccion {

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
    public static void seleccionMetodo(int[] array, String orden){
        if(orden.equalsIgnoreCase("ASC")) seleccionASC(array);
        else if(orden.equalsIgnoreCase("DESC")) seleccionDESC(array);
        else System.out.println("Opción no válida");
        mostrarArray(array);
    }

    public static void seleccionASC(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                // si este par no está ordenado 
                if (array[j] < array[minimo]) {
                    // encontramos un nuevo mínimo 
                    minimo = j;
                }
            }
            // intercambiamos el actual con el mínimo encontrado 
            int aux = array[minimo];
            array[minimo] = array[i];
            array[i] = aux;
        }
    }

    public static void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void seleccionDESC(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                // si este par no está ordenado 
                if (array[j] > array[minimo]) {
                    // encontramos un nuevo mínimo 
                    minimo = j;
                }
            }
            // intercambiamos el actual con el mínimo encontrado 
            int aux = array[minimo];
            array[minimo] = array[i];
            array[i] = aux;
        }
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }

    /*
    INICIO seleccion (A : lista de elementos ) 
n = longitud(A) 
PARA (ENTERO i = 1; i < n - 1; i++) 
ENTERO minimo = i 
PARA (ENTERO j = i+1; j < n; j++) 
// si este par no está ordenado 
SI (A[j] < A[minimo]) ENTONCES: 
// encontramos un nuevo mínimo 
minimo = j 
FIN_SI 
// intercambiamos el actual con el mínimo encontrado 
ENTERO aux = A[minimo] 
A[minimo] = A[j] 
A[j] = aux 
FIN_PARA 
FIN_PARA 
FIN 
     */
    // Selection sort in Java
    /*public class LFC {

        public static void main(String args[]) {
            int arr[] = {6, 7, 2, 1, 4};
            int size = arr.length;
            for (int i = 0; i < size - 1; i++) {
                int min = i;
                for (int j = i + 1; j < size; j++) {
                    if (arr[j] > arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(" " + arr[i]);
            }
        }
    }
     */
}
