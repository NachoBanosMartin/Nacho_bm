package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	static int NUM_VECES = 3;
    static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner (System.in);
		leerNumeroMenor();
		scanner.close();
	}
  
static void leerNumeroMenor() {
	
	for (int i = 1; i <= NUM_VECES ; i ++) {
        
        mostrarMensaje("Intento "+i+" - Ingresa el primer número: ");
        int num1 = leerEntero();
        mostrarMensaje("Intento "+i+" - Ingresa el segundo número: ");
        int num2 = leerEntero();
        mostrarMensaje("Intento "+i+" - Ingresa el segundo número: ");
        int num3 = leerEntero();
        int numeroMenor = encontrarMinimo(num1,num2,num3);
        System.out.println("El numero menor es: " + numeroMenor);
        
       	}
  
}


static int encontrarMinimo (int numero1, int numero2, int numero3) {
	
	int numeroMenor = numero1;
	if (numero2 < numeroMenor) {
		numeroMenor = numero2;
	}
	if (numero3 < numeroMenor) {
		numeroMenor = numero3;
	}
	
	return numeroMenor;
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
