package unidades.unidad7.tareas.empresaFerroviariaSolucion;

public class Maquinista {
	
	private String nombre;
	private String dni;
	private double sueldo;
	private Rango rango;
	
	
	public Maquinista(String nombre, String dni, double sueldo, Rango rango) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.rango = rango;
	}

	

	public String getNombre() {
		return nombre;
	}



	public String getDni() {
		return dni;
	}



	public double getSueldo() {
		return sueldo;
	}



	public Rango getRango() {
		return rango;
	}



	@Override
	public String toString() {
		return "Maquinista [nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + ", rango=" + rango + "]";
	}



	
	
	
}
