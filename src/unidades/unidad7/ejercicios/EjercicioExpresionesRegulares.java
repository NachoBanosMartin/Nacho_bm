package unidades.unidad7.ejercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioExpresionesRegulares {

	public static void main(String[] args) {
		
		// Ejercicio 1: Buscar números en el texto
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el número que desee encontrar en la siguiente frase "
				+ "(Pepe se comió __ platos de macarrones durante __ días): ");
		String patron = entrada.next(); 
		String cadena = "Pepe se comió 2 platos de macarrones durante 3 días";
		
		Pattern pattern = Pattern.compile(patron);
		Matcher matcher = pattern.matcher(cadena);
				
		int contador = 0;
		while(matcher.find()) {
			contador ++;
		}
		
		System.out.println("El número ha sido encontrado " + contador + " vez.");
		
		
		/*
		if (matcher.find()) {
			System.out.println("Número Encontrado");
			System.out.println("La frase completa es: Pepe se comió 2 platos "
					+ "de macarrones durante 3 días");
		}else {
			System.out.println("Número No Encontrado");
		}
		*/
		
		/*
		  Ejercicio 2: Validar una trajeta de crédito
		  
		  EL formato xxxx-xxxx-xxxx-xxxx, donde x es un dígito
		  	- Ejemplo de entrada válida: 1234-5678-9012-3456
		  	- Ejemplo de entrada no válida: 1234-5678-9012-345
		 */
		
		
		System.out.println("Introduzca el número de tarjeta para validarlo");
		String tarjeta = entrada.next();
		
		String patron2 = "(\\d{4}-){3}\\d{4}"; 
		
		
		Pattern pattern2 = Pattern.compile(patron2);
		Matcher matcher2 = pattern2.matcher(tarjeta);
		
		
		if (matcher2.matches()) {
			System.out.println("Tarjeta válida");
		}else {
			System.out.println("Tarjeta no válida, vuelva a intentarlo");
		}
		
		// Ejercicio 3
		
		
		//String patron3 = "\\S{8,}(?=.*[A-Z])(?=.*[!#;&])(?=.*[0-9])";
		String patronPass = "^(?=.*[A-Z])(?=.*[!#;&])(?=.*[0-9])[a-zA-Z0-9?=.*!#;&]{8,}$";
		String cadena3 = "Benito#23";
		
		Pattern pattern3 = Pattern.compile(patronPass);
		Matcher matcher3 = pattern3.matcher(cadena3);
		
		if (matcher3.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		// Ejercicio 4
		
		/*
		
		String patron4 = "(\\d{2}/){2}\\d{4}"; 
		String cadena4 = "06/02/2025";
		
		Pattern pattern4 = Pattern.compile(patron4);
		Matcher matcher4 = pattern4.matcher(cadena4);
		
		if (matcher4.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		*/
		
		System.out.println("Introduzca la fecha: ");
		String fecha = entrada.next();
		
		String patron4 = "(\\d{2}/){2}\\d{4}"; 
		
		
		Pattern pattern4 = Pattern.compile(patron4);
		Matcher matcher4 = pattern4.matcher(fecha);
		
		if (matcher4.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		// Ejercicio 5
		
		String texto = "Hoy es 06/02/2025 y mañana será 07/02/2025";
		String patron5 = "(\\d{2}/(\\d{2})/(\\d{4})";
		
		Pattern patternFechas = Pattern.compile(patron);
		Matcher matcherFechas = pattern.matcher(texto);
		
		while(matcherFechas.find()) {
			System.out.println("Fecha completa: " + matcherFechas.group(0));
			System.out.println("Día: " + matcherFechas.group(1));
			System.out.println("Mes: " + matcherFechas.group(2));
			System.out.println("Año: " + matcherFechas.group(3));
			System.out.println("---------------------------------------");

		}
		
	}

}
