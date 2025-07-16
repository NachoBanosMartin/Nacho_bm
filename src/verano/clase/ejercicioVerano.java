package verano.clase;

import java.util.Scanner;

public class ejercicioVerano {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Intoduce el número de días: ");
		int opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Tiene 20 dias");
			break;
		case 2:
		case 3:       // Agrupar por días
			System.out.println("Tiene 30 dias");
			break;		
		case 4:
			System.out.println("Tiene 30 dias");
			break;
		case 5:
			System.out.println("Tiene 30 dias");
			break;
		case 6:
			System.out.println("Tiene 30 dias");
			break;
		case 7:
			System.out.println("Tiene 30 dias");
			break;
		case 8:
			System.out.println("Tiene 30 dias");
			break;
		case 9:
			System.out.println("Tiene 30 dias");
			break;
		case 10:
			System.out.println("Tiene 30 dias");
			break;
		case 11:
			System.out.println("Tiene 30 dias");
			break;
		case 12:
			System.out.println("Tiene 30 dias");
			break;
		default:
			System.out.println("El mes introducido es inválido");
			break;
		}

	}

}
