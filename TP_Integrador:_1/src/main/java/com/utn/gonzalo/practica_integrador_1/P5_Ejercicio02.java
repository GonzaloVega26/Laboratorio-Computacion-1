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
public class P5_Ejercicio02 {

    /*
    - Repetitiva
Diseñar un algoritmo que realice el promedio de N números. La cantidad de
números a ingresar debe ser indicada por el usuario, valide que la cantidad de
números a ingresar sea mayor a cero.
Los números ingresados pueden ser decimales y serán ingresados por pantalla
por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNumeros = verificarCantidadNumeros();
        double sumatoria = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese un número");
            sumatoria += sc.nextDouble(); //No es necesario guardar el numero en variable
        }
        System.out.println("El promedio de los " + cantidadNumeros + " es: " + (sumatoria/cantidadNumeros));
    }

    public static int verificarCantidadNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números desea ingresar?");
        int cantidadNumeros = sc.nextInt();
        if (cantidadNumeros > 0) {
            return cantidadNumeros;
        } else {
            System.out.println("Ingrese un número mayor a cero");
            return verificarCantidadNumeros(); // verificación recursiva.
        }
    }

}
