package unidades.unidad5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	
	// Escriba un programa Java para eliminar un elemento específico de una matriz.

	public static void main(String[] args) {
		
		int [] números = {10,3,4,5,7,33,9,11,2,1};
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Indique el número que desea eliminar de la matriz: ");
		int valorSeleccionado = entrada.nextInt();
		
		// Cuento cuantas veces aparece el valor que quiero eliminar 		
		int contador = 0;
		for (int i = 0; i < números.length; i ++) {
			if (números[i] == valorSeleccionado) {
				contador ++;
			}
		}
		
		// Creo una nueva array con el tamaño adecuado
		int [] nuevaArray = new int [números.length - contador];
		int index = 0;
		
		// Copio los elementos que no son el valor que quiero eliminar
		for (int i = 0; i < números.length; i ++) {
			if (números[i] != valorSeleccionado) {
				nuevaArray[index ++] = números [i];
			}
			
		}
		
		System.out.println("La array después de eliminar el valor seleccionado sería esta: " + Arrays.toString(nuevaArray));
		
		entrada.close();
	
	}

}
