package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		/*Realizar un programa que acepte dos números enteros por teclado. A continuación, 
		muestre un menú de operaciones a realizar con los dos números. Estas operaciones serán: 
		suma, resta, multiplicación y división. Se indicará la letra correspondiente la 
		operación (S,R,M y D). Se mostrará por pantalla el resultado de la operación elegida. */
		
		Scanner entrada = new Scanner (System.in);
		int numero1 = 0, numero2 = 0;
		char opcion;
		
		
		
		do {
			
			System.out.println("Primer número: ");
			numero1 = entrada.nextInt();
			
			System.out.println("Segundo número: ");
			numero2 = entrada.nextInt();

			System.out.println("---MENÚ---");
			System.out.println("S = suma");
			System.out.println("R = resta");
			System.out.println("M = multiplicación");
			System.out.println("D = división");
			System.out.println("C = cerrar programa");

			System.out.print("Elija una opción (S,R,M,D y C)");
			
			opcion = entrada.next().charAt(0);
			System.out.println("DATOS");
			System.out.println("NÚMERO 1: " +numero1);
			System.out.println("NÚMERO 2: " +numero2);
			System.out.println("OPCIÓN: " +opcion);
			
			switch (opcion) {
			
				case 'S':
					break;
				case 'R':
					break;
				case 'M':
					break;
				case 'D':
					break;
				case 'C':
					break;
				default: 
				
			}
			
		}while (opcion != 'C');
		
						
		/*También se puede hacer con el if y el else if
		 
		if (opcion == 'S' ) {
			
		}else if (opcion =='R') {
			
		}else if (opcion =='M') {
			
		}else if (opcion =='D') {
			
		}else if (opcion =='C') {
		
		}else{	
		
		}
		*/
		
		entrada.close();
				
	}

}
