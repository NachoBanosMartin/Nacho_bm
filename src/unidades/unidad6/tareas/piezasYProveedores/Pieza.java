package unidades.unidad6.tareas.piezasYProveedores;

public class Pieza {

	private int codigo;
	private String nombre;


	public Pieza(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public String toString() {
		return "Pieza [id = " + codigo + ", nombre = " + nombre + "]";
	}
	
}
