package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Realizar de nuevo el ejercicio anterior considerando el caso de que los números introducidos sean iguales.

	public static void main(String[] args) {
		
		   Scanner entrada = new Scanner(System.in);

		    System.out.print("Introduce el primer número:");
	        int numero1 = entrada.nextInt();
	        
	        System.out.print("Introduce el segundo número:");
	        int numero2 = entrada.nextInt();
	        
	        
	        
	        if (numero1 > numero2) {
	        	
	            System.out.println("El número mayor es: " + numero1);
	        }
	        
		        else if (numero1 == numero2) {
		        	
		            System.out.println("Los números " +numero1+ " y " +numero2+" son iguales");
		        }
		        	      	
		    else {
		        	
	            System.out.println("El número mayor es: " + numero2);

		    }

	}

}
