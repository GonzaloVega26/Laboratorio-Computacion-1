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
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        8- Reemplaza todas las a del String anterior por una e. (aplique replace)
        */
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese una cadena");
         String s = sc.nextLine();
         
         System.out.println("La cadena es " + s);
         for (int i = 0; i < s.length(); i++) {
            s = s.replace(s.charAt(i), 'e');
        }
         System.out.println("La cadena reemplazada " + s);
    }
    
}
