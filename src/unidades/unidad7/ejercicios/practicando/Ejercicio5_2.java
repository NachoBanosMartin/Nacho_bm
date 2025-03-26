package unidades.unidad7.ejercicios.practicando;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio5_2 {
	
	// Escriba un programa en Java que muestre por pantalla el mensaje de “Son las hh horas y mm minutos”.

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();
		
		DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter minutosFormateados = DateTimeFormatter.ofPattern("mm");
		
		String horas = hora.format(horaFormateada);
		String minutos = hora.format(minutosFormateados);
		
		System.out.println("Son las " + horas + " horas y " + minutos + " minutos");
		
		
	}

}
