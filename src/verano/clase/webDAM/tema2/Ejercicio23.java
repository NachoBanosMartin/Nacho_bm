package verano.clase.webDAM.tema2;

import java.util.Scanner;

public class Ejercicio23 {

	/*
	 * Nos piden realizar un programa que a partir del peso expresado en gramos nos
	 * muestre su equivalencia en kilogramos, libras y onzas. Hay que tener en
	 * cuenta que:
	 * 
	 * 1 libra (lb) = 16 onzas (oz) = 0,454 kilogramos (kg)
	 * 
	 * 1 kilogramo = 2,2 libras
	 * 
	 * 1 oz = 28,35 gramos (g)
	 * 
	 * 1 gramo = 0,035 oz
	 */

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingrese el peso en gramos: ");
		double gramos = entrada.nextDouble();
		
        double kilogramos = gramos / 1000;            // 1 kg = 1000 g
        double onzas = gramos * 0.035;                // 1 g = 0.035 oz
        double libras = onzas / 16;                   // 1 lb = 16 oz

        System.out.println("Equivalente en kilogramos: " + kilogramos);
        System.out.println("Equivalente en libras: " + libras);
        System.out.println("Equivalente en onzas: " + onzas);
        
	}

}
