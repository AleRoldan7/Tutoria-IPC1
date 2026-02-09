package conceptos.basicos.Semana1;

import java.util.Scanner;

public class MainConceptos {

    public static void main(String[] args) {

        //documentacion java: https://docs.oracle.com/javase/8/docs/api/overview-summary.html
        
        
        //Tipo entero
        int numero = 10;// numeros enteros
        //Tipo caracter
        char letra = 100; //solo un caracter
        //tipo decimal
        double decimal1 = 3.5; //Acepta hasta 15 decimales
        //Tipo cadena
        String cadena = "Hola"; //cadena de caracteres
        //Tipo bandera o logicos
        boolean logico = true;  //true o falseó 
        //sout hace el autocompletado
        System.out.println("Hola mundo");  
        //concatenación de variables
        System.out.println("Entero: " + numero); 
        System.out.println("Caracter: " + letra);
        System.out.println("Decimal: " + decimal1);
        System.out.println("Cadena: " + cadena);
        
        
        
        //Suma de numeros
        int numero1;
        int numero2;
        int suma;
        
        Scanner scanner = new Scanner(System.in);//Sirve para guardar el valor en la variables 
        //Un escáner de texto simple que puede analizar tipos y cadenas primitivos utilizando expresiones regulares.
        
        
        System.out.println("Ingrese numero");
        numero1 = scanner.nextInt();
        
        System.out.println("Ingrese numero");
        numero2 = scanner.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("Resultado: " + suma);
        
        
        //ciclo: es la repetición de una acción
        
        //for, while, do while
        
        //ciclo for, cuenta con un contador de repeticiones
        for(int i = 0; i < 5; i++) {
            
            System.out.println("Hola mundo");
            
        }
    }
}
