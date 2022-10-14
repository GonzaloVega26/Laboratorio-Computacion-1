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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        6. Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado 
        aleatoriamente mediante la función java random. 
        Realice una búsqueda secuencial de la siguiente forma: 
        - se lee el valor que se desea buscar, 
        - se compara la primera posición; 
        - si son iguales, 
        - fin de la búsqueda. 
        - De lo contrario, compararlo con la segunda posición, y así sucesivamente. 
        - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje 
        apropiado. 
        - Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por 
        primera vez.
        */
        Scanner sc = new Scanner(System.in);
        int[] arrayNums = new int[20];
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = ((int) (Math.random() * 50)) * 2;
        }

        System.out.println("Ingrese el valor que desea buscar dentro del array");
        int valor = sc.nextInt();
        Integer resultado = encontrarValor(arrayNums, valor);
        if( resultado != null ){
           System.out.println("El valor se encuentra por primera vez en la posicion " + resultado);
            
        }else{
                System.out.println("El valor no se encuentra en el array");
            
        }
        mostrarArray(arrayNums);
        
        
        
        
    }
    
    public static void mostrarArray(int[] array){
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
    
    public static Integer encontrarValor(int[] array,int valor){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valor){
                return i;
            }
            
        }
            return null;
    }
       
    
}
