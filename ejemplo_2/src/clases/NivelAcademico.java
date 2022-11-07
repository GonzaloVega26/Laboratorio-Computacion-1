/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author govhe
 */
public class NivelAcademico {
    private int codigo;
    private String nivel;
    private double procentajeAumento;

    public NivelAcademico() {
    }

    public NivelAcademico(int codigo, String nivel, double procentajeAumento) {
        this.codigo = codigo;
        this.nivel = nivel;
        this.procentajeAumento = procentajeAumento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getProcentajeAumento() {
        return procentajeAumento;
    }

    public void setProcentajeAumento(double procentajeAumento) {
        this.procentajeAumento = procentajeAumento;
    }
    
}
