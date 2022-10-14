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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    /*
    Codifique un algoritmo que solicite el ingreso de una cadena de texto, si se
ingresa vacío, emita un mensaje de error y vuelva a solicitar la cadena,
este proceso finalizara cuando se ingrese la cadena “000”, para cada una
de las cadenas ingresadas muestre el tamaño de la cadena, un mensaje
que indique si contiene o no números, e indique si la cadena ingresada es
igual o no a la cadena anterior que se haya ingresado siempre y cuando
no sea la primer cadena. Finalmente muestre todas las cadenas
ingresadas separadas con un espacio.
     */
    public static void main(String[] args) {
        String cadenas = "";
        String cadena;
        do {
            cadena = ingresarCadenaValida();
            tamanioCadena(cadena);
            contieneNumeros(cadena);
            cadenas += cadena + " ";
            esRepetida(cadena, cadenas);
        } while (!cadena.equals("000"));
        System.out.println("Las cadenas ingresadas son: " + cadenas);
    }

    public static String ingresarCadenaValida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        if (cadena.trim().length() == 0) { // trim para quitar los espacios de los costados
            System.out.println("La cadena no puede estar vacía");
            return ingresarCadenaValida();
        }

        return cadena;
    }

    public static void tamanioCadena(String cadena) {
        System.out.println("El tamaño es de " + cadena.length());
    }

    public static void contieneNumeros(String cadena) {
        //if(cadena.contains(1)) // string contain es especifico a una cadena, mejor utilizar Regex
        if (cadena.matches(".*[0-9].*")) { 
            System.out.println("Contiene números");
            return; // corta la ejecución del ciclo y de la funcion
        }
        System.out.println("No contiene numeros");
        return; // igual que anterior
    }

    public static void esRepetida(String cadena, String cadenas) {
        String[] cadenasArray = cadenas.split(" ");
        if (cadenasArray.length == 1) {
            System.out.println("Es la primera");
            return;
        }

        if (cadenasArray[cadenasArray.length - 2].equals(cadena)) {
            System.out.println("La cadena es igual a la anterior");
        }else{
            System.out.println("No es igual a la anterior");
        }
    }
}
