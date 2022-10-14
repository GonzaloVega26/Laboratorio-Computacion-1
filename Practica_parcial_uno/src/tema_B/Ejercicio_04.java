/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_B;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    /*
    Cargar una matriz de enteros A de tamaño N y mostrar datos. El
tamaño N de la matriz debe ser solicitado e ingresado por el usuario,
al igual que los valores que se cargaran en cada posición.
 En base a la matriz creada y cargada en el punto anterior cree una
segunda matriz B cuyos valores serán los correspondientes a la
inversa de la matriz A.
 Mostrar los arreglos A y B con sus valores por pantalla.
 Generar una nueva matriz de C de 1 dimensión que será el
resultante de combinar los arreglos PAR e IMPAR, donde el valor de
cada celda será aquel que se corresponda con el mayor valor
resultante de comparar la misma posición de la matriz A con la B.
Muestre por pantalla la matriz resultante.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[ingresarTamanioMatriz()];
        cargarDatos(array);
        mostrarArray(array);
        int[] arrayInvertido = invertirArray(array);
        mostrarArray(arrayInvertido);
        int[] arrayC = compararArray(array, arrayInvertido);
        mostrarArray(arrayC);

    }

    public static void cargarDatos(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresar valor " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
    }

    public static int ingresarTamanioMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del array");
        int tamanio = sc.nextInt();
        if (tamanio > 0) {
            return tamanio;
        }
        return ingresarTamanioMatriz();
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[arrayInvertido.length - i - 1];
        }
        return arrayInvertido;
    }

    public static int[] compararArray(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] >= arrayB[i]) {
                arrayC[i] = arrayA[i];
            }else{
              arrayC[i] = arrayB[i];  
            }
        }

        return arrayC;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
