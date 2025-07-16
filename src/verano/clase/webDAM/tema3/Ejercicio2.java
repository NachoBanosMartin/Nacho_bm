package verano.clase.webDAM.tema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
	
	// Pedir dos números y mostrarlos ordenados de forma decreciente.

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Double> numeros = new ArrayList<>();

		System.out.println("Introduce el primer número: ");
		double numero1 = entrada.nextDouble();
		numeros.add(numero1);
		entrada.nextLine();
		System.out.println("Introduce el segundo número: ");
		double numero2 = entrada.nextDouble();
		numeros.add(numero2);
		
		Collections.sort(numeros, Collections.reverseOrder());
		
		for (double numero : numeros) {
			System.out.println(numero);
		}
		
		
	}
	

}
