/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_vega;

import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class Manzana {
    private double superficie;
    private String letra;
    private ArrayList<Casa> casas;

    public Manzana() {
        this.casas = new ArrayList<>();
    }

    public Manzana(double superficie, String letra) {
        this.superficie = superficie;
        this.letra = letra;
        this.casas = new ArrayList<>();
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    //Metodo Particular
    public double totalMetrosCubiertosManzana (){
        double superficieTotal = 0.0;
        for (Casa casa : this.casas) {
            superficieTotal += casa.getMetrosCubiertos();
        }
        if(superficieTotal <= this.superficie) return superficieTotal;
        System.out.println("Error en la carga de datos la superficie de la "
                + "manzana es menor que la suma de las superficies de "
                + "las casas que las componen");
        System.out.println("Se retorna 0");
        return 0.0;
    }

    
}
