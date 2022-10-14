
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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        cargarDatos(listaNumeros);
        System.out.println("La Lista de numeros es \n"+listaNumeros);
    }

    public static void cargarDatos(ArrayList<Integer> listaNumeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los valores:");
        while(true){
            int numero = sc.nextInt();
            if(numero < 0) break;
            listaNumeros.add(numero);
        }
    }
    
}
