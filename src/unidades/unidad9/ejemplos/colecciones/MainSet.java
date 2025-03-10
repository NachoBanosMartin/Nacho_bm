package unidades.unidad9.ejemplos.colecciones;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		// Crear listas vacias

				Set<String> listaMarcaAs = new HashSet<String>();
				Set<String> listaMarcaEu = new HashSet<String>();
				
				// Añadir elementos a la lista (colección)
				
				listaMarcaAs.add("Toyota");
				listaMarcaAs.add("Mazda");
				listaMarcaAs.add("Honda");
				
				System.out.println(listaMarcaAs);


				listaMarcaEu.add("Mercedes");
				listaMarcaEu.add("Renault");
				listaMarcaEu.add("Seat");
				
				System.out.println(listaMarcaEu);


				for(String marca:listaMarcaAs) {
					System.out.println(marca);
				}
				
				/*
				 * for(int i = 0 < listaMarcaAs.size(); i ++{
				 * System.out.println(marca);
				*/
				
				// Copia de lista
				
				Set<String> listaMarca = new HashSet<String>(listaMarcaAs);
				listaMarca.addAll(listaMarcaEu);
				System.out.println(listaMarca);

				
				// Eliminar
				
				listaMarca.remove("Toyota");
				System.out.println(listaMarca);
				
				listaMarca.removeAll(listaMarcaEu);
				System.out.println(listaMarca);
				
				
				// Eliminar de la lista todas las que no estén en la contraria
				
				// listaMarca.retainAll(listaMarcaEu);
				// System.out.println(listaMarca);
				
				// Preguntar si no está vacía
				
				if(!listaMarca.isEmpty()) {
					System.out.println("Tamaño lista marcas: " + listaMarca.size());
				}

	}

}
