package verano.clase.webDAM.tema3;

import java.util.Scanner;

public class Ejercicio10 {

    /*
     * Pedir una nota de 0 a 10 y mostrarla de la forma:
     * Insuficiente (0-4), Suficiente (5), Bien (6),
     * Notable (7-8), Sobresaliente (9-10).
     */

    public static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce una nota del 0 al 10: ");
        int nota = entrada.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota introducida inválida.");
            return;
        }

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
