package unidades.unidad5.tareas;

import java.util.Scanner;

public class Agusloto {
	
	static final int NUM_FILAS = 10;
	static final int NUM_COLUMNAS = 5;
	static char [] [] numero = new char [NUM_FILAS] [NUM_COLUMNAS];
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		inicializarTabla();
		mostrarTabla();
		
	}
				
		static void mostrarTabla() {
			
			for (int  i = 0; i < NUM_FILAS; i++) { 
				for (int j = 0; j < NUM_COLUMNAS; j++) {
					System.out.print(numero [i] [j]);
				}
				System.out.println();
			}
	
		}
		
		static void inicializarTabla() {
			for (int  i = 0; i < NUM_FILAS; i++) { 
				for (int j = 0; j < NUM_COLUMNAS; j++) {
					numero[i] [j] = '1';
				}
			}
		}
		

	}