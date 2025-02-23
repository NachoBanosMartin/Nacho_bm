package unidades.unidad7.tareas.empresaFerroviariaSolucion;

public class Locomotora {
	
	private String matricula;
	private int potencia;
	private int ano;
	private Mecanico mecanico;
	
	
	public Locomotora(String matricula, int potencia, int ano, Mecanico mecanico) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.ano = ano;
		this.mecanico = mecanico;
	}


	public String getMatricula() {
		return matricula;
	}


	public int getPotencia() {
		return potencia;
	}


	public int getAno() {
		return ano;
	}


	public Mecanico getMecanico() {
		return mecanico;
	}


	@Override
	public String toString() {
		return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", ano=" + ano + ", mecanico="
				+ mecanico + "]";
	}
	


}
