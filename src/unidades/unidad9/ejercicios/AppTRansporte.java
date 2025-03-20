package unidades.unidad9.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppTRansporte {
	
	public static final String SEPARADOR = ";";
	public static final String FORMATO_MATRICULA = "^\\d{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}$";

	public static void main(String[] args) {

		Scanner entradaFichero = null;
		String [] datosLinea = null;
		
		try {
			entradaFichero = new Scanner(new File("viajes_transporte.txt"));
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			// System.err.println("No se ha encontrado fichero");
		}
		
		while(entradaFichero.hasNext()) {
			String linea = entradaFichero.nextLine();
			datosLinea = linea.split(SEPARADOR);
			
			try {
				validarDatos(datosLinea);
			} catch (TransporteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void validarDatos(String[] datosLinea) throws TransporteException{

		if (!validarMatricula(datosLinea[0])) {
			throw new TransporteException("\"Matricula no Válida\" + datosLinea[0]");
		}
	}

	private static boolean validarMatricula(String matricula) {
		
		return matricula.trim().matches(FORMATO_MATRICULA);
	}

}
