package ejercicio3;

public class Ejercicio3 {
  
    public static void main(String[] args) {
       
        /*Realizar un programa que muestre por pantalla los números 
        del 200 al 250 saltando de 2 en dos. 
        La secuencia debería ser: 200…202…204…etc.*/
        
        int cont = 200;
        while (cont<=250) {
            System.out.println(cont);
            cont = cont +2;
        }

    }
    
}
