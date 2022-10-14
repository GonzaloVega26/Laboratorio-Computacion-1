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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división 
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida 
del algoritmo 14.

        */
        Scanner sc = new Scanner(System.in);
        int num;
        //Verifica que el numero esta entre 100 y 999
        do{
            System.out.println("Ingrese un valor entre 100 y 999");
            num = sc.nextInt();
            
        }while(num < 100 || num > 999);
        
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
           
        }
        System.out.println("La suma es " + sum);
    }
    
}
