package verano.clase.tareasCurso.piezasProveedores;

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


	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Pieza -> codigo: " + codigo + " | nombre: " + nombre;
	}
	
}
