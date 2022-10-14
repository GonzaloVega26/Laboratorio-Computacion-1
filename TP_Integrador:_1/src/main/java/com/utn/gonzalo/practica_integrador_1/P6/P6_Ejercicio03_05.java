/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utn.gonzalo.practica_integrador_1.P6;
/*
4. Cree 2 instancias (objetos) de la clase Cliente, en una clase que posea un
método main, haciendo uso de new, y asigne los siguientes valores en c/u
de ellas:
Instancia 1:
apellido “Alonso”
nombre:”Eugenia”
dni:27456987
sueldo:2698.85
nroCliente:13654

Instancia 2:
apellido, “Pereira”
nombre:”Victor”
dni: 26987456
sueldo:3695.45
nroCliente:12852
*/
/**
 *
 * @author gonzalo
 */
public class P6_Ejercicio03_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Alonso", "Eugenia", 27456987, 2698.85, 13654);
        Cliente c2 = new Cliente("Pereira", "Victor", 26987456, 3695.45, 12852);
        /*
    5. Muestre el valor asignado en nombre, apellido y de dni de cada uno de los
objetos mediante un System.out.println
    */
        System.out.println("Instacia 1");
        System.out.println(c1);
        System.out.println("Instacia 2");
        System.out.println(c2);
    }
    
    
    
    
}
