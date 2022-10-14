/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2.ejercicio_20;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class OperacionesFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numerador fraccion 1");
        int numF1 = sc.nextInt();
        System.out.println("Denominador fraccion 1");
        int denF1 = sc.nextInt();
        System.out.println("Numerador fraccion 2");
        int numF2 = sc.nextInt();
        System.out.println("Denominador fraccion 2");
        int denF2 = sc.nextInt();
        
        Fraccion f1 = new Fraccion(numF1, denF1);
        Fraccion f2 = new Fraccion(numF2, denF2);
        
        Fraccion resultadoSuma = f1.sumarFracciones(f1, f2);
        Fraccion resultadoResta = f1.restarFracciones(f1, f2);
        Fraccion resultadoMultiplicacion = f1.multiplicarFracciones(f1, f2);
        Fraccion resultadoDivision = f1.dividirFracciones(f1, f2);
        
        System.out.println("El resultado de la suma es " + resultadoSuma);
        System.out.println("El resultado de la resta es " + resultadoResta);
        System.out.println("El resultado de la multiplicacion es " + resultadoMultiplicacion);
        System.out.println("El resultado de la division es " + resultadoDivision);
    }
    
}
