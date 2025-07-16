package verano.clase.tareasCurso.piezasProveedores;

public class Proveedor {

	private int id;
	private String nombre;
	
	
	public Proveedor(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Proveedor -> id: " + id + "| nombre: " + nombre;
	}



	
}

