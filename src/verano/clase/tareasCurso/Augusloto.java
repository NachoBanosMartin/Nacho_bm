package verano.clase.tareasCurso;

import java.util.Random;
import java.util.Scanner;

public class Augusloto {

	private static final int NUM_PREMIADOS = 5;
	private static final int NUM_APUESTAS = 5;
	private static final int NUM_COLUMNAS = 5;
	private static final int NUM_FILAS = 10;
	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] tabla = new int[NUM_FILAS][NUM_COLUMNAS]; // 1º Filas 2º Columnas
		int[] apuesta = new int[NUM_APUESTAS];
		int[] premiados = new int[NUM_PREMIADOS];

		crearTabla(tabla);
		mostrarTabla(tabla);
		pedirApuesta(apuesta);
		mostrarApuesta(apuesta);
		hacerSorteo(premiados);
		mostrarApuesta(premiados);
		comprobarAciertos(apuesta, premiados);
	}

	private static void crearTabla(int[][] tabla) {

		for (int i = 0; i < NUM_FILAS; i++) {
			for (int j = 0; j < NUM_COLUMNAS; j++) {
				tabla[i][j] = (i + 1) + (j * 10);
			}
		}
	}

	private static void mostrarTabla(int[][] tabla) {

		for (int i = 0; i < NUM_FILAS; i++) {
			for (int j = 0; j < NUM_COLUMNAS; j++) {
				System.out.printf("%-5d", tabla[i][j]); // Formato: %-4d
			}
			System.out.println();
		}
	}

	private static void pedirApuesta(int[] apuesta) {

		int contador = 0;
		int numero;

		do {

			System.out.println("Introduzca su apuesta " + contador);
			numero = entrada.nextInt();

			if (numero <= 0 || numero > 50) {
				System.out.println("Apuesta fuera de rango");
			} else if (esDuplicado(apuesta, numero)) {
				System.out.println("Apuesta duplicada");
			} else {
				apuesta[contador] = numero;
				contador++;
			}

		} while (contador < NUM_APUESTAS);
	}

	private static boolean esDuplicado(int[] apuesta, int numero) {

		boolean repetido = false;
		for (int i : apuesta) {
			if (i == numero) {
				repetido = true;
			}
		}
		return repetido;
	}

	private static void mostrarApuesta(int[] apuesta) {

		for (int i : apuesta) {
			System.out.printf("%-5d", i);
		}

	}

	private static void hacerSorteo(int[] premiados) {

		int numerosGenerados = 0;
		Random aleatorio = new Random();
		int numeroAleatorio;

		do {

			numeroAleatorio = aleatorio.nextInt(50) + 1;
			if (!esDuplicado(premiados, numeroAleatorio)) {
				premiados[numerosGenerados] = numeroAleatorio;
				numerosGenerados++;
			}

		} while (numerosGenerados < NUM_PREMIADOS);

	}
	
	private static void comprobarAciertos(int[] apuesta, int[] premiados) {
		
		int aciertos = 0;
		for (int numApuesta : apuesta) {
			for (int numSorteo : premiados) {
				if (numApuesta == numSorteo) {
					aciertos++;
				}
			}
		}
		if (aciertos == 0) {

			System.out.println("Lo siento, otra vez será");

		}

		System.out.println("Usted ha acertado " + aciertos + " numeros");
	}

}
