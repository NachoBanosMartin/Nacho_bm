package unidades.unidad6.ejercicios.ejercicioColaPedidos;

public class Main {

	public static void main(String[] args) {
		
		ColaPedidos<Pedido> cola = new ColaPedidos<>();

		Pedido mipedido1 = new Pedido (1, "Electrónica", 43.5, "Urgente");
		Pedido mipedido2 = new Pedido (2, "Electrónica", 21.4, "Normal");
		Pedido mipedido3 = new Pedido (3, "Electrónica", 1.6, "Normal");
		Pedido mipedido4 = new Pedido (4, "Electrónica", 3.23, "Express");
		
		cola.encola(mipedido1);
		cola.encola(mipedido2);
		cola.encola(mipedido3);
		cola.encola(mipedido4);
		
		cola.mostrarCola();     // Mostrar estado inicial de la cola
		
		System.out.println("\nCabeza de la cola: " + cola.cabeza());     // Mostrar cabeza de la cola
				
		System.out.println("\nDesencolando cola: " + cola.desencola());   // Desencolar un pedido
		
		System.out.println("\nNueva cola: ");                    // Mostrar estado final de la cola
		cola.mostrarCola();
	
		
	}

}
