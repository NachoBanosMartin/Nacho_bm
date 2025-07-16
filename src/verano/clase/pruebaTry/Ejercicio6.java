package verano.clase.pruebaTry;

import java.util.Scanner;

public class Ejercicio6 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		boolean encontrado = true;

		do {
			try {

				System.out.println("Escribe una palabra para pasarla a entero: ");
				String palabra = entrada.next();
				entrada.nextLine();
				System.out.println("Escribe otra palabra para pasarla a entero: ");
				String palabra2 = entrada.next();

				int palabraModificada = Integer.parseInt(palabra);
				int palabraModificada2 = Integer.parseInt(palabra2);

				double resultado = palabraModificada / palabraModificada2;
				System.out.println("El resultado es: " + resultado);
				encontrado = false;

			} catch (NumberFormatException e) {
				System.out.println("Formato incorrecto.");
			} catch (ArithmeticException e) {
				System.out.println("Error al dividir.");
			}

		} while (encontrado);

	}

}
