package unidades.unidad7.tareas.empresaFerroviaria;

public class Locomotora {
	
	private String matricula;
	private int potencia;
	private int ano;
	private String mecanico;
	
	public Locomotora(String matricula, int potencia, int ano, String mecanico) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.ano = ano;
		this.mecanico = mecanico;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMecanico() {
		return mecanico;
	}

	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}

	@Override
	public String toString() {
		return "Locomotoras [matricula=" + matricula + ", potencia=" + potencia + ", ano=" + ano + ", mecanico="
				+ mecanico + "]";
	}
	
	

}
