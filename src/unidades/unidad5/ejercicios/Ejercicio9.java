package unidades.unidad5.ejercicios;

public class Ejercicio9 {

	// Escriba un programa Java para encontrar los elementos comunes entre dos matrices de enteros.
	
	public static void main(String[] args) {

		int [] array1 = {23, 14, 25, 5, 64, 12, 2, 32, 11, 10};
		int [] array2 = {1, 14, 5, 75, 24, 12, 3, 32, 62, 10};
		
		int [] iguales = encontrarElementoIgual (array1, array2);
		
		System.out.println("Elementos iguales: ");
		for (int elementos : iguales) {
			if (elementos != 0) {
				System.out.println(elementos + " ");
			}
			
		}
	}

	static int [] encontrarElementoIgual(int[] array1, int[] array2) {
		int [] iguales = new int [array1.length];
		int contador = 0;
		
		for (int i = 0; i < array1.length; i ++) {
			for (int j = 0; j < array2.length; j ++) {
				if (array1 [i] == (array2 [j])) {
					iguales [contador] = array1[i];
					contador ++;
					break;
				}
			}
		}
		
		return iguales;
	}

}
