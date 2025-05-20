package unidades.unidad9.ejemplos.metodosColecciones.maps;

import java.util.HashMap;

public class MainMapa {

	public static void main(String[] args) {

		HashMap<String, Double> cuentas = new HashMap <String, Double>();
		
		cuentas.put("Juan", 345.45);
		cuentas.put("Ana", 123.22);
		cuentas.put("Tomás", 12345.89);
		cuentas.put("Ramiro", 99.9);
		cuentas.put("Carlos", -12.76);
		
		
		System.out.println(cuentas.get("Ana"));


	}

}
