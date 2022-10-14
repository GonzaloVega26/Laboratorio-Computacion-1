/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        10- Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
        usuario lo pida y mostraremos el resultado por pantalla.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        
        System.out.println("Ingrese minusculas o m");
        System.out.println("Ingrese mayusculas o M");
        String opcion = sc.nextLine();
        
        if(opcion.equals("minusculas")|| opcion.equals("m")){
            System.out.println(frase.toLowerCase());
        }else if(opcion.equals("mayusculas")|| opcion.equals("M")){
             System.out.println(frase.toUpperCase());
        }else{
            System.out.println("Opcion no válida");
        }
    }
    
}
