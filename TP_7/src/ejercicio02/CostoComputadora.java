/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.HashSet;
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
        Scanner sc = new Scanner(System.in);
        String opc="si";
        System.out.println("Bienvenido al Programa de Presupuestos");
        while(opc.equalsIgnoreCase("si")){
            Computadora computadora =  cargarComputadora();
            computadora.setComponentes(cargarComponentes());
            mostrarComputadora(computadora);
            System.out.println("Desea terminar otra computadora?");
            opc = sc.nextLine();
            
        }
       
        System.out.println("Programa de Presupuestos Finalizado");
    }
    
    public static void mostrarComputadora(Computadora computadora){
        System.out.println("-----------Computadora----------------");
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Componentes:");
        System.out.printf("%20s %25s %10s %15s %15s", "Componente", "Marca", "Cantidad", "Precio X Unidad", "Subtotal");
        System.out.println("");
        for (Componente c : computadora.getComponentes()) {
            System.out.printf("%20s %25s %10s %15s %15s", c.getComponente(), c.getMarca(), 
                    c.getCantidad(), c.getPrecio(), c.getPrecio()*c.getCantidad());
            System.out.println("");
        }
        double costo = calcularCosto(computadora);
        System.out.println("Costo Total: $" + costo);
        System.out.println("El precio sugerido es: $" + calcularPrecioSugerido(costo));
        
    }
    public static double calcularCosto(Computadora comp){
        double costo = 0.0;
        for (Componente componente : comp.getComponentes()) {
            costo += componente.getPrecio()*componente.getCantidad();
        }
        return costo;
    }
    public static double calcularPrecioSugerido(double costo){
        if(costo < 50000) return costo*1.4; //Si el costo es menor a 50000 el precio sale 40% mas
        return costo*1.3; //Si el costo es mayor a 50000 el precio sale 30% mas
    }
    public static Computadora cargarComputadora(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la marca");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = sc.nextLine();
        Computadora computadora = new Computadora();
        
        computadora.setMarca(marca);
        computadora.setModelo(modelo);
        return computadora;
    }
    public static HashSet<Componente> cargarComponentes(){
        Scanner sc = new Scanner(System.in);
        String opc;
        HashSet<Componente> componentes = new HashSet<>();
        do{
            componentes.add(crearComponente());
            System.out.println("Desea Cargar otro componente?(Si/No)");
            opc = sc.nextLine();
        }while(opc.equalsIgnoreCase("si"));
        
        return componentes;
    }
    public static Componente crearComponente(){
        System.out.println("Escriba los Componentes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el componente a cargar");
        String marca = sc.nextLine();
        System.out.println("Ingrese la Marca");
        String modelo = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese el precio");
        double precio = sc.nextDouble();
        return new Componente(modelo, marca, cantidad, precio);
    }
}
