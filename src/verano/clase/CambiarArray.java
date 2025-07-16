package verano.clase;

import java.util.Scanner;

public class CambiarArray {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		int[] array = new int[4];
		int numeros;
 System.out.println(matriz.length);
 System.out.println(matriz[3].length);
		for (int i = 0; i < matriz.length; i++) { // Rellenar la matriz
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Introduzca 16 números para rellenar el array: ");
				numeros = entrada.nextInt();
				matriz[i][j] = numeros;
			}
		}

		for (int i = 0; i < matriz.length; i++) { // Mostramos la matriz
			for (int j = 0; j < matriz.length; j++) {   
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < matriz[0].length; i++) {   // Guardo en la temporal la última posición
			array[i] = matriz[matriz.length - 1][i];
		}

		for (int i = 0; i < matriz[0].length; i++) {      // Pongo la primera en la última
			matriz[matriz.length - 1][i] = matriz[0][i];  // matriz[0].length -> hago referencia a las filas
			
															// matriz.length -> hago referencia a las columnas
		}

		for (int i = 0; i < matriz[0].length; i++) {   // Pongo en la primera posición, la última
			matriz[0][i] = array[i];
		}

		System.out.println("Matriz cambiada:");    // Muestro el cambio
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}

}
