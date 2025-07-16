package unidades.desdeCasa.reparaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import unidades.desdeCasa.gasolinera.Usuario;
import unidades.unidad9.ejemplos.metodosColecciones.comparaciones.ComparatorNombreJugador;

public class Main {

	public static void main(String[] args) {

		Map<Integer, List<Vehiculo>> reparaciones = new TreeMap<>();

		String fichero = "reparacionesVehiculos.txt";
		cargarVehiculo(fichero, reparaciones);

		for (Map.Entry<Integer, List<Vehiculo>> entry : reparaciones.entrySet()) {
			Integer anio = entry.getKey();
			List<Vehiculo> vehiculos = entry.getValue();

			System.out.println("Reparaciones en " + anio + " :");

			for (Vehiculo v : vehiculos) {
				System.out.println(v.toString()); 
			}
		}

	}

	public static void cargarVehiculo(String nombreFichero, Map<Integer, List<Vehiculo>> reparaciones) {

		try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {
			String linea;
			int i = 0;

			while ((linea = lector.readLine()) != null) {
				String[] datos = linea.split("\\s+");
				if (datos.length == 6) {
					String tipo = datos[0];
					int numMatricula = Integer.parseInt(datos[1]);
					String letrasmatricula = datos[2];

					Vehiculo vehiculo = new Vehiculo(tipo, numMatricula, letrasmatricula);

					for (int j = 3; j < datos.length; j++) {
						int anio = Integer.parseInt(datos[j]);
						vehiculo.agregarAno(anio);

						if (!reparaciones.containsKey(anio)) {
							reparaciones.put(anio, new ArrayList<>());
						}

						reparaciones.get(anio).add(vehiculo);
					}

				}
			}
		} catch (IOException e) {
			System.out.println("Error al leer los usuarios: " + e.getMessage());
		}

	}

}
