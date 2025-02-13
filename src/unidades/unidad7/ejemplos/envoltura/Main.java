package unidades.unidad7.ejemplos.envoltura;

public class Main {

	public static void main(String[] args) {

		int numero = 0;
		
		byte numeroEnByte = (byte)numero;
		
		Integer otroNumero = 10;
		
		Byte otroNumeroEnByte = otroNumero.byteValue();
		
		Integer numero2 =35;
		int resultado = numero2.compareTo(otroNumero);
		
		Integer numero3 = Integer.parseInt("79");  //Para pasar entero a cadena
		Double decimal = Double.parseDouble("45.23");
		
		String datos = "79|45.23|Juan";   // Ejemplo separando
		String datosTroceados[] = datos.split("\\|");
		Integer datoNumero = Integer.parseInt(datosTroceados[0]);
		Double datoDecimal = Double.parseDouble(datosTroceados[1]);
		
		System.out.println("Dato entero: " + datoNumero);
		System.out.println("Dato decimal: " + datoDecimal);
		System.out.println("Dato nombre: " + datosTroceados[2]);
		
		
		String numeroCadena = String.valueOf(datoNumero);  // Al revés
		System.out.println("Dato en formato cadena: " + numeroCadena);



		
		int numeroCualquiera = numero3.intValue(); // Para pasar cadena a entero
		double numeroDecimal = decimal.doubleValue();
		
		if(numero2 > otroNumero) {
			System.out.println("Es mayor");

		}else {
			System.out.println("Es menor");
		}
		
		Integer otroEntero = new Integer(10);
		
		System.out.println(numero);
		System.out.println(otroNumero);
		System.out.println(otroEntero);

		
	
	}

}
