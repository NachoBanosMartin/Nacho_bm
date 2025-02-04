package unidades.unidad7.ejemplos.enumerados;

public class JuegoCartasInglesas {

	public static void main(String[] args) {

		Cartas carta1 = new Cartas(Palo.PALO_DIAMANTES,2);

		System.out.println("La carta 1 es: " + carta1.getPuntos() + " de " + carta1.getNombrePalo());

	}

}
