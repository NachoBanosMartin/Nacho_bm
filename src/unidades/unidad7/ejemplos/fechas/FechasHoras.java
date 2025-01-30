package unidades.unidad7.ejemplos.fechas;

import java.util.Calendar;
import java.util.Date;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasHoras {

	public static void main(String[] args) {
		/*
		Fecha fecha = new Fecha (30, 1, 2015);
		Hora horaActual = new Hora (8, 45, 0, 0);
		*/
		
		// Hasta java 8.0. No se suelen usar en proyectos nuevos
		Date fecha = new Date();
		Calendar calendario = Calendar.getInstance();
		
		// Fecha hoy.
		LocalDate fechaHoy = LocalDate.now();
		
		System.out.println("Fecha hoy: " + fechaHoy);
				
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Fecha de hoy ya formateada: " + fechaHoy.format(formatoFecha));
		
		// Fecha usuario
		LocalDate fechaUsuario = LocalDate.of(2025, 1, 8);

		System.out.println("Fecha usuario: " + fechaUsuario);
		System.out.println("Fecha usuario: " + fechaUsuario.format(formatoFecha));

		// Fecha usuario
		/*
			LocalDate fechaUsuario = LocalDate.of(2025, Month.JANUARY, 8);

			System.out.println("Fecha usuario: " + fechaUsuario);
			System.out.println("Fecha usuario: " + fechaUsuario.format(formato));
		*/
		
		// Horas
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora Actual: " + horaActual);
		
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("Hora Actual: " + horaActual.format(formatoHora));
		
		LocalTime horaUsuario = LocalTime.of(12, 45);
		System.out.println("Hora Actual: " + horaUsuario.format(formatoHora));

		//Fechas y Horas
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println("Fecha y hora actual: " + fechaHora);

		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
		System.out.println("Fecha y hora actual: " + fechaHora.format(formatoFechaHora));
		
		LocalDateTime fechaHoraUsuario = LocalDateTime.of(fechaUsuario, horaUsuario);
		System.out.println("Fecha y hora usuario: " + fechaHoraUsuario.format(formatoFechaHora));

		
		// Sumar dias a una fecha
		
		System.out.println("------OPERACIONES CON FECHAS-------");
		LocalDate fechaNueva = fechaHoy.plusDays(7);
		System.out.println("Fecha hoy: " + fechaNueva.format(formatoFecha));
		
		LocalDate fechaAntes = fechaHoy.minusMonths(2);
		System.out.println("Fecha hoy: " + fechaAntes.format(formatoFecha));
		
		if (fechaHoy.isBefore(fechaAntes)) {
			System.out.println("La fecha es anterior");
		}else {
			System.out.println("La fecha es posterior");
		}
		
		if (fechaHoy.isAfter(fechaAntes)) {
			System.out.println("La fecha es posterior");
		}else {
			System.out.println("La fecha es anterior");
		}
		
		//Calcular diferencia entre fechas
		long diferenciasDias = ChronoUnit.DAYS.between(fechaAntes, fechaNueva);
		System.out.println("Dias entre las fechas: " + diferenciasDias);
		
		// Calcular la diferencia entre horas
		long diferenciasHoras = ChronoUnit.HOURS.between(horaActual, horaUsuario);
		System.out.println("Horas entre las fechas: " + diferenciasHoras);
		
		// Calcular la diferencia entre minutos
		long diferenciasMinutos = ChronoUnit.MINUTES.between(horaActual, horaUsuario);
		System.out.println("Horas entre las fechas: " + diferenciasMinutos);
		
		
		Duration duracion = Duration.between(horaActual, horaUsuario);
		System.out.println("Duración entre tiempos: " + duracion);
		System.out.println("Horas entre tiempos: " + duracion.toHours());
		System.out.println("Minutos entre tiempos: " + duracion.toMinutes());

		// Convertir duración a varias unidades
		Duration duracionUsuario = Duration.ofMinutes(125);
		System.out.println("Horas: " + duracionUsuario.toHours());
		System.out.println("Segundos: " + duracionUsuario.toSeconds());
		System.out.println("Milisegundos: " + duracionUsuario.toMillis());
		System.out.println("Nanosegundos: " + duracionUsuario.toNanos());

		
		Instant inicio = Instant.now();
		// Operación que queremos medir su rendimiento
		for(int i = 0; i < 1_000_000; i++) {
			Math.sqrt(i);
		}
		Instant fin = Instant.now();		
		Duration  duracionOperacion = Duration.between(inicio, fin);
		
		System.out.println("Tiempo de ejecución: " + duracionOperacion.toMillis());
	}

}
