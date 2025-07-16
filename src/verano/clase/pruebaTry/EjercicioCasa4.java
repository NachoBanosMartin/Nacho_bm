package verano.clase.pruebaTry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class EjercicioCasa4 {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			
			int dia = pedirDiaNacimiento();
			int mes = pedirMesNacimiento();
			int anio = pedirAnoNacimiento();
			
			String mesFormateado = String.format("%02d", mes);
			String diaFormateado = String.format("%02d", dia);			
			
			int edad = calcularEdad(dia, mes, anio);
            System.out.println("Tienes " + edad + " años.");
            
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	private static int pedirDiaNacimiento() {
		System.out.println("Introduzca el día de nacimiento: ");
		int dia = entrada.nextInt();
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("Día de nacimiento inválido.");
		}
		return dia;
	}

	private static int pedirMesNacimiento() {

		System.out.println("Introduzca el mes de nacimiento: ");
		int mes = entrada.nextInt();
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Mes de nacimiento inválido.");
		}
		return mes;

	}

	private static int pedirAnoNacimiento() {

		System.out.println("Introduzca el año de nacimiento: ");
		int anio = entrada.nextInt();
		if (anio < 1900 || anio > 2025) {
			throw new IllegalArgumentException("Año de nacimiento inválido.");
		}
		return anio;

	}

	private static int calcularEdad(int dia, int mes, int anio) {
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, hoy);
		return periodo.getYears();
	}

}
