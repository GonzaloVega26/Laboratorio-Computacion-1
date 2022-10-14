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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4. Escriba una aplicación que: 
        a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
        arreglo unidimensional.
        b) determine y muestre el mayor de los números en el arreglo
        c) determine y muestre el menor de los números del arreglo calcule y muestre el rango 
        (diferencia entre el mayor y el menor) de los elementos en el arreglo
        */
        Scanner sc = new Scanner(System.in);
        double[] arrayDoubles = new double[20];
        
        for (int i = 0; i < arrayDoubles.length; i++) {
            System.out.println("Ingrese un valor real");
            arrayDoubles[i] = sc.nextDouble();
        }
            //Pone el primer valor del array como el minimo y el maximo
        double max = arrayDoubles[0],
               min = arrayDoubles[0];
        for (int i = 0; i < arrayDoubles.length; i++) {
            
            if(arrayDoubles[i] > max ) max = arrayDoubles[i];
            if(arrayDoubles[i] < min ) min = arrayDoubles[i];
        }
        
        System.out.println("El mayor es " + max);
        System.out.println("El menor es " + min);
        System.out.println("El rango es " + (max-min));
    }
    
}
