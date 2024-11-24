package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	
	/* Crea un programa llamado MedidasTornillos, que pida por teclado el tamaño de un tornillo y muestre por pantalla
	   el texto correspondiente al tamaño. */
	
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el tamaño del tornillo deseado: ");
		double medida = entrada.nextDouble();
		
		if (medida >= 1 && medida <= 2.9) {
			System.out.println("Tornillo de tamaño pequeño");
		}else if (medida >= 3 && medida <= 4.9){
			System.out.println("Tornillo de tamaño mediano");
		}else if (medida >= 5 && medida <= 6.4) {
			System.out.println("Tornillo de tamaño grande");
		}else if (medida >= 6.5 && medida <= 8.5) {
			System.out.println("Tornillo de tamaño muy grande");
		}else {
			System.out.println("No existen tornillos con esa medida");
		}
		
				
		entrada.close();
		
		
	}

}
