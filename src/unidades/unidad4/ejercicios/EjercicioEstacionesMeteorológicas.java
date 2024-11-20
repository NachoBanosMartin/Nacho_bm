package unidades.unidad4.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjercicioEstacionesMeteorológicas {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int numEstacionesMet = 0;
		int mesAnio;
		int estacion;
		
		numEstacionesMet = pedirNumeroEstacionMet();
		
		for (int i = 1; i <= 4; i++) {
			mesAnio = pedirNumeroMes(i);
			estacion = obtenerEstacionAnio(mesAnio);
			obtenerCantidadPrecipitacionesPorEstacion(estacion);
		}
		
		entrada.close();
	}
	
	static void obtenerCantidadPrecipitacionesPorEstacion(int estacion) {
		Random aleatorio = new Random();
		int cantidad = 0;
		
		switch(estacion) {
			case 1:  // PRIMAVERA
				cantidad = aleatorio.nextInt(60 - 10 + 1) + 10;
				break;
			case 2: // VERANO
				cantidad = aleatorio.nextInt(10 - 1 + 1) + 10;
				break;
			case 3: // OTOÑO
				cantidad = aleatorio.nextInt(75 - 15 + 1) + 10;
				break;
			case 4: // INVIERNO
				cantidad = aleatorio.nextInt(100 - 20 + 1) + 10;
				break;
		}
		
		System.out.println("Cantidad de precipitaciones: " + cantidad);
	}

	static int obtenerEstacionAnio(int mes) {
		int estacion = 0;
		
		switch (mes) {
			case 12, 1, 2:
				System.out.println("Invierno");
				estacion = 4;
				break;
			case 3, 4, 5:
				System.out.println("Primavera");
				estacion = 1;
				break;
			case 6, 7, 8:
				System.out.println("Verano");
				estacion = 2;
				break;
			case 9, 10, 11:
				System.out.println("Otoño");
				estacion = 3;
				break;
			default:
				System.out.println("No es una opción válida");
		}
		
		return estacion;
	}

	static int pedirNumeroEstacionMet() {
		System.out.println("¿Cuántas estaciones pluviométricas hay?: ");
		int numEstaciones = entrada.nextInt();
		return numEstaciones;
	}
	
	static int pedirNumeroMes(int numMes) {
		System.out.println("Introduce el mes " + numMes + " para calcular la media: ");
		int mesAnio = entrada.nextInt();
		return mesAnio;
	}
}