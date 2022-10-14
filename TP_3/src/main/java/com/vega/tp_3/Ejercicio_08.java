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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        8. Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por 
        ejemplo:
        45-9-8-6-45-23-21-74-96-32-45-2
        Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en 
        un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de numeros separadas por guiones");
        String cadena = sc.nextLine();
        String[] arrayNumsString = cadena.split("-");
        int[] arrayNums = convertirArrayToInt(arrayNumsString);
        
        System.out.println("La suma total de los elementos es " + sumaTotalElementos(arrayNums));
        System.out.println("El promedio de la suma de los elementos es " + promedioElementosArray(arrayNums));
    }
    public static int[] convertirArrayToInt(String[] array){
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
           temp[i] = Integer.valueOf(array[i]) ;
            
        }
        return temp;
    }
    
    public static int sumaTotalElementos(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
    public  static double promedioElementosArray(int[] array){
        return sumaTotalElementos(array)/ array.length;
    }
    
}
