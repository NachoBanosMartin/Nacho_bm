package unidades.unidad5.ejercicios;

public class Ejercicio7 {
    
    // Escriba un programa Java para revertir una matriz de valores enteros.

    public static void main(String[] args) {
        
        int elementos[] = {3, 4, 5, 12, 27, 28, 45, 53, 90, 97};
        
        int[] elementosRevertidos = revertirArray(elementos);
        
        
        System.out.print("Array revertida: ");
        for (int i : elementosRevertidos) {
            System.out.print(i + " ");
        }
    }
    
    
    public static int[] revertirArray(int[] array) {
        int[] arrayRevertida = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRevertida[i] = array[array.length - 1 - i];
        }
        return arrayRevertida;
    }
}