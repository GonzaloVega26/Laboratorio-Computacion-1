/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_3;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        10)- Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10,
        pedir los valores numéricos enteros para cargar cada uno de los arreglos, cree un
        tercer arreglo de tamaño 5 que contenga en cada posición la suma de la multiplicación 
        de cada elemento del array uno, por cada elemento del array 2

        ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) 
        + (posición 0 del arreglo 1 * posición 1 del arreglo 2)
        + (posición 0 del arreglo 1 * posición 2 del arreglo 2) + .............
        + (posición 4 del arreglo 1 * posición 9 del arreglo 2)

        Use 2 estructuras iterativas anidadas para realizar el cálculo y 
        asignación de los valores en el 3 array.
         */

        Scanner sc = new Scanner(System.in);
        int[] arrayUno = new int[5];
        int[] arrayDos = new int[10];
        int[] arrayTres = new int[5];

        arrayUno = llenarArray(arrayUno);
        arrayDos = llenarArray(arrayDos);
        arrayTres = calcularSumaDeMultiplicaciones(arrayUno, arrayDos, arrayTres);

        mostrarArray(arrayUno);
        mostrarArray(arrayDos);
        mostrarArray(arrayTres);
    }

    public static int[] llenarArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            //array[i] = sc.nextInt();
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }

    public static int[] calcularSumaDeMultiplicaciones(int[] arrayUno, int[] arrayDos, int[] arrayTres) {
        for (int i = 0; i < arrayUno.length; i++) {
            int suma = 0;
            for (int j = 0; j < arrayDos.length; j++) {
                suma += (arrayUno[i] * arrayDos[j]);
            }
            arrayTres[i] = suma;
        }
        return arrayTres;
    }

}
