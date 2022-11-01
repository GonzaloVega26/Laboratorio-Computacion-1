/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_integradror_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import practica2.BonoSueldo;
import practica2.Empleado;

/**
 *
 * @author Gerardo
 */
public class CalculoBonoSueldo {

    static String[][] haberes = {{"100", "Presentismo", "9"}, {"101", " Titulo Profesional", "9"}, {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", " Otros Haberes", "M"}};
    static String[][] deducciones = {{"200", " Obra Social", "3"}, {"201", "Jubilacion", "11"}, {"202", "Sindicato", "2"}, {"203", " Seguro", "1.5"}, {"204", "Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = cargarDatosEmplado();

        while (true) {
            BonoSueldo bono = new BonoSueldo();
cargarBono() ;
            System.out.println("Desea cargar otro Bono? (si/no)");
            String condicionSalida = sc.nextLine();
            if (condicionSalida.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Programa Finalizado");
    }

    public static Empleado cargarDatosEmplado() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el cuil");
        long cuil = sc.nextLong();
        System.out.println("Ingrese el año de Ingreso");
        int anioIngreso = verificarAnio();
        System.out.println("Ingrese los años de antiguedad");
        double montoAntiguedad = sc.nextDouble();
        montoAntiguedad *= 0.02;
        System.out.println("Ingrese su sueldo basico");
        double sueldoBasico = sc.nextDouble();

        return new Empleado(nombreEmpleado, cuil, anioIngreso, montoAntiguedad, sueldoBasico);
    }

    public static int verificarAnio() {
        Scanner sc = new Scanner(System.in);
        int anioIngreso = sc.nextInt();
        System.out.println(new Date().getYear());
        if (anioIngreso > (new Date().getYear()+1900)) {
            System.out.println("Año ingresado no valido");
            return verificarAnio();
        }
        return anioIngreso;
    }

    public static void cargarBono() {
        Scanner sc = new Scanner(System.in);
        String[][] bonoCalculado = new String[10][4];
        bonoCalculado[0][0] = "Codigo Item";
        bonoCalculado[0][1] = "Denominacion";
        bonoCalculado[0][2] = "Haberes";
        bonoCalculado[0][3] = "Deducciones";
        String codigoSalida = "";
        for (int i = 1; i < bonoCalculado.length; i++) {
            String[] vectorDatos = crearFilaHaber();
            if (vectorDatos.length == 0) {
                break;
            }
            bonoCalculado[i] = crearFilaHaber();
        }
        for (String[] strings : bonoCalculado) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println("");
        }

    }

    public static String[] crearFilaHaber() {
        System.out.println("Ingrese los Haberes del Empleado");
        mostarHaberes();
        int codigoItem = cargarCodigoItem();
        if(codigoItem == 000) return  new String[0];
        
        codigosIngresados.add(codigoItem);
        String[] vectorHaber = buscarCodigo(codigoItem);
        String monto = cargarDatoPorMontoOPorcentaje(vectorHaber);
        
        if (codigoItem > 200) {
            String[] vectorDatos = {vectorHaber[0], vectorHaber[1], "", monto};
            return vectorDatos;
        } else {
            String[] vectorDatos = {vectorHaber[0], vectorHaber[1], monto, ""};
            return vectorDatos;
        }
    }

    public static String cargarDatoPorMontoOPorcentaje(String[] vectorHaber) {
        if (vectorHaber[2].equals("M")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el monto");
            double monto = sc.nextDouble();
            if (verificarPositivo(monto)) {
                return String.valueOf(monto);
            }
            cargarDatoPorMontoOPorcentaje(vectorHaber);
        }
        return vectorHaber[2];
    }

    public static boolean verificarPositivo(double monto) {
        if (monto > 0) {
            return true;
        }
        System.out.println("Valor no valido");
        return false;
    }

    public static String[] buscarCodigo(int codigo) {
        for (String[] vectorHaber : haberes) {
            if (vectorHaber[0].equals(String.valueOf(codigo))) {
                return vectorHaber;
            }
        }
        return new String[0];
    }

    public static int cargarCodigoItem() {
        System.out.println("Ingrese el código del ítem");
        Scanner sc = new Scanner(System.in);
        int codigoItem = sc.nextInt();
        if(codigoItem == 000) return codigoItem; 
        
        
        if (codigosIngresados.contains(codigoItem)) {
            System.out.println("El codigo ya sido ingresado");
            return cargarCodigoItem();
        }
        if (verificarExistenciaCodigo(codigoItem)) {
            return codigoItem;
        }
        System.out.println("El codigo no existe");
        return cargarCodigoItem();
    }

    public static boolean verificarExistenciaCodigo(int codigo) {
        for (String[] vectorHaber : haberes) {
            if (vectorHaber[0].equals(String.valueOf(codigo))) {
                return true;
            }
        }
        for (String[] vectorDeducciones : deducciones) {
            if (vectorDeducciones[0].equals(String.valueOf(codigo))) {
                return true;
            }
        }
        return false;
    }

    public static void mostarHaberes() {
        for (String[] vectorHaber : haberes) {
            for (String haber : vectorHaber) {
                System.out.print(haber);
            }
            System.out.println("");
        }
    }
}
