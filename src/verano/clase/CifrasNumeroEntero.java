package verano.clase;

import java.util.Scanner;

public class CifrasNumeroEntero {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {		

		int numero;
		
		do {
			
			System.out.println("Introduce un número para saber sus cifras: ");
			numero = entrada.nextInt();
			
		} while(numero <= 0 || numero >= 99999);
		
		int aux = 0;
		
		while (numero > 0) {
			numero = numero / 10;
			aux ++;
		}
		
		System.out.println(aux);

	}

}
