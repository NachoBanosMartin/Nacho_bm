package unidades.unidad5.tareas;

import java.util.Scanner;

public class PuntoLimpio2 {

static Scanner entrada = new Scanner (System.in);
	
	static int escoger;
	static int kgvidrio;
	static int kgpapel;
	static int kgplastico;
	static int kgchatarra;
	static int totalVidrio;
	static int totalPapel;
	static int totalPlastico;
	static int totalChatarra;
	
	public static void main(String[] args) {
		
		int kilos;
		double media;
		int suma, cantidadKilos;	
	
		do{
			System.out.println("Ingrese el tipo de residuo (1,2,3,4) o salir (5): ");
			escoger = entrada.nextInt();
			switch (escoger){
			case 1:
				System.out.println("Vidrio");
				System.out.println("Indique los kilos de residuos que va a depositar de " +escoger+ ": ");
				kilos =  entrada.nextInt();
				
				break;
			case 2: 
				System.out.println("Papel");
				System.out.println("Indique los kilos de residuos que va a depositar de " +escoger+ ": ");
				kilos =  entrada.nextInt();
				break;
			case 3: 
				System.out.println("Plástico");
				System.out.println("Indique los kilos de residuos que va a depositar de " +escoger+ ": ");
				kilos =  entrada.nextInt();
				break;
			case 4: 
				System.out.println("Chatarra");
				System.out.println("Indique los kilos de residuos que va a depositar de " +escoger+ ": ");
				kilos =  entrada.nextInt();
				break;
			case 5: 
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Añade un valor correcto");
				break;
			}
		}while(escoger != 5);
		
		/*kilos = new int[numeroResiduos];
		
		for (int i = 0; i < numeroResiduos; i++) {
					
		System.out.println("Ingrese la cantidad de kilos para el residuo " +(i+1)+ ":");
		cantidadKilos = entrada.nextInt();
			kilos[i]= cantidadKilos;
		}
		
		suma = obtenerSumaKilos(kilos);
		media = obtenerMediaKilos(kilos);
		mostrarDatos(suma, media);
		
	}



	static void mostrarDatos(int suma, double media) {
		System.out.println("Total de kilos recolectados: " + suma + "kg");
		System.out.println("Promedio de kilos por tipo de residuo: " + media+ "kg");
		
	}

	static int obtenerSumaKilos(int[] kilos) {
		int suma = 0;
		for (int i = 0; i < kilos.length; i++) {
			suma = suma + kilos [i];
		}
		return suma;
	}
*/
	}
}


