package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class EjercicioEstaciones {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int mes;
		
		System.out.println("Introduzca un número (1-12) para indicar el mes del año");
		mes= entrada.nextInt();

		switch (mes) {
		
			case 12,1,2:
				System.out.println("Invierno");
				break;
			case 3,4,5:
				System.out.println("Primavera");
				break;
			case 6,7,8:
				System.out.println("Verano");
					if (mes==7);
					System.out.println("Es mi cumple");
				break;
			case 9,10,11:
				System.out.println("Otoño");
				break;
			default:
				System.out.println("No es una opción válida");	
			}
		entrada.close();
	
	}

}
