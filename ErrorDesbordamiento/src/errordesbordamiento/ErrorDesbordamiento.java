package errordesbordamiento;

public class ErrorDesbordamiento {
   
    public static void main(String[] args) {
       
        int vector [] = new int [3];
        vector[0] = 1;
        vector[1] = 35;
        vector[2] = 23;
        
       for (int i=0; i<3;i++) {
           System.out.println("Valor: " + vector[i]);
       }
        
        
    }
    
}
