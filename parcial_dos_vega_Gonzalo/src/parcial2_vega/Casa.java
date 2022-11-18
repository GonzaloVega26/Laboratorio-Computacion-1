/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_vega;

/**
 *
 * @author gonzalo
 */
public class Casa {
    private String numero;
    private String calleNumero;
    private double metrosCubiertos;
    private String tipoCasa;

    public Casa() {
    }

    
    public Casa(String numero, String calleNumero, double metrosCubiertos, String tipoCasa) {
        this.numero = numero;
        this.calleNumero = calleNumero;
        this.metrosCubiertos = metrosCubiertos;
        this.tipoCasa = tipoCasa;
    }

    public String getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(String tipoCasa) {
        this.tipoCasa = tipoCasa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public double getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(double metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }
    
    
}
