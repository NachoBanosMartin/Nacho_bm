package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    static final int OPMIN = 0;
    static final int OPMAX = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int numeroEntero = entrada.nextInt();

        if (estaEnRango(numeroEntero)) {
            System.out.println("El número está dentro del rango.");
        } else {
            System.out.println("El número no está dentro del rango.");
        }

        entrada.close();
    }

    static boolean estaEnRango(int numero) {
        return numero >= OPMIN && numero <= OPMAX;
    }
}