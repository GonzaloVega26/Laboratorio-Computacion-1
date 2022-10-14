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
public class Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        23- Crea un programa donde se pida el ingreso de una cadena y por medio de
        recursión mostrar la cadena de forma inversa.
        Ejemplo: Ingreso “computadora de escritorio”
        Invertir cadena “oirotircse ed arodatupmoc”
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String cadena = sc.nextLine();
        String cadenaInvertida = invertirCadenaRecursiva(cadena);
        System.out.println("La cadena invertida es \n"+cadenaInvertida);
    }
    
    public static String invertirCadenaRecursiva(String cadena){
        if(cadena.length() == 1)return cadena;
        return cadena.substring(cadena.length()-1,cadena.length()) + 
                invertirCadenaRecursiva(cadena.substring(0, cadena.length()-1)) ;
    }
}
