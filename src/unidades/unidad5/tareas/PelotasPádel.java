package unidades.unidad5.tareas;

import java.util.Random;

public class PelotasPádel {
	
	static final int FILAS = 20;
	static final int COLUMNAS = 20;
	static final int NUM_PELOTAS = 50;
	

	public static void main(String[] args) {
		
		int pista [] [] = new int [FILAS] [COLUMNAS];
		int pelotas [] = new int [NUM_PELOTAS];
		
		crearPista(pista)
		mostrarPista(pista);
		generarPelotas(pelotas);
		mostrarCantidadPelotas(pelotas);
		
	}

	

	static void mostrarCantidadPelotas(int[] pelotas) {
		

	}



	static void generarPelotas(int[] pelotas) {
		int contadorPelotas = 0;
		Random aleatorio = new Random();
		int numeroGenerado;
		
		do {
			
			numeroGenerado = aleatorio.nextInt(50) + 1;
			
			if(!esDuplicado (pelotas, numeroGenerado)) {
				pelotas[contadorPelotas] = numeroGenerado;
				contadorPelotas++;
			}
			
		}while (contadorPelotas < NUM_PELOTAS);
		
	}

	static boolean esDuplicado(int[] pelotas, int numeroGenerado) {
		boolean repetido = false;
		
		for(int elemento:pelotas) {
			if (elemento == numeroGenerado) {
				repetido = true;
			}
		}
		return repetido;
	}

	static void mostrarPista(int[][] pista) {
		for (int i = 0; i< FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("%-4d", pista[i][j]);
		}
			System.out.println();
	
		}
	}

	static void crearPista(int[][] pista) {
		for (int i = 0; i< FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				pista [i] [j] = (i + 1) + j;
		}
		}
	}
}