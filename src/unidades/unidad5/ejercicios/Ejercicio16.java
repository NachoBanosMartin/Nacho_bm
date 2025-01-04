package unidades.unidad5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
	
	/*
	 Implemente una aplicación que permita registrar un arreglo unidimensional básico de 6 elementos numéricos enteros y que
	 al final determine la suma, el promedio, la longitud y el mayor elemento registrado en el arreglo. Adicionalmente 
	 implemente un método que permita ordenar los elementos del arreglo en forma ascendente.
	*/
	
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int [] numeros = registrarNumeros();
		int suma = sumaArray(numeros);
		int mayor = mayorElemento(numeros);
		double media = mediaArray(suma, numeros.length);
		
		mostrarResultados(numeros, suma, media, mayor);
		ordenarArray(numeros);
		mostrarArrayDefinitivo(numeros);
	}

	static int[] registrarNumeros() {           // Método para registrar los números

		int [] numeros = new int [6];
		System.out.println("Ingrese 6 números enteros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + (i +1) + ": ");
			numeros[i] = entrada.nextInt();
		}
		return numeros;
	}
	
	static int sumaArray(int [] numeros) {          // Método para calcular la suma de los elementos del arreglo

		int suma = 0;
				
		for (int i = 0; i < numeros.length; i ++) {
        	suma += numeros[i];
        }
		return suma;
	}
	
	static int mayorElemento(int[] numeros) {            // Método para encontrar el mayor valor del arreglo
		int mayor = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}
	
	static double mediaArray(int suma, int longitud) {         // Método para calcular la media
		return (double) suma / longitud;
	}
	
	static void mostrarResultados(int[] numeros, int suma, double media, int mayor) {          // Método para mostrar los resultados
		System.out.println("-----Resultados-----");
		System.out.println("Suma: " + suma);
		System.out.println("Elemento mayor: " + mayor);
		System.out.println("Media: " + media);
		System.out.println("Tamaño del array: " + numeros.length);
	}
	
	static void ordenarArray(int[] numeros) {          // Método para ordenar el arreglo
		Arrays.sort(numeros);
	}
	
	static void mostrarArrayDefinitivo(int[] numeros) {                         // Método para mostrar el arreglo ordenado
		System.out.println("Array ordenado: " + Arrays.toString(numeros));
		
	}


}
