package operadorternario;

import java.util.Scanner;

public class OperadorTernario {
 
    public static void main(String[] args) {
       
        /*programa que dependiendo del promedio de un alumno, 
        nos diga si aprobó o no una materia*/
        
        //declaración de variables
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        //pedirle al usuario que ingrese el promedio por teclado
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio>=6) ? "Aprobado" : "Desaprobado";
 
        System.out.println("La condición final del alumno es: " + condicionFinal + " El promedio fue: " + promedio);
        
        
    }
    
}
