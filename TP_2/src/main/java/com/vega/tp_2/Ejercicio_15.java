/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        15- Indique que sucede si realizo la siguiente declaración de variable:
        int numero = null;
        ¿Qué debo modificar para poder asignar null a la variable?
        */
       
       //int numero = null;
       /*
       Obtengo un error de compilación porque el dato primitivo int no soporta el dato null
       y null no puede ser convertido a int
       Para solucionar este problema debo de utilizar la Clase/Objeto Integer en vez de su contraparte primitiva
       esto nos da la posibilidad de alamacenar null en la variable
       */
       Integer numero = null;
    }
    
}
