/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author root
 */
public class Componente {
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public Componente() {
    }

    public Componente(String componente, String marca, int cantidad, double precio) {
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
