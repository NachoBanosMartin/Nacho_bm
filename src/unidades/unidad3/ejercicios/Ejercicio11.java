package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	
	/* Implemente una aplicación que tome el peso en kilos 	de una cantidad de ropa a lavar en una lavadora
	 industrial y nos devuelva el nivel de agua dependiendo del peso. Se sabe que con más de 30 kilos la lavadora
	 no funcionará ya que es DEMASIADO PESO. Si la ropa pesa 22 o más kilos, el nivel será de MÁXIMO; si pesa 15 
	 o más será de ALTO; si pesa 8 o más, será un nivel MEDIO; o de lo contrario el nivel será MÍNIMO. */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);	
		System.out.println("Introduce el peso en kg de la cantidad de ropa deseada: ");
		double peso = entrada.nextDouble();
		
		
		if (peso > 30) {
			System.out.println("DEMASIADO PESO (La lavadora no funcionará)");
		}else if (peso >= 22){
			System.out.println("Nivel de agua: MÁXIMO");
		}else if (peso >= 15){
			System.out.println("Nivel de agua: ALTO");
		}else if (peso >= 8) {
			System.out.println("Nivel de agua: MEDIO");
		}else {
			System.out.println("Nivel de agua: MÍNIMO");
		}
		
		
		entrada.close();
		

	}

}
