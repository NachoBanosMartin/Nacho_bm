package unidades.unidad7.ejercicios.practicando;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio4_2 {
	
	// Realice un programa en Java que muestre por pantalla la fecha actual en formato dd-mm-aaaa.

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();
		
		DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("La fecha de hoy es: " + fechaFormateada.format(fecha));
	}

}
