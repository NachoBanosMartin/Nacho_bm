package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
	
	/*
	 En una veterinaria de nuestra localidad ofrece distintos tipos de análisis a perros. Los precios de los análisis son
	 como siguen: Tipo de análisis 1= 25.00 €; Tipo de análisis 2= 36.00 €; Tipo de análisis 3= 50.00 €. Realizar un 
	 programa que muestre el precio al indicar el tipo de análisis.

 	 Por otra parte, existen clientes afiliados y no afiliados. En caso de que el animal pertenezca a un cliente afiliado
 	 se le descuenta un 8% al precio del análisis. Introduce en una segunda versión del programa este cálculo.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique del 1 al 3 qué tipo de análisis quiere realizar a su perro");
		int analisis = entrada.nextInt();
		
		double precio = 0;
		switch (analisis) {
			case 1:
				precio = 25.00;
				break;
			case 2:
				precio = 36.00;
				break;
			case 3:
				precio = 50.00;
				break;
			default:
				System.out.println("El dato introducido no corresponde a ningún tipo de análisis");
				entrada.close();
				return;
		}
		
		System.out.println("¿Es usted un cliente afiliado? (sí/no)");
		String afiliado = entrada.next();
		
		if (afiliado.equalsIgnoreCase("sí") || afiliado.equalsIgnoreCase("si")) {
			precio *= 0.92;
		}
		
		System.out.printf("El análisis de su mascota tiene un precio de %.2f €%n", precio);
		
		entrada.close();
	}
}
