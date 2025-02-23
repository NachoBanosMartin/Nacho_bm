package unidades.unidad8.ejercicios.ejercicio4;

	/*
	  4. Velas Gata hace velas en varios tamaños. Cree una clase para la empresa denominada Vela que
	  contenga campos de datos para color, altura y precio. Cree métodos get para los tres campos. 
	  Cree métodos establecidos para el color y la altura, pero no para el precio. En cambio, cuando
	  se establece la altura, determine el precio como 2€ por cm.

	  Cree una clase secundaria llamada VelaPerfumada que contenga un campo de datos adicional llamado
	  aroma y métodos para obtenerlo y configurarlo. En la clase secundaria, anule el método setAltura ()
	  del padre para establecer el precio de un objeto VelaPerfumada en  3€ por cm. Escriba una aplicación
	  que instancia un objeto de cada tipo y muestra los detalles. Guarde los archivos como Vela.java, 
	  VelaPerfumada.java y ProgramaVelas.java.
	*/

	public class Vela {
		private String color;
		private double altura;
		private double precio;		
		
		
		public Vela(String color, double altura) {
			super();
			this.color = color;
			setAltura(altura);
		}
		
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
			this.precio = altura * 2.0;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		
		public void mostrarInformacion() {
			System.out.println("Color: " + color);
			System.out.println("Altura: " + altura + " cm");
			System.out.println("Precio: " + precio + " $");
		}
	
	
}
