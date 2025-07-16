package verano.clase.webDAM.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	// Codificar un programa que solicite al usuario un número e indique si es par o
	// impar.

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.println("Introduce un número entero para saber si es par o impar: ");

			try {

				int numero = entrada.nextInt();
				entradaValida = true;

				if (numero % 2 == 0) {
					System.out.println("El número " + numero + " es par.");
				} else {
					System.out.println("El número " + numero + " es impar.");
				}

			} catch (InputMismatchException e) {
				System.out.println("Error al introducir el número.");
				entrada.nextLine();
			}
		}

	}

}
