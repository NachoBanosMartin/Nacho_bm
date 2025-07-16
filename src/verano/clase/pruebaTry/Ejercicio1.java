package verano.clase.pruebaTry;

import java.util.Scanner;

public class Ejercicio1 {

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		
		try {
			
			System.out.println("Escribe una palabra para pasarlo a entero: ");
			String palabra = entrada.next();
		
			int palabraModificada = Integer.parseInt(palabra);
			
			System.out.println(palabraModificada);
			
		} catch (NumberFormatException e) {
			
			System.out.println("Formato incorrecto.");
		}
		
		System.out.println("Muy bien");
		
		
	}

}
