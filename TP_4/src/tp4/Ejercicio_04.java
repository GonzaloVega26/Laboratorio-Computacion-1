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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creacion de matriz
        int X;
        do {
            System.out.println("Ingrese un numero mayor o igual a 4 Y menor o igual a 10");
            X = sc.nextInt();
        } while (X < 4 || X > 10);
        int[][] array = new int[X][X];

        // ElegirMenu de opciones
        char opcion;
        boolean flag = false;
        do {

            mostrarMenu();
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'a':
                    flag = llenarMatrizManual(array);
                    break;
                case 'b':
                    flag = llenarMatrizAutomatic(array);
                    break;
                case 'c':
                    sumarFila(array, flag);
                    break;

                case 'd':
                    sumarColumna(array, flag);
                    break;
                case 'e':
                    sumarDiagonalPrincipal(array, flag);
                    break;
                case 'f':
                    sumarDiagonalInversa(array, flag);
                    break;
                case 'g':
                    mediaDeMatriz(array, flag);
                    break;
                case 'h':
                    mostrarMatriz(array, flag);
                    break;
                case 'z':
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 'z');
    }

    public static void mostrarMenu() {
        System.out.println("\n");
        System.out.println(
                "a) Rellenar Matriz de Numeros Manual \n"
                + "b) Rellenar Matriz de Numeros Automaticamente \n"
                + "c) Suma de valores de una fila escogida \n"
                + "d) Suma de valores de una columna escogida \n"
                + "e) Sumar Diagonal Principal \n"
                + "f) Sumar Diagonal Inversa \n"
                + "g) Media de todos los valores \n"
                + "h) Mostrar Matriz \n"
                + "z) Salir");

    }

    public static boolean llenarMatrizManual(int[][] array) {
        System.out.println("Ingrese los valores de la matriz");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Valor " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
            }
        }
        return true;
    }

    public static boolean llenarMatrizAutomatic(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return true;
    }

    public static void sumarFila(int[][] array, boolean flag) {
        if (flag) {
            Scanner sc = new Scanner(System.in);
            int fila;
            do {
                System.out.println("Ingrese una fila a sumar, entre 0 y " + (array.length - 1));
                fila = sc.nextInt();
            } while (fila < 0 || fila >= array.length);

            int sumaFilas = 0;

            for (int i = 0; i < array.length; i++) {
                sumaFilas += array[fila][i];
            }
            System.out.println("La suma de la fila " + fila + " es: " + sumaFilas);
        } else {
            System.out.println("Matriz no llenada");
        }

    }

    public static void sumarColumna(int[][] array, boolean flag) {
        if (flag) {
            Scanner sc = new Scanner(System.in);
            int columna;
            do {
                System.out.println("Ingrese una columna a sumar, entre 0 y " + (array.length - 1));
                columna = sc.nextInt();
            } while (columna < 0 || columna >= array[0].length);

            int sumaColumna = 0;

            for (int i = 0; i < array.length; i++) {
                sumaColumna += array[i][columna];
            }
            System.out.println("La suma de la fila " + columna + " es: " + sumaColumna);
        } else {
            System.out.println("Matriz no llenada");
        }

    }

    public static void sumarDiagonalPrincipal(int[][] array, boolean flag) {
        if (flag) {
            int sumaDiagonal = 0;

            for (int i = 0; i < array.length; i++) {
                sumaDiagonal += array[i][i];
            }
            System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
        } else {
            System.out.println("Matriz no llenada");
        }

    }

    public static void sumarDiagonalInversa(int[][] array, boolean flag) {
        if (flag) {
            int sumaDiagonal = 0;

            for (int i = 0; i < array.length; i++) {
                sumaDiagonal += array[i][array.length - 1 - i];
            }
            System.out.println("La suma de la diagonal secundaria es: " + sumaDiagonal);
        } else {
            System.out.println("Matriz no llenada");
        }

    }

    public static void mediaDeMatriz(int[][] array, boolean flag) {
        if (flag) {
            double sumaTotal = 0;
            int elementos = array.length * array[0].length;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    sumaTotal += array[i][j];
                }
            }
            double promedio = sumaTotal / elementos;
            System.out.println("La media de los elementos de la mariz es es: " + promedio);
        } else {
            System.out.println("Matriz no llenada");
        }

    }

    public static void mostrarMatriz(int[][] array, boolean flag) {
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Matriz no llenada");
        }

    }

}
