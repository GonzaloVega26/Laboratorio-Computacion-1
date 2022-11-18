/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2_vega;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class AltaBarrio {

    static Barrio barrio = new Barrio();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargaDatosBarrio(); // Se cargan los datos de nombre y localidad
        String opc;
        System.out.println("------------CARGAR MANZANAS---------------");
        do {
            barrio.getManzanas().add(crearManzana());
            System.out.println("Desea Cargar otra manzana?(si/no)");
            opc = sc.nextLine();
        } while (opc.equals("si"));

        mostrarResumen();
    }
    public static void mostrarResumen(){
         System.out.println("------------------------RESUMEN DE DATOS------------------------------ ");
        System.out.println("Barrio: " + barrio.getNombre());
        System.out.println("Localidad: " + barrio.getLocalidad());
        for (Manzana manzana : barrio.getManzanas()) {
            mostrarManza(manzana);
        }
        
        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.println("Total Metros Cuadrados de Barrio:" + barrio.totalMetrosCuadradosBarrio());
        System.out.println("");
    }
    public static void mostrarManza(Manzana manzana){
        System.out.println("------------------------Manzana------------------------------ ");
        System.out.println("Superficie Total: " + manzana.getSuperficie());
        System.out.println("Letra: " + manzana.getLetra());
        System.out.println("--------------------Casas de la Manzana------------------");
        for (Casa casa : manzana.getCasas()) {
            mostrarCasa(casa);
        }
        System.out.println("Total Metros Cuadrados Manzana:" + manzana.totalMetrosCubiertosManzana());
    }
    public static void mostrarCasa(Casa casa){
        
        System.out.println("Tipo Casa: " + casa.getTipoCasa());
        System.out.println("Numero Casa: " + casa.getNumero());
        System.out.println("Calle: " + casa.getCalleNumero());
        System.out.println("Metros Cubiertos Cuadrados: " + casa.getMetrosCubiertos());
        System.out.println("\n---------------------------------------------------------------------\n");
    }
   

    public static void cargaDatosBarrio() {
        System.out.println("Ingrese el nombre del Barrio");
        barrio.setNombre(ingresarStringNoVacios());
        System.out.println("Ingrese la localidad del Barrio");
        barrio.setLocalidad(ingresarStringNoVacios());
    }

    public static String ingresarStringNoVacios() {// Verifica que no sea vacío el string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.trim().length() != 0) {
            return str;
        }
        System.out.println("No puede ser vacío!!, vuelva a intentarlo");
        return ingresarStringNoVacios();
    }

    public static double ingresarNumeroPositivo() {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        if (numero > 0) {
            return numero;
        }
        System.out.println("El numero no puede ser negativo!!!, vuelva a ingresarlo");
        return ingresarNumeroPositivo();
    }

    public static String letraManzanaNoRepetida() {
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
        for (Manzana manzana : barrio.getManzanas()) {
            if (letra.equalsIgnoreCase(manzana.getLetra())) {
                System.out.println("La manzana letra "+ letra + " ya fue ingresada");
                return letraManzanaNoRepetida();
            }
        }
        return letra;
    }

    public static Manzana crearManzana() {
        System.out.println("Ingrese la letra de la manzana");
        String letra = letraManzanaNoRepetida();
        System.out.println("Ingrese la superficie de la manzana");
        double superficie = ingresarNumeroPositivo();

        Manzana manzana = new Manzana(superficie, letra);

        String opc;
        System.out.println("------------CARGAR CASAS---------------");
        Scanner sc = new Scanner(System.in);
        do {
            manzana.getCasas().add(crearCasa());
            System.out.println("Desea Cargar otra casa?(si/no)");
            opc = sc.nextLine();
        } while (opc.equals("si"));

        return manzana;
    }

    public static String ingresarTipoCasaCorrecto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Los tipos posibles son: ");
        mostrarTiposPosibles();
        String tipoCasa = sc.nextLine();
        switch (tipoCasa) {
            case "B":
            case "S":
            case "SS":
            case "P":
                return tipoCasa;
            default:
                System.out.println("Tipo de casa no valido, vuelva a ingresarlo");
                return ingresarTipoCasaCorrecto();
        }
    }

    public static Casa crearCasa() {
        System.out.println("Ingrese el nombre de la calle");
        String calleNumero = ingresarStringNoVacios();
        System.out.println("Ingrese el numero de la casa");
        String numero = ingresarStringNoVacios();
        System.out.println("Ingrese los metros cubiertos");
        double metrosCubiertos = ingresarNumeroPositivo();
        System.out.println("Ingrese el tipo de casa");
        String tipoCasa = ingresarTipoCasaCorrecto();
        
        return new Casa(numero, calleNumero, metrosCubiertos, tipoCasa);
    }

    public static void mostrarTiposPosibles() {
        System.out.println("B (Base)");
        System.out.println("S (Standar)");
        System.out.println("SS (Standar Superior)");
        System.out.println("P (Premium)");

    }
}
