package unidades.unidad5.ejemplos;

public class Burbuja {

	public static void main(String[] args) {
		
		int[] datos = {62,23,10,20,9};
		
		System.out.println("Array original");
		mostrarArray(datos);
		ordenarPorBurbuja(datos);
		System.out.println("\nArray ordenado");
		mostrarArray(datos);


	}

	static void ordenarPorBurbuja(int[] datos) {
		int n = datos.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (datos[j] > datos[j + 1]) {
					int tmp = datos[j + 1];
					datos [j + 1] = datos[j];
					datos[j] = tmp;
				}
			}
		}
			
	}

	static void mostrarArray(int[] datos) {
		
		/*
		 for (int i = 0; i < datos.length; i++){
		 }
		 
		 */
		
		for(int dato:datos) {                  //Para recorrer el array hasta el final
			System.out.println(dato + "");
		}
		
	}

}
