package verano.clase.webDAM.tema3;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * Crea un programa llamado MedidasTornillos, que pida por teclado el tamaño de
	 * un tornillo y muestre por pantalla el texto correspondiente al tamaño, según
	 * la siguiente tabla:
	 */

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce la medida del tornillo: ");
		double medida = entrada.nextDouble();

		if (medida >= 1 && medida < 3) {
			System.out.println("Tamaño de tornillo: PEQUEÑO");
		} else if (medida >= 3 && medida < 5) {
			System.out.println("Tamaño de tornillo: MEDIANO");
		} else if (medida >= 5 && medida < 6.5) {
			System.out.println("Tamaño de tornillo: GRANDE");
		} else if (medida >= 6.5 && medida < 8.5) {
			System.out.println("Tamaño de tornillo: MUY GRANDE");
		} else {
			System.out.println("No hay ningún tornillo con esa medida");
		}

	}

}
