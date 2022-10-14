/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_B;

import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    /*
    Diseñar un algoritmo que permita ingresar N números decimales (double)
mayores o iguales a cero 0. El ingreso de números finalizara cuando se
ingrese un valor negativo. Muestre un mensaje indicando la cantidad de
elementos ingresados. Los números ingresados deberán mostrarse como
una cadena separada por guiones medios. Posteriormente se deberá
solicitar el ingreso de un valor entero positivo que se usara para
determinar la cantidad de elementos que se incluirán en una agrupación 
    de números. Valide que el número entero no sea mayor que la cantidad de
números ingresados. Si se ejecuta la validación vuelva a solicitar el
ingreso del número entero. Indique la cantidad de Grupos que se crearan
y Muestre los elementos de cada grupo por pantalla.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaNumeros = "";
        System.out.println("Ingrese numeros Ingrese números decimales, para terminar ingrese un valor negativo");
        double numero = sc.nextDouble();
        while (numero >= 0) {
            cadenaNumeros += numero + "-";
            numero = sc.nextDouble();
        }
        System.out.println("Los numeros ingresados son: " + cadenaNumeros);

        int cantidadNumeros = cadenaNumeros.split("-").length;
        System.out.println("Se han ingresado " + cantidadNumeros);
        int agrupamientos = ingresarAgrupamientoValido(cantidadNumeros);
        int cantidadGrupos = (int) Math.ceil((double) cantidadNumeros / agrupamientos);
        System.out.println("Se crearan " + cantidadGrupos + " grupos");
        
        
        int contador = 0;
        for (int i = 0; i < cadenaNumeros.length(); i++) {
            char letra = cadenaNumeros.charAt(i);
            if( letra == '-') contador++;
            if(contador == agrupamientos) {
                System.out.println("");
                contador = 0;
                continue;
            };
            System.out.print(letra);
        }
        System.out.println("");
                
    }

    public static int ingresarAgrupamientoValido(int cantidadNumeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entero positivo para ejecutar el agrupamiento");
        int numero = sc.nextInt();
        if (numero > 0 && numero <= cantidadNumeros) {
            return numero;
        }
        return ingresarAgrupamientoValido(cantidadNumeros);
    }

}
