package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Pedir dos números y mostrarlos ordenados de forma decreciente.

	public static void main(String[] args) {
		
		   Scanner entrada = new Scanner(System.in);

		        
		        System.out.print("Introduce el primer número:");
		        int numero1 = entrada.nextInt();
		        
		        System.out.print("Introduce el segundo número:");
		        int numero2 = entrada.nextInt();
		        
		        if (numero1 > numero2) {
		        	
		        System.out.print("Número en orden decreciente");
		        
		        }else {
		        	
			    System.out.print("Número en orden creciente");

		        }
	
	}

}
