/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2.ejercicio_19;

/**
 *
 * @author gonzalo
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionMatematica x = new OperacionMatematica(2,5);
        
        System.out.println(x.aplicarOperacion("+"));
        System.out.println(x.aplicarOperacion("-"));
        System.out.println(x.aplicarOperacion("*"));
        System.out.println(x.aplicarOperacion("/"));
    }
    
}

