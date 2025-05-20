package unidades.unidad9.ejemplos.metodosColecciones.iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

	public static void main(String[] args) {

		ArrayList<String> marca = new ArrayList<String>();
		
		marca.add("BMW");
		marca.add("Audi");
		marca.add("Nissan");
		marca.add("Volvo");
		marca.add("Porche");
		marca.add("Tesla");
		
		
		System.out.println("Contenido original de la lista");
		Iterator<String> it = marca.iterator();

		// Con el while recorro
		
		while(it.hasNext()) {
			String elemento = it.next();
			System.out.println(elemento);
		}
	}

}
