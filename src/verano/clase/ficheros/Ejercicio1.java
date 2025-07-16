package verano.clase.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio1 {

	public static final Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {

		crearArchivo();
	}

	private static void crearArchivo() {
		
		System.out.println("Cuántos archivos quieres crear?: ");
		int numArchivos = entrada.nextInt();
		System.out.println("he recogido la informacion");
		int contador = 0;
		
		do {
			
			String file = "./practicando" + contador + ".txt";

			try (BufferedWriter escritor = new BufferedWriter(new FileWriter(file))){
				
				escritor.write("Este es el fichero PRACTICANDO " + contador + ".txt");
				contador ++;
				System.out.println("vuelta "+ contador);
				
			} catch (Exception e) {
				System.out.println("Error al escribir en el archivo");
			}
			
		} while (contador <= numArchivos);
		
	}

}
