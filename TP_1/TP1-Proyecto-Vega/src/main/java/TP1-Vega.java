import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        // Ejercicio 1
        /*
        String name = "Gonzalo";
        System.out.println("Bienvenido " + name);
        */

        // Ejercicio 2
        /*
        Scanner sc = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Bienvenido " + name);
        */

        // Ejercicio 3
        /*
        double num1 = 2.1;
        double num2 = 5;
        double sum, div, mult, mod, rest;
        sum = num1 + num2;
        rest = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println("La suma es: " + sum);
        System.out.println("La resta es: " + rest);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La dvision es: " + div);
        System.out.println("El módulo es: " + mod);
        */

        // Ejercicio 4
        /*
        double num1=2.2;
        double num2= 2.2;

        if (num1>num2){
            System.out.println("El primer valor es mayor al segundo");
            }else if(num1<num2){
                  System.out.println("El segundo valor es mayor al primero");

            }else{
                  System.out.println("Son iguales");
            }
          */

        // Ejercicio 5
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double num = sc.nextDouble();

        if (num % 2 == 0){
            System.out.println("El número si es divisible por 2 con resto 0");
        }else{
            System.out.println("La divsión por 2 no da resto 0");
        }
        */

        //Ejercicio 6
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double num = sc.nextDouble();
        double iva = 0.21;

        System.out.println("El valor con iva es: "+ (num*iva+num));

        */

        //Ejercicio 7
        /*
        int i =0;
        while(i <= 100){
         System.out.println(i);
         i++;
        }
        */

        // Ejercicio 8
        /*
        for(int i=0;i<=100;i++  ){
           System.out.println(i);
        }
        */

        // Ejercicio 9
        /*
        for(int i = 0 ; i <= 100; i++){
            if(i % 2 == 0 || i % 3 == 0){
            System.out.println(i);
            }
        }
        */

        // Ejercicio 10
        /*
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingresa valor");
            num = sc.nextInt();
            } while (num <= 0);
        */

        //Ejercicio 11
        /*
        Scanner sc = new Scanner(System.in);
        int tries = 3;
        String password = "123abc";
        String loginPass;
        while(tries > 0){
        System.out.println("Ingrese su contraseña");
        loginPass = sc.nextLine();
            if( password.equals(loginPass)){
                System.out.println("Acceso Correcto");
                break;
            }
         tries--;
        }
        */

        //Ejercicio 12
        /*
        Scanner sc = new Scanner(System.in);
        int dia;
        do{
            System.out.println("Ingrese número de dia del 1 al 7");
            dia = sc.nextInt();
        }while(dia < 1 || dia > 7);

        switch(dia){
            case 1 :
                System.out.println("Lunes es laboral");
                break;
            case 2 :
                System.out.println("Martes es laboral");
			    break;
			case 3:
			    System.out.println("Miercoles es laboral");
			    break;
			case 4:
			    System.out.println("Jueves es laboral");
			    break;
			case 5 :
			    System.out.println("Viernes es laboral");
			    break;
			case 6 :
			    System.out.println("Sabado (dia no laboral)");
			    break;
			case 7  :
			    System.out.println("Domingo (dia no laboral)");
				break;
			default:
			    System.out.println("Valor no válido");
        }

         */

        // Ejercicio 13
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = sc.nextInt();
      
        if(num <= 1){
            System.out.println("El número no es primo");
            return;
        }
        int raizCercana = (int) Math.sqrt(num) + 1;
        for (int i = raizCercana; i > 1; i--) { //Checks between sqrt of num and 1
            if (i != raizCercana && num % i == 0) {
               
                System.out.println("El número no es primo");
                return;
            }
        }
        System.out.println("El número es primo");
        */

        // Ejercicio 14
        /*
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Double(Math.random() * 100).intValue();
        int guessedNumber;
        int tries = 0;
        do {
            System.out.println("Ingrese un número");
            guessedNumber = sc.nextInt();
            if(guessedNumber > randomNumber) System.out.println("Es muy alto");
            if(guessedNumber < randomNumber) System.out.println("Es muy bajo");
            tries++;
        }while (randomNumber != guessedNumber);
        System.out.println("Correcto, número encontrado, cantidad de intentos " + tries);
        */

    }

}
