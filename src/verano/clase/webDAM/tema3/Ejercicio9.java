package verano.clase.webDAM.tema3;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio9 {

	/*
	 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
	 * mostrar un mensaje "Promociona".
	 */
	
	public static final Scanner entrada = new Scanner(System.in);
	private static final int NUM_INTENTOS = 3;

	public static void main(String[] args) {
		
		double suma = 0; 
		
		for (int i = 1; i <= NUM_INTENTOS; i++) {
			System.out.println("Introduce la nota " + i + ": ");
			double nota = entrada.nextDouble();
			suma += nota;
		}
		
		double promedio = suma / NUM_INTENTOS;
		
		if (promedio > 7) {
			System.out.println("Promociona");
		}else {
			System.out.println("No promociona");
		}
		
		
		
		
		
		

	}

}
