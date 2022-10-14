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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores 
        numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los 
        números mediante un bucle.
        */
        int[] arrayNums = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println("Ingrese un entero para llenar el array");
            arrayNums[i] = sc.nextInt();
        }
        for (int j = 0; j < arrayNums.length; j++) {
            System.out.print(arrayNums[j] + "  ");
        }
    }
    
}
