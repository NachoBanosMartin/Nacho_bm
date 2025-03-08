package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio3 {
	
	// Solicitar dos números distintos y mostrar cuál es el mayor.

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int mayor;
		
		do {
			System.out.println("Introduzca el primer número positivo: ");
			numero1 = entrada.nextInt();
			if(numero1 <= 0) {
				System.out.println("Error: Debe ingresar un número positivo");
			}
		}while(numero1 <= 0);
		
		do {
            System.out.print("Introduzca el segundo número positivo y distinto del primero: ");
            numero2 = entrada.nextInt();
            if (numero2 <= 0) {
                System.out.println("Error: Debe ingresar un número positivo.");
            } else if (numero2 == numero1) {
                System.out.println("Error: Debe ingresar un número diferente al primero.");
            }
        } while (numero2 <= 0 || numero2 == numero1);
		
		mayor = Math.max(numero1, numero2);
		System.out.println("El número mayor es: " + mayor);
		
		entrada.close();
		
	}

}
