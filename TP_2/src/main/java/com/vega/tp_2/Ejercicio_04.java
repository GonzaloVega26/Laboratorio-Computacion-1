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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4- Desarrolle un programa que ayude a una cajera a determinar el número de 
        billetes y monedas que se necesitan de cada una de las siguientes 
        denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y 
        0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es 
        1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2 
        billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos. 
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        double price = sc.nextDouble();
        int[] billsAmount = {0,0,0,0,0,0,0,0,0,0,0,0}; //Contador de billetes/monedas
        final double[] bills = {200,100,50,20,10,5,2,1,0.50,0.25,0.10,0.05}; //Tipos de billetes/monedas
        int j = 0;
        while(true){
            if ( price >= bills[j]){
                price = redondearDosCifras(price - bills[j]);
                billsAmount[j] += 1;
                continue;
            }
            j++;
            if(price > 0 && j < bills.length) continue; 
            break;
        }
        System.out.println("Se necesitan: ");
        String typeOfCurrency; //Para hacer dinamico si se usa monedas o billetes
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] >= 1) typeOfCurrency = " billetes de ";
            else typeOfCurrency = " monedas de ";
            
            System.out.print(
            billsAmount[i]== 0? "" : billsAmount[i] + typeOfCurrency + bills[i] + "\n");
            
        }
        System.out.println(price);
        
    }
    
    public static double redondearDosCifras(double numero){
        return Math.round(numero*100.0)/100.0;
    }
    
}
