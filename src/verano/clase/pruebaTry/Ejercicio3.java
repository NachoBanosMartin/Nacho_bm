package verano.clase.pruebaTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		boolean encontrado = true;

		do {
			System.out.println("Introduzca un número entero: ");
			int numero;
			try {
				numero = entrada.nextInt();
				int resultado = numero * numero;
				System.out.println("El cuadrado del número introducido es: " + resultado);
				encontrado = false;

			} catch (InputMismatchException e) {
				System.out.println("Error al intoducir el número");
				entrada.nextLine();    // Si no se limpia el buffer se creará un bucle infinito
			}
		} while (encontrado);

	}

}
