package tp4;

import java.util.Scanner;

/**
 *
 * @author gonzalo
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        String[] nombres = new String[12];
        int[][] preciosStock = new int[12][2];
        int ventasTotales = 0;
        llenarMaquina(preciosStock, nombres);
        String opc;

        do {
            mostrarMenu();
            System.out.println("Ingrese una opcion");
            opc = sc.nextLine();
            switch (opc) {
                case "a":
                    int opcion = pedirGolosina();
                    entregarGolosina(opcion, preciosStock);
                    ventasTotales += sumarVentas(preciosStock, opcion);
                    break;
                case "b":
                    mostrarGolosina(preciosStock, nombres);
                    break;
                case "c":
                    rellenarGolosina(preciosStock, nombres);
                    break;
                case "d":
                    System.out.println("Sistema Apagandose");
                    System.out.println("Ventas totales realizadas $" + ventasTotales);
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (!opc.equals("d"));
    }

    public static void llenarMaquina(int[][] preciosStock, String[] nombres) {
        nombres[0] = "KitKat";
        preciosStock[0][0] = 32;
        preciosStock[0][1] = 10;

        nombres[1] = "Chicles";
        preciosStock[1][0] = 2;
        preciosStock[1][1] = 50;

        nombres[2] = "Caramelos de Menta";
        preciosStock[2][0] = 2;
        preciosStock[2][1] = 50;

        nombres[3] = "Huevo Kinder";
        preciosStock[3][0] = 25;
        preciosStock[3][1] = 10;

        nombres[4] = "Chetoos";
        preciosStock[4][0] = 30;
        preciosStock[4][1] = 10;

        nombres[5] = "Twix";
        preciosStock[5][0] = 26;
        preciosStock[5][1] = 10;

        nombres[6] = "M&M'S";
        preciosStock[6][0] = 35;
        preciosStock[6][1] = 10;

        nombres[7] = "Papas Lays";
        preciosStock[7][0] = 40;
        preciosStock[7][1] = 20;

        nombres[8] = "Milkybar";
        preciosStock[8][0] = 30;
        preciosStock[8][1] = 10;

        nombres[9] = "Alfajor Tofi";
        preciosStock[9][0] = 20;
        preciosStock[8][1] = 15;

        nombres[10] = "Lata Coca";
        preciosStock[10][0] = 50;
        preciosStock[10][1] = 20;

        nombres[11] = "Chitos";
        preciosStock[11][0] = 45;
        preciosStock[11][1] = 10;

    }

    public static void mostrarMatriz(int[][] preciosStock, String[] nombres) {
        //Ver de formatear para que quede como tabla.
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + "    ");
            for (int j = 0; j < preciosStock[0].length; j++) {
                System.out.print(preciosStock[i][j] + "   ");
            }
            System.out.println("");
        }
    }

    public static void mostrarMenu() {

        System.out.println("a. Pedir Golosina \n"
                + "b. Mostrar Golosinas \n"
                + "c. Rellenar Golosinas \n"
                + "d. Apagar Máquina \n");
    }

    //Seleccion de golosina con verificacion recursiva
    public static int pedirGolosina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición de la golosina que desea");
        int eleccion = sc.nextInt();
        if (eleccion < 1 || eleccion > 12) {
            System.out.println("Ingrese una opción válida, entre 1 y 12");
            return pedirGolosina();
        } else {
            return eleccion;
        }
    }

    public static void entregarGolosina(int golosina, int[][] preciosStock) {
        //golosina-1 porque la elección es entre 1 y 12 pero matriz es desde 0 a 11
        if (verificarStock(preciosStock[golosina - 1][1])) {
            preciosStock[golosina - 1][1]--;
            System.out.println("Compra Realizada");
        } else {
            System.out.println("No hay más stock, eliga otra golosina");
        }

    }

    public static boolean verificarStock(int stock) {
        if (stock > 1) {
            return true;
        }
        return false;
    }

    public static void mostrarGolosina(int[][] preciosStock, String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print((i + 1) + " " + nombres[i] + "   " + preciosStock[i][1] + "   ");
            System.out.println("");
        }
        System.out.println("");
    }

    public static void rellenarGolosina(int[][] preciosStock, String[] nombres) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String password = sc.nextLine();
        if (password.equals("AdminXYZ")) {
            mostrarGolosina(preciosStock, nombres);
            int posicion = pedirGolosina();
            preciosStock[posicion - 1][1] += verificarCantidadARellenar();
        } else {
            System.out.println("Contraseña Invalida");
        }
    }

    public static int verificarCantidadARellenar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad a recargar");
        int cantidad = sc.nextInt();
        if(cantidad <= 0 ) return verificarCantidadARellenar();
        return cantidad;

    }

    public static int sumarVentas(int[][] preciosStock, int opcion) {
        return preciosStock[opcion - 1][0];
    }
}
