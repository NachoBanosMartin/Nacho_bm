package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Codificar un programa que solicite al usuario un número e indique si es par o impar.

	public static void main(String[] args) {
		
	     Scanner entrada = new Scanner(System.in);
	     int numero;
	        
	        System.out.print("Introduce un número: ");
	        numero = entrada.nextInt();
	        
	        if (numero % 2 == 0) {
	        	
            System.out.println("El número es par.");
            
	        }else{
	        	
	        System.out.println("El número es impar.");

	        }

	}

}
