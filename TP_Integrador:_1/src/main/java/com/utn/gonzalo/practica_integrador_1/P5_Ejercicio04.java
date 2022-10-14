/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.gonzalo.practica_integrador_1;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class P5_Ejercicio04 {
/*
    - Arreglo
a- Codifique un algoritmo que cargue en un array 10 números enteros
mayores a 0, todos los números cargados deben ser distintos entre sí, al
finalizar la carga, muestre los números cargados.
Valide que no pueda
cargarse el mismo número.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int[] arrayNumeros = new int[10];
        while(contador < arrayNumeros.length){
            int numero = verificarEnteroPositivo(); // Verifica que el numero sea positivo
            if(verificarRepetidos(arrayNumeros, numero)){ //Solo añade numero si no está repetido
                arrayNumeros[contador] = numero;
                contador++;//Para llenar el array completo no se avanza de posición sino se agrego numero nuevo.
            }
        }
        mostrarArray(arrayNumeros);
    }
    
    public static boolean verificarRepetidos(int[] array, int numero){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == numero) {
                System.out.println("Número repetido");
                return false;
            }
        }
        
        return true;
    }
    public static int verificarEnteroPositivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if(numero > 0  ) return numero;
        
        System.out.println("Debe ser mayor a cero");
        return  verificarEnteroPositivo();
    }
    
    public static void mostrarArray(int[] array){
        System.out.println("El array es:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
