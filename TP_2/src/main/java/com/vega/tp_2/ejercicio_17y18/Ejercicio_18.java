/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.vega.tp_2.ejercicio_17y18;

import com.vega.tp_2.ejercicio_17y18.FuncionesPrograma;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        18- En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
..........
}
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        Date date = FuncionesPrograma.getFechaDate(dia, mes, anio);
        
        System.out.println(date);
    }
    
}
