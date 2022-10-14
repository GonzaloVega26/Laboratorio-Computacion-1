/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vega.tp_2.ejercicio_20;

/**
 *
 * @author gonzalo
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int valor1, int valor2) {
        this.numerador = valor1;
        this.denominador = valor2;
    }
    
    
    
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int numerador,denominador;
        if(f1.denominador == f2.denominador){
            numerador = f1.numerador + f2.numerador;
            denominador = f2.denominador; // Se puede elegir el de cualquiera de los dos
            return new Fraccion(numerador,denominador);
        }else{
            numerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
            denominador = f1.denominador * f2.denominador;
            return new Fraccion(numerador, denominador);
        }
    }
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int numerador,denominador;
        if(f1.denominador == f2.denominador){
            numerador = f1.numerador - f2.numerador;
            denominador = f2.denominador; // Se puede elegir el de cualquiera de los dos
            return new Fraccion(numerador,denominador);
        }else{
            numerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
            denominador = f1.denominador * f2.denominador;
            return new Fraccion(numerador, denominador);
        }
    }
    
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int numerador,denominador;
        numerador = f1.numerador * f2.numerador;
        denominador = f1.denominador * f2.denominador;
        return new Fraccion(numerador, denominador);
        
    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int numerador,denominador;
        numerador = f1.numerador * f2.denominador;
        denominador = f1.denominador * f2.numerador;
        return new Fraccion(numerador, denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/"+ denominador;
    }
    
    
}
