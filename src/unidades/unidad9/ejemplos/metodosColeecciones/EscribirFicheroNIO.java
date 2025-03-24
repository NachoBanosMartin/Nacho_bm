package unidades.unidad9.ejemplos.metodosColeecciones;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscribirFicheroNIO {

	public static void main(String[] args) {

		try {
			String nombreFichero = "datos3.txt";
			
			File fichero = new File(nombreFichero);
			
			if(!fichero.exists()) {
				fichero.createNewFile();
				System.out.println("Fichero creado");
			}else {
				System.out.println("Fichero no creado");
			}
			
			
			Path path = Paths.get(nombreFichero);  // Se abre la consola si hay algun error
																			 // TRUNCATE_EXISTING (hace lo mismo que el false)
			Files.write(path, Arrays.asList("Nuevos DAtos"), StandardOpenOption.APPEND);
		} catch (NoSuchFileException e) {
			System.err.println("No existe el fichero");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
