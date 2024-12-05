package unidades.unidad5.tareas;

import java.util.Random;
import java.util.Scanner;

public class AguslotoCorregido {
	
	static final int FILAS = 10;
	static final int COLUMNAS = 5;
	static final int NUM_APUESTAS = 5;
	static final int NUM_PREMIADOS = 5;
	static Scanner entrada = new Scanner (System.in);



	public static void main(String[] args) {
		
		int tabla [] [] = new int [FILAS] [COLUMNAS];
		int apuesta [] = new int [NUM_APUESTAS];
		int sorteo [] = new int [NUM_PREMIADOS];
		int aciertos [] = new int [NUM_APUESTAS];
		
		crearTabla(tabla);
		mostarTabla(tabla);
		pedirApuesta(apuesta);
		mostarNumeros(apuesta);
		hacerSorteo(sorteo);
		mostarNumeros(sorteo);
		comprobarAciertos(apuesta, sorteo);

	}

	static void comprobarAciertos(int[] apuesta, int[] sorteo) {
		
		int aciertos = 0;
		for (int numApuesta:apuesta) {
			for(int numSorteo:sorteo) {
				if(numApuesta==numSorteo) {
					aciertos++;
				}
			}
		}
		if(aciertos==0) {
		
		System.out.println("Lo siento");
		
		}
	
		System.out.println("Usted ha acertado " +aciertos+ "numero");

		}

	static void hacerSorteo(int[] sorteo) {
		
		int contadorNumerosGenerados = 0;
		Random aleatorio = new Random();
		int numeroGenerado;
		
		do {
			
			numeroGenerado = aleatorio.nextInt(50) + 1;
			
			if(!esDuplicado (sorteo, numeroGenerado)) {
				sorteo[contadorNumerosGenerados] = numeroGenerado;
				contadorNumerosGenerados++;
			}
			
		}while (contadorNumerosGenerados < NUM_PREMIADOS);
		
	}

	static void mostarNumeros(int[] apuesta) {
		
		for (int numero:apuesta) {
			System.out.printf("%-4d", numero);
		}
	}

	static void pedirApuesta(int[] apuesta) {
		
		int contadorNumeros = 0;
		int numero;
		
		do {
			
			System.out.println("Número " + (contadorNumeros));
			numero = entrada.nextInt();
			
			if (numero < 0 || numero > 50) {
				System.out.println("Número fuera de rango");
			}else if (esDuplicado (apuesta, numero)){
				System.out.println("Está duplicado");

				
			}else {
				apuesta[contadorNumeros] = numero;
				contadorNumeros++;
			}
		}while (contadorNumeros < NUM_APUESTAS);
		
	}

	static boolean esDuplicado(int[] apuesta, int numero) {
		boolean repetido = false;
		
		for(int elemento:apuesta) {
			if (elemento == numero) {
				repetido = true;
			}
		}
		return repetido;
	}


	static void mostarTabla(int[][] tabla) {
		
		for (int i = 0; i< FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("%-4d", tabla[i][j]);
		}
			System.out.println();
	
		}
	}

	static void crearTabla(int[][] tabla) { //Por referencia
		
		for (int i = 0; i< FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				tabla [i] [j] = (i + 1) + (j * 10);
		}
		}
	}
}
