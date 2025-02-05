package unidades.unidad7.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	
	/*
	 El proceso de curado es muy importante a la hora de obtener buenos productos de embutidos.
	 Una de las empresas de cárnica de nuestra región nos pide realizar un programa que a partir
	 de la información de los distintos productos de embutidos que ofrece, nos ofrezca diga si 
	 ese produzco está en fase de curación parcial o total, siguiendo los criterios que se muestran
	 en la siguiente tabla:

	 Los días de curación indican el límite superior a considerar.
	 
	 PRODUCTO     Días de Curacion     Nivel de Curación     Días de Curación     Nivel de Curación
	 
	 Salchichón         100                 Medio                 300                   Alto
	 
	 Chorizo            100                 Medio                 300                   Alto
	 
	 Paleta             100                 Bajo                  300                   Medio
	 
	 Jamón              100                 Bajo                  300                   Medio
	       
	*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre del producto (Salchichón, Chorizo, Paleta"
				+ " o Jamón) que desee consultar: ");
		String producto = entrada.next();
		
		System.out.println("Introduzca los días de curación");
		int diasCuracion = entrada.nextInt();
		
		String nivelCuracion = obtenerNivelCuracion(producto, diasCuracion);

        System.out.println("El nivel de curación del " + producto + " es: " + nivelCuracion);
		

	}

	private static String obtenerNivelCuracion(String producto, int diasCuracion) {
        
		switch (producto.toLowerCase()) {

		 case "salchichón":
	     case "chorizo":
			 if (diasCuracion < 100 ) {
				 return "Bajo";
			 } else if (diasCuracion >= 100) {
	             return "Medio";
	         } else if (diasCuracion == 300) {
	             return "Alto";
	         } else {
	             return "Muy Alto";
	         }
	     case "paleta":
	     case "jamón":
	         if (diasCuracion <= 100) {
	             return "Bajo";
	         } else if (diasCuracion <= 300) {
	             return "Medio";
	         } else {
	             return "Alto";
	         }
	     default:
	         return "Tipo de embutido no válido";
	         
		}

	}

}
