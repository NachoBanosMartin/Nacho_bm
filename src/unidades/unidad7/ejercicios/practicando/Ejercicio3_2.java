package unidades.unidad7.ejercicios.practicando;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio3_2 {
	
	// Realice un programa en Java que muestre pon pantalla la hora actual en formato HH:MM:SS.

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();
		System.out.println("Hora actal: " + hora);
		DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora actual formateada: " + hora.format(horaFormateada));


	}

}
