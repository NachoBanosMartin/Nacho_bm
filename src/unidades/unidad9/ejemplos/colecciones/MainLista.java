package unidades.unidad9.ejemplos.colecciones;

import java.util.ArrayList;
import java.util.List;

public class MainLista {

	public static void main(String[] args) {
		
		// Crear listas vacias

		List<String> conjuntoMarcasAs = new ArrayList<String>();
		List<String> conjuntoMarcasEu = new ArrayList<String>();
		
		// Añadir elementos a la lista (colección)
		
		conjuntoMarcasAs.add("Toyota");
		conjuntoMarcasAs.add("Mazda");
		conjuntoMarcasAs.add("Honda");
		
		System.out.println(conjuntoMarcasAs);


		conjuntoMarcasEu.add("Mercedes");
		conjuntoMarcasEu.add("Renault");
		conjuntoMarcasEu.add("Seat");
		
		System.out.println(conjuntoMarcasEu);


		for(String marca:conjuntoMarcasAs) {
			System.out.println(marca);
		}
		
		/*
		 * for(int i = 0 < listaMarcaAs.size(); i ++{
		 * System.out.println(marca);
		*/
		
		// Copia de lista
		
		List<String> conjuntoMarcas = new ArrayList<String>(conjuntoMarcasAs);
		conjuntoMarcas.addAll(conjuntoMarcasEu);
		System.out.println(conjuntoMarcas);

		
		// Eliminar
		
		conjuntoMarcas.remove("Toyota");
		System.out.println(conjuntoMarcas);
		
		// listaMarca.removeAll(listaMarcaEu);
		// System.out.println(listaMarca);
		
		
		// Eliminar de la lista todas las que no estén en la contraria
		
		conjuntoMarcas.retainAll(conjuntoMarcasEu);
		System.out.println(conjuntoMarcas);
		
		// Preguntar si no está vacía
		
		if(!conjuntoMarcas.isEmpty()) {
			System.out.println("Tamaño lista marcas: " + conjuntoMarcas.size());
		}
		
		if(conjuntoMarcas.contains("Mercedes")) {
			System.out.println("Contiene a Mercedes");
		}
		
		if(conjuntoMarcas.contains(conjuntoMarcasAs)) {
			System.out.println("Contiene las marcas asiáticas");
		}
		
		
		
		
		// ------------------------------------Métodos de List---------------------------
		
		conjuntoMarcas.add(1, "Ford");
		System.out.println(conjuntoMarcas);
		
		List<String> conjuntoMarcasAm = new ArrayList<String>();
		System.out.println("Chevrolet");
		System.out.println("Tesla");
		System.out.println("Jeep");
		
		

		conjuntoMarcas.addAll(2, conjuntoMarcasAm);

		
		conjuntoMarcas.remove(3);
		System.out.println(conjuntoMarcas);
		
		System.out.println("Marca en la posición 5: " + conjuntoMarcas.get(2));


		
		List<String> listaMarcaFav = conjuntoMarcas.subList(1, 3);
		System.out.println("Favoritas: " + listaMarcaFav);

	}

}
