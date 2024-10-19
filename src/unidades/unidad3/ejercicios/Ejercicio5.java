package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo realizar la suma de ambos, 
	en caso contrario realizar el producto del primero respecto al segundo.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	    System.out.print("Introduce el primer número:");
        int numero1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número:");
        int numero2 = entrada.nextInt();
        
	        if (numero1 > numero2) {
	        	
	        	int suma = numero1 + numero2;        
	            System.out.print("El resultado es:" +suma);
	
	        }else{
	        	
	        	int multiplicación= numero1 * numero2;
	            System.out.print("El resultado es:" +multiplicación);
	        	
	        }
			
	}

}

















