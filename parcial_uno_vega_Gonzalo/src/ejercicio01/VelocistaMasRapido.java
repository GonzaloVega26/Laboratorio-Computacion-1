/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 * Parcial 1 Laboratorio de Computación 1
 * @author Gonzalo Vega
 */
public class VelocistaMasRapido {
    static Velocista[] velocistas;
    
    public static void main(String[] args) {
        System.out.println("Inicio Programa de carga de Datos Velocistas");
        int cantidad = cantidadVelocistas();
        velocistas = new Velocista[cantidad];
        for (int i = 0; i < velocistas.length; i++) {
            velocistas[i] = cargarVelocistas(i);
            System.out.println("");
        }
        
        System.out.println("-----------------------------");
        
        mostrarVelocistas(velocistas);
        
        System.out.println("-----------------------------");
        
        System.out.println("El velocista más rapido es: ");
        System.out.println(velocistaMasRapido(velocistas));
    }
    
    public static int cantidadVelocistas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de velocistas, debe ser al menos mayor o igual a 3");
        int cantidad = sc.nextInt();
        if(cantidad >= 3) return cantidad;
        return cantidadVelocistas();
    }
    
    public static Velocista cargarVelocistas(int i){
        Scanner sc = new Scanner(System.in);
        Velocista  velocista = new Velocista();
        System.out.println("Carga de datos del velocista " + (i+1));
        
        System.out.println("Apellido: ");
        velocista.setApellido(ingresarStrings());
        
        System.out.println("Nombre: ");
        velocista.setNombre(ingresarStrings());
        
        System.out.println("Edad: ");
        velocista.setEdad(ingresarCantidadNumerica());
        
        System.out.println("Cuantos tiempos desea cargar?");
        int cantidad = ingresarCantidadNumerica();
        double[] tiempos = new double[cantidad];
        for (int j = 0; j < tiempos.length; j++) {
            System.out.println("Ingrese el tiempo " + (j+1));
            tiempos[j] = cargarTiempo();
        }
        velocista.setTiempos(tiempos);
        System.out.println("Carga de tiempos finalizada");
        
        velocista.setMejorTiempo(mejorTiempo(tiempos));
        
        return velocista;
        
    }
    public static int ingresarCantidadNumerica(){
        //Verifica que no se ingrese 0 o numeros negativos
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        if(cantidad >= 1) return cantidad;
        System.out.println("No puede ser menor a 1");
        return ingresarCantidadNumerica();
    }
    
    public static String ingresarStrings(){
         //Verifica que no se ingrese String vacío o solo espacios
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); // Quita espacios de los costados
        if(str.length() >= 1) return str;
        System.out.println("No puede ser vacío");
        return ingresarStrings();
    }
    
    public static double cargarTiempo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el tiempo, debe ser mayor a 8 y menor a 15");
        double tiempo = sc.nextDouble();
        if(tiempo > 8 && tiempo < 15) return tiempo;
        System.out.println("El tiempo ingresado no es válido");
        return cargarTiempo();
    }
    
    public static double mejorTiempo(double[] tiempos){
        double min = tiempos[0]; // Se supone que el primer tiempo ingresado es el mayor
        for (int i = 0; i < tiempos.length; i++) {
            if(tiempos[i] < min) min = tiempos[i];
        }
        System.out.println("El mejor tiempo es " + min);
        return min;
    }
    
    public static void mostrarVelocistas(Velocista[] velocistas){
        System.out.println("La lista de velocistas cargados es:");
        System.out.println("edad        apellido,nombre     mejorTiempo");
        for (int i = 0; i < velocistas.length; i++) {
            Velocista vi = velocistas[i];
            System.out.println(vi.getEdad()
                    +"          " + vi.getApellido()+","+ vi.getNombre()+"     " + vi.getMejorTiempo());
        }
    }
    
    public static Velocista velocistaMasRapido(Velocista[] velocistas){
        int posicion = 0;
        double mejorTiempo = velocistas[0].getMejorTiempo(); 
        // Tambien se podria poner un valor basura como 15, segun especificaciones el tiempo es menor a 15
        for (int i = 0; i < velocistas.length; i++) {
            if(velocistas[i].getMejorTiempo() < mejorTiempo) {
                mejorTiempo = velocistas[i].getMejorTiempo();
                posicion++;
            }
        }
        
        return velocistas[posicion];
    }
}





