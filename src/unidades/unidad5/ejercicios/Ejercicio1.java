package unidades.unidad5.ejercicios;

public class Ejercicio1 {
	
	// Escriba un programa Java para calcular el valor promedio de los elementos de la matriz

	public static void main(String[] args) {

		int [] números = {10,23,4,5,12,33,9,11,16,17};
		int suma = 0;
		
		for(int i = 0; i < números.length; i++) {
		suma += números[i];
		}
		
		double media = (double) suma/números.length;
		
		System.out.println("La media de los números de la array es: " + media);
		
		
	}

}
