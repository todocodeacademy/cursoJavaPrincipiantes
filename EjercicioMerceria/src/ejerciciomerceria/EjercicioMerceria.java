package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {

        //Mercería mayorista --> vende al por mayor
        //Menos de 5 paquetes NO VENDE
        // Entre 5 y 15 sale 10 USD el envío
        // Más de 15 el envío es gratis
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDesc;
        Scanner teclado = new Scanner(System.in);

        //preguntar por teclado cuantos paquetes son
        System.out.println("Ingrese la cantidad de paquetes");
        cantidadPaquetes = teclado.nextInt();

        //evaluar los posibles casos
        if (cantidadPaquetes < 5) {
            if (cantidadPaquetes < 0) {
                System.out.println("No se permiten compras con cantidad de paquetes negativos");
            } else {
                System.out.println("No se permiten ventas minoristas (cantidad de paquetes menor a 5)");
            }
        } else {
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El costo del envío es de 10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("Usted no tiene costo de envío. ¡Muchas gracias por su compra!");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no posee promociones. Necesita comprar: " + diferencia + " USD para entrar en promo");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDesc);
                } else {
                    descuento = montoTotal * 0.10;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDesc);
                }
            }

        }

    }

}
