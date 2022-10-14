/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vega.tp_2.ejercicio_17y18;

import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class FuncionesPrograma {
    
    public static String getFechaString(Date date){
       return date.toString();
   }
    
    public static Date getFechaDate(int dia, int mes, int anio){
        Date date = new Date();
        date.setYear(anio-1900);
        date.setMonth(mes-1);
        date.setDate(dia);
        return date;
    }
}
