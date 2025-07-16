package unidades.desdeCasa.ascensor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class leeeYEscribir {

	public static void main(String[] args) {

		

		try (BufferedReader br = new BufferedReader(new FileReader("transportes.txt"))) {
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				
				System.out.println(linea);
			
			}

		} catch (IOException e) {
			
			e.printStackTrace();
		
		}

		
		
		try (FileWriter fw = new FileWriter("nuevocreadoporjava.txt")) {
			
			fw.write("Este archivo ha sido creado automáticamente.");
		
		} catch (IOException e) {
		
			e.printStackTrace();
		
		}
	}

}
