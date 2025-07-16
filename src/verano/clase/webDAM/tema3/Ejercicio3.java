package verano.clase.webDAM.tema3;

import java.util.Scanner;

public class Ejercicio3 {
	
	// Solicitar dos números distintos y mostrar cuál es el mayor.

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce el primer número: ");
		double numero1 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introduce el segundo número: ");
		double numero2 = entrada.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("El número mayor es " + numero1);
		}else {
			System.out.println("El número mayor es " + numero2);
		}

		
	}

}
