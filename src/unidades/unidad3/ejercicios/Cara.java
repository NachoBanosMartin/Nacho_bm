package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Cara {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				if (
				
				   (i == 1 && (j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8))
					|| (i == 2 && (j == 2 || j == 9))
					|| (i == 3 && (j == 1 || j == 10))
					|| (i == 4 && (j == 1 || j == 10))
					|| (i == 5 && (j == 1 || j == 10))
					|| (i == 6 && (j == 2 || j == 9))
					|| (i == 7 && (j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8))
				
				) 
	
				{
					System.out.print("*");
				} else if(i == 3 && (j == 4 || j == 7)) {
					System.out.print("O");
				} else if(i == 4 && (j == 5 || j == 6)) {
					System.out.print("|");
				} else if(i == 5 && (j == 4 || j == 5 || j == 6 || j == 7)) {
					System.out.print("_");
				} else if(i == 2 && (j == 4 || j == 7)) {
					System.out.print("_");
				} 
				
				else {
					System.out.print(" ");
	
				}
			}
			System.out.println("");
		}
	}
}

