package unidades.unidad2.ejemplos;

import java.util.Scanner;

public class LeerDatosTeclado {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		//Leer un número entero(int)
		System.out.println("Introduce un número entero");
		int numeroEntero= entrada.nextInt();
		System.out.println("Número entero ingresado:" +numeroEntero);
		

		//Leer un long
		System.out.println("Introduce un número largo(long):");
		long numeroLargo= entrada.nextLong();
		System.out.println("Número long:" + numeroLargo);
		
		
		//Leer un número de tipo float
		System.out.println("Introduce un número con decimales(float)");
		float numeroFloat= entrada.nextFloat();
		System.out.print("Número float:" + numeroFloat);
		
		System.out.println("Introduce un número con decimales (double):");
		double numeroDouble= entrada.nextDouble();
		System.out.println("Número double:"+ numeroDouble);
		
		
		
		//Leer una palabra (String hasta el primer espacio)
		//hola que tal
		System.out.println("Introduce una palabra");
		String palabra= entrada.next();
		System.out.println("Palabra ingresada:"+ palabra);
		
		//Leer una linea
		System.out.println("Introduce una linea de texto");
		String linea = entrada.nextLine();
		System.out.println("Texto ingresado:"+ linea);
		
		//Leer un caracter
		System.out.println("Introduzca un caracter");
		char caracter= entrada.next().charAt(0);
		System.out.println("Caracter ingresado"+ caracter);
		
		
		
		//Leer un valor booleano(true o false)
		System.out.println("Introduce un valor booleano:");
		boolean valorBooleano= entrada.hasNextBoolean();
		System.out.println("Valor booleano ingresado:"+ valorBooleano);
		
	}
}
