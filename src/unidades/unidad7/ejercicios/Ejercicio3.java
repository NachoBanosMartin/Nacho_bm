package unidades.unidad7.ejercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {
	
	// Realice un programa en Java que muestre pon pantalla la hora actual en formato HH:MM:SS.

	public static void main(String[] args) {

		LocalTime horaActual = LocalTime.now();
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora Actual: " + horaActual.format(formatoHora));
	}

}
