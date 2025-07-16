package verano.clase.pruebaTry;

import java.util.Scanner;

public class Ejercicio4 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = { 23, 24, 25, 26, 27 };
		
		try {
			System.out.println("Introduce la posición que quieras (1-5): ");
			int posicion = entrada.nextInt();

			System.out.println(numeros[posicion - 1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posición introducida inválida.");
		}

		
	}

}
