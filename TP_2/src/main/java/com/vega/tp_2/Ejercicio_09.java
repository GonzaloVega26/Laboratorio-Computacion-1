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
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        9- Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
        Muéstralos en línea recta, separados por un espacio entre cada carácter.
        */
        String s = "La lluvia en Mendoza es escasa";
        String cadenaASCII = "";
        for (int i = 0; i < s.length(); i++) {
            cadenaASCII += (int) s.charAt(i)+" ";
        }
        System.out.println(cadenaASCII);

    }
    
}
