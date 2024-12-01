package unidades.unidad1.ejemplos;

import java.util.Scanner;

public class ejemplo3 {

    public static void main(String[] args) {
    	
        Scaner scanner = new Scanner(System.in);
        double total = 0.0;
        int opcion;

        do {
            
            mostrarMenu();
          
            System.out.print("Elige un bocadillo (1-4) o 0 para finalizar: ");
            opcion = scanner.nextInt();
            
            total += procesarOpcion(opcion);

        } while (opcion != 0); 
        
        System.out.printf("El costo total de tu pedido es: €%.2f%n", total);
        System.out.println("Gracias por tu compra!");

        scanner.close();
    }

    
    static void mostrarMenu() {
        System.out.println("\nBienvenido a la tienda de bocadillos!");
        System.out.println("Estos son nuestros bocadillos disponibles:");
        System.out.println("1. Jamón - €3.50");
        System.out.println("2. Queso - €2.75");
        System.out.println("3. Vegetal - €3.00");
        System.out.println("4. Pollo - €4.00");
        System.out.println("0. Finalizar pedido");
    }

    static double procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                mostrarResultado("Jamón", 3.50);
                return 3.50;
            case 2:
                mostrarResultado("Queso", 2.75);
                return 2.75;
            case 3:
                mostrarResultado("Vegetal", 3.00);
                return 3.00;
            case 4:
                mostrarResultado("Pollo", 4.00);
                return 4.00;
            case 0:
                System.out.println("Finalizando pedido...");
                return 0.0;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                return 0.0;
        }
    }

    
    static void mostrarResultado(String bocadillo, double precio) {
        System.out.println("Has elegido: " + bocadillo);
        System.out.println("El precio es: €" + precio);
    }
}