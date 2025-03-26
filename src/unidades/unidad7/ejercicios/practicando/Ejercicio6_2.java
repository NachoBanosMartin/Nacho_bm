package unidades.unidad7.ejercicios.practicando;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio6_2 {
	
	// Realiza un programa que sume 4 meses a la fecha actual y muestra por pantalla la fecha resultante.

	public static void main(String[] args) {

		LocalDate fechaActual = LocalDate.now();
		
		DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("La fecha de hoy es: " + fechaFormateada.format(fechaActual));
		
		LocalDate fechaModificada = fechaActual.plusMonths(4);
		
		DateTimeFormatter fechaFormateada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Dentro de 4 meses la fecha será: " + fechaFormateada.format(fechaModificada));
	}

}
