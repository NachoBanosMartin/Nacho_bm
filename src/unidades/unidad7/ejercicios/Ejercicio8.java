package unidades.unidad7.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	// Realiza un programa en Java que a partir de un mes nos diga cuantos días tiene el mes indicado.

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mes = 0;

        // Validar la entrada del usuario
        while (true) {
            System.out.println("Ingrese el número del mes (1-12): ");
            
            // Verificar si la entrada es un número entero
            if (entrada.hasNextInt()) {
                mes = entrada.nextInt();
                
                // Verificar si el número está en el rango permitido
                if (mes >= 1 && mes <= 12) {
                    break; 
                } else {
                    System.out.println("Por favor, ingrese un número entre 1 y 12.");
                }
            } else {
                System.out.println("Por favor, ingrese un número entero válido.");
                entrada.next();
            }
        }

        int dias = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; // Sin tener en cuenta los años bisiestos
                break;
        }

        System.out.println("El mes " + mes + " tiene " + dias + " días.");
        
        entrada.close();
    }
}