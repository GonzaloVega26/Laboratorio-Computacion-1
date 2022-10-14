/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_5;

/**
 *
 * @author gonzalo
 */
public class Busqueda_secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] array = {1, 5, 10, 3, 2, 7, 9, 4, 8, 6};
        mostrarArray(array);
        
        System.out.println(secuencial(array, 5));
        System.out.println(secuencial(array, 11));
    }

    public static boolean secuencial(int[] array, int numero) {
        int n = array.length;
        boolean encontrado = false;
        // recorremos la lista, revisando cada elemento de la misma, para ver si es el numero está
        for (int i = 0; i < n; i++) // comparamos el numero de la posición actual con el numero buscado
        {
            if (array[i] == numero) {
        // encontramos el alumno buscado
                encontrado = true;
            }
        }
        // si nunca se cumple L[i] == a, entonces la variable que indica si se
        // encontró o no el alumno: seEncontró, quedará valiendo falso.
        return encontrado;
    }
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }

}
