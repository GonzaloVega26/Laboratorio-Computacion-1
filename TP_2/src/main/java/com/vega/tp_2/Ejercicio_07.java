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
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        7- Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
        vocales tiene en total (recorre el String con charAt)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String s = sc.nextLine();
        int contadorVocales = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char caracter = Character.toLowerCase(s.charAt(i)); //Convierte a lowercase en caso de vocales mayusculas
            if(caracter == 'a' ||
               caracter == 'e' ||
               caracter == 'i' ||
               caracter == 'o' ||
               caracter == 'u') contadorVocales++;
                                             
        }
        
        System.out.println("La cadena contiene " + s.length() + " caracteres");
        System.out.println("La cadena contiene " + contadorVocales + " vocales en total");
    }
    
}
