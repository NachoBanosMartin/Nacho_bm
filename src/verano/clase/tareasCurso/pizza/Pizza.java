package verano.clase.tareasCurso.pizza;

public class Pizza {

	private TamanoPizza tamano;

	public Pizza(TamanoPizza tamano) {
		super();
		this.tamano = tamano;
	}
	
	public double calcularPrecio() {
		
		switch (tamano) {
		case PEQUENA:
			return 5.0;
		case MEDIANA:
			return 7.5;
		case GRANDE:
			return 10.0;
		default:
			return 0.0;

		}
		
	}
	
	public void mostrarDetalles() {
		
		// System.out.println(tamano);
		// System.out.println(calcularPrecio());
		
		System.out.println("La pizza " + tamano + " cuesta " + calcularPrecio() + " euros.");
		
		
	}
}
