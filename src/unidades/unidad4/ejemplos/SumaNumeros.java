package unidades.unidad4.ejemplos;

import java.util.Scanner;

public class SumaNumeros {

	static  int NUM_VECES = 3;
	static Scanner scanner;
	public static void main(String[] args) {
		
	     	scanner = new Scanner(System.in);
	       	realizarSumas();
	       	scanner.close();
	}
	static void realizarSumas() {
		
		for (int i = 1; i <= NUM_VECES; i ++) {
	        
	        mostrarMensaje("Intento "+i+" - Ingresa el primer número: ");
	        int num1 = leerEntero();
	        mostrarMensaje("Intento "+i+" - Ingresa el segundo número: ");
	        int num2 = leerEntero();
	        int suma = sumar(num1,num2);
	        System.out.println("La suma es: " + suma);
	        
	       	}
      
	}
	
	
	static int sumar(int sumando1, int sumando2) {
		
		int resultado = sumando1 + sumando2;		
		return resultado;
	}
	
	static int leerEntero() {
		
		Scanner scanner = new Scanner(System.in);		
		int numero = scanner.nextInt();		
		return numero;
				
	}
	
	static void mostrarMensaje (String mensaje) {
		
		System.out.println(mensaje);
	}
	
	

}
