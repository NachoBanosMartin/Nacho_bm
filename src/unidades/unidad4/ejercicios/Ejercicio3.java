package unidades.unidad4.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /* Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos. 
        Implementa y utiliza la función: 
                        
                double multiplica(double a, double b) // Devuelve la multiplicación de dos números */

        Scanner scanner = new Scanner(System.in);
        
        mostrarMensaje("Introduce el primer número: ");
        double numero1 = leerNumero(scanner);
        mostrarMensaje("Introduce el segundo número: ");
        double numero2 = leerNumero(scanner);
        
        double resultado = multiplica(numero1, numero2);
        mostrarMensaje("El resultado de la operación es: " + resultado);
        
        scanner.close();
    }
    
    static double multiplica(double a, double b) {
        return a * b; 
    }
    
    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    static double leerNumero(Scanner scanner) {
        return scanner.nextDouble();
    }
}
