package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promociona"
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Ingresa la primera nota: ");
		 
			double nota1 = entrada.nextDouble();
			
		System.out.println("Ingresa la segunda nota: ");
		
			double nota2 = entrada.nextDouble();
			
		System.out.println("Ingresa la tercera nota: ");
		
			double nota3 = entrada.nextDouble();
			
		double promedio = (nota1 + nota2 + nota3)/3;
		
		if (promedio >= 7) {
			
			System.out.println("Promociona");
			
		}else {
			
			System.out.println("No promociona");
		}
				
		
		entrada.close();
		
	}

}
