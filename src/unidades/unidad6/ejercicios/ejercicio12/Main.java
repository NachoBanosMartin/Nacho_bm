package unidades.unidad6.ejercicios.ejercicio12;

public class Main {

	private static final double PRECIO_MAS_BAJO = 32;
	private static final double PRECIO_MAS_ALTO = 35;

	public static void main(String[] args) {
		
		Evento evento = new Evento(60, (60 >= 50) ? PRECIO_MAS_BAJO : PRECIO_MAS_ALTO); // Prueba con 60 invitados

		System.out.println("Número de invitados: " + evento.getNumeroInvitados());
		System.out.println("Precio por invitado: " + evento.getPrecioPorInvitado() + " €");
		System.out.println("¿Es un evento grande?: " + evento.esEventoGrande());
		System.out.println("Precio total del evento: " + evento.calcularPrecioTotal() + " €");
		
	}

}
