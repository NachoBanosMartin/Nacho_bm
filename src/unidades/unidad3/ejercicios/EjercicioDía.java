package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class EjercicioDía {
	
	//Introducir un número para indicar el día de la semana

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int dia;
		
		System.out.println("Introduzca un número (1-7) para indicar el día de la semana");
		dia= entrada.nextInt();
			
		
			if (dia==1) 
			{
			System.out.println("Lunes");				
			}
			else if (dia==2) 
			{
				System.out.println("Martes");				
			}
			else if (dia==3) 
			{
				System.out.println("Miercoles");
			}
			else if (dia==4) 
			{
				System.out.println("Jueves");
			}
			else if (dia==5) 
			{
				System.out.println("Viernes");
			}
			else if (dia==6) 
			{
				System.out.println("Sabado");
			}
			else if (dia==7) 
			{
				System.out.println("Domingo");
			}			  			
			else{	//dato incorrecto
				System.out.println("El número indicado no corresponde a ningún día de la semana.");
			}
		entrada.close();
	}

}
