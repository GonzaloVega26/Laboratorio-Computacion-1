/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2.ejercicio_17y18;

import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        17- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
..........
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
        */
       
       String fecha = FuncionesPrograma.getFechaString(new Date());
       System.out.println("La fecha en string es " + fecha);
    }
    
}
