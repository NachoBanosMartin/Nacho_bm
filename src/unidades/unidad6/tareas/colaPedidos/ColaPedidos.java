package unidades.unidad6.tareas.colaPedidos;

public class ColaPedidos<T> {

	static final int PEDIDOS = 10;
	
	static Pedidos [] cola = new Pedidos [PEDIDOS];
	static int cabeza = 0;
	static int siguienteLibre = cabeza;
	
	public static boolean esVacia() {
		boolean esVacia = false;
		if(siguienteLibre == cabeza) {
			esVacia = true;
		}
		return esVacia;
	}
	
	public static void encolar (Pedidos pedido) {
		if (siguienteLibre <PEDIDOS) {
			cola[siguienteLibre] = pedido;
			siguienteLibre ++;
		}
	}
	
	public static Pedidos desencola() {
		Pedidos pedidoCabeza = null;
		
		if(!esVacia()) {
			pedidoCabeza = cola[cabeza];
			for (int i = 1; i <siguienteLibre; i++) {
				cola[i -1] = cola[i];
			}
			cola[siguienteLibre-1] = null;
			siguienteLibre--;
		}
		return pedidoCabeza;
	}

	public static Pedidos cabeza() {
		Pedidos pedidoCabeza = null;
		
		if(!esVacia()) {
			pedidoCabeza = cola[cabeza];
		}
		return pedidoCabeza;
	}

		
}