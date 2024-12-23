package unidades.unidad5.tareas;

import java.util.Random;

public class BocadillosCorregido {
    public static void main(String[] args) {
    	
        String[] ingredientes = {"Jamón", "Queso", "Lechuga", "Atún", "Tomate", "Huevo Duro", "Pollo", "Aceitunas", 
            "Pimiento", "Chorizo", "Pepinillos", "Salsa Rosa", "Lomo", "Cebolla", "Mayonesa"};
        
        // Llamamos a la función que genera los bocadillos
        generarBocadillos(ingredientes);
    }

    // Función para generar y mostrar los bocadillos
    static void generarBocadillos(String[] ingredientes) {
        System.out.println("Bocadillos generados:");

        // Randomizamos el array de ingredientes para asegurar aleatoriedad
        String[] ingredientesAleatorios = randomizarIngredientes(ingredientes);

        // Generamos 5 bocadillos, cada uno con 3 ingredientes aleatorios
        for (int i = 0; i < 5; i++) {
            mostrarBocadillo(ingredientesAleatorios, i);
        }
    }

    // Función para randomizar el array de ingredientes
    static String[] randomizarIngredientes(String[] ingredientes) {
        Random rand = new Random();
        String[] ingredientesAleatorios = ingredientes.clone();
        for (int i = 0; i < ingredientesAleatorios.length; i++) {
            int j = rand.nextInt(ingredientesAleatorios.length);
            String temp = ingredientesAleatorios[i];
            ingredientesAleatorios[i] = ingredientesAleatorios[j];
            ingredientesAleatorios[j] = temp;
        }
        return ingredientesAleatorios;
    }

    // Función para mostrar un bocadillo
    static void mostrarBocadillo(String[] ingredientes, int indiceBocadillo) {
        System.out.print("Bocadillo " + (indiceBocadillo + 1) + ": ");
        for (int j = 0; j < 3; j++) {
            System.out.print(ingredientes[indiceBocadillo * 3 + j]);
            if (j < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}