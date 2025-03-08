package unidades.unidad6.ejercicios.ejercicioColaPedidos;

public class ColaPedidos<T> {

	private static final int TAMANO_MAXIMO = 10; // Tamaño fijo del array: 10 espacios
	private T[] cola;           // El array donde guardamos los pedidos
	private int frente;        // Apunta al primer pedido (el que saldrá primero)
	private int fin;           // Apunta al lugar donde pondremos el próximo pedido
	private int tamano;        // Cuenta cuántos pedidos hay en la cola
	
	
	public ColaPedidos() { // Constructor
		cola = (T[]) new Object[TAMANO_MAXIMO]; 
	    frente = 0;    
	    fin = 0;       // El lugar para nuevos pedidos también empieza en 0
	    tamano = 0;
	}
	
	public void encola(T pedido) {
		if(tamano == TAMANO_MAXIMO) {
			System.out.println("La cola está llena, no se puede agregar ningún pedido más");
			return;
		}
		cola[fin] = pedido; 				// Si hay espacio, el pedido se pone en la posición fin del array.
		fin = (fin + 1) % TAMANO_MAXIMO;    // Movemos "fin" al siguiente espacio. El "%" hace que si llegamos al final (posición 10), volvamos a 0
		tamano ++;
		System.out.println("Pedido encolado: " + pedido);
	}
	
	private boolean esVacia() {
		return tamano == 0;
	}
	
	public T cabeza() {
		if(esVacia()) {
			System.out.println("La cola está vacía");
			return null;
		}
		return cola[frente];		
	}
	
	public T desencola() {
		if(esVacia()) {
			System.out.println("La cola está vacía");
			return null;
		}
		T pedido = cola[frente];
		cola[frente] = null;
		frente = (frente + 1) % TAMANO_MAXIMO;
		tamano --;
		return pedido;		
	}
	
	public void mostrarCola() {
		if(esVacia()) {
			System.out.println("La cola está vacía");
			return;
		}
		System.out.println("\nCola actual: ");
		int contador = 0;
		int indice = frente;
		while (contador < tamano) {
			System.out.println(cola[indice]);
			indice = (indice + 1) % TAMANO_MAXIMO;
			contador ++;
		}
	}

	
	
	
}
