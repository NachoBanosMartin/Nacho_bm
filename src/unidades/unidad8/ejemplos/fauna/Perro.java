package unidades.unidad8.ejemplos.fauna;

public class Perro extends Mamifero {
	
	private String raza;

	public Perro(String nombre, int edad, int numPatas, String raza) {
		super(nombre, edad, numPatas);
		this.raza = raza;
	
	}
	
	public void ladrar() {
		System.out.println("Guau Guau");
	}
	
	public void comer(String pienso) {
		super.comer();
		System.out.println("ksgurfeierugfie" + pienso);
	}
	
	public void comerPienso() {
		super.comer();
		System.out.println("ksgurfeierugfie");
	}

}
