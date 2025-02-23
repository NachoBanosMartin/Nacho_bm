package unidades.unidad8.ejercicios.ejercicio5;

	/*
	  5. Crea una clase Camiseta para la compañía Camisetas Augusta. Los campos incluyen un número
	  de pedido, tamaño, color y precio. Cree métodos establecidos para el número de pedido, el 
	  tamaño y el color y obtenga métodos para los cuatro campos. El precio está determinado por 
	  el tamaño: 22.99€ para XXL o XXXL, y  9.99€ para todos los demás tamaños. Cree una subclase 
	  llamada Personalizada que descienda de Camiseta e incluya un campo para contener el eslogan 
	  solicitado para la camisa e incluya métodos get y set en este campo. Escriba una aplicación
	  que cree dos objetos de cada clase y demuestre que todos los métodos funcionan correctamente.
	  Guarde los archivos como Camiseta.java, Personalizada.java y ProgramaCamisetas.java
	*/

	public class Camiseta {
		
		private int numPedido;
		private String tamano;
		private String color;
		private double precio;
		
		
		public Camiseta(int numPedido, String tamano, String color) {
			super();
			this.numPedido = numPedido;
			this.tamano = tamano;
			this.color = color;
			setPrecio(tamano);
		}


		public int getNumPedido() {
			return numPedido;
		}


		public void setNumPedido(int numPedido) {
			this.numPedido = numPedido;
		}


		public String getTamano() {
			return tamano;
		}


		public void setTamaño(String tamano) {
			this.tamano = tamano;
			setPrecio(tamano);
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


		public void setPrecio(String tamano) {
	
			if(tamano.equals("XXL") || tamano.equals("XXXL")){
				this.precio = 22.99;
			}else {
				this.precio = 9.99;
			}
		}
		
		public void mostrarInformacion() {
	        System.out.println("Número de Pedido: " + numPedido);
	        System.out.println("Tamaño: " + tamano);
	        System.out.println("Color: " + color);
	        System.out.println("Precio: " + precio + " €");
	    }

}
