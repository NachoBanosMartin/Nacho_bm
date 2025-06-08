package unidades.desdeCasa.agenciaTransporte;

public abstract class Transporte {
	
	private String matricula;
	private String condcutor;
	private String origen;
	private String destino;
	
	public Transporte(String matricula, String condcutor, String origen, String destino) {
		super();
		this.matricula = matricula;
		this.condcutor = condcutor;
		this.origen = origen;
		this.destino = destino;
	}
	
	public abstract double calcularCoste();
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCondcutor() {
		return condcutor;
	}

	public void setCondcutor(String condcutor) {
		this.condcutor = condcutor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return  matricula + ";" + condcutor + ";" + origen + ";" + destino;
	}
	
	
	
	

}
