package unidades.desdeCasa.empresaFerroviaria;

public class Maquinistas {
	
	protected String nombre;
	protected int edad;
	protected double sueldo;
	protected Rangos rango;
	
	
	public Maquinistas(String nombre, int edad, double sueldo, Rangos rango) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.rango = rango;
	}


	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Rangos getRango() {
		return rango;
	}

	public void setRango(Rangos rango) {
		this.rango = rango;
	}


	@Override
	public String toString() {
		return "Maquinista: " + this.nombre + " | " + "Rango: " + this.rango;
	}
	
	
	
	

}
