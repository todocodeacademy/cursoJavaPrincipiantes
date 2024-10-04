package ejercicio4vectores;

import java.util.Scanner;

public class Ejercicio4Vectores {

    public static void main(String[] args) {
        
        /*
        Un empleado desea almacenar en un vector sus 12 sueldos del año. 
        A partir de esto, necesita un programa que determine y muestre por pantalla
        la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
        */
        
        double sueldos[] = new double[12];
        Scanner teclado = new Scanner(System.in);
        
        //carga de los sueldos
        for (int i=0; i<sueldos.length;i++) {
            System.out.println("Ingrese el sueldo del mes " + (i+1));
            sueldos[i] = teclado.nextDouble();
        }
        
        //suma sueldos
        double suma=0;
        for (int i=0; i<sueldos.length;i++) { 
            suma = suma + sueldos[i];
        }
        
        //promedio de sueldo del año
        double promedio;
        promedio = suma /sueldos.length;
        
        System.out.println("La suma de todos los sueldos del año es de: " + suma + " dólares");
        System.out.println("El promedio de sueldos es de: " + promedio + " dólares");
        
    }
    
}
