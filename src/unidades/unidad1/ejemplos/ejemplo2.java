package unidades.unidad1.ejemplos;

import java.util.Scanner;

public class ejemplo2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        mostrarMenu();

        System.out.print("Por favor, elige un bocadillo (1-4): ");
        int opcion = scanner.nextInt();

        procesarOpcion(opcion);

        System.out.println("Gracias por tu compra!");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a la tienda de bocadillos!");
        System.out.println("Estos son nuestros bocadillos disponibles:");
        System.out.println("1. Jamón - 3.50 €");
        System.out.println("2. Queso - 2.75 €");
        System.out.println("3. Vegetal - 3.00 €");
        System.out.println("4. Pollo - 4.00 €");
    }

    public static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                mostrarResultado("Jamón", 3.50);
                break;
            case 2:
                mostrarResultado("Queso", 2.75);
                break;
            case 3:
                mostrarResultado("Vegetal", 3.00);
                break;
            case 4:
                mostrarResultado("Pollo", 4.00);
                break;
            default:
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
        }
    }

    public static void mostrarResultado(String bocadillo, double precio) {
        System.out.println("Has elegido: " + bocadillo);
        System.out.println("El precio es: " + precio + " €");
    }
}