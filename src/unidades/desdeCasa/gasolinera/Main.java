package unidades.desdeCasa.gasolinera;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import unidades.desdeCasa.agenciaTransporte.Animales;
import unidades.desdeCasa.agenciaTransporte.Mercancias;
import unidades.desdeCasa.agenciaTransporte.NivelRiego;
import unidades.desdeCasa.agenciaTransporte.Peligroso;
import unidades.desdeCasa.agenciaTransporte.TiposAnimales;
import unidades.desdeCasa.agenciaTransporte.TiposMaterial;
import unidades.desdeCasa.agenciaTransporte.TiposMercancias;
import unidades.desdeCasa.agenciaTransporte.Transporte;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		do {

			mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.out.println("Gracias por usar la gasolinera. Vuelva cuando quiera.");
				break;
			default:
				System.out.println("Opción marcada inválida.");
			}

		} while (opcion != 6);
	}

	private static void mostrarMenu() {

		System.out.println("------GASOLINERA------");
		System.out.println("1. Repostar.");
		System.out.println("2. Ver comprobantes.");
		System.out.println("3. Consultar estadisticas personales.");
		System.out.println("4. Reabastecer depositos.");
		System.out.println("5. Consultar estadisticas generales.");
		System.out.println("6. Salir.");
		System.out.println("Seleccione la opción que desee: ");
	}

	public void guardarFichero() {

		try {
			BufferedWriter escritor = new BufferedWriter(
					new FileWriter("C:\\Users\\nacho\\git\\Nacho_bm\\gasolinera.txt"));
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

	public static int obtenerNumUsuReg(String nombreFichero) {

		int contador = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
			while (br.readLine() != null) {
				contador++;
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}

		return contador;
	}

	private static Usuario[] cargarUsuarios() {
		
		int tamanoVector = obtenerNumUsuReg("C:\\Users\\nacho\\git\\Nacho_bm\\gasolinera.txt") ;

		Usuario[] usuario = new Usuario[tamanoVector];

		try {
			FileReader fichero = new FileReader("C:\\Users\\nacho\\git\\Nacho_bm\\gasolinera.txt");
			BufferedReader leer = new BufferedReader(fichero);

			String linea = leer.readLine();
			while (linea != null) {
				String datos[] = linea.split(";");
				if (datos.length == 6) {
					
					
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
