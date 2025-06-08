package unidades.desdeCasa.controlVendimia;

import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	private static final int NUM_ZONAS = 6;
	public static int[] zonas = new int[NUM_ZONAS];
	public static int[] conteos = new int[NUM_ZONAS];       // Cuántas veces se ha añadido


	public static void main(String[] args) {

		int opcion;
		do {
			mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				agregarCantidad();
				break;
			case 2:
				obtenerPesoTotal();
				break;
			case 3:
				mostrarCantidadPorZona();
				break;
			case 4:
				mostrarMediaPorZona();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}

		} while (opcion != 5);

	}

	
	private static void mostrarMenu() {

		System.out.println("------Menú Interactivo------");
		System.out.println("1. Añadir cantidad a una zona.");
		System.out.println("2. Obtener peso total.");
		System.out.println("3. Saber cantidad por zona.");
		System.out.println("4. Conocer media por zona");
		System.out.println("5. Salir.");
		System.out.println("Elija una opción: ");

	}

	private static void agregarCantidad() {
		
		System.out.println("Ingrese el número de la zona (1-6): ");
		int zona = entrada.nextInt();
		
		if(zona < 1 || zona > NUM_ZONAS) {
			System.out.println("Zona inválida.");
		}
		
		System.out.println("Ingrese la cantidad de kilos a agregar: ");
		double kilos = entrada.nextDouble();
		
		if(kilos <= 0) {
			System.out.println("La cantidad no puede ser negativa o nula");
		}
		
		zonas[zona - 1] += kilos;      // Sumar kilos
	    conteos[zona - 1]++;           // Contar entrada
	    System.out.println("Cantidad añadida correctamente a la zona " + zona + ".");
	}
	
	private static void obtenerPesoTotal() {
		
		int total = 0;
		for (int i = 0; i < zonas.length; i++) {
			total += zonas[i];
		}
		
	    System.out.println("El peso total recolectado en todas las zonas es: " + total + " kg.");
		
	}
	

	private static void mostrarCantidadPorZona() {
		
		  System.out.print("Ingrese el número de la zona (1-6): ");
		    int zona = entrada.nextInt();

		    if (zona < 1 || zona > NUM_ZONAS) {
		        System.out.println("Zona inválida.");
		        return;
		    }

		    System.out.println("Cantidad acumulada en la zona " + zona + ": " + zonas[zona - 1] + " kg.");
		
	}
	
	
	private static void mostrarMediaPorZona() {
		
	    System.out.println("----- Media por Zona -----");
		for (int i = 0; i < zonas.length; i++) {
			if(conteos[i] == 0) {
	            System.out.println("Zona " + (i + 1) + ": No hay datos.");
			}else {
				double media = (double) zonas[i] / conteos[i];
	            System.out.printf("Zona %d: %.2f kg de media%n", (i + 1), media);
			}
		}		
		
		
	}

}
