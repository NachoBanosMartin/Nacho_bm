package unidades.unidad3.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

	public static void main(String[] args) {
		
		final int LIMITE_INFERIOR =1;
		final int LIMITE_SUPERIOR= 100;
		final int INTENTOS_PERMITIDOS= 5;
		Scanner entrada = new Scanner (System.in);
		Random numeroAleatorio = new Random();
		int numero = numeroAleatorio.nextInt(100);
		int eleccion = 0;
		int numIntentos = 0;
		
		do {
			
		System.out.println("Introduzca un número entre " + (LIMITE_INFERIOR +1) + "y el " + (LIMITE_SUPERIOR -1));
		eleccion = entrada.nextInt();
		
			// es valido el dato
			if (eleccion < 1 || eleccion > 100){
				System.out.println("El número no es válido, se encuentra fuera de rango");
			}
			else {
				if (numero > eleccion) {
					System.out.println("El número buscado es mayor");
				}
				else if (numero < eleccion){
					System.out.println("El número buscado es menor");
				}
				else {
					System.out.println("El número es correcto");
					System.out.println("Felicidades, has adivinado el número");
				}
			}
			
			numIntentos ++;
		
						
		}while (numIntentos < INTENTOS_PERMITIDOS && eleccion != numero);
		
		System.out.println("Intentos " + numIntentos);
		
		entrada.close();
	}

}
