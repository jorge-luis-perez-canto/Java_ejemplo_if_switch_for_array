/*
 * Copyright (C) 2020 Universidad de San Carlos de Guatemala
 */

package ejerciciojorgeperez;
import java.util.Scanner;
/**
 *
 * @author Jorge Luis Pérez Canto <george.jlpc@gmail.com>
 * 
 */
public class EjercicioJorgePerez {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][] producto = new int[3][2];
        double [][] precio = new double[3][2];
        double subtotal = 0.0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("\nIngrese el cantidad: ");
            producto[i][0] = sc.nextInt(); // cantidad
            
            System.out.print("Ingrese el código: ");
            producto[i][1] = sc.nextInt(); // código
            sc.nextLine();
            
            switch (producto[i][1]) {
                case 101:
                    precio[i][0] = 40.00;
                    break;
                case 102:
                    precio[i][0] = 54.99;
                    break;
                case 103:
                    precio[i][0] = 72.80;
                    break;
                case 104:
                    precio[i][0] = 73.00;
                    break;
                default:
                    precio[i][0] = 0;
                    break;
            }
            
            precio[i][1] = producto[i][0] * precio[i][0]; // monto
            subtotal = subtotal + precio[i][1];
        }
        
        double descuento;
        
        if (subtotal >= 500.00) {
            descuento = 0.15 * subtotal;
        } else {
            descuento = 0.0;
        }
        
        double total = subtotal - descuento;
        
        System.out.print("\nNombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("NIT: ");
        int nit = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
        
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("NIT: " + nit);
        
        System.out.println("_____________________________________________________________");
        System.out.println("\nCantidad \t Código \t Precio \t Monto");
        System.out.println("_____________________________________________________________");
        for (int i = 0; i<3; i++) {
            System.out.print(producto[i][0] + "\t\t");
            System.out.print(producto[i][1] + "\t\t");
            System.out.printf("%.2f \t\t", precio[i][0]);
            System.out.printf("%.2f \t\n", precio[i][1]);
        }
        System.out.println("_____________________________________________________________");
        
        System.out.printf("\nSubtotal: %.2f", subtotal);
        System.out.printf("\nDescuento: %.2f", descuento);
        System.out.printf("\nTOTAL: %.2f \n\n", total);
        
    }

}
