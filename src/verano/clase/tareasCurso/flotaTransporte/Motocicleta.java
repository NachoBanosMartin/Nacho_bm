package verano.clase.tareasCurso.flotaTransporte;

public class Motocicleta extends Vehiculo {

	private String tipoMoto;

	public Motocicleta(String marca, String modelo, String matricula, double capacidadDeposito, String tipoMoto) {
		super(marca, modelo, matricula, capacidadDeposito);
		this.tipoMoto = tipoMoto;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	@Override
	public double calcularAutonomia() {
		double factorTipo;
			if (tipoMoto.equalsIgnoreCase("deportiva")) {
				factorTipo = 1.2;
			} else {
				factorTipo = 1.0;
			}
		double consumo = 4 * factorTipo;		
		double factorVelocidad;
		    if (VELOCIDAD_MEDIA > 100) {
		        factorVelocidad = 1.1;
		    } else {
		        factorVelocidad = 1.0;
		    }
		return getCapacidadDeposito() / (consumo * factorVelocidad);
	}

}
