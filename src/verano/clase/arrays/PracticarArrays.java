package verano.clase.arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class PracticarArrays {

	public static final Scanner entrada = new Scanner(System.in);
	public static final ArrayList<String> tareas = new ArrayList<String>();

	public static void main(String[] args) {

		tareas.add("Limpiar coche");
		tareas.add("Poner lavadora");
		tareas.add("Barrer casa");
		tareas.add("Fregar cocina");

		mostrarMenu();

	}

	private static void mostrarMenu() {

		int opcion;

		do {

			System.out.println("------ MENÚ ------");
			System.out.println("1. Añadir tarea");
			System.out.println("2. Eliminar tarea");
			System.out.println("3. Mostrar tareas");
			System.out.println("4. Modificar tarea");
			System.out.println("5. Comprobar tarea");
			System.out.println("6. Salir");
			System.out.println("Introduzca la opción deseada: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				anadir();
				break;
			case 2:
				eliminar();
				break;
			case 3:
				mostrar();
				break;
			case 4:
				modificar();
				break;
			case 5:
				comprobar();
				break;
			case 6:
				System.out.println("Gracias por usar el menú.");
				break;
			default:
				System.out.println("Opción introducida inválida.");
				break;
			}

		} while (opcion != 6);

	}

	private static void anadir() {

		System.out.println("Introduce la otra tarea pendiente: ");
		entrada.nextLine();
		String tareaNueva = entrada.nextLine();
		tareas.add(tareaNueva);

	}

	private static void eliminar() {				

	 try {        

	        System.out.println("Introduce la posición de la tarea que deseas eliminar:");
	        mostrar(); 
	        int posicionTarea = entrada.nextInt();
	        entrada.nextLine();

	        if (posicionTarea < 0 || posicionTarea > tareas.size()) {
	            System.out.println("Posición fuera de rango.");
	            return;
	        }

	        String tareaEliminada = tareas.remove(posicionTarea - 1);
	        System.out.println("Tarea eliminada: " + tareaEliminada);

	    } catch (InputMismatchException e) {
	        System.out.println("Tienes que introducir un número válido");
	        
	    } 
	 
	}

	private static void mostrar() {

		Iterator<String> elementos = tareas.iterator();

		while (elementos.hasNext()) {
			System.out.println(elementos.next());

		}
	}

	private static void modificar() {

		try {
			System.out.println("Indica la posición donde harás la modificación: ");
			int posicionModificacion = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Indica la modificación: ");
			String modificacion = entrada.nextLine();

			tareas.set(posicionModificacion, modificacion);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Posición ingresada inválida");
		}

	}

	private static void comprobar() {

		System.out.println("Introduce la tarea que deseas comprobar:");
		entrada.nextLine();
		String buscarTarea = entrada.nextLine();
		

		if (tareas.contains(buscarTarea)) {
			System.out.println("La tarea " + buscarTarea + " está en la lista");
		} else {
			System.out.println("La tarea " + buscarTarea + " no está en la lista");

		}
	}

}
