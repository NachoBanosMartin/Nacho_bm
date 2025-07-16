package verano.clase.tareasCurso.flotaTransporte;

public class Autobus extends Vehiculo{
	
	private int numPasajeros;

	public Autobus(String marca, String modelo, String matricula, double capacidadDeposito, int numPasajeros) {
		super(marca, modelo, matricula, capacidadDeposito);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	@Override
	public double calcularAutonomia() {
		double consumo = 25 + numPasajeros * 0.05;
		double factorVelocidad = 0;
		  if (VELOCIDAD_MEDIA > 100) {
		        factorVelocidad = 1.1;
		    } else {
		        factorVelocidad = 1.0;
		    }
		return getCapacidadDeposito() / (consumo * factorVelocidad);
	}
	
	

}
