package unidades.unidad7.ejercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio5 {
	
	// Escriba un programa en Java que muestre por pantalla el mensaje de “Son las hh horas y mm minutos”.

	public static void main(String[] args) {
		
		LocalTime horaActual = LocalTime.now();
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH");
		DateTimeFormatter formatoMinutos = DateTimeFormatter.ofPattern("mm");
		
		String horas = horaActual.format(formatoHora);
	    String minutos = horaActual.format(formatoMinutos);

        System.out.println("Son las " + horas + " horas y " + minutos + " minutos");

	}

}
