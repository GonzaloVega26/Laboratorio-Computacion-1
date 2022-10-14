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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5- Solicite el ingreso de un número y conviértalo a un String mediante
        String.valueOf
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        String numString = String.valueOf(num);
        System.out.println("El numero es " + num);
        System.out.println("El numero en String es " + numString);
    }
    
}
