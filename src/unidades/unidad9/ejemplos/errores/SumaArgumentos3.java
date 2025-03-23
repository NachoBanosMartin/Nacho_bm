package unidades.unidad9.ejemplos.errores;

public class SumaArgumentos3 {

	public static void main(String[] args) {

		int suma = 0;
		
		// Run > Run Configurations > "Comprobar Class" > Argumentos
		// Separar por espacio los argumentos
		
		
		for(int i = 0; i < args.length; i ++) {
			try {
				suma += Integer.parseInt(args[i]);				
			}catch(NumberFormatException e){
				System.out.println("Uno de los argumentos recibidos no es un entero");
				System.err.println("Argumento inválido: " + args[i] + "\tPosición: " + i);
			}catch(Exception e) {
				System.out.println("Se ha producido un error");
			}
		} // Fin del for
		
		System.out.println("Suma: " + suma);
	}

}
