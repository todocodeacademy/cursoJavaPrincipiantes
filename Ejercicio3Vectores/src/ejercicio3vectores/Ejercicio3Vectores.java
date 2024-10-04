package ejercicio3vectores;

import java.util.Scanner;


public class Ejercicio3Vectores {

     public static void main(String[] args) {
      
       /*
       Realizar un programa que permita la carga de 15 números en un vector. 
       Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.
       */  
         
       int numeros [] = new int [15];
       Scanner teclado = new Scanner(System.in);
       
       //cargar 15 números
       for (int i=0;i<15;i++) {
           System.out.println("Ingrese el número para el índice: " + i );
           numeros[i] = teclado.nextInt();
       }
       
       //contar cuántos números 3 hay
       
       int cont3 = 0;
       
       for (int i=0;i<15;i++) {
           if (numeros[i]==3 || numeros[i]==-3) {
                cont3=cont3+1;
           }
           
       }
       
         System.out.println("La cantidad de números 3 que hay es de: " + cont3);
       
       
    }
    
}
