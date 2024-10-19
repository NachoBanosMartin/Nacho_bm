package unidades.unidad3.ejemplos;

import java.util.Scanner;

public class Condiciones {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int edad =0;
		
		System.out.println("Introduzca su edad:");
		edad= entrada.nextInt();
		
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
			System.out.println("Ya puedes sacarte el carné");
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Eres menor de edad");
			System.out.println("Tendrás que esperar para conducir legalmente");
		}

	}





	}


