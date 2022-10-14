/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_5;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ordenamiento_por_insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = {1,5,10,3,2,7,9,4,8,6};
        mostrarArray(array);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el orden en que quiere ordenar el array (ASC ó DESC)");
        seleccionMetodo(array, sc.nextLine());
    }
    public static void seleccionMetodo(int[] array, String orden){
        if(orden.equalsIgnoreCase("ASC")) insercionASC(array);
        else if(orden.equalsIgnoreCase("DESC")) insercionDESC(array);
        else System.out.println("Opción no válida");
        mostrarArray(array);
    }
    
    public static void insercionASC(int[] array){
        for(int i = 0; i < array.length; i++){
            int valor = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > valor){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = valor;
        }
    }
    
    public static void insercionDESC(int[] array){
        for(int i = 0; i < array.length; i++){
            int valor = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] < valor){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = valor;
        }
    }
    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
    }
    /*
    INICIO insercion (A: lista de elementos) 
PARA (ENTERO i = 1; i < longitud(A); i++) : 
ENTERO valor = A[i] 
ENTERO j = i-1 
MIENTRAS (j >= 0 && A[j] > valor) 
HACER: 
A[j+1] = A[j] 
j-- 
FIN_MIENTRAS 
A[j+1] = valor 
FIN_PARA 
FIN 
    */
    
}
