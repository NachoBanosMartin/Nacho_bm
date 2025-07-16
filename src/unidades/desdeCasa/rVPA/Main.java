package unidades.desdeCasa.rVPA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		// Mapa donde clave es el año, y valor es una lista de vehículos
		Map<Integer, List<String>> reparacionesPorAno = new TreeMap<>();

		try {
			BufferedReader lector = new BufferedReader(new FileReader("reparacionesVehiculos.txt"));
			String linea;

			while ((linea = lector.readLine()) != null) {
				// Separar la línea por espacios
				String[] partes = linea.split(" ");

				// Aseguramos que hay al menos 4 partes (Tipo, Parte1Matricula, Parte2Matricula,
				// Año1...)
				if (partes.length >= 4) {
					String tipo = partes[0];
					String matricula = partes[1] + partes[2];
					String vehiculo = tipo + " " + matricula;

					// Recorrer los años a partir del índice 3
					for (int i = 3; i < partes.length; i++) {
						try {
							int ano = Integer.parseInt(partes[i]);
							// Usamos containsKey para comprobar si ya existe el año
							if (!reparacionesPorAno.containsKey(ano)) {
								reparacionesPorAno.put(ano, new ArrayList<>());
							}
							// Añadimos el vehículo a la lista del año correspondiente
							reparacionesPorAno.get(ano).add(vehiculo);
						} catch (NumberFormatException e) {
							System.out.println("Año no válido en la línea: " + linea);
						}

					}
				}

			}

		} catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
		}
		
		for (Integer ano : reparacionesPorAno.keySet()) {
			System.out.println("Reparaciones en " + ano + ":");

		    List<String> vehiculos = reparacionesPorAno.get(ano);
		    for (String vehiculo : vehiculos) {
		        System.out.println("- " + vehiculo);
		    }
		}

	}
}
