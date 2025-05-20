package unidades.desdeCasa.empresaFerroviaria;

public class Mecanicos {
	
	protected String nombre;
	protected int telefono;
	protected Especialidad especialidad;
	
	
	
	public Mecanicos(String nombre, int telefono, Especialidad especialidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public Especialidad getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "Mecanicos [nombre=" + nombre + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
	}
	
	

}
