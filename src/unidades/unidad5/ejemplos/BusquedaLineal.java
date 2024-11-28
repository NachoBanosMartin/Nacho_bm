package unidades.unidad5.ejemplos;

public class BusquedaLineal {

	public static void main(String[] args) {

		int elementos[] = {3,12,4,7,5,90};
		
		boolean resultadoBusqueda = buscar(elementos,5);
		
		if(resultadoBusqueda) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");

		}
		
		
		
		
		
		
	}

	static boolean buscar(int array[], int elemento) {
		boolean encontrado = false;
		for(int i = 0; i < array.length && !encontrado; i ++) {
			System.out.println("Voy a preguntar por el elemento " +(i+1));
			if (array[i] == elemento) {
				encontrado = true;
			
				}
			}
	return encontrado;
		}
		
}
	
	
	
	

