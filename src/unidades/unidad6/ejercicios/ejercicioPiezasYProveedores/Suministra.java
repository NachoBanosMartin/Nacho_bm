package unidades.unidad6.ejercicios.ejercicioPiezasYProveedores;

public class Suministra {
	
	private int codigoPieza;
	private int idProveedor;
	private double precio;
	
	
	public Suministra(int codigoPieza, int idProveedor, double precio) {
		super();
		this.codigoPieza = codigoPieza;
		this.idProveedor = idProveedor;
		this.precio = precio;
	}


	public int getCodigoPieza() {
		return codigoPieza;
	}


	public void setCodigoPieza(int codigoPieza) {
		this.codigoPieza = codigoPieza;
	}


	public int getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Suministro [codigoPieza=" + codigoPieza + ", idProveedor=" + idProveedor + ", precio=" + precio + "]";
	}

	

}
