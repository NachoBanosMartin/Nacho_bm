package verano.clase.pruebaTry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioCasa3 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Introduzca un número entero: ");
			int valor = entrada.nextInt();
			System.out.println("Valor introducido: " + valor);
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido incorrecto");
		}

	}

}
