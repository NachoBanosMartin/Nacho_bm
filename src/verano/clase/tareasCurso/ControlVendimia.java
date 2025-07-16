package verano.clase.tareasCurso;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ControlVendimia {

	private static final int NUM_ZONAS = 6;
	private static final HashMap<Integer, Double> zonas = new HashMap<Integer, Double>();
	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		zonas.put(1, 0.0);
		zonas.put(2, 0.0);
		zonas.put(3, 0.0);
		zonas.put(4, 0.0);
		zonas.put(5, 0.0);
		zonas.put(6, 0.0);

		int opcion = 0;
		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				anadirCantidad();
				break;
			case 2:
				obtenerPeso();
				break;
			case 3:
				cantidadPorZona();
				break;
			case 4:
				mediaPeso();
				break;
			case 5:
				System.out.println("Gracias por usar el menú interactivo");
				break;
			default:
				System.out.println("Introduzca una opción válida");
				break;
			}

		} while (opcion != 5);

	}

	private static int mostrarMenu() {

		System.out.println("MENU");
		System.out.println("1. Añadir cantidad");
		System.out.println("2. Obtener peso total");
		System.out.println("3. Obtener cantidad por zona");
		System.out.println("4. Media de peso");
		System.out.println("5. Salir");
		System.out.println("Indique la opción deseada: ");
		int opcion = entrada.nextInt();
		return opcion;

	}

	private static void anadirCantidad() {

		try {
			System.out.println("Introduzca la zona para añadir la cantidad: ");
			int zona = entrada.nextInt();
			
			if (!zonas.containsKey(zona)) {
		        System.out.println("Zona no válida.");
		        return;
		    }
			
			System.out.println("Introduzca la cantidad en kg: ");
			double cantidad = entrada.nextDouble();

			zonas.replace(zona, zonas.get(zona) + cantidad);

		} catch (InputMismatchException e) {
			System.out.println("Error");
		}

	}

	private static void obtenerPeso() {

		double sumaTotal = 0;
		if (zonas.isEmpty()) {
			System.out.println("Las zonas están vacías");
		} else {
			for (Double valores : zonas.values()) {
				sumaTotal += valores;
			}

			System.out.println("La suma de las zonas es de: " + sumaTotal + " Kg");

		}

	}

	private static void cantidadPorZona() {

		System.out.println("Introduzca la zona de la que quieras saber la cantidad: ");
		int zona = entrada.nextInt();

		System.out.println("La zona " + zona + " tiene: " + zonas.get(zona) + " Kg");
	}

	private static void mediaPeso() {

		double sumaTotal = 0;

		for (Double valores : zonas.values()) {
			sumaTotal += valores;
		}

		double media = (double) sumaTotal / NUM_ZONAS;

		System.out.println("La media de las zonas es de: " + media);

	}

}
