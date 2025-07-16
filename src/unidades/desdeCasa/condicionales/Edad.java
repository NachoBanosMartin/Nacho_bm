package unidades.desdeCasa.condicionales;

import java.util.Scanner;

public class Edad {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		/* int edad;
		do {
			System.out.println("Indique su edad para registrarse: ");
			edad = entrada.nextInt();			
		} while (edad <= 18 || edad >= 65);
		
		if (edad >= 18 || edad <= 65) {
			System.out.println("Se ha registrado correctamente");
		}else {
			System.out.println("Su edad está fuera del rango permitido para registrarse");
		}
		
		
		
		
		int numero;
		do {
		    System.out.println("Introduce un número de 6 dígitos: ");
		    numero = entrada.nextInt();
		    if (numero < 100000 || numero > 999999) {
		        System.out.println("Número de cuenta inválido. Intenta de nuevo.");
		    }
		} while (numero < 100000 || numero > 999999);

		System.out.println("Número de cuenta válido");
		
		*/
		
		double temperatura;
		do {
			System.out.println("Intoduzca la temperatura corporal: ");
			temperatura = entrada.nextDouble();
			
			if (temperatura < 36.1 || temperatura > 37.2) {
				System.out.println("La temperatura indica fiebre o hipotermia");
			}
			
		} while (temperatura < 36.1 || temperatura > 37.2);
		
		System.out.println("Temperatura normal");
		

		

	}

}
