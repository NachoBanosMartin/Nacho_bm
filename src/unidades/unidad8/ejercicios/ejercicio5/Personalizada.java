package unidades.unidad8.ejercicios.ejercicio5;

	public class Personalizada extends Camiseta{
		
		private String eslogan;

		public Personalizada(int numPedido, String tamano, String color, String eslogan) {
			super(numPedido, tamano, color);
			this.eslogan = eslogan;
		}

		public String getEslogan() {
			return eslogan;
		}

		public void setEslogan(String eslogan) {
			this.eslogan = eslogan;
		}
		
		public void mostrarInformacion() {
	        super.mostrarInformacion();
	        System.out.println("Eslogan: " + eslogan);
	    }

}
