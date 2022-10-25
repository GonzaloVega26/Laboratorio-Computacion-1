
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Long> agenda = new HashMap<String,Long>();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
           menu();
           opc = sc.nextInt();
           switch(opc){
               case 1: cargarContacto(agenda);
               break;
               case 2: System.out.println(buscarTelefono(agenda));
               break;
               case 3: listarAgenda(agenda);
               break;
               case 4: break;
               default: System.out.println("Opcion no valida");
           }
        }while(opc != 4);
        
    }
    
    public static void cargarContacto(HashMap<String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Contacto");
        String nombre = sc.nextLine();
        if(agenda.containsKey(nombre)){
            System.out.println("Desea sobreescribir el contacto? (Y/N)");
            String opc = sc.nextLine();
            if(!opc.equalsIgnoreCase("y")){
                System.out.println("Creacion de contacto cancelada");
                return;
            }
        }
        System.out.println("Ingrese el numero de telefono");
        Long telefono = sc.nextLong();
        agenda.put(nombre, telefono);
    }
    
    public static String buscarTelefono(HashMap<String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Contacto a buscar");
        String nombre = sc.nextLine();
        Long numero = agenda.get(nombre);
        if(numero != null) return numero.toString();
        return "Contacto no encontrado";
        
    }
    
    public static void listarAgenda(HashMap<String,Long> agenda){
        for(String clave : agenda.keySet()){
            System.out.println(clave + " ---- " + agenda.get(clave));
        }
    }
    
    public static void menu(){
        System.out.println("Ingrese una opcion");
        System.out.println("##########  MENU  ##########");
        System.out.println("1. Cargar Contacto");
        System.out.println("2. Bucar Telefono por Nombre");
        System.out.println("3. Listar Agenda");
        System.out.println("4. Salir");
    }
    
    
}





































