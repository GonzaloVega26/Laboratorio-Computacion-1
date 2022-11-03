/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_integradror_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerardo
 */
public class Empleado {

    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double montoAntiguedad;
    private double sueldoBasico;
    private List<BonoSueldo> bonos;

    public Empleado() {
        this.bonos = new ArrayList<>();
    }

    public Empleado(String nombreEmpleado, long cuil, int anioIngreso, double montoAntiguedad, double sueldoBasico) {
        this.nombreEmpleado = nombreEmpleado;
        this.cuil = cuil;
        this.anioIngreso = anioIngreso;
        this.montoAntiguedad = montoAntiguedad;
        this.sueldoBasico = sueldoBasico;
        this.bonos = new ArrayList<>();
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }

    public void addBono(BonoSueldo bono) {
        if (this.bonos == null) {
            this.bonos = new ArrayList<>();
        }
        this.bonos.add(bono);
    }

}
