package unidades.desdeCasa.agenciaTransporte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	public static ArrayList<Transporte> cargar = new ArrayList<Transporte>();

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
				case 2:
					agregarTransporte();
					break;
				case 3:
					mostrarTransportes();
					break;
				case 4:
					guardarTransportes();
					break;
				case 5:
					System.out.println("Gracias por usar el menú interactivo.");
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}

			} catch (InputMismatchException e) { // Error de entrada por teclado
				System.err.println("Entrada no válida.");
				entrada.nextLine();
				opcion = 0;
			}

		} while (opcion < 5);
	}

	private static void agregarTransporte() {

		System.out.println("Seleccione tipo de transporte a añadir (Mercancias, Peligroso, Animales):");
		int tipo = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Código: ");
		String codigo = entrada.nextLine();

		System.out.print("Origen: ");
		String origen = entrada.nextLine();

		System.out.print("Destino: ");
		String destino = entrada.nextLine();

		System.out.print("Fecha (dd/mm/yyyy): ");
		String fecha = entrada.nextLine();

		switch (tipo) {
		case 1: // Mercancias
			System.out.print("Peso: ");
			double peso = entrada.nextDouble();
			entrada.nextLine();

			System.out.print("Tipo de mercancia (General, Refrigerada, Pesada): ");
			String tipoMerc = entrada.nextLine();
			TiposMercancias tipoMercancia;
			try {
				tipoMercancia = TiposMercancias.valueOf(tipoMerc);
			} catch (Exception e) {
				System.out.println("Tipo de mercancia no válido. Se asignará GENERAL por defecto.");
				tipoMercancia = TiposMercancias.General;
			}

			cargar.add(new Mercancias(codigo, origen, destino, fecha, peso, tipoMercancia));
			System.out.println("Mercancia añadida.");
			break;

		case 2: // Peligroso
			System.out.print("Nivel de riesgo (Uno, Dos, Tres, Cuatro, Cinco): ");
			String nivelStr = entrada.nextLine();
			NivelRiego nivel;
			try {
				nivel = NivelRiego.valueOf(nivelStr);
			} catch (Exception e) {
				System.out.println("Nivel de riesgo no válido. Se asignará UNO por defecto.");
				nivel = NivelRiego.Uno;
			}

			System.out.print("Tipo de material (Quimicos, Explosivos, Radiactivos): ");
			String tipoMatStr = entrada.nextLine();
			TiposMaterial tipoMat;
			try {
				tipoMat = TiposMaterial.valueOf(tipoMatStr);
			} catch (Exception e) {
				System.out.println("Tipo de material no válido. Se asignará QUIMICOS por defecto.");
				tipoMat = TiposMaterial.Quimicos;
			}

			cargar.add(new Peligroso(codigo, origen, destino, fecha, nivel, tipoMat));
			System.out.println("Transporte peligroso añadido.");
			break;

		case 3: // Animales
			System.out.print("Cantidad: ");
			int cantidad = entrada.nextInt();
			entrada.nextLine();

			System.out.print("Tipo de animal (Bovino, Ovino, Porcino, Aves): ");
			String tipoAniStr = entrada.nextLine();
			TiposAnimales tipoAni;
			try {
				tipoAni = TiposAnimales.valueOf(tipoAniStr);
			} catch (Exception e) {
				System.out.println("Tipo de animal no válido. Se asignará BOVINO por defecto.");
				tipoAni = TiposAnimales.Bovino;
			}

			cargar.add(new Animales(codigo, origen, destino, fecha, cantidad, tipoAni));
			System.out.println("Transporte de animales añadido.");
			break;

		default:
			System.out.println("Opción inválida.");
			break;
		}
	}

	private static void guardarTransportes() {

		try {
			BufferedWriter escritor = new BufferedWriter(
					new FileWriter("C:\\Users\\nacho\\git\\Nacho_bm\\transportes2.txt"));
			String linea;
			for (Transporte transporte : cargar) {
				linea = transporte.toString();
				escritor.write(linea);
				escritor.newLine();
			}
		} catch (IOException e) {
			System.out.println("Fallo al escribir el fichero.");
		}

	}

	private static void mostrarTransportes() {
		for (Transporte t : cargar) {
			System.out.println(t.toString());
			System.out.println("Coste del transporte: " + t.calcularCoste() + "€");

		}

	}

	private static void mostrarMenu() {
		System.out.println("----Menú Interactivo----");
		System.out.println("1. Cargar transportes desde fichero.");
		System.out.println("2. Añadir nuevo transporte.");
		System.out.println("3. Mostrar todos los transportes con coste");
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
						TiposMercancias tipoM = null;
						switch (datos[6].toLowerCase()) {
						case "general":
							tipoM = TiposMercancias.General;
							break;
						case "refrigerada":
							tipoM = TiposMercancias.Refrigerada;
							break;
						case "pesada":
							tipoM = TiposMercancias.Pesada;
							break;
						default:
							break;
						}
						double peso = Double.parseDouble(datos[5]);
						Mercancias mercancia = new Mercancias(datos[1], datos[2], datos[3], datos[4], peso, tipoM);
						cargar.add(mercancia);
						break;
					case "peligroso":
						NivelRiego nivel = null;
						switch (datos[5].toLowerCase()) {
						case "uno":
							nivel = NivelRiego.Uno;
							break;
						case "dos":
							nivel = NivelRiego.Dos;
							break;
						case "tres":
							nivel = NivelRiego.Tres;
							break;
						case "cuatro":
							nivel = NivelRiego.Cuatro;
							break;
						case "cinco":
							nivel = NivelRiego.Cinco;
							break;
						default:
							break;
						}
						TiposMaterial tipoP = null;
						switch (datos[6].toLowerCase()) {
						case "quimicos":
							tipoP = TiposMaterial.Quimicos;
							break;
						case "explosivos":
							tipoP = TiposMaterial.Explosivos;
							break;
						case "radiactivos":
							tipoP = TiposMaterial.Radiactivos;
							break;
						default:
							break;
						}
						int riesgo = Integer.parseInt(datos[5]);
						Peligroso peligroso = new Peligroso(datos[1], datos[2], datos[3], datos[4], nivel, tipoP);
						cargar.add(peligroso);
						break;
					case "animales":
						TiposAnimales tipoA = null;
						switch (datos[6].toLowerCase()) {
						case "bovino":
							tipoA = TiposAnimales.Bovino;
							break;
						case "ovino":
							tipoA = TiposAnimales.Ovino;
							break;
						case "porcino":
							tipoA = TiposAnimales.Porcino;
							break;
						case "aves":
							tipoA = TiposAnimales.Aves;
							break;
						default:
							break;
						}
						int cantidad = Integer.parseInt(datos[5]);
						Animales animales = new Animales(datos[1], datos[2], datos[3], datos[4], cantidad, tipoA);
						cargar.add(animales);
						break;
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Error al leer el fichero.");
		}

	}

}
