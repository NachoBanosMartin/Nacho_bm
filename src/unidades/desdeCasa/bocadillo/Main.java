package unidades.desdeCasa.bocadillo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ingredientes = {
            "Jamón", "Queso", "Lechuga", "Tomate", "Atún", "Huevo duro",
            "Mayonesa", "Aceitunas", "Pepinillos", "Pollo", "Chorizo",
            "Pimiento", "Cebolla", "Salsa rosa", "Lomo"
        };

        // Lista para llevar el control de los ingredientes ya usados
        List<String> ingredientesUsados = new ArrayList<>();

        // Lista para almacenar los bocadillos
        List<List<String>> bocadillos = new ArrayList<>();

        Random rand = new Random(); // Para usar Math.random con más control

        for (int i = 0; i < 5; i++) {
            List<String> bocadillo = new ArrayList<>();
            while (bocadillo.size() < 3) {
                int indice = (int)(Math.random() * ingredientes.length);
                String ingrediente = ingredientes[indice];

                // Verificamos que no se haya usado aún
                if (!ingredientesUsados.contains(ingrediente)) {
                    bocadillo.add(ingrediente);
                    ingredientesUsados.add(ingrediente);
                }
            }
            bocadillos.add(bocadillo);
        }

        // Mostrar resultados
        System.out.println("Bocadillos generados:");
        for (int i = 0; i < bocadillos.size(); i++) {
            System.out.println("Bocadillo " + (i + 1) + ": " + String.join(", ", bocadillos.get(i)));
        }
    }
}