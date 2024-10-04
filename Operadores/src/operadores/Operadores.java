package operadores;

import java.util.Scanner;

public class Operadores {

     public static void main(String[] args) {
        //declaración de variables
         Scanner teclado = new Scanner(System.in);
        double num1, num2, suma;
         
        System.out.println("Ingrese el primer número a operar"); 
        num1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número a operar"); 
        num2 = teclado.nextDouble();
        
        suma = num1 / num2;
        
         System.out.println("El resultado es: " + suma);
        
        
    }
    
}
