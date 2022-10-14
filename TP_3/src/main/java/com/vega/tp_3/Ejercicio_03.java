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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3. Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear 
        una función que rellene el array o arreglo con los múltiplos de un numero pedido por 
        teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array 
        contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la tamaño del array");
        int tamanioArray = sc.nextInt();
        int[] arrayNums = new int[tamanioArray];
        
        System.out.println("Ingrese un entero para llenar el array con sus multiplos");
        int numero = sc.nextInt();
        
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = numero * (i+1);
        }
        for (int j = 0; j < arrayNums.length; j++) {
            System.out.print(arrayNums[j] + "  ");
        }
    }
    
}
