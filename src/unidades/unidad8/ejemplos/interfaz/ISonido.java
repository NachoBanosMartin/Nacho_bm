package unidades.unidad8.ejemplos.interfaz;

public interface ISonido {
	
	static final String nombre = "SONIDO";
	
	void voz();

	default void vozDurmiendo() {
		System.out.println("Zzzzzzzzzzzz");
	}
}
