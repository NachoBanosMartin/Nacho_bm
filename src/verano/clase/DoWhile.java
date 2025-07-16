package verano.clase;

import java.util.Scanner;

public class DoWhile {

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		String palabra;
		do {
			
			System.out.println("Escribe abracadabra: ");
			palabra = entrada.next();
			
		} while (!palabra.equals("abracadabra"));   // Hay que negarlo

		System.out.println("Muy bien");
	}

}
