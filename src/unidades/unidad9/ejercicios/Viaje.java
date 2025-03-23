package unidades.unidad9.ejercicios;

public abstract class Viaje {
	
	protected String matriculaCamion;
	protected String conductor;
	protected String origen;
	protected String destino;
	
	
	public Viaje(String matriculaCamion, String conductor, String origen, String destino) {
		super();
		this.matriculaCamion = matriculaCamion;
		this.conductor = conductor;
		this.origen = origen;
		this.destino = destino;
	}

	public abstract double calcularCosteViaje();
	public abstract void mostrarDetalle();

	public String getMatriculaCamion() {
		return matriculaCamion;
	}


	public String getConductor() {
		return conductor;
	}


	public String getOrigen() {
		return origen;
	}


	public String getDestino() {
		return destino;
	}

	@Override
	public String toString() {
		return "Viaje [matriculaCamion=" + matriculaCamion + ", conductor=" + conductor + ", origen=" + origen
				+ ", destino=" + destino + "]";
	}


	
	

}
