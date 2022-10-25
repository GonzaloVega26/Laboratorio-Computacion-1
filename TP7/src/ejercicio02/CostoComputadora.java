/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class CostoComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            opc = sc.nextInt();
            switch(opc){
                case 1: cargarComputadora();
            }
        }while(opc != 4);
        
    }
    
    public static Computadora cargarComputadora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = sc.nextLine();
         Computadora  c  = sc
    }
    
    public static Componente crearComponente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese el precio");
        double precio = sc.nextDouble();
        return new Componente(modelo, marca, cantidad, precio);
    }
}
