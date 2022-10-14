/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_A;

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
    Cree una aplicación de Consola que permita por parte del usuario el
ingreso por teclado de un número entero mayor a 0 y menor o igual que
100000, valide el rango, posteriormente el sistema deberá permitir el
ingreso nuevamente de otro número entero mayor a 0 y menor o igual
que 100000, que deberá sumarse a los números ingresados desde el inicio
del proceso, esta secuencia se deberá repetir hasta que la sumatoria de
los números ingresados supere un millón, indique cuantos números fueron
necesarios ingresar para alcanzar superar el millón.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, sumatoria =0;
        do{
            sumatoria += ingresarNumero();
            contador++;
        }while(sumatoria <= 1000000);
        System.out.println("Se debieron ingrear " + contador + " numeros, para superar 100000");
    }
    
    public static int ingresarNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if(numero <= 0 || numero > 100000){
            System.out.println("Debe ser entero mayor a 0 y menor o igual que 1000000");
            return ingresarNumero();
        }
        return numero;
    }
    
}
