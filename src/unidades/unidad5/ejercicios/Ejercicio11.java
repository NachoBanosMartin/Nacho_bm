package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int N = pedirValor ("Introduce el primer valor entero (N): ");
		int M = pedirValor ("Introduce el segundo valor entero (M): ");
		
		int[] array = crearArray(N, M);
		
		mostrarArray(array);

	}

	static int pedirValor(String mensaje) {  // Metodo para pedir un valor entero al usuario
		System.out.println(mensaje);
		return entrada.nextInt();
	}
	
	static int[] crearArray(int N, int M) {  // Metodo para crear el array y llenarlo con el valor M
		int [] array = new int [N];
		for (int i = 0; i < N; i ++) {
			array[i] = M;
		}
		
		return array;
	}
	
	private static void mostrarArray(int[] array) {  // Metodo para mostrar el array por pantalla
		System.out.print("La array creada es: [");
		for (int i = 0; i < array.length; i ++) {
		System.out.print(array[i]);
		if (i < array.length - 1) {
			System.out.print(", ");
		}
		
	}
	System.out.print("]");

	}

}
