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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    /*
    Diseñar un algoritmo que solicite el ingreso de un número entero mayor
que 100000, posteriormente muestre cual sería el resultante de sumar
cada uno de los dígitos que componen al número.
Ejemplo:
Ingreso:
15478963
Salida:
La suma resultante es 43
     */
    public static void main(String[] args) {

        int numero = ingresarNumeroValido();
        int suma = sumarDigitos(numero);
        System.out.println("La suma resultante es " + suma);
    }

    public static int ingresarNumeroValido() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 100000) {
            return x;
        }
        return ingresarNumeroValido();
    }

    public static int sumarDigitos(int numero) {
        
        if(numero < 10) return numero; 
        else return ((numero % 10) + sumarDigitos(numero / 10));
    }
}
