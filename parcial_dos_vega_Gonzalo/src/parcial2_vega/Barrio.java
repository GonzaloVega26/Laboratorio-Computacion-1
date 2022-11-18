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
public class Barrio {
    private String nombre;
    private String localidad;
    private ArrayList<Manzana> manzanas;

    public Barrio() {
        this.manzanas = new ArrayList<>();
    }

    public Barrio(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.manzanas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Manzana> getManzanas() {
        return manzanas;
    }

    public void setManzanas(ArrayList<Manzana> manzanas) {
        this.manzanas = manzanas;
    }
    
    //Metodo Particular
    public double totalMetrosCuadradosBarrio (){
        double superficieTotal = 0.0;
        for (Manzana manzana : this.manzanas) {
             superficieTotal += manzana.getSuperficie();
        }
        return superficieTotal;
    }
}
