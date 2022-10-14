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
public class P5_Ejercicio05 {

    /*
    b- Escribe un programa que busque un valor dentro de un array de integers y
borre todas sus ocurrencias, reduciendo la dimensión del array. Es decir,
no vale con poner cero en el lugar donde encontremos el valor.
El array de enteros será:
1 – 5 – 9 – 3 – 45 – 23 – 45 – 12 – 87 – 9 – 6 – 5
El valor a buscar y borrar debe ser introducido por el usuario.
El programa debe mostrar por pantalla el valor borrado, el array inicial y el array
final.
Una posible salida sería:
Introduce el número que quieres borrar:
5
Elemento a borrar: 5
Array inicial: 1 – 5 – 9 – 3 – 45 – 23 – 45 – 12 – 87 – 9 – 6 – 5
Array final : 1 – 9 – 3 – 45 – 23 – 45 – 12 – 87 – 9
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int[] array = new int[10]; //Array Dinámico
        //llenarArray(array);;
        int[] array = {1 , 5 , 9 , 3 , 45 , 23 , 45 , 12 , 87 , 9 , 6 , 5};
        System.out.println("Array Original");
        mostrarArray(array);

        System.out.println("Ingrese el valor a borrar");
        int numeroABorrar = sc.nextInt();
        int[] arrayModificado = borrarNumero(array, numeroABorrar);

        System.out.println("Array Modificado");
        mostrarArray(arrayModificado);
    }

    public static void llenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.println("El array es:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int[] borrarNumero(int[] array, int numero) {
        int[] arrayModificado = new int[array.length - contarOcurrencias(array, numero)];
        int i = 0, j = 0;
        while(i < array.length){
           if(array[i] != numero){
                arrayModificado[j]= array[i];
                j++;
            }
            i++;
        }
      
        
        return arrayModificado;
    }

    public static int contarOcurrencias(int[] array, int numero) {
        int[] arrayCopy = array.clone(); //No modifique el original
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                contador++;
            }
        }
        return contador;
    }
}
