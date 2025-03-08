package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 Realiza un algoritmo que introducidas las notas de N alumnos nos indicará 
	 cuántos aprobados y cuántos suspensos hay. Generaliza este ejercicio para
	 una cantidad indefinida de notas (pararemos con una nota negativa). Amplía
	 el ejercicio indicando no solo cuántos aprobados hay, también cuántos 
	 sobresalientes, notables, bienes, aprobados y suspensos. 
	*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nota;
		int insuficiente = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
		System.out.println("Introduce las notas de los alumnos (introduce un número negativo para finalizar):");

		
		do {
			
			
		            System.out.print("Nota: ");
		            nota = entrada.nextInt();
		            
		            if (nota < 0) { // Condición de salida
		                break;
		            }
		            
		            if (nota < 5) {
		                insuficiente++;
		            } else if (nota == 5) {
		                suficiente++;
		            } else if (nota == 6) {
		                bien++;
		            } else if (nota >= 7 && nota <= 8) {
		                notable++;
		            } else if (nota >= 9 && nota <= 10) {
		                sobresaliente++;
		            } else {
		                System.out.println("Nota no válida. Introduce una nota entre 0 y 10.");
		            }
		        
		}while(nota >= 0 || nota <= 10);
		
		
		 
		 entrada.close();
	        
	        // Mostrar los resultados
	        System.out.println("\nResultados:");
	        System.out.println("Insuficientes: " + insuficiente);
	        System.out.println("Suficientes: " + suficiente);
	        System.out.println("Bien: " + bien);
	        System.out.println("Notables: " + notable);
	        System.out.println("Sobresalientes: " + sobresaliente);
	    }
	}