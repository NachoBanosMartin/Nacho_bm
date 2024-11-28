package unidades.unidad5.ejemplos;

public class BusquedaBinaria {

	public static void main(String[] args) {
	int elementos[] = {3,4,5,12,27,28,45,53,90,97,276};
		
		boolean resultadoBusqueda = buscarBinario(elementos,97);
		
		if(resultadoBusqueda) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");

		}
		
		
		
	}

	static boolean buscarBinario(int array[], int elemento) {
		boolean encontrado = false;
		int izquierda = 0, derecha = array.length-1;
		while(izquierda <= derecha && !encontrado) {
			int medio = (izquierda + derecha)/2;
			//comprobar si elemento es el medio
			if (array [medio] == elemento) {
			encontrado =true;
			}
			//preguntamos si es mayor, me quedo con la parte derecha
			else if (array[medio] < elemento) {
			izquierda = medio +1;
			}// si es menor me quedo con la parte izquierda
			else {
				derecha = medio -1;
			}
		}
		
	return encontrado;
		}
		
}
	