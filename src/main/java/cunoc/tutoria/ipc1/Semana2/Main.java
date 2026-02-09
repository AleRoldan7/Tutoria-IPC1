package cunoc.tutoria.ipc1.Semana2;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Arreglo: Es una colección de datos que son iguales*/
        /*length: es para obtner el tamaño de un arreglo o de un String */
        /*equals: El método compara dos cadenas, y devuelve verdadero si las cadenas son iguales y falso si no*/
        /*Pagina colores ANSI: https://www.jc-mouse.net/java/ansi-colorear-consola-de-salida-de-netbeans/*/
        final String ROJO = "codigo";

        Scanner scanner = new Scanner(System.in);
        String palabraAdivinada;

        int [] numeros = {1,55,88,9,6,4}; //Declaracion de un arreglo
        int [] numerosNuevos = new int[6];

        int [] numerosAleatorios = {5,8,9,6};

        String [] palabrasAleatorias = {"Hola", "Mundo", "Adios"};

        Random random = new Random(); //Random para obtener algo aleatorio

        int posicionString = random.nextInt(palabrasAleatorias.length);
        String palabra = palabrasAleatorias[posicionString].toLowerCase();

        System.out.println(palabra);

        System.out.println("Ingrese una palabra");
        palabraAdivinada = scanner.nextLine().toLowerCase();

        if (palabra.equals(palabraAdivinada)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //int posicion = random.nextInt(numerosAleatorios.length);//obtenemos una posicion aleatoria del arreglo
        //int valor = numerosAleatorios[posicion];//obtenemos el valor en la posicion aleatoria

        //System.out.println("El valor aleatorio es: " + valor);



        /*Como llenar un arreglo y mostrarlo
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ingrese numeros: ");
            numerosNuevos[i] = scanner.nextInt();
        }

        System.out.println("------------------------------");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Los numeros del arreglo son: ");
            System.out.println(numerosNuevos[i]);
        }
        */

        /* Mostrar un arreglo ya con datos definidos
        for (int i = 0; i <= 5; i++) {
            System.out.println("Los datos son: " + numeros[i]);
        }
        */


    }
}
        /*
        if (args.length > 0) {
            int parametro = Integer.parseInt(args[0]);

            if (parametro >= 1 && parametro <= 3) {
                switch (parametro) {

                    case 1:
                        System.out.println("Hola parametro 1");
                        break;

                    case 2:
                        System.out.println("Parametro 2");
                        break;

                    case 3:
                        System.out.println("Parametro 3");
                        break;


                }
            }   else {
                System.out.println("Parametro invalido");
            }
        }

        */
        /*

        Scanner scanner = new Scanner(System.in);
        String cadena;
        String adivinarCadena;

        /*
        int  [] arreglo  = {1,2,3,4,6};
        int [] llenarArreglo = new int[4];
        String cadena = "ABCDEFGHIJK";
        */
        /*
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese valores: ");
            llenarArreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(llenarArreglo[i]);
        }
    */
        /*
        System.out.println(arreglo.length);

        System.out.println(cadena.indexOf("B"));
        System.out.println(cadena.charAt(5));
        System.out.println(cadena.toLowerCase());
    */
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[i]);
        }
        */


        /*
        System.out.println("Ingrese cadena que adivinara: ");
        cadena = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese la cadena: ");
        adivinarCadena = scanner.nextLine().toLowerCase();

        for (int i = 0; i < 5; i++) {

            String palabraAdivinar = cadena;
            String palabraAdivinada = adivinarCadena;

            if (palabraAdivinar.equals(palabraAdivinada)) {
                System.out.println("Si son la misma cadena");
            } else {
                System.out.println("No son la misma cadena");
            }

        }
        */
