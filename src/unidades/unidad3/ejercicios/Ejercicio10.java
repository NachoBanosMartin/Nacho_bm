package unidades.unidad3.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		/* Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (de 0 a 4), Suficiente (5), Bien (6),
		Notable (7 y 8) y Sobresaliente (9,10) */
		
		
		Scanner scanner = new Scanner(System.in);
        int nota;
        String clasificacion;

        do {
            System.out.print("Introduce una nota de 0 a 10: ");
            nota = scanner.nextInt();

            if (nota >= 0 && nota <= 4) {
                clasificacion = "Insuficiente";
            } else if (nota == 5) {
                clasificacion = "Suficiente";
            } else if (nota == 6) {
                clasificacion = "Bien";
            } else if (nota == 7 || nota == 8) {
                clasificacion = "Notable";
            } else if (nota == 9 || nota == 10) {
                clasificacion = "Sobresaliente";
            } else {
                clasificacion = "Nota inválida";
            }
        } while (nota < 0 || nota > 10);
        
            System.out.println("La clasificación de la nota " + nota + " es: " + clasificacion);
        

        scanner.close();
        
	}

}
