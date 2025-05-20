package unidades.unidad11.ejemplos.io_nio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroIO {

	public static void main(String[] args) {

		try {
			BufferedWriter escritor = new BufferedWriter (new FileWriter("datos.txt", false));
			
			String datos = "Aquí vienen los datos";
			
			escritor.write(datos);
			
			escritor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
