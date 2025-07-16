package verano.clase.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ficheros {

	public static void main(String[] args) {

		File file = new File( "prueba.txt");
		
		try (BufferedReader lector = new BufferedReader(new FileReader(file))){
			
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			System.out.println("Error");		}
	}

}



/*
 *  String rutaArchivo = "datos.txt"; // Asegúrate de que este archivo exista

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        
        
        String rutaArchivo = "salida.txt";

        try (FileWriter fw = new FileWriter(rutaArchivo)) {
            fw.write("Primera línea\n");
            fw.write("Segunda línea\n");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

 * 
 */
