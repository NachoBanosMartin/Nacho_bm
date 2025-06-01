package unidades.desdeCasa.agenciaTransporte;

public class Peligroso extends Transporte{
	
	private static final int COSTO_BASE_PELIGROSO = 200;
	private NivelRiego nivelRiesgo;
	private TiposMaterial tipoMaterial;
	
	
	public Peligroso(String matricula, String condcutor, String origen, String destino, NivelRiego nivelRiesgo,
			TiposMaterial tipoMaterial) {
		super(matricula, condcutor, origen, destino);
		this.nivelRiesgo = nivelRiesgo;
		this.tipoMaterial = tipoMaterial;
	}
	
	 
	@Override 
	public double calcularCoste() {
		
		double costoTotal = 0;
		
		switch (nivelRiesgo) {
		case Uno:
			costoTotal = COSTO_BASE_PELIGROSO + (50 * 1);
			break;
		case Dos:
			costoTotal = COSTO_BASE_PELIGROSO + (50 * 2);
			break;
		case Tres:
			costoTotal = COSTO_BASE_PELIGROSO + (50 * 3);
			break;
		case Cuatro:
			costoTotal = COSTO_BASE_PELIGROSO + (50 * 4);
			break;
		case Cinco:
			costoTotal = COSTO_BASE_PELIGROSO + (50 * 5);
			break;
		default:
			System.out.println("No se puede calcular el costo total");
			break;
		}
		return costoTotal;
		
	}


	public NivelRiego getNivelRiesgo() {
		return nivelRiesgo;
	}


	public void setNivelRiesgo(NivelRiego nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}


	public TiposMaterial getTipoMaterial() {
		return tipoMaterial;
	}


	public void setTipoMaterial(TiposMaterial tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}


	@Override
	public String toString() {
		return "Peligroso [nivelRiesgo=" + nivelRiesgo + ", tipoMaterial=" + tipoMaterial + "]";
	}
	
	
	
	

}
