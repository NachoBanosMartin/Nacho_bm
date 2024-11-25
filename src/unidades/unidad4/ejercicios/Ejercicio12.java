package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	/* Escribe un método Java para calcular el área de un triángulo. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca la medida en cm del primer lado: ");
		double medida1 = entrada.nextDouble();
		System.out.println("Introduzca la medida en cm del segundo lado: ");
		double medida2 = entrada.nextDouble();
		System.out.println("Introduzca la medida en cm del tercer lado: ");
		double medida3 = entrada.nextDouble();

		double area = areaTriangulo(medida1, medida2, medida3);
		
        System.out.println("El área del triángulo es: " + area);

		
		entrada.close();
		
	}

	static double areaTriangulo(double medida1, double medida2, double medida3) {
		double semiperimetro = (medida1 + medida2 + medida3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - medida1) * (semiperimetro - medida2) * (semiperimetro - medida3));
	}

}
        