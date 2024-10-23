package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class EjercicioBiblioteca {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		int opcion;
		int contadorLeer=0;
		int contadorEstudiar=0;
		int contadorJugar=0;
		boolean seguir = true;
		
		while(seguir) { 
		
			System.out.println("----Recreo Biblio----");
			System.out.println("1. Leer");	
			System.out.println("2. Estudiar");	
			System.out.println("3. Jugar al ajedrez");	
			System.out.println("4. Salir");	
			
			opcion= entrada.nextInt();
			
			System.out.println("Opcion: " +opcion);	
			
			switch (opcion) {
			case 1:
				System.out.println("Opción leer");
				contadorLeer++;
			break;
			case 2:
				System.out.println("Opción estudiar");	
				contadorEstudiar++;
			break;
			case 3:
				System.out.println("Opción jugar");	
				contadorJugar++;
			break;
			case 4:
				System.out.println("Opción salir");
				seguir = false;
			break;
			default:
				System.out.println("Opción no válida");	
			
			} // fin switch
				
	    }// fin while
		
		System.out.println("----ESTADÍSTICAS----");
		System.out.println("Usuarios lectores:" +contadorLeer);
		System.out.println("Usuarios estudiosos:" +contadorEstudiar);
		System.out.println("Usuarios jugones:" +contadorJugar);
		
		System.out.println("Total de usuarios:" +(contadorLeer)+(contadorEstudiar)+contadorJugar);
	}

}











