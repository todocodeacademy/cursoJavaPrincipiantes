package ejercicioif;

import java.util.Scanner;

public class EjercicioIf {

    public static void main(String[] args) {
       
        int edad;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        
        if (edad >18) {
            System.out.println("Sos mayor de 18. Felicitaciones");
            
            if (edad >40) {
                System.out.println("Sos generación X");
            }
            else {
                System.out.println("Sos Millennial o Centennial");
            }
            
        }
        else {
            
            if (edad == 18) {
                System.out.println("Tenés exactamente 18 años");
            }
            else {
                System.out.println("No podés acceder :( ... Sos menor de 18");
            }
        }
        
        System.out.println("Llegué al final");
        
    }
    
}
