package unidades.desdeCasa.ascensor;

import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	public static final Ascensor ascensor = new Ascensor();

	public static void main(String[] args) {
		int opcion;

		do {
			mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				marcarPlanta();
				break;
			case 2:
				abrirPuerta();
				break;
			case 3:
				cerrarPuerta();
				break;
			case 4:
				System.out.println("Gracias por usar el ascensor. Vuelva pronto.");
				break;
			default:
				System.out.println("Opción inválida.");
			}
		} while (opcion != 4);
	}

	private static void mostrarMenu() {
		System.out.println("\n------- ASCENSOR -------");
		System.out.println("Planta actual: " + ascensor.getPlantaActual());
		System.out.println("Puerta: " + (ascensor.isPuerta() ? "Abierta" : "Cerrada"));
		System.out.println("1. Marcar planta");
		System.out.println("2. Abrir puerta");
		System.out.println("3. Cerrar puerta");
		System.out.println("4. Apagar");
		System.out.print("Seleccione una opción: ");
	}

	private static void marcarPlanta() {
		if (ascensor.isPuerta()) {
			System.out.println("Cierra la puerta antes de usar el ascensor");
			return;
		}

		System.out.print("Ingrese la planta deseada (0-5): ");
		int destino = entrada.nextInt();

		if (destino < 0 || destino > 5) {
			System.out.println("Planta inválida.");
			return;
		}

		if (destino > ascensor.getPlantaActual()) {
			System.out.println("Subiendo...");
			while (ascensor.getPlantaActual() != destino) {
				ascensor.subir();
			}
		} else {
			System.out.println("Bajando...");
			while (ascensor.getPlantaActual() != destino) {
				ascensor.bajar();
			}
		}

		System.out.println("Llegaste a la planta " + destino);
	}

	private static void abrirPuerta() {
		if (ascensor.isPuerta()) {
			System.out.println("La puerta ya está abierta.");
		} else {
			ascensor.abrirPuerta();
			System.out.println("Puerta abierta.");
		}
	}

	private static void cerrarPuerta() {
		if (!ascensor.isPuerta()) {
			System.out.println("La puerta ya está cerrada.");
		} else {
			ascensor.cerrarPuerta();
			System.out.println("Puerta cerrada.");
		}
	}
}