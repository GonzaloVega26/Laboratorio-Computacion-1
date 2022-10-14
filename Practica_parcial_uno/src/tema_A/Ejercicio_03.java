/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_A;

import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        char [] alfabeto = {'a','b','c','d','e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',' '};
        int[] array = new int[10];
        cargarArray(array);
        traducirNumeros(array, alfabeto);
        
        
        
    }
    
    public static int ingresarNumeroValido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 26");
        int numero = sc.nextInt();
        if(numero >= 0 && numero <= 26) return numero;
        return ingresarNumeroValido();
    }
    public static void cargarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = ingresarNumeroValido();
        }
    }
    
    public static void traducirNumeros(int[] arrayNumeros, char[] alfabeto){
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(alfabeto[arrayNumeros[i]]);
        }
        System.out.println("");
    }
}
