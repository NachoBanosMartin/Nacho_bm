package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class AnioBisiesto {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		int anio;
		
		System.out.println("Introduce anio:");
		anio= entrada.nextInt();
		
		if (   (  (anio%4==0) &&  (anio%100!=0)  )   ||   (anio%400==0) ){
			System.out.println("Es bisiesto");
		
		}else {
			System.out.println("No es bisiesto");


		}


		
	}

}
