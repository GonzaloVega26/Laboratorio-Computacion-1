/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_3;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*1. ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?*/
       //Por ejemplo tenemos un array de longitud 5 llenado con numeros del 1 al 10 
       int[] arrayNums = new int[5];
       for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = (int) (Math.random()*10 + 1);
        }
        //Siempre y cuando nos mantengamos entre 0 y la longitud del array -1 no vamos a tener problemas
        for (int j = 0; j < arrayNums.length; j++) {
            System.out.println(arrayNums[j]);
        } 
       
        //Si intetnamos acceder a una posición que no existe obtenemos el error
        //ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
        //System.out.println(arrayNums[7]);
    }
    
}
