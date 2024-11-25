package unidades.unidad3.ejercicios;

public class Ejercicio19 {
	
	/* Desarrollar un programa Java que sume los números del 1 al 100 (ambos inclusive). */
	
	public static void main(String[] args) {

		int suma = 0;
		
		for (int i = 1; i <= 100; i++) {
			suma += i;
		}
		
		System.out.println("La suma de los números del 1 al 100 es: " +suma);

		
	}

}
