package unidades.desdeCasa.misionEspacial;

import java.util.Scanner;

public class MisionEspacial {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroCristales = 0;
		int numeroTripulantes = 0;
		
		do {
			
			System.out.println("Introduce el número de cristales: ");			
			numeroCristales = entrada.nextInt();
			
		}while(numeroCristales > 1000);
		
		do {
			
			System.out.println("Introduce el número de tripulantes: ");			
			numeroTripulantes = entrada.nextInt();
			
		}while(numeroTripulantes > 10);
		
	}

}
