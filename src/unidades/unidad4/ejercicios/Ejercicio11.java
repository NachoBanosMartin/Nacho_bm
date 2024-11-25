package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	/* Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros. Recuerda
	   que una milla son 1,60934 kilómetros. Implementa y utiliza la función: double millas_a_kilometros(int millas)
	   Devuelve la conversión de millas a kilómetros. */
	
	public static void main(String[] args) {
		

		Scanner entrada = new Scanner (System.in);

		System.out.println("Escriba un número en millas para saber su equivalente en kilómetros: ");
		double milla = entrada.nextDouble();
		
		double resultado = millas_a_kilometros(milla);
        
        System.out.println(milla + " millas son equivalentes a " + resultado + " kilómetros.");
		
	}

	static double millas_a_kilometros(double milla) {
		double equivalenteEnKilometros = 1.60934;

		return milla * equivalenteEnKilometros ;
	}

}
