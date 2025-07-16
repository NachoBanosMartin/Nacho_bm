package verano.clase.pruebaTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		boolean encontrado = true;

		do {
			System.out.println("Introduzca un número entero: ");
			int numero;
			try {
				numero = entrada.nextInt();
				entrada.nextLine();
				int resultado = numero * numero;
				System.out.println("El cuadrado del número introducido es: " + resultado);

				int[] numeros = {23, 24, 25, 26, 27};

				System.out.println("Introduce la posición que quieras (1-5): ");
				int posicion = entrada.nextInt();

				System.out.println(numeros[posicion - 1]);
				
				encontrado = false;


			} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e);
				entrada.nextLine(); // Si no se limpia el buffer se creará un bucle infinito
			}
		} while (encontrado);

	}

}
