package verano.clase.tareasCurso;

import java.util.Scanner;

public class GestionResiduos {

	public static final Scanner entrada = new Scanner(System.in);
	private static int NUM_RESIDUOS;
	public static void main(String[] args) {
		
		solicitarCantidad();
		procesarInfo();
		
	}
	
	
	private static void procesarInfo() {
		
		int kilos;
		int kilosTotales = 0;

		for (int i = 0; i < NUM_RESIDUOS; i++) {
			System.out.println("Ingrese la cantidad de kilos para el residuo " + i + ": ");
			kilos = entrada.nextInt();
			kilosTotales += kilos;
		}
		
		System.out.println("Total de kg recolectados: " + kilosTotales);
		double media = kilosTotales / NUM_RESIDUOS;
		System.out.println("Media de residuos: " + media);		
	}
	
	private static void solicitarCantidad() {
	
		do {
			System.out.println("Indique el número de residuos: ");
			NUM_RESIDUOS = entrada.nextInt();
		} while (NUM_RESIDUOS < 0);
		
	}

}
