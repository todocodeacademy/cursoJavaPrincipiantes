package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /* Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) 
    muestre en pantalla todos los números hasta ese límite (empezando por 1).
 */

    public static void main(String[] args) {
        
        int numero;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese por teclado el límite");
        numero = teclado.nextInt();
        
        for (int i=0; i<numero;i++) {
            System.out.println(i+1);
        }
        
        
    }
    
}
