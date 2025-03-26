package unidades.unidad7.ejercicios.practicando;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio11_2 {
	
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
		int id;
		int eleccion;
		
		LocalDateTime horaEntrada = null;
		LocalDateTime horaSalida = null;
		
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		
		
		System.out.println("Indique su id: ");
		id = entrada.nextInt();
		
		do {
		
		System.out.println("Empleado " + id + " ,indique qué operación desea realizar: ");
		System.out.println("1. Registrar entrada");
		System.out.println("2. Registrar salida");
		System.out.println("3. Salir");
		System.out.println("Elija una opción");
		eleccion = entrada.nextInt();
		
		switch(eleccion){
			case 1:
				if(horaEntrada == null) {
					horaEntrada = LocalDateTime.now();
					System.out.println("El empleado " + id + " ha registrado su entrada "
							+ "a las " + horaEntrada.format(formatoHora));
				}else {
					System.out.println("Ya has registrado tu entrada");
				}
			break;
			
			case 2: 
				if(horaEntrada == null) {
					System.out.println("No puedes registrar la salida sin haber registrado"
							+ " antes la entrada.");
				}else if (horaSalida != null){
					System.out.println("Ya has registrado tu salida a las " 
							+ horaSalida.format(formatoHora));

				}else {
					horaSalida = LocalDateTime.now();
					System.out.println("El empleado " + id + " ha registrado su salida a "
							+ "las " + horaSalida.format(formatoHora));
					
					Duration duracion = Duration.between(horaEntrada, horaSalida);
					long horas = duracion.toHours();
					long minutos = duracion.toMinutesPart();
					
					
					System.out.println("El empleado " + id + " ha registrado su entrada "
							+ "a las " + horaEntrada);
					System.out.println("El empleado " + id+ " ha registrado su salida "
							+ "a las " + horaSalida);
					System.out.println("Tiempo total trabajado: " + horas + " horas "
							+ "y " + minutos + " minutos.");
				}
			break;
			
			case 3:
				System.out.println("Saliendo del sistema...");
			break;
			
			default:
				System.out.println("Opción no válida. Intentelo de nuevo");
				
		}
		
		}while(eleccion != 3);
		
		entrada.close();
		
		
	}

}


















