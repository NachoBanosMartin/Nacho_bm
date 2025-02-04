package unidades.unidad7.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 Realiza un programa en Java que pida el número de meses que se desea sumar a la fecha actual. 
	 Hay que tener en cuenta lo valores válidos para la entada de datos.
	*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Indique cuantos meses desea sumar a la fecha actual: ");
		
		// Valida la entrada del usuario (entran números enteros, tanto negativos como positivos)
		
		 while (!entrada.hasNextInt()) { 
	            System.out.println("Por favor, ingrese un número válido.");
	            entrada.next(); 
	     }
	        
		int cantidadMeses = entrada.nextInt();
		
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNueva = fechaActual.plusMonths(cantidadMeses);
		System.out.println("Fecha actual pero sumando los meses que quiere el usuario: " + fechaNueva.format(formatoFecha));

		
	}

}
