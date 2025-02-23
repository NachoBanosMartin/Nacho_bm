package unidades.unidad7.ejercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio11 {
	
	/*
	 Crea un sistema de registro de entrada y salida para empleados.
	 

     	- Un empleado puede registrar su entrada con la fecha y hora actual.
	
		- También puede registrar su salida.
	
		- Calcula el tiempo total trabajado en el día.
	
		- Usa LocalDateTime y Duration.
		
	
	Ejemplo de interacción:
	
		Empleado 1234 ha registrado su entrada a las 08:15:00.
		
		Empleado 1234 ha registrado su salida a las 17:45:00.
		
		Tiempo total trabajado: 9 horas y 30 minutos.
		
	*/

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
		
		
		System.out.println("El empleado " + idEmpleado + " ha registrado su entrada a las " + entradaUsuario);
		System.out.println("El empleado " + idEmpleado + " ha registrado su salida a las " + salidaUsuario);
		System.out.println("Tiempo total trabajado: " + horas + " horas y " + minutos + " minutos.");
		}
		
	}
	

