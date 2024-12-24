package unidades.unidad5.ejercicios;

public class Ejercicio10 {
	
	/* 
	Escriba una aplicación que almacene nueve enteros en un array. Muestre el primer y último entero y 
	luego visualice los enteros del último al primero. Guarde el archivo como NuevoEnteros.java
	*/

	public static void main(String[] args) {
		
		int[] array = {23, 14, 25, 5, 64, 12, 2, 32, 11};

		
		System.out.println("Primer entero: " + array[0]);
		System.out.println("Último entero: " + array[array.length - 1]);

		System.out.println("Enteros en orden inverso:");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}