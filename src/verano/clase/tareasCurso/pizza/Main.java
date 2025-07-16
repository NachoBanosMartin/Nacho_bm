package verano.clase.tareasCurso.pizza;

import java.util.Scanner;

public class Main {

	private static final Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {


		/*
		pizza1.mostrarDetalles();
		pizza2.mostrarDetalles();
		pizza3.mostrarDetalles();  */
		
		//while (true) {
			System.out.println("Introduzca el tamaño de pizza: ");
			String tamanoPizza = entrada.next().toUpperCase();  // Igualo la entrada a mayusculas (Como en el enum)
			
			try {
				TamanoPizza tamano = TamanoPizza.valueOf(tamanoPizza);
				Pizza pizza1 = new Pizza(tamano);
				pizza1.mostrarDetalles();
			}catch (IllegalArgumentException e) {
				System.out.println("MAL");
			}
			
			/*if (tamanoPizza.equals("PEQUEÑA")) {                // En el caso de que sea pequeña
				tamanoPizza = tamanoPizza.replace("Ñ", "N");    // Remplazo la Ñ por la N y lo guardo en la misma variable	
			}

			switch (tamanoPizza) {
			case "PEQUENA":
				Pizza pizza1 = new Pizza(TamanoPizza.PEQUENA);
				pizza1.mostrarDetalles();
				return;
			case "MEDIANA":
				Pizza pizza2 = new Pizza(TamanoPizza.MEDIANA);
				pizza2.mostrarDetalles();
				return;
			case "GRANDE":
				Pizza pizza3 = new Pizza(TamanoPizza.GRANDE);
				pizza3.mostrarDetalles();
				return;
			default:
				System.out.println("Tamaño inválido");
				break;
			}*/

		}

		
	}


