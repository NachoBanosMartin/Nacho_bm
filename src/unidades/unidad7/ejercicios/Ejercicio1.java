package unidades.unidad7.ejercicios;

import java.util.Random;

public class Ejercicio1 {
	
	// Escriba un programa Java generar un número aleatorio entre 1 y 10.

	public static void main(String[] args) {
		  // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 10
        int numero = random.nextInt(10) + 1;

        // Convertir el número a una cadena
        String numeroEnCadena = String.valueOf(numero);

        // Imprimir el número como cadena
        System.out.println("El número generado como cadena es: " + numeroEnCadena);
    }


	}


