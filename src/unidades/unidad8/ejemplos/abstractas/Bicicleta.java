package unidades.unidad8.ejemplos.abstractas;

public class Bicicleta extends Vehiculo{

	private int numPedaleoMin;
	
	public Bicicleta(String fuenteAlimentacion, int ruedas, double velocidad, int numPedaleoMin) {
		super(fuenteAlimentacion, ruedas, velocidad);
		this.numPedaleoMin = numPedaleoMin;
	}

	public double calcularVelocidad() {
		double velocidad = this.velocidad;
		
		if(numPedaleoMin > 60) {
			velocidad+= 20;
		}else if(numPedaleoMin < 60) {
			velocidad+= 10;
		}else {
			velocidad+= 15;
		}
		return velocidad;
	}

	@Override
	public String toString() {
		return "Bicicleta [numPedaleoMin=" + numPedaleoMin + "]";
	}

	
	
}
