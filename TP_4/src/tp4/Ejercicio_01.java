/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* ingresar 4 paises y 3 ciudades por pais */
        System.out.println("Ingrese 4 paises");
        String[][] arrayPaises = new String[4][4];
        llenarPaises(arrayPaises);
        llenarCiudades(arrayPaises);
        mostrarArray(arrayPaises);
    }

    public static void llenarPaises(String[][] array) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Pais " + (i + 1));
            array[i][0] = sc.nextLine();

        }
    }

    public static void llenarCiudades(String[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de 3 ciudades");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Pais " + array[i][0]);

            for (int j = 1; j < array[0].length; j++) {
                System.out.println("Ciudad " + j);

                array[i][j] = sc.nextLine();
            }

        }

    }
    
    public static void mostrarArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "     ");
            }
            System.out.println("");

        }
    }

}
