/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_5;

import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantida de filas y columnas");
        System.out.print("Filas: "); 
        int n = sc.nextInt();
        System.out.print("Columnas: "); 
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        llenarMatrizAutomatic(matriz);
        System.out.println("El promedio entero es " + promedioEntero(matriz));
        System.out.println("El promedio se encuentra en las posiciones " + encontrarPromedioEnMatriz(matriz, promedioEntero(matriz)));
        mostrarMatriz(matriz);
        
    }
    
    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese valor [" +i+"]["+j+"]");
                matriz[i][j]= new Scanner(System.in).nextInt();
            }
        }
    }
    public static void llenarMatrizAutomatic(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= (int) (Math.random()*100);
            }
        }
                System.out.println("Matriz llenada!");
    }
    public static int promedioEntero(int[][] matriz){
        int sumatoria = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumatoria += matriz[i][j] ;
            }
        }
        return sumatoria / (matriz.length * matriz[0].length);
    }
    
    public static String encontrarPromedioEnMatriz(int[][] matriz, int numero){
        String posiciones = "";
        //Algoritmo de busqueda secuencial
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] == numero) posiciones += "("+i+","+j+")";
            }
        }
        posiciones = posiciones.length() < 1 ? "No hay coincidencias": posiciones;
        return posiciones;
    }
    
    public static boolean secuencial(int[] array, int numero) {
        int n = array.length;
        boolean encontrado = false;
        // recorremos la lista, revisando cada elemento de la misma, para ver si es el numero está
        for (int i = 0; i < n; i++) // comparamos el numero de la posición actual con el numero buscado
        {
            if (array[i] == numero) {
        // encontramos el alumno buscado
                encontrado = true;
            }
        }
        // si nunca se cumple L[i] == a, entonces la variable que indica si se
        // encontró o no el alumno: seEncontró, quedará valiendo falso.
        return encontrado;
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
}
