package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.printf("Introduzca un número (1-9)");
		int n = entrada.nextInt();

		
		//Recorrer las filas
		for (int fila = 1; fila <= n; fila ++ ) {
			
			//Recorrer las columnas
			for (int columna = 1; columna <= 10; columna ++) {
			// Para hacerlo a la inversa 
			// for (int columna = 10; columna >= 1; columna --) {
				System.out.printf("%6d", fila * columna);
			}
			
			System.out.println();
		
		}
		
		entrada.close();
	}
}