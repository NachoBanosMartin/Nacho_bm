package verano.clase.webDAM.tema3;

import java.util.Scanner;

public class Ejercicio4 {

	// Realizar de nuevo el ejercicio anterior considerando el caso de que los
	// números introducidos sean iguales.

	public static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double numero1, numero2;
		do {
			System.out.println("Introduce el primer número: ");
			numero1 = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Introduce el segundo número: ");
			numero2 = entrada.nextDouble();

			if (numero1 == numero2) {
				System.out.println("Error, debes introducir números distintos");
			}
		} while (numero1 == numero2);

		if (numero1 > numero2) {
			System.out.println("El número mayor es " + numero1);
		} else {
			System.out.println("El número mayor es " + numero2);
		}
	}

}
