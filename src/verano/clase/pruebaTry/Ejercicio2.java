package verano.clase.pruebaTry;

import java.util.Scanner;

public class Ejercicio2 {
	
	
	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		
		try {
			
			System.out.println("Introduca el primer número: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Introduzca el segundo número: ");
			int numero2 = entrada.nextInt();
			
			double resultado = numero1 / numero2;
			System.out.println("El resultado es: " + resultado);
			
		} catch (ArithmeticException e) {
			System.out.println("Error al dividir.");
		}
	}

}
