/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_3;

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
        9. Calcule la letra de un DNI a partir del número de DNI que 
        introduzca el usuario. devolver el DNI completo (con la letra).
        Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23. 
        El resultado debe estar por tanto entre 0 y 22.
        asignarla segun esta disposicion
        Posición 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
           Letra T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
        Ejemplo: DNI 20267079, el resto de dividirlo por 23 sería 8, luego 
        la letra sería la P,
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI sin puntos ni comas,ni guiones ni espacios");
        long dni = Long.valueOf(sc.nextLine());
        
        System.out.println("El DNI completo es " + dni + obtenerLetra(dni));
        
    }
    
    public static String obtenerLetra(long numeroDNI){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",  "X",  "B",  "N",
        "J",  "Z",  "S",  "Q",  "V",  "H",  "L",  "C",  "K",  "E"};
        int posicion = (int) numeroDNI % 23;
        return letras[posicion];
    }
    
}
