package unidades.desdeCasa.agenciaTransporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;

		do {

			try {

				mostrarMenu();
				opcion = entrada.nextInt();

				switch (opcion) {
				case 1:
					cargarTransportes();
					break;

				default:
					break;
				}

			} catch (InputMismatchException e) { // Error de entrada por teclado
				System.err.println("Entrada no válida.");
				entrada.nextLine();
				opcion = 0;
			}

		} while (opcion < 5);
	}

	private static void mostrarMenu() {
		System.out.println("----Menú Interactivo----");
		System.out.println("1. Cargar transportes desde fichero.");
		System.out.println("2. Añadir nuevo transporte.");
		System.out.println("3. Mosrar toods los transportes con coste");
		System.out.println("4. Guardar transportes.");
		System.out.println("5. Salir.");
		System.out.println("Seleccione una opción: ");
	}

	private static void cargarTransportes() {

		ArrayList<Transporte> cargar = new ArrayList<Transporte>();

		try {
			FileReader fichero = new FileReader("C:\\Users\\nacho\\git\\Nacho_bm\\transportes.txt");
			BufferedReader leer = new BufferedReader(fichero);

			String linea = leer.readLine();
			while (linea != null) {
				String datos[] = linea.split(";");
				if (datos.length == 7) {
					switch (datos[0].toLowerCase()) {					
					case "mercancias":
						TiposMercancias tipo = null;
						switch (datos[6].toLowerCase()) {
						case "general":
							tipo = TiposMercancias.General;
							break;
						case "refrigerada":
							tipo = TiposMercancias.Refrigerada;
							break;
						case "pesada":
							tipo = TiposMercancias.Pesada;
							break;

						default:
							break;
						}
						double peso = Double.parseDouble(datos[5]);
						Mercancias mercancia1 = new Mercancias(datos[1], datos[2], datos[3], datos[4], peso, tipo);
						cargar.add(mercancia1);
						break;
					case "peligroso":

						break;
					case "animales":

						break;

					default:
						break;
					}
				}
			}

		} catch (IOException e) {
			e.getMessage();
		}

	}

}
