package verano.clase.tareasCurso.piezasProveedores;

public class Suministro {
	
	private int codigoPieza;
	private int idProveedor;
	private int cantidas;
	private double precio;
	
	
	public Suministro(int codigoPieza, int idProveedor, int cantidas, double precio) {
		super();
		this.codigoPieza = codigoPieza;
		this.idProveedor = idProveedor;
		this.cantidas = cantidas;
		this.precio = precio;
	}


	public int getCodigoPieza() {
		return codigoPieza;
	}


	public int getIdProveedor() {
		return idProveedor;
	}


	public int getCantidas() {
		return cantidas;
	}


	public double getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "Suministro -> codigoPieza: " + codigoPieza + "| idProveedor: " + idProveedor + "| cantidas: " + cantidas
				+ "| precio: " + precio;
	}

	
	
	

}
