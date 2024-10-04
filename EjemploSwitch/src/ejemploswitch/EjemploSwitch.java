package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
      
        //declaración de variables
        int dia;
        String nombreDia;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese un número del 1 al 7");
        dia = teclado.nextInt(); //lee por teclado el día de la semana
        
        switch (dia) {
            case 1: nombreDia="Lunes";
                        break;
            case 2: nombreDia="Martes";
                        break;               
            case 3: nombreDia="Miércoles";
                        break; 
            case 4: nombreDia="Jueves";
                        break;
            case 5: nombreDia="Viernes";
                        break;               
            case 6: nombreDia="Sábado";
                        break;    
            case 7: nombreDia="Domingo";
                        break;
            default: nombreDia="Dia incorrecto";
        }
        
        System.out.println("El día de la semana es: " + nombreDia);
        
    }
    
}
