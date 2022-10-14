
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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> listaNumeros = new ArrayList<>();
        cargarDatos(listaNumeros);
        System.out.println("La Lista de numeros es \n" + listaNumeros);
        System.out.println("El mayor valor es: " + mayorValor(listaNumeros));
        System.out.println("El menor valor es: " + menorValor(listaNumeros));
        System.out.println("El Rango es: " + 
                ((int) (mayorValor(listaNumeros) - menorValor(listaNumeros))));
    }

    public static void cargarDatos(ArrayList<Double> listaNumeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los 20 valores:");
        while (listaNumeros.size() < 20) {
            Double numero = sc.nextDouble();
            listaNumeros.add(numero);
        }
    }
    
    public static double mayorValor(ArrayList<Double> listaNumeros){
        double mayor = listaNumeros.get(0);
        for(double element : listaNumeros){
            if(element > mayor) mayor = element;
        }
        return mayor;
    }
    
    public static double menorValor(ArrayList<Double> listaNumeros){
        double menor = listaNumeros.get(0);
        for(double element : listaNumeros){
            if(element < menor) menor = element;
        }
        return menor;
    }
}
