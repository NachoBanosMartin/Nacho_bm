package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*
	 Codificar un programa que solicite al usuario un número e indique si es par o impar.
	*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un numero: ");
		numero = entrada.nextInt();
		
		
		// Determinar si el número es positivo o negativo
		
		if(numero >= 0) {
			System.out.println("El número " + numero + " es positivo");
		}else {
			System.out.println("El número " + numero + " es negativo");
		}
		
		// Determinar si el número es par o impar
		
		if(numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
		
		entrada.close();
		
	}

}
