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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, pares, impares;
        int[] arrayA;
        do {
            N = ingresarNumeroValido();
            arrayA = new int[N];
            cargarArray(arrayA);
            pares = cantidadPares(arrayA);
            impares = cantidadImpares(arrayA);
        } while (pares == 0 || impares == 0);

        mostrarArray(arrayA);
        int[] arrayPares = new int[pares];
        int[] arrayImpares = new int[impares];
        dividirPorParidad(arrayPares, arrayImpares, arrayA);
        mostrarArray(arrayPares);
        mostrarArray(arrayImpares);
        
        int[] arrayC;
        //Revisar porque no me gusta
        if(pares >= impares){
            arrayC = new int[pares];
            mutiplicacionArrays(arrayC, arrayPares, arrayImpares);
        }else{
            arrayC = new int[impares];
            mutiplicacionArrays(arrayC, arrayImpares, arrayPares);
        }
        mostrarArray(arrayC);
    }
    
    public static void mutiplicacionArrays(int[] arrayC, int[]arrayA, int[] arrayB){
        int resultado = 0;
        // el arrayA siempre será mayor en longitud que el array B
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                resultado += arrayA[i]*arrayB[j];
            }
            arrayC[i] = resultado;
            resultado = 0;
            
        }
    }

    public static void dividirPorParidad(int[] arrayPares, int[] arrayImpares, int[] array) {
        int contadorPar = 0, contadorImpar =0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] % 2 == 0){
                    arrayPares[contadorPar] = array[i];
                    contadorPar++;
                }else{
                    arrayImpares[contadorImpar] = array[i];
                    contadorImpar++;
                }
            }

    }


    public static int ingresarNumeroValido() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo, para la longitud del array");
        int numero = sc.nextInt();
        if (numero > 0) {
            return numero;
        }
        return ingresarNumeroValido();
    }

    public static void cargarArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el valor " + (i + 1));
            array[i] = sc.nextInt();
        }

    }

    public static int cantidadPares(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int cantidadImpares(int[] array) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                contador++;
            }
        }

        return contador;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

}
