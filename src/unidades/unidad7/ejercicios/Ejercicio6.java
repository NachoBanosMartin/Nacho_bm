package unidades.unidad7.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio6 {
	
	// Realiza un programa que sume 4 meses a la fecha actual y muestra por pantalla la fecha resultante.

	public static void main(String[] args) {
				
		// Fecha actual default
		
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha actual: " + fechaActual);
		
		// Fecha actual pero empezando por dias y sustituyendo los guiones por barras
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha actual con formato: " + formatoFecha.format(fechaActual));
		
		// Fecha actual pero sumando 4 meses
		
		LocalDate fechaNueva = fechaActual.plusMonths(4);
		System.out.println("Fecha actual pero sumando 4 meses: " + fechaNueva.format(formatoFecha));

		

	}

}
