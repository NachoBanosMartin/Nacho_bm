package verano.clase.Mapas;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EjercicioFacil {

	public static final Scanner entrada = new Scanner(System.in);
	public static final HashMap<Integer, String> colores = new HashMap<Integer, String>();

	public static void main(String[] args) {

		int opcion = 0;

		do {

			opcion = mostrarMenu();

			switch (opcion) {
			case 1:
				anadirColor();
				break;
			case 2:
				comprobarColor();
				break;
			case 3:
				mostrasClaves();
				break;
			case 4:
				verTamano();
				break;
			case 5:
				System.out.println("Gracias por usar el menú");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}

		} while (opcion != 5);

	}

	

	private static int mostrarMenu() {

		System.out.println("MENU");
		System.out.println("1. Añadir color");
		System.out.println("2. Comprobar color");
		System.out.println("3. Mostrar claves");
		System.out.println("4. Ver tamaño");
		System.out.println("5. Salir");
		System.out.println("Introduce la opción deseada: ");
		int opcion = entrada.nextInt();
		return opcion;
	}

	private static void anadirColor() {

		try {
			System.out.println("Introduce una clave para el color deseado: ");
			int clave = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Introduce el color que desee añadir: ");
			String color = entrada.nextLine();

			if (colores.containsValue(color)) {
				System.out.println("Color ya existente en el mapa");
			} else {
				colores.put(clave, color);
			}
		} catch (InputMismatchException e) {
			System.out.println("Error al introducir la clave");
		}

	}

	private static void comprobarColor() {

		System.out.println("Introduce la clave de color deseado: ");
		int clave = entrada.nextInt();

		if (colores.containsKey(clave)) {
			System.out.println(colores.get(clave));
		}
	}

	private static void mostrasClaves() {

		if (colores.isEmpty()) {
			System.out.println("No hay ningún color en el mapa");
		} else {
			Set<Map.Entry<Integer, String>> listaColores = colores.entrySet();
			for (var elemento : listaColores) {
				System.out.println(elemento.getKey() + " : " + elemento.getValue());
			}
		}

	}
	
	private static void verTamano() {

		System.out.println(colores.size());
	}

}
