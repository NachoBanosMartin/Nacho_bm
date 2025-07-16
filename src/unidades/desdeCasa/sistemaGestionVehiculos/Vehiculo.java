package unidades.desdeCasa.sistemaGestionVehiculos;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int anio;
	private double kilometraje;
	
	
	public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.kilometraje = kilometraje;
	}


	public String mostrarInfo() {
		return "Vehículo -> marca: " + marca + ", modelo: " + modelo + ", año: " + anio + ", kilometraje: " + kilometraje;
	}
	
	public double calcularConsumo(double litros, double distancia) {
		if (litros == 0) {
			return 0;
		}
		return distancia / litros;
	}
	
	public String calcularMantenimiento() {
        return "Mantenimiento general requerido.";
    }

}
