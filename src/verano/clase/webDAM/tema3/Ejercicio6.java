package verano.clase.webDAM.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	/*
	 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
	 * Mostrar un mensaje indicando si el número tiene uno o dos dígitos.
	 */

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			try {
				System.out.print("Introduce un número positivo (1 a 99) o 0 para salir: ");
				int numero = entrada.nextInt();

				if (numero == 0) {
					System.out.println("Programa finalizado.");
					break;
				}

				if (numero < 0 || numero > 99) {
					System.out.println("Número fuera del rango permitido. Debe estar entre 1 y 99.\n");
					continue;
				}

				if (numero < 10) {
					System.out.println("El número tiene un dígito.\n");
				} else {
					System.out.println("El número tiene dos dígitos.\n");
				}

			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor introduce un número entero.");
				entrada.nextLine(); 
			}
		}
	}
}
