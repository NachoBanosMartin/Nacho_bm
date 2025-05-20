package unidades.desdeCasa.empresaFerroviaria;

public class Locomotora {
	
	protected String matricula;
	protected int potenciaMotor;
	protected int anoFabricacion;
	protected Mecanicos mecanico;
	
	
	public Locomotora(String matricula, int potenciaMotor, int anoFabricacion, Mecanicos mecanico) {
		super();
		this.matricula = matricula;
		this.potenciaMotor = potenciaMotor;
		this.anoFabricacion = anoFabricacion;
		this.mecanico = mecanico;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getPotenciaMotor() {
		return potenciaMotor;
	}


	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}


	public int getAnoFabricacion() {
		return anoFabricacion;
	}


	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}


	public Mecanicos getMecanico() {
		return mecanico;
	}


	public void setMecanico(Mecanicos mecanico) {
		this.mecanico = mecanico;
	}


	@Override
	public String toString() {
		return "Locomotora: " + this.matricula + " | Potencia: " + this.potenciaMotor + " CV"; 
	}
	
	

}
