/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_3;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares 
        del 1 al 100, de los cuales se desea saber: 
        a) su promedio aritmético
        b) cuántos de los números son iguales al promedio aritmético
        c) cuántos de los números son mayores que el promedio aritmético
        d) cuántos de los números son menores que el promedio aritmético
         */

        int[] arrayNums = new int[20];
        int sumatoria = 0;
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = ((int) (Math.random() * 50)) * 2;
            sumatoria = arrayNums[i];
        }

        double promedio = sumatoria / arrayNums.length;
        int mayorAritmetico = 0;
        int menorAritmetico = 0;
        int igualArtimetico = 0;
        for (int k = 0; k < arrayNums.length; k++) {
            if (arrayNums[k] == promedio) {
                igualArtimetico++;
            }
            if (arrayNums[k] > promedio) {
                mayorAritmetico++;
            }
            if (arrayNums[k] < promedio) {
                menorAritmetico++;
            }

        }
        System.out.println("El promedio es " + promedio);
        System.out.println("Cantidad de números mayores al promedio aritmético" + mayorAritmetico);
        System.out.println("Cantidad de números menores al promedio aritmético" + menorAritmetico);
        System.out.println("Cantidad de números mayoigualeses al promedio aritmético" + igualArtimetico);

        //Mostrar array
        mostrarArray(arrayNums);
    }
    public static void mostrarArray(int[] array){
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

}
