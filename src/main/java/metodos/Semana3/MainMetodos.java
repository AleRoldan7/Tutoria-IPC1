package metodos.Semana3;

import java.util.Random;
import java.util.Scanner;

public class MainMetodos {

    static Scanner scanner = new Scanner(System.in);
    static int contadorSuma = 0;
    static int contadorResta = 0;
    static int contadorMultiplicacion = 0;
    static int contadorDivision = 0;

    public static void main(String[] args) {
        //mostrarMensaje();
       //System.out.println(sumarNumeros(5,8.5));
        mostrarMenu();
    }


    static void mostrarMensaje() {
        System.out.println("Hola mundo");
    }

    /*Para declarar un metodo se tiene que utilizar un verbo*/

    /*para retornar un valor de una funcion*/
    /*
    static double sumarNumeros(double numero1, double numero2) {
        return numero1 + numero2;
    }
    */

    static void mostrarMenu() {

        int numero1;
        int numero2;
        System.out.println("Ingrese numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese numero");
        numero2 = scanner.nextInt();
        int opcion = 0;
        do {
            System.out.println("--------------MENU-------------------");
            System.out.println("1.Suma");
            System.out.println("2.Reta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.print("Elija opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    contadorSuma++;
                    sumarNumeros(numero1, numero2);
                    break;

                case 2:
                    contadorResta++;
                    restarNumeros(numero1, numero2);
                    break;

                case 3:
                    contadorMultiplicacion++;
                    multiplicarNumeros(numero1, numero2);
                    break;

                case 4:
                    contadorDivision++;
                    dividirNumeros(numero1, numero2);
                    break;

                default:
                    System.out.println("Saliendo....");
                    break;
            }

        }while(opcion != 5);


        System.out.println("Suma contador: " + contadorSuma);
        System.out.println("Resta contador: " + contadorResta);
        System.out.println("Multiplicacion contador: " + contadorMultiplicacion);
        System.out.println("Division contador: " + contadorDivision);
    }

    static void sumarNumeros(double numero1, double numero2) {
        double suma;
        suma = numero1 + numero2;
        System.out.println("El resultado es: " + suma);
    }

    static void restarNumeros(double numero1, double numero2) {
        double resta;
        resta = numero1 - numero2;
        System.out.println("El resultado es: " + resta);
    }

    static void multiplicarNumeros(double numero1, double numero2) {
        double multi;
        multi = numero1 * numero2;
        System.out.println("El resultado es: " + multi);
    }

    static void dividirNumeros(double numero1, double numero2) {
        double dividir;

        if (numero2 == 0) {
            System.out.println("El numero no se puede dividir por cero");
        } else {

            dividir = numero1 / numero2;
            System.out.println("El resultado es: " + dividir);
        }
    }


}
