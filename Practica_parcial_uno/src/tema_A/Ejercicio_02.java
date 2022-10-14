/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_A;

import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    /*
    Cree una aplicación de Consola que permita por parte del usuario el
ingreso por teclado de una cadena de texto alfanumérica, valide que la
cadena posea al menos 50 caracteres y valide que no existan espacios en
blanco. Si alguna de las validaciones es ejecutada emita el mensaje
“Cadena No Valida” y vuelva a pedir la cadena.
Si la cadena es válida recorra los caracteres que la componen y extraiga
aquellos caracteres que sean números. Para finalizar muestre la cadena
original sin números y una nueva cadena con los números extraídos.
    
    Entrada
Fdehfd65ai4fgh65fg465fehdfg5h64cax6v5b4xc6vb4xfde65g4hdfgiah64hf6
g5hxc6vb4xevo6b
Salida:
Fdehfdaifghfgfehdfghcaxvbxcvbxfdeghdfgiahhfghxcvbxevob
65465465564654646546465646
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = ingresarCadenaValida();
        String cadenaAlfabetica = extraerLetras(cadena);
        String cadenaNumeros = extraerNumeros(cadena);
        System.out.println(cadenaAlfabetica);
        System.out.println(cadenaNumeros);
    }
    
    public static String ingresarCadenaValida(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de al menos 50 caracteres, sin espacios en blanco");
        String cadena = sc.nextLine();
        if(cadena.length() >= 50 && !cadena.trim().contains(" ")) return cadena;
        System.out.println("Cadena No Valida");
        return ingresarCadenaValida();
    }
    
    public static String extraerLetras(String cadena){
         String cadenaAlfabetica = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(!esDigito(cadena.charAt(i))) cadenaAlfabetica += cadena.charAt(i);
        }
        return cadenaAlfabetica;
    }
    
    public static String extraerNumeros(String cadena){
        String cadenaNumeros = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(esDigito(cadena.charAt(i))) cadenaNumeros += cadena.charAt(i);
        }
        return cadenaNumeros;
    }
    
    public static boolean esDigito(char letra){
        switch(letra){
                case '0':
                case '1': 
                case '2':
                case '3':
                case '4': 
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    return true;
                default: return false;
            }
    }
}
