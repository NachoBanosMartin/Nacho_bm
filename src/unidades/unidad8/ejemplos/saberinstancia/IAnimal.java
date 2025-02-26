package unidades.unidad8.ejemplos.saberinstancia;

public interface IAnimal {

	void hacerSonido();
	void dormir();
	
	default void morir() {
		System.out.println("kbhjrgfkjihew");
	}
}
