package unidades.unidad6.tareas.piezasYProveedores;

public class Suministro2 {
	private Pieza pieza;
	private Proveedores proveedor;
	private int cantidad;
	private double precio;
	
	public Suministro2(Pieza pieza, Proveedores proveedor, int cantidad, double precio) {
		
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministro2 [pieza=" + pieza + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
}
