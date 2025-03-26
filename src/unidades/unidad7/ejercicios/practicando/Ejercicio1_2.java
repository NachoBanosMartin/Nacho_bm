package unidades.unidad7.ejercicios.practicando;

import java.util.Random;

public class Ejercicio1_2 {
	
	// Escriba un programa Java generar un número aleatorio entre 1 y 10.


	public static void main(String[] args) {

		Random aleatorio = new Random();
		
		int numero = aleatorio.nextInt(10) + 1;
		
		String numeroCadena = String.valueOf(numero);
		
		System.out.println("El número aleatorio generado es: " + numeroCadena);
	}

}
