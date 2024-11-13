package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Escribe un método Java para calcular la media de tres números.

		
		Scanner scanner = new Scanner(System.in);
		
		mostrarMensaje("Introduce el primer número entero: ");
		int numero1 = leerEntero();
		mostrarMensaje("Introduce el segundo número entero: ");
		int numero2 = leerEntero();
		mostrarMensaje("Introduce el tercer número entero: ");
		int numero3 = leerEntero();
		
		double media= (numero1 + numero2 + numero3) / 3.0;
		
		mostrarMensaje("La media de los números introducidos es: " + media);

		scanner.close();
		
		
	}
	
	static int leerEntero() {
		
		Scanner scanner = new Scanner(System.in);		
		int numero = scanner.nextInt();		
		return numero;
				
	}

	static void mostrarMensaje (String mensaje) {
		
		System.out.println(mensaje);
	}
	



}
