package unidades.unidad7.ejemplos; 

public class CadenasConString {

	public static void main(String[] args) {
		
		String cadena = "Más vale pájaro en mano que ciento volando";
		String texto = new String  ("Allí donde fueres, haz lo que vieres");
		
		System.out.println(cadena);
		
		System.out.println("Longitud: " + cadena.length());
		
		System.out.println("Carácter en la posición 1: " + cadena.charAt(1));
		
		System.out.println("Subcadena: " + cadena.substring(9, 15));
		
		String nombre = "Luis";
		String apellido1 = "Martínez";
		String apellido2 = "Redondo";
		
		
		System.out.println("Apellido sin tilde" + apellido1.replace('í', 'i'));
		
		String usuario = nombre.toUpperCase().substring(0, 1) + apellido1 + apellido2.substring(0, 1);
		System.out.println("Usuario: " + usuario);
		
		
		System.out.println("Nombre: " + nombre.toLowerCase());
		System.out.println("Nombre: " + apellido1.toLowerCase());
		System.out.println("Nombre: " + apellido2.toLowerCase());

		
		String nombreMinuscula = nombre.toLowerCase();
		System.out.println("Nombre: " + nombre);
		System.out.println("Nombre: " + nombreMinuscula);
		
		
		System.out.println("Nombre repetido: " + (nombre + nombre));
		nombre += nombre;
		
		String nombreLimpio = nombre.trim();
		System.out.println("Nombre limpio: " + nombreLimpio);
		
		
		String MAC = "FF:4C:11:56:A3:B1";
		String [] elementosMac = MAC.split(":");
		for (int i = 0; i < elementosMac.length; i++) {
			System.out.println(elementosMac[i]);
		}

	}

}



/*
	Ejercicio 2:  
	Diseñar un programa que solicite al usuario una frase y una palabra. 
	A continuación, buscará cuántas veces aparece la palabra en la frase
*/













