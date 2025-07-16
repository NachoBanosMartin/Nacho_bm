package verano.clase.webDAM.tema3;

import java.util.Scanner;

public class Ejercicio11 {

    /*
     * Implemente una aplicación que tome el peso en kilos de una cantidad de ropa a
     * lavar en una lavadora industrial y nos devuelva el nivel de agua dependiendo
     * del peso. Se sabe que con más de 30 kilos la lavadora no funcionará ya que es
     * DEMASIADO PESO. Si la ropa pesa 22 o más kilos, el nivel será de MÁXIMO; si
     * pesa 15 o más será de ALTO; si pesa 8 o más, será un nivel MEDIO; o de lo
     * contrario el nivel será MÍNIMO.
     */

    public static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce el peso en kg de la cantidad de ropa a lavar: ");
        int pesoRopa = entrada.nextInt();

        if (pesoRopa > 30) {
            System.out.println("DEMASIADO PESO, la lavadora no funcionará.");
        } else if (pesoRopa >= 22) {
            System.out.println("Nivel de agua: MÁXIMO");
        } else if (pesoRopa >= 15) {
            System.out.println("Nivel de agua: ALTO");
        } else if (pesoRopa >= 8) {
            System.out.println("Nivel de agua: MEDIO");
        } else if (pesoRopa >= 0) {
            System.out.println("Nivel de agua: MÍNIMO");
        } else {
            System.out.println("Peso inválido.");
        }
    }
}
