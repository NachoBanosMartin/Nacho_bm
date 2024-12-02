package unidades.unidad5.tareas;

public class Bocadillos {

	public static void main(String[] args) {
		
		String[] ingredientes = {"Jamón", "Queso", "Lechuga", "Atún", "Tomate", "Huevo Duro", "Pollo", "Aceitunas", 
				"Pimiento", "Chorizo", "Pepinillos", "Salsa Rosa", "Lomo", "Cebolla", "Mayonesa"};
	
	
		generarBocadillo(ingredientes, null);

	}
	
	
	static void generarBocadillo(String array[], String ingredientes) {
		
		for (int i = 0; i < ingredientes.length(); i++) {
		
		System.out.println("Bocadillos generados: ");
		System.out.println("Bocadillo 1: " + ingredientes[i]);
		System.out.println("Bocadillo 2: ");
		System.out.println("Bocadillo 3: ");
		System.out.println("Bocadillo 4: ");
		System.out.println("Bocadillo 5: ");
		
		}
	}

}
