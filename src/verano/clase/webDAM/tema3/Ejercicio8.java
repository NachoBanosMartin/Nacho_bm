package verano.clase.webDAM.tema3;

import java.util.Collections;
import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Pedir un número entre 0 y 99999 y decir si es capicúa.
	 */

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un número entero: ");
		String numero = entrada.next();

		String invertido = new StringBuilder(numero).reverse().toString();

		if (numero.equals(invertido)) {
			System.out.println("Es capicúa.");
		} else {
			System.out.println("No es capicúa.");
		}

	}

}
