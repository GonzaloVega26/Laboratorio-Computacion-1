/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        7. Escriba una aplicación que solicite y cargue en un arreglo 10 enteros, luego cree 
        dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
        ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla
         */

        int[] arrayNums = new int[10];
        int[] arrayDesc, arrayAsc;
        //Llenado del array por el usuario
        arrayNums = llenarArray(arrayNums);

        //Se envia copia de array para evitar modificar el array original porque los arrays se pasan por referencia
        arrayAsc = ordenarAsc(Arrays.copyOf(arrayNums, arrayNums.length)); 
        arrayDesc = ordenarDesc(Arrays.copyOf(arrayNums, arrayNums.length));
        
        System.out.println("Array Original");
        mostrarArray(arrayNums);
        System.out.println("Array en Forma Ascendente");
        mostrarArray(arrayAsc);
        System.out.println("Array en Froma Descendente");
        mostrarArray(arrayDesc);
    }

    public static int[] llenarArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }
    
    //Utilizando ordenamiento por algoritmo de burbuja
    public static int[] ordenarAsc(int[] array){
        int temp;
        boolean flag = true;
        while(flag){         
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    flag = true;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            } 
        }
            
        return array;
       
    }
    
    public static int[] ordenarDesc(int[] array){
        int[] arrayTemp = ordenarAsc(Arrays.copyOf(array, array.length));
        
            for (int i = 0; i < array.length; i++) {
                array[i] = arrayTemp[array.length-i-1];
               
            }
        
        return array;
    }
    /*
    swap = False
	while not swap:
		swap = True
		for j in range(1,len(l)):
		if L[j-1] > L[j]:
			swap = False
			temp = L[j]
			L[j]= L[j-1]
			L[j-1]= temp
    */
}
