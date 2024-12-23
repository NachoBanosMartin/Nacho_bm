package unidades.unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    // Escriba un programa Java para encontrar el índice de un elemento de matriz.
    
    public static void main(String[] args) {
        
       int[] numeros = {10, 3, 4, 5, 21, 33, 9, 11, 2, 7};
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Ingrese el valor que desea encontrar: ");
       int valorBuscado = entrada.nextInt();
       
       int índice = -1;
       
       for (int i = 0; i < numeros.length; i++) {
    	   if (numeros[i] == valorBuscado) {
    		   índice = i;
    		   break;
		   
    	   }
       }
       
       if (índice != -1) {
    	   System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + índice);
       } else {
    	   System.out.println("El valor " + valorBuscado + " no se encuentra en la array.");
       }
       
       entrada.close();
       
    }
}