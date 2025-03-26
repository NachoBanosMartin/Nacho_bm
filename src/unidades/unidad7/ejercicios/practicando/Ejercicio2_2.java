package unidades.unidad7.ejercicios.practicando;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2_2 {
	
	 /*
	 Escriba un programa Java que pida por consola dos números, compruebe que
	 son positivos y que son menores de 100. Genere un número aleatorio comprendido
	 entre los dos números introducidos.
	 */
	

	public static void main(String[] args) {
		
		
		pedirNumeros();
		

	}

	private static void pedirNumeros() {
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		int numero1;
		int numero2;

		do {
			System.out.println("Introduzca el primer número positivo y menor de 100: ");
			numero1 = entrada.nextInt();
		}while(numero1 <= 0 || numero1 >= 100);
		
		do {
			System.out.println("Introduzca el segundo número positivo y menor de 100: ");
			numero2 = entrada.nextInt();
		}while(numero2 <= 0 || numero2 >= 100);	
		
		Random random = new Random();
        int numeroAleatorio = random.nextInt(numero2 - numero1 + 1) + numero1;

        System.out.println("Número aleatorio generado entre " + numero1 + " y " + numero2 + ": " + numeroAleatorio);
        
        entrada.close();
		
		
		
	}
	
	

}
