package unidades.unidad3.ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 Realizar un programa que lea por teclado dos números, si el primero es mayor
		 al segundo realizar la suma de ambos, en caso contrario realizar el producto
		 del primero respecto al segundo.
		*/
		
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		
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
            }
        } while (numero2 <= 0);
		
		
			System.out.println("----RESULTADO----");
			if(numero1 > numero2) {
				int suma = numero1 + numero2;
				System.out.println("La suma de los números es: " + suma);
			}else {
				int multiplicacion = numero1 * numero2;
				System.out.println("La multiplicacion de los números es: " + multiplicacion);
			}			
		
		
		
		entrada.close();
		
	}

}
