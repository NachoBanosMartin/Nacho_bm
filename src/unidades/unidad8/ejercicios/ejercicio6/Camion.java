package unidades.unidad8.ejercicios.ejercicio6;

public class Camion extends Vehiculo{
	
	private double capacidadCarga;

	public Camion(String marca, String modelo, String matricula, double capidadDeposito, double capacidadCarga) {
		super(marca, modelo, matricula, capidadDeposito);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void carcularAutonomia() {
		// TODO Auto-generated method stub
		
	}

	
}
	
	


