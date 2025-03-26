package unidades.unidad7.ejercicios.practicando;

import java.util.Scanner;

public class Ejercicio10_2 {
	
	/*
	 Escribe un programa para predecir el tiempo que va a hacer mañana a partir de varios datos
	 atmosféricos suministrados por el usuario. Estos datos son: La presión atmosférica: puede 
	 ser alta, media o baja. La humedad relativa: también puede ser alta, media o baja. El 
	 programa se encargará de calcular la probabilidad de lluvia, la probabilidad de que haga
	 sol y la probabilidad de que haga frio. Tiembla, Roberto Brasero. Nuestros cálculos 
	 superprecisos serán estos:

    Para calcular la probabilidad de lluvia:
    
    	PRESIÓN     HUMEDAD     PROVABILIDAD DE LLUVIA
    	
    	 Baja        Alta              Muy alta
    	
    	 Baja        Media               Alta
    	 
    	 Baja        Baja                Media
    	
    	 Baja        Media               Media
    	 
    	  En cualquier caso              Baja
    	  
    
    Para trabajar las funciones se puede añadir más cálculos de probabilidad asociadas a la 
    meteorología, de tal manera que por cada probabilidad se utilice una función determinada.
    

    Para calcular la probabilidad de que haga sol:
    	
    	PRESIÓN     HUMEDAD     PROVABILIDAD  DE QUE HAGA SOL
    	
    	 Baja        Alta                    Baja
    	
    	 Baja        Media                   Media
    	 
    	 Baja        Baja                    Media
    	
    	 Media       Media                   Media
    	 
    	  En cualquier caso                  Alta
    	  
    
    Para calcular la probabilidad de que haga frío:
    
    	
    	PRESIÓN     HUMEDAD     PROVABILIDAD DE QUE HAGA FRIO
    	
    	 Baja        Alta                Alta
    	
    	 Baja        Media               Alta
    	 
    	 Media       Alta                Alta
    	
    	 Media       Media               Media
    	 
    	  En cualquier caso              Baja

	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca la presión atmosférica (alta, media o baja): ");
		String presion = entrada.next().toLowerCase();
		
		System.out.println("Introduzca la humedad relativa (alta, media o baja): ");
		String humedad = entrada.next().toLowerCase();
		
		
		String probabilidadLluvia = calcularProbabilidadLluvia (presion, humedad);
		String probabilidadSol = calcularProbabilidadSol (presion, humedad);
		String probabilidadFrio = calcularProbabilidadFrio (presion, humedad);
		
		System.out.println("La probabilidad de lluvia es: " + probabilidadLluvia);
		System.out.println("La probabilidad de sol es: " + probabilidadSol);
		System.out.println("La probabilidad de frio es: " + probabilidadFrio);

		
	}

	private static String calcularProbabilidadFrio(String presion, String humedad) {
		if(presion.equals("baja") && humedad.equals("alta")) {
			return "alta";
		}else if(presion.equals("baja") && humedad.equals("media")) {
			return "alta";
		}else if(presion.equals("media") && humedad.equals("alta")) {
			return "alta";
		}else if(presion.equals("media") && humedad.equals("media")) {
			return "media";
		}else {
			return "baja";

		}
	}

	private static String calcularProbabilidadSol(String presion, String humedad) {
		if(presion.equals("baja") && humedad.equals("alta")) {
			return "alta";
		}else if(presion.equals("baja") && humedad.equals("media")) {
			return "media";
		}else if(presion.equals("baja") && humedad.equals("baja")) {
			return "media";
		}else if(presion.equals("media") && humedad.equals("media")) {
			return "media";
		}else {
			return "alta";
		}
	}

	private static String calcularProbabilidadLluvia(String presion, String humedad) {
		if(presion.equals("baja")) {
			if(humedad.equals("alta")) {
				return "muy alta";
			}else if(humedad.equals("media")) {
				return "alta";
			}else {
				return "media";
			}
		}else {
			return "baja";
		}
	}

}


























