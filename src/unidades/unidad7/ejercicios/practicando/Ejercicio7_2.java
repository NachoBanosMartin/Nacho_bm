package unidades.unidad7.ejercicios.practicando;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7_2 {
	
	/*
	  Realiza un programa en Java que pida el número de meses que se desea sumar a
	  la fecha actual. Hay que tener en cuenta lo valores válidos para la entada de datos.
	*/

	public static void main(String[] args) {
		
		

		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Indique el número de meses que desee sumar a la fecha actual: ");
		
		while (!entrada.hasNextInt()) { 
		    System.out.println("Por favor, ingrese un número válido.");
		    entrada.next(); 
		}
		
		numero = entrada.nextInt();	
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaSumada = fechaActual.plusMonths(numero);
		DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("La fecha final será: " + fechaFormateada.format(fechaSumada));
		
		
	}

}
