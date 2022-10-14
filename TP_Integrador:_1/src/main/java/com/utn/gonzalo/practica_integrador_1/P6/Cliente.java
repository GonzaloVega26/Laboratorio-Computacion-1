/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.gonzalo.practica_integrador_1.P6;
/*
3. Escriba la definición de la clase Cliente cuyo alcance debe ser público con
los siguientes datos:
Tipos:
apellido, nombre: String.
dni: int.
sueldo: double.
nroCliente: int.
*/
/**
 *
 * @author gonzalo
 */
public class Cliente {
    private String apellido;
    private String nombre;
    private int dni;
    private double sueldo;
    private int nroCliente;

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + ", nroCliente=" + nroCliente + '}';
    }

    
    public Cliente(String apellido, String nombre, int dni, double sueldo, int nroCliente) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.nroCliente = nroCliente;
    }
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }
}
