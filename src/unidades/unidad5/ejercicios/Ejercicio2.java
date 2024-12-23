package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	// Escriba un programa Java para probar si una matriz contiene un valor específico.

	public static void main(String[] args) {
		
		int [] números = {10,23,4,5,72,33,9,11,2,17};
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el valor que desea encontrar: ");
		int valorBuscado = entrada.nextInt();
		
		boolean encontrado = false;
		
		for (int número : números) {
			if (número == valorBuscado) {
				encontrado = true;
				break;
			}
		}
		
		if (encontrado) {
			System.out.println("El valor " + valorBuscado + " se encuentra en la array.");
		} else {
			System.out.println("El valor " + valorBuscado + " no se encuentra en la array.");
		}
		
		entrada.close();
	}

}
