package verano.clase.tareasCurso.flotaTransporte;

public class Camion extends Vehiculo{
	
	private double pesoCarga;

	public Camion(String marca, String modelo, String matricula, double capacidadDeposito, double capacidadCarga) {
		super(marca, modelo, matricula, capacidadDeposito);
		this.pesoCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return pesoCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.pesoCarga = capacidadCarga;
	}

	@Override
	public double calcularAutonomia() {
		double consumo = 20 + pesoCarga * 0.001;
		double factorVelocidad = 0;
		if (VELOCIDAD_MEDIA > 100) {
			factorVelocidad = 1.1;
		}else {
			factorVelocidad = 1.0;
		}
		return getCapacidadCarga() / (consumo * factorVelocidad);
	} 
	
	

}
