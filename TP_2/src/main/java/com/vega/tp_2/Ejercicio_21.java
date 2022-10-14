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
public class Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        21- Codifique un programa que solicite un número entero mayor a cero y que
    mediante recursión sume todos los números números naturales desde el
    número ingresado hasta 1.
    Ejemplo: Ingreso 10
    El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
        */
        Scanner sc = new Scanner(System.in);
        
        int num;
        do {      
            System.out.println("Ingrese un numero entero mayor a cero");
            num = sc.nextInt();
        } while (num < 0);
        System.out.println("La suma recursiva es " + sumaRecursiva(num));
    }
    
    public static int sumaRecursiva(int num){
        if(num == 1) return 1;
               
        return num + sumaRecursiva(num-1);
    }
}
