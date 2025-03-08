package unidades.unidad6.ejercicios.ejercicio4;

/*
 La serigrafía de tu pueblo pretende crear una aplicación para organizar los datos de las camisetas
 que ofrece en su catálogo. Nos indica que quiere recoger la siguiente información: identificador, 
 descripción, material, color, precio y cantidad en stock. Defina una clase que permita modelar dicha
 información. Además, esta clase tendrá un método que permita mostrar por pantalla los datos de la 
 camiseta. Crear una clase ProgramaCamiseta con un método main que utilice la clase creada.
*/

public class ProgramaCamiseta {
		
		private String identificador;
		private String descripcion;
		private String material;
		private String color;
		private double precio;
		private int stock;
		
	
	
	public ProgramaCamiseta(String identificador, String descripcion, String material, String color, double precio,
				int stock) {
			
			this.identificador = identificador;
			this.descripcion = descripcion;
			this.material = material;
			this.color = color;
			this.precio = precio;
			this.stock = stock;
		}


		
	public String getIdentificador() {
		return identificador;
	}



	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "ProgramaCamiseta [identificador=" + identificador + ", descripcion=" + descripcion + ", material="
				+ material + ", color=" + color + ", precio=" + precio + ", stock=" + stock + "]";
	}



	public void mostrarInformacion() {
		System.out.println("Id: " + identificador);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Material: " + material);
		System.out.println("Color: " + color);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad de Stock: " + stock);
			
	}

}
