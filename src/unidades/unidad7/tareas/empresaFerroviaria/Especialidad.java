package unidades.unidad7.tareas.empresaFerroviaria;

public enum Especialidad {

	FRENOS ("Frenos"),
	HIDRAULICA ("Hidráulica"),
	ELECTRICIDAD ("Electricidad"),
	MOTOR ("Motor");
	
	private final String especialidad;

	private Especialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
	
}
