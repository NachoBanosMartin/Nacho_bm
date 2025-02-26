package unidades.unidad8.ejercicios.ejercicio6;

public class Autobus extends Vehiculo{
	
	private int numeroPasajeros;

	public Autobus(String marca, String modelo, String matricula, double capidadDeposito, int numeroPasajeros) {
		super(marca, modelo, matricula, capidadDeposito);
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public void carcularAutonomia() {
		// TODO Auto-generated method stub
		
	}
	
	

}
