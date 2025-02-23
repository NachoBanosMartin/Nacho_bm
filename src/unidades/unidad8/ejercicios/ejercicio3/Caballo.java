package unidades.unidad8.ejercicios.ejercicio3;

	/*
	 3. Cree una clase llamada Caballo que contenga campos de datos para el nombre, el color y
	 el año de nacimiento. Incluya los métodos get y set para estos campos. A continuación, 
	 cree una subclase llamada CarrerasCaballo, que contiene un campo adicional que contiene el
	 número de carreras en las que el caballo ha competido y métodos adicionales para obtener y
	 establecer el nuevo campo. Escriba una aplicación que demuestre el uso de objetos de cada clase.
	
	 Guarde los archivos como Caballo.java, CarrerasCaballo.java y ProgramaCaballos.java.
	*/

public class Caballo {
	
	private String nombre;
	private String color;
	private int anoNacimiento;
	
	
	public Caballo(String nombre, String color, int anoNacimiento) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.anoNacimiento = anoNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnoNacimiento() {
		return anoNacimiento;
	}
	public void setAnoNacimento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Color: " + color);
		System.out.println("Año de nacimiento: " + anoNacimiento);
	}
	
	
}
