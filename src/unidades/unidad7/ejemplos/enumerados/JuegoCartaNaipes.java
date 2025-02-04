package unidades.unidad7.ejemplos.enumerados;

public class JuegoCartaNaipes {

	public static void main(String[] args) {

		CartaNaipes carta1 = new CartaNaipes(PaloNaipes.PICAS,3);
		
		System.out.println("La carta 1 es: " + carta1.getPuntos()
			+ " de " + carta1.getPalo().getNombre());

	}

}
