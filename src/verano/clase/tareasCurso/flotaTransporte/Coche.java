package verano.clase.tareasCurso.flotaTransporte;

public class Coche extends Vehiculo{

	private static final int CONSUMO_BASE = 6;
	private int numPasajeros;

	public Coche(String marca, String modelo, String matricula, double capacidadDeposito, int numPlazas) {
		super(marca, modelo, matricula, capacidadDeposito);
		this.numPasajeros = numPlazas;
	}

	public int getNumPlazas() {
		return numPasajeros;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPasajeros = numPlazas;
	}

	@Override
	public double calcularAutonomia() {
		double consumo = CONSUMO_BASE + (numPasajeros * 0.1);
		double factorVelocidad = 0;
			if (VELOCIDAD_MEDIA> 100) {
				factorVelocidad = 1.1;
			}else {
				factorVelocidad = 1.0;
			}
		return getCapacidadDeposito() / (consumo * factorVelocidad);
	}
	
	

}
