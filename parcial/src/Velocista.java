/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gonzalo
 */
public class Velocista {
    private String apellido;
    private String nombre;
    private int edad;
    private double tiempos[];
    private double mejorTiempo;

    public Velocista() {
    }

    //Getters y Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getTiempos() {
        return tiempos;
    }

    public void setTiempos(double[] tiempos) {
        this.tiempos = tiempos;
    }

    public double getMejorTiempo() {
        return mejorTiempo;
    }

    public void setMejorTiempo(double mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }
    //Para mostrar a un velocista en formato propio
    @Override
    public String toString() {
        return "Apellido: " + apellido + "\nNombre: " + nombre + "\nEdad:" + edad + "\nTiempos: " + mostrarTiemposString() 
                + "\nMejor Tiempo: " + mejorTiempo;
    }
    //Para poder mostrar los tiempos como si fuera un string separado por comas.
    private String mostrarTiemposString(){
        String tiemposString = "";
        for (int i = 0; i < this.tiempos.length; i++) {
            tiemposString += this.tiempos[i] + ", ";
        }
        if(tiemposString.trim().length() == 0) return ""; 
        //En caso de que no se cargue tiempo, pero está contemplado en el programa principal
        tiemposString = tiemposString.substring(0,tiemposString.length()-2); // Quitando ultimo ", "
        return tiemposString;
    }
    
}
