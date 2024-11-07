package unidades.unidad4.ejemplos;

import java.util.Scanner;

public class PedirOperacion {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		char operacion = pedirOperacion();
		int numVeces = pedirNumeroVecesOperacion();
		do {
			if (opcion == 'S') {
				
			}
			
		}while (opcion == 'S' && opcion == 'R');
		
		realizarOperacion(operacion,numVeces);
		
		
		

	}

    static void realizarOperacion(char operacion, int numVeces) {
		
    	switch (operacion) {
		case 'S': 
			
			mostrarMensaje("Operación elegida sumar "+numVeces+" veces");
			break;
		
		case 'R': 
			
			mostrarMensaje("Operación elegida restar "+numVeces+" veces");
			break;
		
		}
	}

	static int pedirNumeroVecesOperacion() {
		
    	int veces = 0;
		
		do {	
			mostrarMensaje("Introduzca el número de veces entre el 1 y el 3");
			veces = entrada.nextInt();
		} while (veces<=0 || veces>3);
				
		return veces;
	}

	static char pedirOperacion() {
		
		char operacion = 0;
		
		do {	
			mostrarMensaje("Introduzca la operación S para sumar o R para restar");
			operacion = entrada.next().toUpperCase().charAt(0);
			
		} while (operacion!='S' && operacion!='R');
		
		return operacion;
	}

	static void mostrarMensaje (String mensaje) {
			System.out.println(mensaje);
		}
	
	
	static int sumar(int sumando1, int sumando2) {
		
		int resultado = sumando1 + sumando2;		
		return resultado;
	}
	
	static int restar(int sumando1, int sumando2) {
		
		int resultado = sumando1 - sumando2;		
		return resultado;
	}
	
	static int leerEntero() {
			
		Scanner scanner = new Scanner(System.in);		
		int numero = scanner.nextInt();		
		return numero;
				
	}
	
	
	
	
}
