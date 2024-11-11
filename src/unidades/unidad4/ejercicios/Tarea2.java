package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		
		static Scanner entrada = new Scanner(System.in);

		
		double constanteGravitacional;
		double kilosMasaPlaneta;
		double metrosRadioPlaneta;
		double gravedad = constanteGravitacional * kilosMasaPlaneta / metrosRadioPlaneta;
		int datos;
		
		
		
		System.out.println("Introduce los datos que se piden para calcular la gravedad en la superficie del planeta");
		System.out.println("Ingrese la constante gravitacional en: ");
		double constanteGravitacional= entrada.nextInt();
		
		System.out.println("Ingrese la masa del planeta en metros: ");
		System.out.println("Ingrese el radio del planeta en metros: ");
		System.out.println("La gravedad en la superficie del planeta es: " +gravedad);
		
		entrada.close();
		
		
		
		}

}


