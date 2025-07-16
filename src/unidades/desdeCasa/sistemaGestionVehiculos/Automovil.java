package unidades.desdeCasa.sistemaGestionVehiculos;

public class Automovil extends Vehiculo{
	
	private int numeroPuertas;

	public Automovil(String marca, String modelo, int anio, double kilometraje, int numeroPuertas) {
		super(marca, modelo, anio, kilometraje);
		this.numeroPuertas = numeroPuertas;
	}
	
	public String mostrarInfo() {
        super.mostrarInfo();
		return "Puertas -> " + numeroPuertas;		
	}

	public String calcularMantenimiento() {
        return "Revisión de frenos y cambio de aceite.";
	}
	
	 public double calcularConsumo() {
	        return 15.5; // valor fijo simulado
	 }
}
