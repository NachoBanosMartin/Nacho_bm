package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no. 
		Implementa y utiliza la función: 
		 
                  boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario*/

		Scanner scanner = new Scanner (System.in);
		
		
		int edad = pedirEdad();
		mostrarResultado(edad);
		
		scanner.close();
		
			
	}
	
	 static int pedirEdad() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Introduzca su edad: ");
	        int edad = scanner.nextInt();
	        scanner.close();
	        return edad;
	}
	
	 static void mostrarResultado(int edad) {
	        if (esMayorEdad(edad)) {
	            System.out.println("Eres mayor de edad.");
	        } else {
	            System.out.println("Eres menor de edad.");
	        }
	 }
	   
	static boolean esMayorEdad(int a) {
		return a >= 18;
	}
	
}
