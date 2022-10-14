
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
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        cargarDatos(listaNumeros);
        System.out.println("La Lista de numeros es \n" + listaNumeros);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a buscar");
        System.out.println(isNumberInList(listaNumeros, sc.nextInt()));
    }
    
    public static void cargarDatos(ArrayList<Integer> listaNumeros) {
        while (listaNumeros.size() < 50) {
            listaNumeros.add((int) (Math.random()*100));
        }
        System.out.println("Carga de los 50 valores finalizada");
    }
    
    public static String isNumberInList(ArrayList<Integer> listaNumeros, int valorBuscado){
        for (Integer numero : listaNumeros) {
            if(numero == valorBuscado) return "El número está en la posición: " + listaNumeros.indexOf(valorBuscado);
        }
        return "El número no se encuentra en la lista";
    }
}
