package ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author govhe
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        while (true) {
            Celda c = cargarCelda();
            matrizCuadrada.add(c);
            System.out.println("Si desea dejar de cargar celdas, escriba FIN");
            String salir = sc.nextLine();
            if(salir.equals("FIN")) break;
        }
        mostrarMatriz();
        System.out.println(mostrarCelda());
    }
    
    public static Celda cargarCelda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la celda");
        String valor = sc.nextLine();
        System.out.println("Ingrese la posición, primero fila y luego columna");
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        
        return new Celda(fila, columna, valor);
    }
    
    public static void mostrarMatriz(){
        System.out.println("La matriz contiene:" + matrizCuadrada);
    }
    
    public static String mostrarCelda(){
        System.out.println("Mostrar contenido de la celda");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición, primero fila y luego columna");
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        for (Celda celda : matrizCuadrada) {
            if(celda.getFila() == fila && celda.getColumna() == columna) 
                return "El valor de la celda es " + celda.getValor();
        }
        return "La fila y columna indicada no ha sido asignada";
    }
}
