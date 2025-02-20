package unidades.unidad8.ejemplos.fauna;

public class Animal {

	private String nombre;
	private int edad;
	
	
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	protected void dormir() {
		System.out.println("Zzzzzzzzzzzz");
	}
	
	protected void comer() {
		System.out.println("Ñamñamñamñam");
		
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
	
	
}
