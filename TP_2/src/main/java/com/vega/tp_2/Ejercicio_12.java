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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //12- Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String cadena = sc.nextLine();
        System.out.println("La cuarta y quinta letra es " + cadena.substring(3,5));
    }
    
}
