package unidades.unidad1.ejemplos;

import java.util.Scanner;

public class ejemplo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bocadillos = {"Jamón", "Queso", "Vegetal", "Pollo"};
        double[] precios = {3.50, 2.75, 3.00, 4.00};

        System.out.println("Bienvenido a la tienda de bocadillos!");
        System.out.println("Estos son nuestros bocadillos disponibles:");
        
        for (int i = 0; i < bocadillos.length; i++) {
            System.out.println((i + 1) + ". " + bocadillos[i] + " - €" + precios[i]);
        }

        System.out.print("Por favor, elige un bocadillo (1-4): ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= bocadillos.length) {
            System.out.println("Has elegido: " + bocadillos[opcion - 1]);
            System.out.println("El precio es: €" + precios[opcion - 1]);
        } else {
            System.out.println("Opción no válida. Por favor, intenta de nuevo.");
        }

        System.out.println("Gracias por tu compra!");
        scanner.close();
    }
}