package unidades.unidad8.ejercicios.ejercicio6;

public class Coche extends Vehiculo{
	
	private int numeroPlazas;

	public Coche(String marca, String modelo, String matricula, double capidadDeposito, int numeroPlazas) {
		super(marca, modelo, matricula, capidadDeposito);
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public void carcularAutonomia() {
		// TODO Auto-generated method stub
		
	}

	

}
