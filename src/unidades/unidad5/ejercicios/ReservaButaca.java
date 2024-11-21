package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class ReservaButaca {

	static final int NUM_FILAS = 5;
	static final int NUM_COLUMNAS = 6;
	static char [] [] asientos = new char [NUM_FILAS] [NUM_COLUMNAS];
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		inicializarAsientos();
		mostrarAsientos();
		
			char opcion = 0;
			do {
				
				mostrarMenu();
				opcion = leerOpcion();
				
				switch (opcion) {
				
				case 'R':
					pedirDatosReserva();
					mostrarAsientos();
				break;
				case 'C':
					pedirDatosCompra();
					mostrarAsientos();
					break;
				case 'A':
					mostrarAsientos();
					break;
				default:
					cerrarPrograma();
				}
							
			}while(opcion!= 'S');
	
				
	}
	
		
	static void pedirDatosReserva() {
		int fila;
		int columna;
		System.out.println("Introduzca la fila");
		fila = entrada.nextInt();
		System.out.println("Introduzca la columna");
		columna = entrada.nextInt();
		
		reservarAsiento(fila,columna);

	}
	
	static void pedirDatosCompra() {
		int fila;
		int columna;
		System.out.println("Introduzca la fila");
		fila = entrada.nextInt();
		System.out.println("Introduzca la columna");
		columna = entrada.nextInt();
		
		comprarAsiento(fila,columna);

	}
	
	static void anularAsiento (int fila, int columna) { 
		
		asientos[fila-1] [columna-1] = 'L';
	}
	
	static void reservarAsiento (int fila, int columna) { 
		
		asientos[fila-1] [columna-1] = 'R';
	}
	
	static void comprarAsiento (int fila, int columna) { 
		
		asientos[fila-1] [columna-1] = 'C';
	}
	
	static void cerrarPrograma() {
		System.out.println("Muchas Gracias por la compra");
		
	}
	
	static char leerOpcion() {
		char opcion = entrada.next().toUpperCase().charAt(0);
		return opcion;
	}
	
	static void mostrarMenu() {
		System.out.println("----Reserva de Asientos----");
		System.out.println("1.Reservar");
		System.out.println("2.Comprar");
		System.out.println("3.Salir");
		System.out.println("4.Anular Reserva");
		
	}
		
	static void mostrarAsientos() {
		
		for (int  i = 0; i < NUM_FILAS; i++) { //Recorrer las columnas de cada fila
			for (int j = 0; j < NUM_COLUMNAS; j++) {
				System.out.printf("%3s", asientos [i] [j]);
			}
			System.out.println();
		}
		
	}
	
	static void inicializarAsientos() {
		for (int  i = 0; i < NUM_FILAS; i++) { //Recorrer las filas
			for (int j = 0; j < NUM_COLUMNAS; j++) {
				asientos[i] [j] = 'L';
			}
		}
	}
	

}
