/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author govhe
 */
public class Empresa {
    String cuit;
    String razonSocial;
    ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
