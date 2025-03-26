package unidades.unidad7.tareas;

import java.util.Scanner;

public class CodigoBarras {
	
	private static final int EAN_8 = 8;
    public static final int EAN_13 = 13;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        // Leer el código de barras
		
		String codigoBarras = entrada.next();
		
        // Guardar los dígitos de cada posición del código de barras en un arreglo o lista
		
		char[] posiciones = new char [codigoBarras.length()];
		
		// Recorrer el código de barras y almacenar cada carácter
		
        for (int i = 0; i < codigoBarras.length(); i++) {
            posiciones[i] = codigoBarras.charAt(i);           // Guardar cada carácter en el array
        }
		
        // Comprobamos la longitud del código y si el dígito de control es correcto
		
		if (codigoBarras.length() == EAN_8 || codigoBarras.length() == EAN_13) {
            if (verificarDigitoControl(codigoBarras)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        
        entrada.close();
    }

	private static boolean verificarDigitoControl(String codigoBarras) {
		
		int longitud = codigoBarras.length();
		return false;
	}
		
		

        
	}


