package ejercicioenglishschool;
import java.util.Scanner;

public class EjercicioEnglishSchool {

  
    public static void main(String[] args) {
        
        //declaración de variables
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("****** BIENVENIDO A ENGLISH SCHOOL ******");
        System.out.println("Ingrese la edad del alumno");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del grupo KINDER, es Lunes y Miércoles de 16 a 17hs");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario del grupo 1st year, es Martes y Jueves de 16:30 a 17:30hs");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario del grupo 2nd year, es Martes y Jueves de 17:30 a 19hs");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario del grupo 3rd year, es Lunes y Miércoles de 17 a 18:30hs");
                    } else {
                        System.out.println("Ingresó una edad que no corresponde");
                    }
                }
            }
        }
        
       
    }
    
}
