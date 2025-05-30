package unidades.unidad10.ejemplos.sumaErrores;

public class SumaArgumentos2 {

	public static void main(String[] args) {

		int suma = 0;
		
		// Run > Run Configurations > "Comprobar Class" > Argumentos
		// Separar por espacio los argumentos
		
		try {
			for(int i = 0; i < args.length; i ++) {
				suma += Integer.parseInt(args[i]);
			}
		}catch(NumberFormatException e){
			System.out.println("Uno de los argumentos recibidos no es un entero");
		}catch(Exception e) {
			System.out.println("Se ha producido un error");
		}
		
		System.out.println("Suma: " + suma);
	}

}
