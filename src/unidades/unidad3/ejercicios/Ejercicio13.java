package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	
	/* Crea un programa llamado ComprobarFecha, que pida una fecha formada por tres valores numéricos (día, mes y año),
	   y determine si la fecha corresponde a un valor válido. */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el día: ");
		int dia = scanner.nextInt();
		
		System.out.print("Ingrese el mes: ");
		int mes = scanner.nextInt();
		
		System.out.print("Ingrese el año: ");
		int anio = scanner.nextInt();
		
		if (esFechaValida(dia, mes, anio)) {
			System.out.println("La fecha es válida.");
		} else {
			System.out.println("La fecha no es válida.");
		}
		
		scanner.close();
	}
	
	static boolean esFechaValida(int dia, int mes, int anio) {
		if (mes < 1 || mes > 12) {
			return false;
		}
		
		if (dia < 1 || dia > diasEnMes(mes, anio)) {
			return false;
		}
		
		return true;
	}
	
	static int diasEnMes(int mes, int anio) {
		switch (mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				if (esBisiesto(anio)) {
					return 29;
				} else {
					return 28;
				}
			default:
				return 0;
		}
	}
	
	static boolean esBisiesto(int anio) {
		if (anio % 4 == 0) {
			if (anio % 100 == 0) {
				return anio % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}