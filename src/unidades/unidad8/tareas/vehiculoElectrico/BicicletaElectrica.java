package unidades.unidad8.tareas.vehiculoElectrico;

public class BicicletaElectrica extends VehiculoElectrico {

	private String tipoMotor;
	private boolean asistenciaPedaleo;
	
	public BicicletaElectrica(String marca, String modelo, double capacidadBateria, int autonomiaMaxima,
			String tipoMotor, boolean asistenciaPedaleo) {
		super(marca, modelo, capacidadBateria, autonomiaMaxima);
		this.tipoMotor = tipoMotor;
		this.asistenciaPedaleo = asistenciaPedaleo;
	}
	
	

}
