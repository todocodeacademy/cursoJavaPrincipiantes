package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    Realizar un programa que muestre en pantalla palabras 
    que sean ingresadas por teclado hasta que se ingrese la palabra “salir”.

    */
    
    public static void main(String[] args) {

        String palabra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la palabra que quiera mostrar por teclado");
        palabra = teclado.nextLine();

        while (!palabra.equalsIgnoreCase("salir")) {

            System.out.println("La palabra es: " + palabra);

            System.out.println("Ingrese la palabra que quiera mostrar por teclado");
            palabra = teclado.nextLine();
        }
        
        System.out.println("¡Gracias por usar nuestro programa!");        
        
      
    }
    
}
