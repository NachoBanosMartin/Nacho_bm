package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Escribir un programa que indique cuántas cifras tiene un número entero introducido por teclado, 
		que estará comprendido entre 0 y 99999.*/
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce un número positivo de 1 o 2 dígitos: ");
        int numero = entrada.nextInt();
        
        if (numero >= 0 && numero <= 99999) {
            int cifras = String.valueOf(numero).length();
            System.out.println("El número tiene " + cifras + " cifras.");
        } else {
            System.out.println("El número ingresado no está en el rango especificado.");
        }
        
		entrada.close();

	}

}
