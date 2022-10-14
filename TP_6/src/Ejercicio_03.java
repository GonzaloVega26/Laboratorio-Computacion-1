
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
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        cargarDatos(listaNumeros);
        System.out.println("La Lista de numeros es \n" + listaNumeros);
        System.out.println("El promedio es \n" + promedioAritmetico(listaNumeros));
        System.out.println("La cantida de elementos mayores al promedio es: \n"
                + mayorPromedio(listaNumeros));
        System.out.println("La cantida de elementos menores al promedio es: \n"
                + menorPromedio(listaNumeros));
    }

    public static void cargarDatos(ArrayList<Integer> listaNumeros) {
        while (listaNumeros.size() < 20) {
            int numero = (int) (Math.random()*100); 
            if(numero % 2 == 0) listaNumeros.add(numero);
        }
        System.out.println("Carga de los 20 valores finalizada");
    }
    
    public static double promedioAritmetico(ArrayList<Integer> listaNumeros){
        double sumatoria = 0;
        for (Integer numero : listaNumeros) {
            sumatoria += numero;
        }
        return sumatoria/listaNumeros.size();
    }
    
    public static int mayorPromedio(ArrayList<Integer> listaNumeros){
        int contador = 0;
        double promedio = promedioAritmetico(listaNumeros);
        for (Integer numero : listaNumeros) {
            if(numero > promedio) contador++;
        }
        return contador;
    }
    
    public static int menorPromedio(ArrayList<Integer> listaNumeros){
        int contador = 0;
        double promedio = promedioAritmetico(listaNumeros);
        for (Integer numero : listaNumeros) {
            if(numero < promedio) contador++;
        }
        return contador;
    }
    
}
