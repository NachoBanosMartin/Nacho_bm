package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*
	 Pedir dos números y mostrarlos ordenados de forma decreciente.
	*/

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Introduzca el primer número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		numero2 = entrada.nextInt();
		
		
		if(numero1 > numero2) {
			System.out.println("Estos números ordenados de forma decreciente serian: " + numero2 + ", "+ numero1);
		}else {
			System.out.println("Estos números ordenados de forma decreciente serian: " + numero1 + ", "+ numero2);
		}
			
	}
	
	

}
