package ejerciciointegradorrepetitivas;

import java.util.Scanner;

public class EjercicioIntegradorRepetitivas {

    public static void main(String[] args) {
   
        /*
        varios clientes:
        El programa debe solicitar por teclado dos datos:
            La patente del vehículo
            El tipo de estacionamiento
        */
        String patente="";
        int tipoServicio, cantHoras, cont1=0, cont2=0, cont3=0;
        double total, totalDia=0;
        Scanner teclado = new Scanner (System.in);
        
        /* El programa debe calcular el monto a pagar para cada cliente en función
del tipo de estacionamiento seleccionado. La carga de datos debe
continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la
patente.*/              
        while (!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese la patente de su vehículo");
            patente = teclado.nextLine();
            
            if (!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1 - Por hora");
            System.out.println("2 - Media Jornada (5 horas)");
            System.out.println("3- Jornada completa (Hasta 10 horas)");
            teclado = new Scanner (System.in);
            tipoServicio= teclado.nextInt();
            
            if (tipoServicio<=0 || tipoServicio >3) {
                System.out.println("No ingresó un tipo de servicio correcto");
            }
            else {
                /* Los tipos de estacionamiento disponibles son 3:
                        -Por hora (cuyo valor es de $3 USD por hora)
                        -Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)
                        -Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)   
                */
                if (tipoServicio == 1) {
                    System.out.println("Ingrese la cantidad de horas que desea estacionar");
                    cantHoras = teclado.nextInt();
                    total = cantHoras*3;
                    System.out.println("El total de su estacionamiento es de: $" + total + " USD"); 
                    cont1 = cont1 + 1;
                    totalDia = totalDia + total;
                }
                else {
                    if (tipoServicio == 2) {
                        System.out.println("El servicio de media jornada corresponde a 5 hs y posee un descuento del 5%");
                        total = 15 - (15 * 0.05);
                        System.out.println("El total de su estacionamiento es de: $" + total + " USD");        
                        cont2 = cont2 +1;
                        totalDia = totalDia + total;
                    }
                    else {
                        System.out.println("El servicio de jornada completa corresponde a 10 hs y posee un descuento del 10%");
                        total = 30 - (30 * 0.10);
                        System.out.println("El total de su estacionamiento es de: $" + total + " USD");
                        cont3 = cont3 + 1;
                        totalDia = totalDia + total;
                    }
                }
            System.out.println("************* ¡MUCHAS GRACIAS POR SU COMPRA! *************\n");
            }
    
            
            teclado = new Scanner (System.in);
            }
        }
        
        System.out.println("===========================================================");
        System.out.println("Totales Monetarios del día");
        System.out.println("Cantidad Servicios por Hora: " + cont1);
        System.out.println("Cantidad Servicios de Media Jornada: " + cont2);
        System.out.println("Cantidad Servicios de Jornada Completa: " + cont3);
        System.out.println("El monto total recaudado del día es de: $" + totalDia + " USD");
    }
    
}
