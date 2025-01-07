package unidades.unidad5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
	
	/*
	 Implemente una aplicación que permita registrar un arreglo unidimensional básico de 6 elementos
	 numéricos enteros y que al final determine la suma, el promedio, la longitud y el mayor elemento
	 registrado en el arreglo. Adicionalmente, implemente un método que permita ordenar los elementos 
	 del arreglo en forma ascendente. Debe implementar la clase ArregloUnidimensional que permita controlar
	 todos los métodos de la aplicación. Considere los siguientes aspectos: 	

			- Crear un arreglo para los números dentro de la clase arregloNumeros. 		
			
			- Implemente los siguientes métodos dentro de la clase arregloNumeros:
			
			- El método constructor se encargará de crear el arreglo numérico de 6 números e inicializar los
			  valores del arreglo con los siguientes números: 10, 20, 70, 30, 80 y 15. 		
			
			- El método tamaño devuelve el número de elementos registrados en el arreglo. 
			
			- El método ordenaAscendente se encarga de ordenar los números registrados en el arreglo en 
			  forma ascendente.
			
			- El método determinaMayor se encarga de obtener el mayor elemento del arreglo. 
			
			- El método calculaPromedio se encarga de promediar los números del arreglo. 		
			
			- El método calculaSuma se encarga de sumar todos los elementos del arreglo. 		
			
			- El método devuelveValor se encarga de devolver el elemento contenido en el arreglo de uno en uno.
	 */

	static Scanner entrada = new Scanner (System.in);
	static int [] numeros;
	static int suma = 0;
	public static void main(String[] args) {
		
		crearArray();
		tamañoArray();
		ordenarAscendente(numeros);	
		determinarMayor(numeros);
		calcularSuma(numeros);
		calcularPromedio(numeros);
		devuelveValor(numeros);
	

	}
	


	



	static void crearArray() {             // Método para crear un array
		
	    numeros = new int[] {10, 20, 70, 30, 80, 15};
		
	}
	
	static void tamañoArray() {		        //Método para mostrar el array creado
		
		System.out.print("La array creada es: [");
		for (int i = 0; i < numeros.length; i ++) {
			System.out.print(numeros[i]);
			if (i < numeros.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}
	
	static void ordenarAscendente(int [] numeros) {   // Método para ordenar el array creado pero de forma ascendente
		
		Arrays.sort(numeros);
		System.out.print("Array ascendente: [");
	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print(numeros[i]);
	        if (i < numeros.length - 1) {
	            System.out.print(", ");  
	        }
	    }
	    System.out.println("]");
		
	}
	
	static void determinarMayor(int[] numeros) {         // Método para encontrar el mayor elemento de la array
		int mayor = numeros [0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		System.out.println("El mayor elemento de la array es: " + mayor);
		
	}
	
	static void calcularSuma(int[] numeros) {       // Método para calcular la suma de la array
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println("La suma de los elementos de la array es: " + suma);
		
	}
	
	static void calcularPromedio(int[] numeros) {       //Método para calcular la media de la array
		double media = (double) suma / numeros.length;
		System.out.println("La media de los elementos de la array es: " + media);
		
	}
	
	static void devuelveValor(int[] numeros) {        // Método para mostrar los elementos del array 1 por 1
		System.out.println("Elementos del array uno por uno: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
		}
			
	}

}
