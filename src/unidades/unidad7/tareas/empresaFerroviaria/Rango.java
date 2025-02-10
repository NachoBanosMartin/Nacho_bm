package unidades.unidad7.tareas.empresaFerroviaria;

public enum Rango {

	APRENDIZ ("Aprendiz"),
	JUNIOR ("Junior"),
	SENIOR ("Senior"),
	INSTRUCTOR ("Instructor");

	private final String nombre;

	private Rango(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	
	
}
