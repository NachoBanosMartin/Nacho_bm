package unidades.unidad8.ejemplos.fauna;

public class Main {

	public static void main(String[] args) {

		
		Animal miPerro = new Perro ("String", 5, 4,"Pastor Alemán");
		Animal miGato = new Gato ("Ciro", 7, 4, "Blanco");
		Tiburon miTiburon = new Tiburon ("Pepe", 34, "Salada", 82);
		
		darDeComer(miPerro);
		darDeComer(miGato);
		darDeComer(miTiburon);
		
		((Perro)miPerro).ladrar();
		
		miPerro.comer();
		
		miPerro.dormir();
	}

	private static void darDeComer(Animal animal) {
		animal.comer();
		
	}

}
