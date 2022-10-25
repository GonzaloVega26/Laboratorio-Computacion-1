/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.HashSet;

/**
 *
 * @author root
 */
public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<Componente> componentes;
    
    public Computadora(){
        componentes = new HashSet<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<Componente> componentes) {
        this.componentes = componentes;
    }
}
