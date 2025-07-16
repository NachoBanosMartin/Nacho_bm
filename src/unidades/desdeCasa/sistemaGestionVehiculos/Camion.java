package unidades.desdeCasa.sistemaGestionVehiculos;

public class Camion extends Vehiculo{
	
	private double capacidadCarga;

	public Camion(String marca, String modelo, int anio, double kilometraje, double capacidadCarga) {
		super(marca, modelo, anio, kilometraje);
		this.capacidadCarga = capacidadCarga;
	}
	
	public String mostrarInfo() {
        super.mostrarInfo();
		return "Capacidad -> " + capacidadCarga;		
	}
	
	public String calcularMantenimiento() {
		return "Inspección de frenos y suspensión.";
	}
	
	public double calcularConsumo(double litros, double distancia, double carga) {
        double factorCarga = 1 + (carga / 10); // más carga = más consumo
        return (distancia / litros) / factorCarga;
    }

}
