package unidades.unidad9.ejemplos.errores;

public class SumaArgumentos {

	public static void main(String[] args) {

		int suma = 0;
		
		// Run > Run Configurations > "Comprobar Class" > Argumentos
		// Separar por espacio los argumentos
		
		for(int i = 0; i < args.length; i ++) {
			suma += Integer.parseInt(args[i]);
		}
		
		System.out.println("Suma" + suma);
	}

}
