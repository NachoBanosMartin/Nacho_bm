package unidades.desdeCasa.sistemaGestionVehiculos;

public class Motocicleta extends Vehiculo{
	
	private String tipoMotor;

	public Motocicleta(String marca, String modelo, int anio, double kilometraje, String tipoMotor) {
		super(marca, modelo, anio, kilometraje);
		this.tipoMotor = tipoMotor;
	}
	
	public String mostrarInfo() {
        super.mostrarInfo();
		return "Motor -> " + tipoMotor;		
	}
	
	public String calcularMantenimiento() {
        return "Revisión de motor.";
	}
	
	public double calcularConsumo(double distancia) {
	    double consumoPromedio = 30.2; // consumo promedio simulado
	    return consumoPromedio;
	}

}
