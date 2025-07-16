package verano.clase.webDAM.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Escribir un programa que indique cuántas cifras tiene un número entero
	 * introducido por teclado, que estará comprendido entre 0 y 99999.
	 */

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		try {
			System.out.println("Ingresa un número entero: ");
			int numero = entrada.nextInt();

			if (numero < 0 || numero > 99999) {
				System.out.println("El número introducido se encuentra fuera de rango");
			} else {
				System.out.println("Cifras: " + String.valueOf(numero).length());
			}
		} catch (InputMismatchException e) {
			System.out.println("Error al introducir el número");
		}

	}

}
