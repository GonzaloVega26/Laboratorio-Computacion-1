/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X;
        do {            
            System.out.println("Ingrese un numero mayor o igual a 3 Y menor o igual a 10");
            X =  sc.nextInt();
        } while (X < 3 || X > 10);
        int[][] array = new int[X][X];
        
        llenarArrayAutomatic(array);
        mostrarMatriz(array);
        
        int[] arrayResultado = new int[X];
        sumarColumnas(array, arrayResultado);
        
        mostrarVector(arrayResultado);
        
        System.out.println("El resultado es " + sumarFilas(arrayResultado));
        
        
    }
    
    public static void sumarColumnas(int[][] array, int[] arrayResultado) {
        int sumaColumna = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
               sumaColumna += array[j][i];
            }
            arrayResultado[i] = sumaColumna;
            sumaColumna = 0;

        }

    }
      public static int sumarFilas(int[] array) {
        int sumaFilas = 0;
        for (int i = 0; i < array.length; i++) {
            sumaFilas+= array[i];

        }
        return sumaFilas;

    }
    
    
    
    public static void llenarArrayAutomatic(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random()*10);
            }
        }

    }
    
    public static void mostrarMatriz(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");

        }
    }
    
    public static void mostrarVector(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"   ");
        }
        System.out.println("");
    }
    
    
}
