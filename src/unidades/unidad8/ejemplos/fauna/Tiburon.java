package unidades.unidad8.ejemplos.fauna;

public class Tiburon extends Pez {
	
	private int numDientes;

	public Tiburon(String nombre, int edad, String tipoAgua, int numDientes) {
		super(nombre, edad, tipoAgua);
		this.numDientes = numDientes;

	}
	
	public void comer() {
		super.comer();
		System.out.println("Mejor ni saberlo");
	}

}
