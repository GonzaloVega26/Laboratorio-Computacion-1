
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author govhe
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listaPalabras = new ArrayList<>();
        cargarPalabras(listaPalabras);
        System.out.println("Las palabras ingresadas son: \n" + listaPalabras);
        System.out.println("La palabra que posee más caracteres es: \n" + palabraMasLarga(listaPalabras));
        String palabrasRepetidas = hayPalabrasRepetidas(listaPalabras)? "Si hay palabras Repetidas": "No hay palabras repetidas";
        System.out.println(palabrasRepetidas);
        // Imprimir mapa
        Map<String, Integer> mapaFrecuencias = palabrasRepetidas(listaPalabras);
        for (HashMap.Entry<String, Integer> entry : mapaFrecuencias.entrySet()) {
            if(entry.getValue() > 1)
            System.out.printf("Palabra '%s' con frecuencia %d\n", entry.getKey(), entry.getValue());
        }

    }

    public static void cargarPalabras(ArrayList<String> listaPalabras) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las palabras, si desea salir escriba 'salir'");
        while (true) {
            String palabra = sc.nextLine();
            if (palabra.equalsIgnoreCase("salir")) {
                break;
            }
            listaPalabras.add(palabra);
        }
    }

    public static String palabraMasLarga(ArrayList<String> listaPalabras) {
        String palabraLarga = "";
        for (String palabra : listaPalabras) {
            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }
        }
        return palabraLarga;
    }

    public static boolean hayPalabrasRepetidas(ArrayList<String> listaPalabras) {
        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.subList((i + 1), listaPalabras.size()).contains(listaPalabras.get(i))) {
                return true;
            }

        }
        return false;

    }

    public static Map<String, Integer> palabrasRepetidas(ArrayList<String> listaPalabras) {
        Map<String, Integer> palabrasRepetidas = new HashMap<>();
        for (String palabra : listaPalabras) {
            if (palabrasRepetidas.containsKey(palabra)) {
                palabrasRepetidas.put(palabra, palabrasRepetidas.get(palabra) + 1);
            } else {
                palabrasRepetidas.put(palabra, 1);
            }
        }
        return palabrasRepetidas;
        
    }

}
