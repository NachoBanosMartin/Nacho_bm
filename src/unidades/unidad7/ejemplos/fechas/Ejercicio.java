package unidades.unidad7.ejemplos.fechas;
	
	/*
	 Crea un sistema de registros de entrada y salida de empleados
	 	- Un empleado puede registrar su entrada con la fecha y la hora actual
	 	- Tambien puede registrar su salida
	 	- Calcula el tiempo total trabajado
	 	- Usa LocalDateTime y Duration
	*/

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio {
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		
		System.out.println("----Marque la opción deseada----");
		System.out.println("1. Calcular horas trabajadas");
		System.out.println("2. Salir");
		int eleccion = entrada.nextInt();

		

		System.out.println("Indique su ID de empleado: ");
		int idEmpleado = entrada.nextInt();
		entrada.nextLine(); 

		System.out.println("Ingrese la fecha y hora de entrada (yyyy-MM-dd HH:mm): ");
		String entradaUsuario = entrada.nextLine();
		LocalDateTime horaEntrada = LocalDateTime.parse(entradaUsuario, formatoHora);

		System.out.println("Ingrese la fecha y hora de salida (yyyy-MM-dd HH:mm): ");
		String salidaUsuario = entrada.nextLine();
		LocalDateTime horaSalida = LocalDateTime.parse(salidaUsuario, formatoHora);

		// Calcular el tiempo trabajado
		Duration duracion = Duration.between(horaEntrada, horaSalida);
		long horas = duracion.toHours();
		long minutos = duracion.toMinutesPart();

		System.out.println("El empleado " + idEmpleado + "ha trabajado" + horas + " horas y " + minutos + " minutos.");
		}
		
	}
	
