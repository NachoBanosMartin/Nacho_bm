package unidades.unidad7.ejemplos.expresiones_regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String patron = "a.*b"; // Empieza por a y acaba por b (. es cualquier cosa y * muchas veces)
		String cadena = "aXyZb";
		
		Pattern pattern = Pattern.compile(patron);
		Matcher matcher = pattern.matcher(cadena);
		
		
		if (matcher.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		String patron2 = "[aeiou]"; 
		String cadena2 = "Ciclo";
		
		Pattern pattern2 = Pattern.compile(patron2);
		Matcher matcher2 = pattern2.matcher(cadena2);
		
		if (matcher2.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		String patron3 = "^io"; 
		String cadena3 = "iooooooooo";
		
		Pattern pattern3 = Pattern.compile(patron3);
		Matcher matcher3 = pattern3.matcher(cadena3);
		
		if (matcher3.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		String patron4 = "a{2,4}"; 
		String cadena4 = "aa";
		
		Pattern pattern4 = Pattern.compile(patron4);
		Matcher matcher4 = pattern4.matcher(cadena4);
		
		if (matcher4.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		String patron5 = "\\w\\s+\\w"; 
		String cadena5 = "Hola   Clase";
		
		Pattern pattern5 = Pattern.compile(patron5);
		Matcher matcher5 = pattern5.matcher(cadena5);
		
		if (matcher5.find()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
		
		String patron6 = "\\w{3,15}"; 
		String cadena6 = "Pinochofueapesc";
		
		Pattern pattern6 = Pattern.compile(patron6);
		Matcher matcher6 = pattern6.matcher(cadena6);
		
		if (matcher6.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No Encontrado");
		}
	}

}
