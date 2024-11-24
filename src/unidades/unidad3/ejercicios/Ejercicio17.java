package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	
	/* La clínica veterinaria ofrece venta de pienso para ganado vacuno al por mayor, teniendo en cuenta que hay 3
	   categorías de alimentación: A, B y C. Los precios por kilogramo de pienso son 30, 20 y 15 céntimos 
	   respectivamente. Realizar un programa que recoja el tipo de pienso que desea el cliente y muestre el precio
	   por pantalla. En caso de elegir una opción no válida, se mostrará un mensaje de error. */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char pienso;
		boolean opcionValida = false;
		
		while (!opcionValida) {
			System.out.println("Indique A, B o C dependiendo del tipo de pienso que desee comprar: ");
			pienso = entrada.next().toUpperCase().charAt(0);
			
			switch (pienso) {
			    case 'A':
			        System.out.println("El precio del pienso tipo A es 30 céntimos por kilogramo.");
			        opcionValida = true;
			        break;
			    case 'B':
			        System.out.println("El precio del pienso tipo B es 20 céntimos por kilogramo.");
			        opcionValida = true;
			        break;
			    case 'C':
			        System.out.println("El precio del pienso tipo C es 15 céntimos por kilogramo.");
			        opcionValida = true;
			        break;
			    default:
			        System.out.println("Opción no válida. Por favor, elija A, B o C.");
			        break;
			}
		}
		
		entrada.close();
	}
}