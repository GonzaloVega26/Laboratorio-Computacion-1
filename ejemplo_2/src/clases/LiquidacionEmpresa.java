/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class LiquidacionEmpresa {

    static ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<>();

    public static void main(String[] args) {
        cargarNiveles(); // Carga de niveles academicos
        Empresa empresa = creacionEmpresa();
        String opc="";
        System.out.println("Creacion de Empleados");
        do {
            Empleado empleado = creacionEmpleado();
            Scanner sc = new Scanner(System.in);

            if (verificarLegajoCreado(empresa, empleado.getLegajo())) {
                System.out.println("El legajo ingresado ya fue cargado anteriormente");
                continue;
            } else {
                System.out.println("Empleado cargado correctamente");
                empresa.getEmpleados().add(empleado);
            }

            System.out.println("Desea cargar otro empleado?(si/no)");
            opc = sc.nextLine();
        } while (opc.equalsIgnoreCase("si"));
        
        mostrarResumen(empresa);
    }

    public static void mostrarResumen(Empresa empresa) {
        
        System.out.println("Empresa: " + empresa.getRazonSocial());
        System.out.println("CUIT:" + empresa.getCuit());
        System.out.println("------------------------Empleados------------------------------");
        for (Empleado empleado : empresa.getEmpleados()) {
            
            mostrarDatosEmpleado(empleado);

            System.out.println("---------------------------------------------------------------------");
        }
        System.out.println("\n ------------------------Resumen General------------------------------ \n");
        System.out.println("El promedio de los salarios de la empresa es: $" + calcularPromedioSalarios(empresa));

        Empleado empleadoMejorPago = getEmpleadoMejorPago(empresa);
        System.out.println("El empleado con mejor salario es:");
         mostrarDatosEmpleado(empleadoMejorPago);
    }

    public static void mostrarDatosEmpleado(Empleado empleado) {
        System.out.println("Nombre Completo:" + empleado.getNombreCompleto());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Nivel Educativo: " + empleado.getNivelAcademico().getNivel()
                + "(Porcentaje Aumento " + empleado.getNivelAcademico().getProcentajeAumento() + "%)");
    }

    public static Empleado getEmpleadoMejorPago(Empresa empresa) {
        Empleado empleadoMejorPago = new Empleado();
        double mejorSalario = 0.0;
        for (Empleado empleado : empresa.getEmpleados()) {
            if (mejorSalario < empleado.salarioTotalCalculado()) {
                empleadoMejorPago = empleado;
            }
        }

        return empleadoMejorPago;

    }

    public static double calcularPromedioSalarios(Empresa empresa) {
        double sumatoria = 0.0;
        for (Empleado empleado : empresa.getEmpleados()) {
            sumatoria += empleado.salarioTotalCalculado();
        }
        return sumatoria/empresa.getEmpleados().size();
    }

    public static boolean verificarLegajoCreado(Empresa empresa, int legajo) {
        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado.getLegajo() == legajo) {
                return true;
            }
        }
        return false;
    }

    public static void cargarNiveles() {
        NivelAcademico secundario = new NivelAcademico(10, "Secundario Completo", 10);
        NivelAcademico universitario = new NivelAcademico(20, "Universitario Completo", 30);
        NivelAcademico maestria = new NivelAcademico(30, "Maestría Completo", 40);
        NivelAcademico doctorado = new NivelAcademico(40, "Doctorado Completo", 50);
        nivelesAcademicos.add(secundario);
        nivelesAcademicos.add(universitario);
        nivelesAcademicos.add(maestria);
        nivelesAcademicos.add(doctorado);
    }

    public static Empresa creacionEmpresa() {
        System.out.println("Ingrese la razon social de la Empresa");
        String razonSocial = crearString(); // Se valida que no sea vacio
        System.out.println("Ingrese el cuit");
        String cuit = crearCuit(); // Se valida que tenga 11 caracteres

        System.out.println("\nDatos Empresa creados Correctamente \n");
        return new Empresa(cuit, razonSocial);
    }

    public static String crearString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isVacio(str)) {
            System.out.println("Error!, no puede ser vacío");
            return crearString();
        }
        return str;
    }

    public static String crearCuit() {
        Scanner sc = new Scanner(System.in);
        String cuit = sc.nextLine();
        if (cuit.length() == 11) {
            return cuit;
        }

        System.out.println("El cuit debe contener 11 caracteres, vuelvalo a ingresa");
        return crearCuit();
    }

    public static boolean isVacio(String str) {
        if (str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static double crearSalarioPositivo() {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario > 0) {
            return salario;
        }
        System.out.println("El salario no puede ser negativo");
        return crearSalarioPositivo();
    }

    public static NivelAcademico getNivelAcademico(int codigo) {
        for (NivelAcademico nivelAcademico : nivelesAcademicos) {
            if (nivelAcademico.getCodigo() == codigo) {
                return nivelAcademico;
            }
        }
        return null;
    }

    public static NivelAcademico elegirNivelAcademico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del nivel academico");
        int codigo = sc.nextInt();
        NivelAcademico nivelAcademico = getNivelAcademico(codigo);
        if (nivelAcademico == null) {
            System.out.println("El código ingresado no existe, intente nuevamente");
            return elegirNivelAcademico();
        }
        return nivelAcademico;

    }
    public static int crearLegajo(){
        int legajo;
        try {
            System.out.println("Ingrese su legajo");
            legajo = Integer.parseInt(crearString()); //Verifica que no esté vacio
        } catch (Exception e) {
            System.out.println("Solo debe contener numeros"); // Try catch para evitar entrada de letras
            return crearLegajo();
        }
        
        return legajo;
    }

    public static Empleado creacionEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre Completo del empleado");
        String nombreCompleto = crearString(); // Ya valida que no sea vacio
        int legajo = crearLegajo();
        System.out.println("Ingrese el salario del empleado");
        double salario = crearSalarioPositivo(); // Verifica que no sea negativo
        NivelAcademico nivelAcademico = elegirNivelAcademico();

        return new Empleado(nombreCompleto, legajo, salario, nivelAcademico);
    }
}
