package ejemplomatrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {
      
       int matriz [][] = new int [3][4];
       Scanner teclado = new Scanner (System.in);

       //recorrido y carga de matrices
       for (int f=0; f <matriz.length; f++) {
           for (int c=0; c<matriz[0].length; c++){
               System.out.println("Ingrese el valor para la fila: " + f + " columna " + c);
               matriz[f][c] = teclado.nextInt();         
           }
       }
    
    //recorrido y muestra       
         for (int f=0; f <matriz.length; f++) {
           for (int c=0; c<matriz[0].length; c++){
               System.out.println("Fila: " + f + " Columna: " + c + " Valor: " + matriz[f][c]);
               
           }
       }  
        
    }
    
}
