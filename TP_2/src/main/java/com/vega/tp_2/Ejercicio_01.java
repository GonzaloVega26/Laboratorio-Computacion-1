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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1- CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
        asigne el mismo a una variable valorDecimal de tipo double, aplique las
        operaciones de CASTING para convertir la variable a los siguientes tipos de
        datos, short, int, long, String, float investigue las diferentes formas de lograr la
        conversión. Muestre por pantalla el resultado de las conversiones.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double num = sc.nextDouble();
        sc.close();
        short numShort = (short) num;
        int numInt = (int) num;
        long numLong = (long) num;
        String numString = String.valueOf(num);
        float numFloat = (float) num;
        
        System.out.println("El numero en Double es " + num);
        System.out.println("El numero en Short es " + numShort);
        System.out.println("El numero en Integer es " + numInt);
        System.out.println("El numero en Long es " + numLong);
        System.out.println("El numero en String es " + numString);
        System.out.println("El numero en float es " + numFloat);
    }
    
}
