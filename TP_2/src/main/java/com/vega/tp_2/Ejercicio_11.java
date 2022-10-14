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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        11- Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
        compareToIgnoreCase)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase1 = sc.nextLine();
        System.out.println("Ingrese otra frase");
        String frase2 = sc.nextLine();
        if(frase1.equalsIgnoreCase(frase2))System.out.println("Es la misma frase");
        else System.out.println("No es la misma frase");
    }
    
}
