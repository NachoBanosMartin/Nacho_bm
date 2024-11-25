package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	
	/* Escribe un método llamado cuadrado que acepte un argumento entero y devuelva el cuadrado de ese argumento. */

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca un número entero para calcular el cuadrado: ");
		int numero = entrada.nextInt();
		
		int resultado = cuadrado(numero);
		
		System.out.println("El cuadrado de " +numero+ " es: " +resultado);
		
		entrada.close();
		
	}

	static int cuadrado (int numero) {
		return numero * numero ;
	}

}
