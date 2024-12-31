package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	
	/*
	 Cree una aplicación que contenga un array que almacene ocho enteros. La aplicación debe llamar a cinco métodos:
	 
	 (1) Mostrar todos los enteros
	 (2) Mostrar todos los enteros en orden inverso
	 (3) Mostrar la suma de los enteros
	 (4) Mostrar todos los valores menores que un argumento limitante 
	 (5) Mostrar todos los valores que son más altos que el valor promedio calculado
	 
	 Guarde el archivo como MetodosArray.java
	*/
	
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int [] array = new int [8];
		llenarArray(array);
		mostrarArray(array);
		mostrarArrayInverso(array);
		sumarValores(array);
		mostrarMayoresQuePromedio(array);

	}

	static void llenarArray(int[] array) {     // Metodo para llenar el array con valores del usuario
		System.out.println("Introduce 8 valores enteros: ");
		for (int i = 0; i < array.length; i ++) {
			array[i] = entrada.nextInt();
		}
		
	}
	
	static void mostrarArray(int[] array) {    // Metodo para mostrar el array
		System.out.print("La array creada es: [");
		for (int i = 0; i < array.length; i ++) {
		System.out.print(array[i]);
		if (i < array.length - 1) {
			System.out.print(", ");
		}
		
	}
	System.out.println("]");

	}
		
	static void mostrarArrayInverso(int[] array) {   // Metodo para mostrar el array en orden inverso
		System.out.print("Array inverso: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	static void sumarValores(int[] array) {       // Metodo para sumar todos los valores de la array
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i]; 
		}
		System.out.println("La suma de los valores de la array es: " + suma);
	}
	

	static void mostrarMayoresQuePromedio(int[] array) {    // Metodo para mostrar los valores mayores que el promedio
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i]; 
		}
		double media = (double) suma / array.length;
		System.out.println("La media es: " + media);
		System.out.print("Valores mayores que la media: [");
		boolean primero = true;                         // Esta variable es para controlar la impresión de comas
		for (int i = 0; i < array.length; i++) {
		    if (array[i] > media) {
		        if (!primero) {
		            System.out.print(", ");            // Imprimimos una coma solo si no es el primer valor
		        }
		        System.out.print(array[i]);
		        primero = false;                       // Después de imprimir el primer valor, cambiamos 'primero' a 'false'
		    }
		}
		System.out.println("]");
		
	}

}

