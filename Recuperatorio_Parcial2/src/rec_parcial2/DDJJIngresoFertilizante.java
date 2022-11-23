/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_parcial2;

/**
 *
 * @author govhe
 */
public class DDJJIngresoFertilizante {

    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    private String[][] detallesFertilizantes;

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getMontoXIngreso() {
        return montoXIngreso;
    }

    public void setMontoXIngreso(double montoXIngreso) {
        this.montoXIngreso = montoXIngreso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(long cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public String[][] getDetallesFertilizantes() {
        return detallesFertilizantes;
    }

    public void setDetallesFertilizantes(String[][] detallesFertilizantes) {
        this.detallesFertilizantes = detallesFertilizantes;
    }

    public void crearDetallesFertilizantes(int filas) {
        
        if (this.detallesFertilizantes == null) {
            this.detallesFertilizantes = new String[filas + 1][6]; // El +1 es porque la primera fila es el encabezado
            cargarCabecera();
        }
    }

    private void cargarCabecera(){
        this.detallesFertilizantes[0][0] = "CODIGO FERTILIZANTE";
        this.detallesFertilizantes[0][1] = "NOMBRE FERTILIZANTE";
        this.detallesFertilizantes[0][2] = "TIPO ENVASE";
        this.detallesFertilizantes[0][3] = "CAPACIDAD ENVASE";
        this.detallesFertilizantes[0][4] = "CANTIDAD ENVASE";
        this.detallesFertilizantes[0][5] = "SUBTOTAL";
    }
    public void calcularTotalAbonoIngreso() {
        int total = 0;
        for (int i = 1; i < this.detallesFertilizantes.length; i++) {
            total += Integer.valueOf(this.detallesFertilizantes[i][5]);
        }
        this.montoXIngreso = total;
    }
}
