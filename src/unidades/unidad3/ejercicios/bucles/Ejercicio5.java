package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 Escribir un programa que indique cuántas cifras tiene un número entero introducido
	 por teclado, que estará comprendido entre 0 y 99999.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduzca un número (entre 0 y 99999): ");
			numero = entrada.nextInt();
			
			if(numero < 0 || numero > 99999) {
				System.out.println("Número fuera de rango. Vuelva a intentarlo");
			}else {
				int cifras = contarCifras(numero);
				System.out.println("El número proporcionado tiene " + cifras + " cifras");
			}
		}while(numero < 0 || numero > 99999);	
		
	}

	private static int contarCifras(int numero) {
		return String.valueOf(numero).length();
	}

}
		
		/*
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca un número (entre 0 y 99999): ");
		numero = entrada.nextInt();
		
		if(numero >= 1 && numero <=9) {
			System.out.println("El número proporcionado tiene una cifra");
		}else if(numero >= 10 && numero <= 99) {
			System.out.println("El número proporcionado tiene dos cifra");		
		}else if(numero >= 100 && numero <= 999) {
			System.out.println("El número proporcionado tiene tres cifra");	
		}else if(numero >= 1000 && numero <= 9999) {
			System.out.println("El número proporcionado tiene cuatro cifra");	
		}else if(numero >= 10000 && numero <= 99999) {
			System.out.println("El número proporcionado tiene cinco cifra");	
		} else {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 99999.");
        }

        entrada.close();
		*/
	
