package verano.clase.webDAM.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Realizar un programa que lea por teclado dos números, si el primero es mayor
	 * al segundo realizar la suma de ambos, en caso contrario realizar el producto
	 * del primero respecto al segundo.
	 */

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			System.out.println("Introduce el primer número: ");
			double numero1 = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Introduce el segundo número: ");
			double numero2 = entrada.nextDouble();

			if (numero1 > numero2) {
				double suma = numero1 + numero2;
				System.out.println("La suma de ambos números es: " + suma);
			} else {
				double multiplicacion = numero1 * numero2;
				System.out.println("El producto del primero respecto al segundo es: " + multiplicacion);
			}
		} catch (InputMismatchException e) {
			System.out.println("Introduce un número valido");
		}

		
	}

}
