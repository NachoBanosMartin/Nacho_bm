package unidades.unidad5.tareas;

import java.util.Scanner;

public class CartaReyes {
	
	String[] regalos = {"Bici", "Monopatín", "Balón", "Libro", "Consola", "Ropa"};
	int[] cantidades = {6,6,10,10,2,8};
	static Scanner entrada = new Scanner(System.in);
	


	public static void main(String[] args) {

		while (true){ 

			System.out.println("------Menú------");
			System.out.println("1. Elegir cantidad de regalos");
			System.out.println("2. Elegir Regalo");
			System.out.println("3. Elegir Rey Mago");
			System.out.println("4. Acabar");
			
	        int opción = entrada.nextInt();
	        
	        switch (opción) {
            case 1:
                elegirCantidadRegalos();
               break;
            case 2:
            	elegirRegalo();
               break;
            case 3: 
            	elegirRey();
            case 4:
            	System.out.println("Gracias, Feliz Navidad");
            default:
            	 System.out.println("Opción no válida. Por favor, elige entre 1 y 3.");
	        	
            	
	        }
	}
	}



	static void elegirRey() {
		
		
	}



	static void elegirRegalo() {
		
		
		
	}



	static void elegirCantidadRegalos() {
		System.out.println("Ingrese la cantidad de regalos");
    	int cantidadRegalos = entrada.nextInt();
    	
    	if (cantidadRegalos < 1 || cantidadRegalos > 3) {
            System.out.println("Cantidad no válida. Debes elegir entre 1 y 3 regalos.");
            return;
    	}else{
            System.out.println("Has elegido " + cantidadRegalos + " regalos.");
        }
    }
        	
       
		
	}



