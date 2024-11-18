package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class Donaciones {

	public static void main(String[] args) {
	
		
		int maquina1 = 0;
		int maquina2 = 0;
		int maquina3 = 0;
		int maquina4 = 0;
		int maquina5 = 0;
		int maquina6 = 0;
		int maximo, minimo = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca las donaciones de la maquina 1: ");
		maquina1 = entrada.nextInt();
		
		System.out.println("Introduzca las donaciones de la maquina 2: ");
		maquina2 = entrada.nextInt();
		
		System.out.println("Introduzca las donaciones de la maquina 3: ");
		maquina3 = entrada.nextInt();
		
		System.out.println("Introduzca las donaciones de la maquina 4: ");
		maquina4 = entrada.nextInt();
		
		System.out.println("Introduzca las donaciones de la maquina 5: ");
		maquina5 = entrada.nextInt();
		
		System.out.println("Introduzca las donaciones de la maquina 6: ");
		maquina6 = entrada.nextInt();

		//MAXIMO
		maximo = maquina1;
		if(maquina2 > maximo) {
			maximo = maquina2;
		}
		if(maquina3 > maximo) {
			maximo = maquina3;
		}
		if(maquina4 > maximo) {
			maximo = maquina4;
		}
		if(maquina5 > maximo) {
			maximo = maquina5;
		}
		if(maquina6 > maximo) {
			maximo = maquina6;
		}
		
		//MINIMO
		minimo = maquina1;
		if(maquina2 < minimo) {
			minimo = maquina2;
		}
		if(maquina3 < minimo) {
			minimo = maquina3;
		}
		if(maquina4 < minimo) {
			minimo = maquina4;
		}
		if(maquina5 < minimo) {
			minimo = maquina5;
		}
		if(maquina6 < minimo) {
			minimo = maquina6;
		}
		
		System.out.println("El máximo de donaciones ha sido: " + maximo);
		System.out.println("El mínimo de donaciones ha sido: " + minimo);

	}

}