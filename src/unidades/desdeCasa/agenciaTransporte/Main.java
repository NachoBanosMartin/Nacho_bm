package unidades.desdeCasa.agenciaTransporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		
		do {
			
			System.out.println("----Menú Interactivo----");
			System.out.println("1. Cargar transportes desde fichero.");
			System.out.println("2. Añadir nuevo transporte.");
			System.out.println("3. Mosrar toods los transportes con coste");
			System.out.println("4. Guardar transportes.");
			System.out.println("5. Salir.");
			System.out.println("Seleccione una opción: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				cargarTransportes();
				break;

			default:
				break;
			}
			
			
		}while(opcion < 5);
	}

	private static void cargarTransportes() {
		
		ArrayList<Transporte> cargar = new ArrayList<Transporte>();
		
		
		
	}

}
