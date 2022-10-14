/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.gonzalo.practica_integrador_1;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class P5_Ejercicio01 {
    /*
    - String
Cree una aplicación de Consola que permita por parte del usuario el ingreso por
teclado de una cadena de texto, posteriormente el sistema deberá permitir el
ingreso de una segunda cadena de texto. Finalmente el sistema deberá emitir el
mensaje “ENCONTRADO” o “NO ENCONTRADO” según sean el caso de que la
segunda cadena existe o no existe en la primera cadena. 
    Valide que la cantidad de caracteres de la segunda cadena sea menor o igual a la cantidad de
caracteres de la primera cadena.
Ej.:
Entrada Cadena 1: jhsjdhsjdhsd8787dsdsds8ds8d7sd6ds76d
Entrada Cadena 2: ds8ds8d
Resultado: “ENCONTRADO”
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cadena 1");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese cadena 2");
        String cadena2 = sc.nextLine();
        
        if(verificarLongitud(cadena1, cadena2)){
            //Enviar argumentos en minúsculas
            if(cadenaDentroDeCadena(cadena1.toLowerCase(), cadena2.toLowerCase())){
                System.out.println("ENCONTRADO");
            }else{
                System.out.println("NO ENCONTRADO");
            }
        }
        
    }
    
    public static boolean verificarLongitud(String cadena1, String cadena2){
        if(cadena2.length() > cadena1.length()) return false; 
        
        return true;
    }
    
    public static boolean cadenaDentroDeCadena(String cadena1, String cadena2){
        return cadena1.contains(cadena2);
        
    }
    
}
