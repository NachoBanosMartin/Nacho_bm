package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/** Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si
		el número tiene uno o dos dígitos.(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un
		número entero).*/
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.print("Introduce un número positivo de 1 o 2 dígitos: ");
        int numero = entrada.nextInt();
		
        if (numero >=1 && numero <=9) {
        	
        System.out.println("El número ingresado tiene un dígito");
        
        }else if (numero >=10 && numero<=99) {
        	
		System.out.println("El número ingresado tiene dos dígitos");
		
        }else {
        	
        System.out.println("El número ingresado no se encuentra en el rango que se ha especificado");
        
        }
        
        entrada.close();
        
        
	}

}
