package unidades.unidad8.tareas.vehiculoElectrico;

public class MotoElectrica extends VehiculoElectrico{
	
	private int cilindrada;
	private boolean tieneSidecar;

	public MotoElectrica(String marca, String modelo, double capacidadBateria, int autonomiaMaxima,
			int cilindrada, boolean tieneSidecar) {
		super(marca, modelo, capacidadBateria, autonomiaMaxima);
		this.cilindrada = cilindrada;
		this.tieneSidecar = tieneSidecar;
	}

}
