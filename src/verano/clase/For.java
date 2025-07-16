package verano.clase;

public class For {

	public static void main(String[] args) {

		String[] argumentos = {"hola", "como", "estas", "hoy", "por", "la", "mañana"};
		
		for (int i = 0; i < argumentos.length; i++) {
			System.out.println(i + ") " + argumentos[i]);
		}		
		
		for (String string : argumentos) {     // string equivale a argumentos[i] para recorrerlo
			System.out.println(string);			
		}
		
		
		
	}

}
