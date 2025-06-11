package unidades.desdeCasa.examenOrdinario;

public class Deposito {

	private String producto;
	private double capacidad;
	private double consumo;
	
	
	
	public Deposito(String producto, double capacidad, double consumo) {
		super();
		this.producto = producto;
		this.capacidad = capacidad;
		this.consumo = consumo;
	}



	public double obtenerCapacidadActual() {
		return capacidad - consumo;
	}
}
