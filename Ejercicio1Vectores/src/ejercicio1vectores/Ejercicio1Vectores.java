package ejercicio1vectores;

import java.util.Scanner;

public class Ejercicio1Vectores {

     public static void main(String[] args) {     
         /*
         Llevar a cabo un programa que incluya un vector que almacene los nombres:
         Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar 
         un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
         */
         
         String nombres[] = new String [8];
         Scanner teclado = new Scanner (System.in);
         
         //carga de nombres
         for (int i=0; i<nombres.length;i++) {
            System.out.println("Ingrese el nombre que quiera guardar en el índice " + i);
            nombres[i] = teclado.nextLine();
         }
         
         //mostrar los nombres
         for (int i=0; i<nombres.length;i++) {
            System.out.println("índice: " + i + " Nombre guardado: " + nombres[i]);
         }
    }
    
}
