package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class CondicionesEjercicio {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		int calificacion;
		
			System.out.println("Introduzca su calificación");
			calificacion= entrada.nextInt();
			

					
			if (calificacion==0) 
			{
				System.out.println("Muy mal");				
			}
			else if (calificacion==1) 
			{
				System.out.println("Regular");				
			}
			else if (calificacion==2) 
			{
				System.out.println("Bien");
			}
			else if (calificacion==3) 
			{
				System.out.println("Muy bien");
			}
			  			
		else{		//dato incorrecto
			System.out.println("Su dato está fuera de rango.");
		}
			
		}
	}


