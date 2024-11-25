package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
	
	/* Determinar el precio de un billete de tren, conociendo la distancia a recorrer y sabiendo que si el número
	   de días de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%.
	   El precio por km es de 2,5 €. */

	public static void main(String[] args) {
		
		double precioKm = 2.5;
		double reduccion = 0.30;
		int distanciaKm = 0;
		int numDias = 0;

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Indique la distancia en km que quiera recorrer: ");
		distanciaKm = entrada.nextInt();
		
		System.out.println("Ahora, indique el número de días que durará su viaje: ");
		numDias = entrada.nextInt();
		
		double precioTotal = distanciaKm * precioKm;
		
		
		if (numDias > 7 && distanciaKm > 800) {
            precioTotal = precioTotal * (1 - reduccion);
		}
		
        System.out.println("El precio del billete es: " + precioTotal + " €");

        
		entrada.close();
		
		
	}

}
