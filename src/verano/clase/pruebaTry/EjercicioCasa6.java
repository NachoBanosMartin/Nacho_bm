package verano.clase.pruebaTry;

import java.util.Scanner;

public class EjercicioCasa6 {

    public static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            pedirCadena();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void pedirCadena() {
        String cadena;

        // Pedir cadena válida
        while (true) {
            System.out.println("Introduzca una cadena de valores (máx 10 caracteres): ");
            cadena = entrada.nextLine();

            if (cadena.length() <= 10) {
                break;
            } else {
                System.out.println("❌ Se ha superado el máximo de caracteres.");
            }
        }

        int posicion;

        // Pedir posición válida
        while (true) {
            System.out.println("Introduce la posición del carácter que desees sacar:");
            if (entrada.hasNextInt()) {
                posicion = entrada.nextInt();
                entrada.nextLine(); // limpiar salto de línea

                if (posicion >= 0 && posicion < cadena.length()) {
                    break;
                } else {
                    System.out.println("❌ La posición está fuera de rango.");
                }
            } else {
                System.out.println("❌ Debes escribir un número.");
                entrada.nextLine(); // limpiar entrada inválida
            }
        }

        char caracter = cadena.charAt(posicion);
        System.out.println("✅ El carácter en la posición " + posicion + " es: '" + caracter + "'");
    }
}
