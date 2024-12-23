package unidades.unidad5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    
    // Escriba un programa Java para insertar un elemento (posición específica) en una matriz.

    public static void main(String[] args) {
        
        int[] numeros = {10, 3, 4, 5, 7, 33, 9, 11, 2, 1};
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indique el número que desea insertar en la array: ");
        int numeroElegido = entrada.nextInt();
        
        System.out.println("Ahora indique en qué posición quiere establecer el número elegido: ");
        int posicion = entrada.nextInt();
        
        // Compruebo que la posición es correcta
        if (posicion < 0 || posicion > numeros.length) {
            System.out.println("Posición incorrecta. Debe estar comprendida entre 0 y " + numeros.length);
            return;
        }
        
        // Creo una nueva array pero con una posición mayor
        int[] nuevaArray = new int[numeros.length + 1];
        
        // Copio los elementos que hay antes de la posición elegida
        for (int i = 0; i < posicion; i++) {
            nuevaArray[i] = numeros[i];
        }
        
        // Inserto el número elegido en la nueva array
        nuevaArray[posicion] = numeroElegido;
        
        // Copio los elementos que hay después de la posición elegida
        for (int i = posicion; i < numeros.length; i++) {
            nuevaArray[i + 1] = numeros[i];
        }
        
        System.out.println("La nueva array quedaría así: " + Arrays.toString(nuevaArray));
        
        entrada.close();
    }
}