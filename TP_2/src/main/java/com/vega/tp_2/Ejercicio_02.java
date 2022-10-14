/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2- Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
        ¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero muy grande");
        //Ejemplo ingresar 50000000000000000000000000
        Long num = sc.nextLong();
        System.out.println("El numero es:" + num);
        /*
        Da un error de overflow, lo que significa que el numero es demasiado grande como para ser conenido
        en nuestra variable de tipo long. Estos limites podemos verlos con la instruccion Long.MAX_VALUE y
        Long.MIN_VALUE:
        Valor máximo= 9223372036854775807
        Valor Minimo= -9223372036854775808
        */
        
        /*
        Este problema pasa en todos los tipos de datos, siendo los limites de éstos los que varian dependiendo 
        el tipo de dato.
        
        Tambien existe el problema del underflow que se produce cuando los numeros con los que trabajamos 
        son tan chicos que terminan siendo redondeados a cero
        Ejemplo: 
        */
        
         System.out.println("Ingrese un numero muy chico");
        //Ejemplo ingresar 0.0000000000000000000000000000000000000000000001
        Float num2 = sc.nextFloat();
        System.out.println("El numero es:" + num2);
        
        
        /*
        Una forma de resolver estos problemas es conocer el rango de valores con los que vamos a trabajar
        para no colocar variables que no soporten estos valores y exista un pronlema de overflow
        
        Por otro lado si debemos "castear" un tipo de variable a otro debemos tener en cuenta los limites de éstas
        castear un dato de tipo long a uno de tipo int no deberia de hacerse porque éste no puede contenerlo
        Siempre debemos de ir de un "contenedor" más chico a uno más grande.
        */
        Integer numInt =  num.intValue();
        System.out.println(numInt);
    }
    
}
