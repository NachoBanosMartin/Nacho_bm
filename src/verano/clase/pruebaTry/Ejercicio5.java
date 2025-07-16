package verano.clase.pruebaTry;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String palabra = "Perico";
		
		try {
			
			System.out.println(palabra.length());
			
		} catch (NullPointerException e) {
			System.out.println("Palabra inválida.");
		}
		
	}

}
