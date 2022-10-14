
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author govhe
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        cargarDatos(listaNumeros);
        //Listas
        ArrayList<Integer> listaNumerosAsc = (ArrayList)listaNumeros.clone();
        ArrayList<Integer> listaNumerosDesc = (ArrayList)listaNumeros.clone();
        
        Collections.sort(listaNumerosAsc);
        Collections.sort(listaNumerosDesc,Collections.reverseOrder());
        //Resultados
        System.out.println("La Lista de numeros es: \n" + listaNumeros);
        System.out.println("La Lista ordenada ascendente es: \n" + listaNumerosAsc);
        System.out.println("La Lista ordenada descendente es \n" + listaNumerosDesc);
        

    }

    public static void cargarDatos(ArrayList<Integer> listaNumeros) {
        while (listaNumeros.size() < 10) {
            listaNumeros.add((int) (Math.random() * 100));
        }
        System.out.println("Carga de los 50 valores finalizada");
    }
}
