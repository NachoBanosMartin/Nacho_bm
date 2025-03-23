package unidades.unidad7.ejemplos.envoltura;

public class Prueba {

	public static void main(String[] args) {
		
		String datos = "79/45.23/Juan";   // Ejemplo separando
		String datosTroceados[] = datos.split("/");
		Integer datoNumero = Integer.parseInt(datosTroceados[0]);
		Double datoDecimal = Double.parseDouble(datosTroceados[1]);
		
		System.out.println(datoNumero);

		System.out.println(datoDecimal);
		
		System.out.println(datosTroceados[2]);
		
	}

}
