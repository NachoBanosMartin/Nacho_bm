package unidades.unidad8.ejercicios.ejercicio6;

public class Motocicleta extends Vehiculo{

	private String tipoMoto;

	public Motocicleta(String marca, String modelo, String matricula, double capidadDeposito, String tipoMoto) {
		super(marca, modelo, matricula, capidadDeposito);
		this.tipoMoto = tipoMoto;
	}

	@Override
	public void carcularAutonomia() {
		// TODO Auto-generated method stub
		
	}
	
	
}
