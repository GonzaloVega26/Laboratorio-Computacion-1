/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_parcial2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author govhe
 */
public class CargaDDJJIngresoFertilizante {

    private static String[][] fertilizantesPermitidos = {{"101", "UREA", "BS"},
    {"102", "SULFATO AMONICO", "BS"}, {"103", " SULFATO AMONICO", "BS"},
    {"104", "NITRATO DE CALCIO", "BS"}, {"105", "NITRATO DE CALCIO", "BD"},
    {"106", "SUPERFOSFATO TRIPLE", "BD"}, {"107", "NITRATO AMONICO", "BS"},
    {"108", "CLORURO DE POTASIO", "BD"}, {"109", "SULFATO DE POTASIO", "BS"},
    {"110", "NITROGENO LIQUIDO", "BD"}};

    public static void main(String[] args) {
        //Se crea la instancia de la clase DDJJIngresoFertilizante
        DDJJIngresoFertilizante ddj = new DDJJIngresoFertilizante();
        
        //Inicio de carga de datos "basicos"
        System.out.println("Ingree la Razon social");
        String razonSocial = cargarString();
        ddj.setEmpresa(razonSocial);
        System.out.println("Ingrese el cuil");
        long cuit = cargarCuil();
        ddj.setCuitEmpresa(cuit);
        System.out.println("Ingrese el año");
        int anio = cargarAnio();
        ddj.setAnioDeclaracion(anio);
        System.out.println("Ingrese el mes");
        int mes = cargarMes();
        ddj.setMesDeclaracion(mes);
        System.out.println("Cuantos envases de fertilizante desea cargar?");
        int envases = cargarNumeroPositivo();
        //Como dice que era secuencial yo cree la matriz de detalles de los fertilizantes usando un metodo en la clase de DDJJIngresoFertilizante
        //Lo unico que hace es crear la matriz, mas una fila que es el encabezado
        ddj.crearDetallesFertilizantes(envases); //Crea la matriz con (envases + 1) filas y 6 columnas

        //Despues manejo toda la logica de la carga de datos en un metodo que llama a los demas
        ddj.setDetallesFertilizantes(cargarEnvasesFertilizante(
                ddj.getDetallesFertilizantes()));
        ddj.calcularTotalAbonoIngreso();
        mostrarDatos(ddj);
    }
    static void mostrarDatos(DDJJIngresoFertilizante ddj)
    {
        System.out.println("Empresa: "  + ddj.getEmpresa());
        System.out.println("Cuit: " + ddj.getCuitEmpresa());
        System.out.println("Mes:" + ddj.getMesDeclaracion());
        System.out.println("Año:" + ddj.getAnioDeclaracion());
        for (String[] detallesFertilizante : ddj.getDetallesFertilizantes()) {
            for (String string : detallesFertilizante) {
                System.out.printf("%15s",string);
            }
            System.out.println("");
        }
        System.out.println("Total: " + ddj.getMontoXIngreso());
    }
    static String[][] cargarEnvasesFertilizante(String[][] fertilizantes) {
        //Lo que hice fue pensar la carga de datos de la matriz en dos partes
        //Lado 1: elegir que tipo de fertilizante(con el codigo) se usa, a partir de eso necesito tomar la decision de si son bolsas o bidones
        for (int i = 1; i < fertilizantes.length; i++) {//Empiezo desde 1 porque el 0 es la cabecera
            String[] detalleFertilizante = obtenerDetallesFertilizante(); //Como tengo que obtener varios valores uso un vector de dimension 3 para los primeros 3 datos
            //| Codigo Fertilizante | Nombre Fertilizante | Tipo  Envase | Capacidad Envase | Cantidad | Envase Subtotal
            //Los primeros 3 los obtenemos de "detalleFertilizante"
            fertilizantes[i][0] = detalleFertilizante[0];
            fertilizantes[i][1] = detalleFertilizante[1];
            fertilizantes[i][2] = detalleFertilizante[2];
            //Las columnas son fijas por lo que lo unico que varia son las filas
            String[] envases;
            //El codigo existe, ahora debemos ver si son bolsas o bidones
            if (detalleFertilizante[2].equals("BS")) {
                envases = cargarBolsa();
            } else {
                envases = cargarBindon();
            }
            
            fertilizantes[i][3] = envases[0];
            fertilizantes[i][4] = envases[1];
            fertilizantes[i][5] = envases[2];
        }

        return fertilizantes;
    }

    public static String[] obtenerDetallesFertilizante() {
        Scanner sc = new Scanner(System.in);
        int codigo;
        String[] detalleFertilizante;
        do {
            System.out.println("Ingrese el codigo");
            codigo = sc.nextInt();
            detalleFertilizante = verificarExistenciaCodigo(codigo);
            if(detalleFertilizante == null){
                System.out.println("Codigo no existe!");
            }
        } while (detalleFertilizante == null);
        if (detalleFertilizante == null) {
            System.out.println("El código del fertilizante ingresado no existe, intente nuevamente");
            return obtenerDetallesFertilizante();
        }

        return detalleFertilizante;
    }

    static String[] cargarBolsa() {
        String[] detallesBolsa = new String[3]; //Voy a devolver el vector ya armado
        // 0 para peso bolsa
        // 1 para cantidad de bolsas
        // 2 para subtotal
        int tamanioBolsa;
        boolean bolsaCorrecta = false;
        do {
            System.out.println("Que tamaño de bolsa desea?, solo puede ser de 5, 10, 25, 50 kg");
            tamanioBolsa = cargarNumeroPositivo();

            switch (tamanioBolsa) {
                case 5:
                case 10:
                case 25:
                case 50:
                    bolsaCorrecta = true; // uso bandera para salir del bucle de eleccion
                    break;
                default:
                    System.out.println("Valor no válido");
            }
        } while (!bolsaCorrecta);

        detallesBolsa[0] = String.valueOf(tamanioBolsa);
        System.out.println("Ingrese la cantidad de bolsas de " + tamanioBolsa + "kg que desea.");
        int cantidadBolsas = cargarNumeroPositivo();

        detallesBolsa[1] = String.valueOf(cantidadBolsas);
        int subtotal;
        /*
          Bolsas de 5 Kilos = 5 pesos x Bolsa
         Bolsas de 10 Kilos = 8 pesos x Bolsa
         Bolsas de 25 Kilos = 20 pesos x Bolsa
         Bolsas de 50 Kilos = 36 pesos x Bolsa
         */
        switch (tamanioBolsa) {
            case 5:
                subtotal = cantidadBolsas * 5;
                break;
            case 10:
                subtotal = cantidadBolsas * 8;
                break;
            case 25:
                subtotal = cantidadBolsas * 20;
                break;
            default:
                subtotal = cantidadBolsas * 36;
                break;
        }
        detallesBolsa[2] = String.valueOf(subtotal);

        return detallesBolsa;
    }

    static String[] cargarBindon() {
        String[] detalleBidon = new String[3]; //Voy a devolver el vector ya armado
        // 0 para lt bidon
        // 1 para cantidad de bidones
        // 2 para subtotal
        System.out.println("Ingrese el volumen del bidon en litros");
        int tamanioBidon = cargarNumeroPositivo();
        detalleBidon[0] = String.valueOf(tamanioBidon);
        System.out.println("Ingrese la cantidad de bidones de " + tamanioBidon + "lts que desea.");
        int cantidadBidones = cargarNumeroPositivo();
        detalleBidon[1] = String.valueOf(cantidadBidones);
        int subtotal = cantidadBidones * 12;
        //bidones un monto fijo de 12 pesos por bidón
        detalleBidon[2] = String.valueOf(subtotal);

        return detalleBidon;
    }

    static String[] verificarExistenciaCodigo(int codigo) {
        for (String[] fertilizantesPermitido : fertilizantesPermitidos) {
            if (fertilizantesPermitido[0].equals(String.valueOf(codigo))) {
                return fertilizantesPermitido; //Devolvemos el vector para cargarlo en la matriz general
            }
        }
        return null; //null porque String[] es objeto tipo referencia entonces peude ser null
    }

    public static String cargarString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (!str.isBlank() && !str.isEmpty()) {
            return str;
        }
        System.out.println("No puede ser vacio");
        return cargarString();
    }

    public static long cargarCuil() {
        Scanner sc = new Scanner(System.in);
        long cuil = sc.nextLong();
        if ((String.valueOf(cuil)).length() == 11) {
            return cuil;
        }
        System.out.println("El Cuil debe poseer 11 digitos");
        return cargarCuil();

    }

    public static int cargarMes() {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt() + 1;
        if ((mes > 12 || mes < 1) && mes > (new Date().getMonth() + 1)) {
            System.out.println("Debe estar entre 1 y 12");
            System.out.println("El mes no es valido o es superior al mes actual");
            return cargarMes();
        }
        return mes;
    }

    public static int cargarAnio() {
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        if (anio > (new Date().getYear() + 1900)) {
            System.out.println("El año no es valido, debe ser anterior al año actual");
            return cargarAnio();
        }
        return anio;
    }

    public static int cargarNumeroPositivo() {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero > 0) {
            return numero;
        }
        System.out.println("No puede ser negativo");
        return cargarNumeroPositivo();
    }
}
