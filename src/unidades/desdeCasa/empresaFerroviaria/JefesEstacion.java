package unidades.desdeCasa.empresaFerroviaria;

public class JefesEstacion {
	
	protected String nombre;
	protected String dni;
	protected String fecha;
	
	
	public JefesEstacion(String nombre, String dni, String fecha) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha = fecha;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public String toString() {
		return "Jefe de Estación: " + this.nombre + " | DNI: " + this.dni + " | Nombramiento: " + this.fecha;
	}
	
	
	

}
