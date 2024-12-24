package unidades.unidad5.ejercicios;

public class Ejercicio8 {
	
	// Escriba un programa Java para encontrar los elementos comunes entre dos matrices (valores de cadena).

	public static void main(String[] args) {
		
		String [] array1 = {"Periquito", "Agaporni", "Canario", "Jilguero", "Verderón"};
		String [] array2 = {"Jilguero", "Ninfa", "Cotorra", "Gould", "Mandarín"};
	
		String [] iguales = encontrarElementoIgual (array1, array2);
	
		System.out.println("Elementos iguales: ");
		for (String elemento : iguales) {
			if (elemento != null) {
				System.out.println(elemento + " ");
			}
		}
	
	}

	static String[] encontrarElementoIgual(String[] array1, String[] array2) {
		String [] iguales = new String [array1.length];
		int contador = 0;
		
		for (int i = 0; i < array1.length; i ++) {
			for ( int j = 0; j < array2.length; j ++) {
				if (array1[i].equals(array2[j])) {
					iguales[contador] = array1[i];
					contador ++;
					break;
				}
			}
		}
		return iguales;
	}

}
