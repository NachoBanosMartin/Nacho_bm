package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class EjercicioEstaciones {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int mes;
		
		System.out.println("Introduzca un número (1-12) para indicar el mes del año");
		mes= entrada.nextInt();

		switch (mes) {
		
			case 12:
			System.out.println("Invierno");
			break;
		case 1:
			System.out.println("Invierno");
			break;
		case 2:
			System.out.println("Invierno");
			break;
		case 3:
			System.out.println("Primavera");
			break;
		case 4:
			System.out.println("Primavera");
			break;
		case 5:
			System.out.println("Primavera");
			break;
		case 6:
			System.out.println("Verano");
			if (mes==7);
			System.out.println("Es mi cumple");
			break;
		case 7:
			System.out.println("Verano");
			if (mes==7);
			System.out.println("Es mi cumple");
			break;
		case 8:
			System.out.println("Verano");
			if (mes==7);
			System.out.println("Es mi cumple");
			break;
		case 9:
			System.out.println("Otoño");
			break;
		case 10:
			System.out.println("Otoño");
			break;
		case 11:
			System.out.println("Otoño");
			break;
		default:
				System.out.println("No es una opción válida");	
			}
		entrada.close();
	
	}

}
