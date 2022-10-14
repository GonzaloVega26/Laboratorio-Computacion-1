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
public class P5_Ejercicio03 {
/*
    - Recursiva
Diseñar un algoritmo que solicite el ingreso de una cadena de texto y que
posteriormente y mediante recursión muestre cada una de las letras de la cadena
en forma individual por cada pasada de la recursión. Se recomienda usar charAt
    */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        mostrarCharRecursivo(cadena);
    }
    
    // Ver de nuevo despues!!! 
    public static void mostrarCharRecursivo(String cadena){
       if(cadena.length() == 1){
           System.out.println(cadena);
       }else{
           System.out.println(cadena.charAt(0));
           mostrarCharRecursivo(cadena.substring(1));
       }
    }
    
}
