package unidades.unidad8.ejemplos.saberinstancia;

public class Perro extends Animal implements Jugar{

	public void hacerSonido() {
		System.out.println("El perro ladra: Guau Guau");
	}
	
	void moverCola() {
		System.out.println("El perro mueve la colita");
	}

	@Override
	public void correr() {
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
	}

	@Override
	public void saltar() {
		System.out.println("@   @    @    @     @");
		
	}
}
