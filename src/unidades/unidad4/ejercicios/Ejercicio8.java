package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    /* Escribe un método llamado diezVeces. El método debe aceptar un valor de tipo doble y devuelve un valor 
       doble que es diez veces el valor del argumento. */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        double valor = entrada.nextDouble();
        
        double resultado = diezVeces(valor);
        
        System.out.println("El valor " + valor + " multiplicado por diez es: " + resultado);
        
        entrada.close();
    }

    static double diezVeces(double valor) {
        return valor * 10;
    }
}