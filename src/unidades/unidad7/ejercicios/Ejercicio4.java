package unidades.unidad7.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 {
	
	//  Realice un programa en Java que muestre por pantalla la fecha actual en formato dd-mm-aaaa.

	public static void main(String[] args) {

		LocalDate fechaHoy = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		System.out.println("Fecha de hoy ya formateada: " + fechaHoy.format(formatoFecha));
		
	}

}
