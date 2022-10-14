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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        System.out.println("Ingrese Numero 1");
        int X = sc.nextInt();
        System.out.println("Ingrese Numero 1");
        int Y = sc.nextInt();
        
        int[][] array1 = new int[X][Y];
        int[][] array2 = new int[Y][X];
        int[][] array3 = new int[X][Y];
        
        //llenarArrayAutomatic(array1);
        llenarArray(array1);
        //llenarArrayAutomatic(array2);
        llenarArray(array2);
        System.out.println("Arreglo 1");
        mostrarArray(array1);
        System.out.println("Arreglo 2");
        mostrarArray(array2);
        multiplicarArrays(array1, array2, array3);
        System.out.println("Arreglo 3");
        mostrarArray(array3);
    }
    
     public static void llenarArray(int[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            System.out.println("Valor " + "[" + i +"]" + "["+ j + "]");
                array[i][j] = sc.nextInt();
            }

        }

    }
     public static void multiplicarArrays(int[][] array1, int[][] array2, int[][] array3) {
         
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j] = array1[i][j] * array2[j][i];
                
            }

        }

    }
     
     public static void llenarArrayAutomatic(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random()*10);
            }
            

        }

    }
    
    public static void mostrarArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");

        }
    }
    
}
