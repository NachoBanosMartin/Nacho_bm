package unidades.unidad5.ejercicios;

public class Ejercicio6 {
	
	// Escriba un programa Java para encontrar el valor máximo y mínimo de una matriz.

	public static void main(String[] args) {

		int elementos[] = {3,4,5,234,27,28,1,53,90,97};
		
		int max = elementos [0];
		int min = elementos [0];
		
		for (int i = 0; i < elementos.length; i ++) {
			if (elementos [i] > max) {
				max = elementos [i];
			}
			
			if (elementos [i] < min) {
				min = elementos [i];
			}
		}
		
		System.out.println("El valor máximo del array es: " + max);
		System.out.println("El valor mínimo del array es: " + min);
	}

}
