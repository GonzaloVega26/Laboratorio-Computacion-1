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
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase1 = sc.nextLine();
        System.out.println("Ingrese otra frase");
        String frase2 = sc.nextLine();
        if(frase1.contains(frase2)){
            System.out.println("La frase " + frase1 + " contiene " + frase2);
        }else{
            System.out.println("La segunda frase no está contenida en la primera");
        }
    }
    
}
