package unidades.unidad2.tareas;

import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
		
	       	final double G = 6.674e-11; // Constante gravitacional (en notación científica)
	        final double PI = 3.14159;
	        final double gravedadTierra = 9.81;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la masa del planeta (kg): ");
	        double masaPlaneta = scanner.nextDouble();

	        System.out.print("Ingrese el radio del planeta (m): ");
	        double radioPlaneta = scanner.nextDouble();

	        System.out.print("Ingrese el peso del objeto en la Tierra (kg): ");
	        double pesoObjetoTierra = scanner.nextDouble();

	        // Cálculo de la gravedad en la superficie del planeta
	        double radioPlanetaCuadrado = radioPlaneta * radioPlaneta;
	        double gravedadPlaneta = (G * masaPlaneta) / radioPlanetaCuadrado;

	        // Cálculo del volumen del planeta
	        double radioPlanetaCubo = radioPlaneta * radioPlaneta * radioPlaneta;
	        double volumenPlaneta = (4.0 / 3.0) * PI * radioPlanetaCubo;

	        // Cálculo de la densidad del planeta
	        double densidadPlaneta = masaPlaneta / volumenPlaneta;

	        // Cálculo del peso del objeto en el planeta
	        double pesoObjetoPlaneta = (gravedadPlaneta / gravedadTierra) * pesoObjetoTierra;

	        // Salida de resultados
	        System.out.printf("Gravedad en la superficie del planeta: %.2f m/s^2 %n", gravedadPlaneta);
	        System.out.printf("Densidad del planeta: %.2f kg/m^3 %n", densidadPlaneta);
	        System.out.printf("Peso del objeto en el planeta: %.2f kg %n", pesoObjetoPlaneta);
	        
	        scanner.close();
	    }
	}