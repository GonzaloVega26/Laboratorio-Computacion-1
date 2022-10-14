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
public class Ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        22- Suma los dígitos de un número ingresado por el usuario de forma recursiva.
    Ejemplo: el usuario ingresa 1596
    El programa debe sumar 1 + 5 + 9 + 6
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        sumaDigitosRecursivo(num);
        System.out.println("La suma de los digitos es " + sumaDigitosRecursivo(num));
    }
    
    public static int sumaDigitosRecursivo(int num){
        if(num < 1 ) return 0;
        return num % 10 + sumaDigitosRecursivo((int) num/10);
    }
    
}
