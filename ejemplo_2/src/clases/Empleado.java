/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author govhe
 */
public class Empleado {
    private String nombreCompleto;
    private int legajo;
    private double salario;
    private NivelAcademico nivelAcademico;

    public Empleado(String nombreCompleto, int legajo, double salario, NivelAcademico nivelAcademico) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.salario = salario;
        this.nivelAcademico = nivelAcademico;
    }

    public Empleado() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
    
    public double salarioTotalCalculado(){
        return (this.salario + ((this.nivelAcademico.getProcentajeAumento()/100) * this.salario));
    }
}
