package unidades.unidad5.tareas;

import java.util.Scanner;

public class PuntoLimpio {

	static Scanner entrada = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		int kilos[];
		double media;
		int suma, cantidadKilos;
		int residuos;
		
		
		System.out.println("Ingrese el número de tipos de residuos: ");
		int numeroResiduos = entrada.nextInt();
		
		kilos = new int[numeroResiduos];
		
		for (int i = 0; i < numeroResiduos; i++) {
					
		System.out.println("Ingrese la cantidad de kilos para el residuo " +(i+1)+ ":");
		cantidadKilos = entrada.nextInt();
			kilos[i]= cantidadKilos;
		}
		
		suma = obtenerSumaKilos(kilos);
		media = obtenerMediaKilos(kilos);
		mostrarDatos(suma, media);
		
	}



	static void mostrarDatos(int suma, double media) {
		System.out.println("Total de kilos recolectados: " + suma + "kg");
		System.out.println("Promedio de kilos por tipo de residuo: " + media+ "kg");
		
	}

	static int obtenerSumaKilos(int[] kilos) {
		int suma = 0;
		for (int i = 0; i < kilos.length; i++) {
			suma = suma + kilos [i];
		}
		return suma;
	}

	static double obtenerMediaKilos(int[] kilos) {
		double media;
		int suma = obtenerSumaKilos(kilos);
		
		media = (double) suma / kilos.length;
		return media;
	}

}





