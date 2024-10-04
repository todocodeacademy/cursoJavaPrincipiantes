package ejbucleinfinito;

import java.util.Scanner;

public class EjBucleInfinito {

    public static void main(String[] args) {
    
     /*   int contador = 0;
        
        while (contador <=10) {
            System.out.println("Bucle infinito");
        }*/
     
      boolean bandera = true;
      Scanner teclado = new Scanner (System.in);
      String respuesta;
      
      while (bandera == true) {
          System.out.println("¿Estás actualmente suscrito? " + bandera);
          
          System.out.println("¿Querés desuscribirte a TodoCode?");
          //respuesta = teclado.next();
          
          
         /* if (respuesta.equalsIgnoreCase("si")) {
              bandera = false;  
          }*/
          
          System.out.println("----------------------------------------------");
          
      }
                
        
    }
    
}
