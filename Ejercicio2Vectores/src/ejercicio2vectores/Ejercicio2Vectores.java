package ejercicio2vectores;

import java.util.Scanner;

public class Ejercicio2Vectores {

    public static void main(String[] args) {
        /*
        Realizar un programa que permita la carga de 10 números en un vector. 
        Una vez cargados, se necesita que el programa determine cual es el mayor 
        y cual es el menor de ellos.
        */
        int numeros[] = new int [10];
        Scanner teclado = new Scanner(System.in);
       
        //carga del vector
        for(int i=0;i<10;i++) {
            System.out.println("Ingrese el número que quiere cargar en la posición " + i);
            numeros[i] = teclado.nextInt();
        }
        
        //búsqueda del mayor
        int mayor = Integer.MIN_VALUE; 
           for(int i=0;i<10;i++) {
                if(numeros[i]>mayor) {
                    mayor = numeros[i];
                }
           }
           
            //búsqueda del menor
        int menor = Integer.MAX_VALUE; 
           for(int i=0;i<10;i++) {
                if(numeros[i]<menor) {
                    menor = numeros[i];
                }
           }
           
           System.out.println("El mayor número es: " + mayor);
           System.out.println("El menor número es: " + menor);
           
           }
   
    }
    
