package unidades.unidad7.ejemplos.enumerados;

public enum PaloNaipes {

	PICAS("Picas"), 
	CORAZONES("Corazones"), 
	TREBOLES("Treboles"), 
	DIAMANTES("Diamantes"); // Cuidado con el punto y coma
	
	private final String nombre;
	
	private PaloNaipes(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
