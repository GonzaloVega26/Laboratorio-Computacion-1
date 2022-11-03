/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_integradror_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class CalculoBonoSueldo {

    static String[][] haberes = {{"100", "Presentismo", "9"}, {"101", "Titulo Profesional", "9"}, {"102", "Horas Extraordinarias", "M"}, {"103", "Horas Nocturnas", "M"}, {"104", " Otros Haberes", "M"}};
    static String[][] deducciones = {{"200", " Obra Social", "3"}, {"201", "Jubilacion", "11"}, {"202", "Sindicato", "2"}, {"203", " Seguro", "1.5"}, {"204", "Otros", "M"}};
    static List<Integer> codigosIngresados = new ArrayList<Integer>();
    static Empleado empleado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        empleado = cargarDatosEmplado();
        while (true) {
            empleado.getBonos().add(cargarBono());
            System.out.println("Desea cargar otro Bono? (si/no)");
            String condicionSalida = sc.nextLine();
            if (condicionSalida.equalsIgnoreCase("no")) {
                break;
            }
            codigosIngresados.clear();
        }
        mostrarEmpleado();
        System.out.println("Programa Finalizado");

    }
    
    public static void mostrarEmpleado(){
        System.out.println("Nombre: " +empleado.getNombreEmpleado());
        System.out.println("Cuil: " + empleado.getCuil());
        System.out.println("Sueldo Basico: " + empleado.getSueldoBasico());
        System.out.println("Año Ingreso: " + empleado.getAnioIngreso());
        System.out.println("Monto Por antiguedad " + empleado.getMontoAntiguedad());
        System.out.println("------BONOS-----");
        int i=1;
        for (BonoSueldo bono : empleado.getBonos()) {
            System.out.println("BONO----- " + i);
            System.out.println("Mes Liquidacion " + bono.getMesLiquidacion());
            System.out.println("Año Liquidacion " + bono.getAnioLiquidacion());
            
            mostrarResumenHaberes(bono.getHaberes());
            i++;
            }
        
    }

    public static Empleado cargarDatosEmplado() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el cuil");
        long cuil = sc.nextLong();
        System.out.println("Ingrese el año de Ingreso");
        int anioIngreso = verificarAnio();
        System.out.println("Ingrese su sueldo basico");
        double sueldoBasico = sc.nextDouble();
        System.out.println("Ingrese los años de antiguedad");
        int aniosAntiguedad = sc.nextInt();
        double montoAntiguedad = sueldoBasico * ((aniosAntiguedad * 2) / 100);

        return new Empleado(nombreEmpleado, cuil, anioIngreso, montoAntiguedad, sueldoBasico);
    }

    public static int verificarAnio() {
        Scanner sc = new Scanner(System.in);
        int anioIngreso = sc.nextInt();
        if (anioIngreso > (new Date().getYear() + 1900)) {
            System.out.println("Año ingresado no valido");
            return verificarAnio();
        }
        return anioIngreso;
    }

    public static BonoSueldo cargarBono() {
        Scanner sc = new Scanner(System.in);
        BonoSueldo bono = new BonoSueldo();
        String[][] bonoCalculado = new String[10][4];
        bonoCalculado[0][0] = "Codigo Item";
        bonoCalculado[0][1] = "Denominacion";
        bonoCalculado[0][2] = "Haberes";
        bonoCalculado[0][3] = "Deducciones";
        System.out.println("-----------------------------");
        System.out.println("Carga de BONO de SUELDO");
        System.out.println("Ingrese el mes de Liquidacion");
        int mesLiquidacion = sc.nextInt();
        System.out.println("Ingrese el año de Liquidacion");
        int anioLiquidacion = verificarAnio();
        
        for (int i = 1; i < bonoCalculado.length; i++) {
            String[] vectorDatos = crearFilaHaber();
            if (vectorDatos.length == 0) {
                if (bonoCalculado[1][1] != null) {
                    break;
                }
                System.out.println("Debe al menos ingresar un haber");
                return cargarBono();
            }
            bonoCalculado[i] = vectorDatos;
        }

        System.out.println("Calculando BONO");
        mostrarResumenHaberes(bonoCalculado);
        double montoLiquidacion = calcularTotalBono(bonoCalculado);
        
        //Seteo de datos a bono
        bono.setAnioLiquidacion(anioLiquidacion);
        bono.setMesLiquidacion(mesLiquidacion);
        bono.setMontoLiquidacion(montoLiquidacion);
        bono.setEmpleado(empleado);
        bono.setHaberes(bonoCalculado);
        return bono;
    }

    public static double calcularTotalBono(String[][] bonoCalculado) {
        double sumatoria = 0.0;
        for (int i = 1; i < bonoCalculado.length; i++) {
            for (int j = 2; j < bonoCalculado[0].length; j++) {
                String valor = bonoCalculado[i][j];
                if(valor == null) break; // ya no tengo más valores
                if(valor.equals("")) continue; // valor vacío
                if(valor != null){
                if (j == 2)  {
                    sumatoria += Double.parseDouble(valor);
                }
                if (j == 3) {
                    sumatoria -= Double.parseDouble(valor);
                }
                }
            }
        }
        return sumatoria;
    }

    public static void mostrarResumenHaberes(String[][] bonoCalculado) {
        for (String[] strings : bonoCalculado) {
            for (String string : strings) {
                if (string == null) {
                    continue;
                }
                System.out.printf("%-25s", string);
                if(string.equals(strings[strings.length-1])) System.out.println("");
            }
        }
    }

    public static String[] crearFilaHaber() {
        System.out.println("Ingrese los Haberes del Empleado");
        mostarHaberes();
        mostarDeducciones();
        int codigoItem = cargarCodigoItem();
        if (codigoItem == 000) {
            return new String[0];
        }

        codigosIngresados.add(codigoItem);
        String[] vectorHaber = buscarCodigo(codigoItem);
        String monto = cargarDatoPorMontoOPorcentaje(vectorHaber);
        System.out.println("Vector Haber");
        for (String string : vectorHaber) {
            System.out.print(string + "  ");
        }

        if (codigoItem >= 200) {
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
            return cargarDatoPorMontoOPorcentaje(vectorHaber);
        }
        double monto = (Double.parseDouble(vectorHaber[2]) / 100) * empleado.getSueldoBasico();
        return String.valueOf(monto);
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

        for (String[] vectorDeducciones : deducciones) {
            if (vectorDeducciones[0].equals(String.valueOf(codigo))) {
                return vectorDeducciones;
            }
        }
        return new String[0]; // Ya está verificado que el codigo existe entonces esta opcion no se cumple nunca pero necesita un return
    }

    public static int cargarCodigoItem() {
        System.out.println("Ingrese el código del ítem");
        Scanner sc = new Scanner(System.in);
        int codigoItem = sc.nextInt();
        if (codigoItem == 000) {
            return codigoItem;
        }

        if (codigosIngresados.contains(codigoItem)) {
            System.out.println("El codigo ya ha sido ingresado");
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
                System.out.print(haber + "  ");
            }
            System.out.println("");
        }
    }

    public static void mostarDeducciones() {
        for (String[] vectorDeducciones : deducciones) {
            for (String deduccion : vectorDeducciones) {
                System.out.print(deduccion + "  ");
            }
            System.out.println("");
        }
    }
}
