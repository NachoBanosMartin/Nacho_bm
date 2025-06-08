package unidades.desdeCasa.agenciaTransporte;

public class Animales extends Transporte {
	
	private static final int COSTO_BASE_ANIMALES = 80;
	private int numAnimales;
	private TiposAnimales tiposAnimales;
	
	
	public Animales(String matricula, String condcutor, String origen, String destino, int numAnimales,
			TiposAnimales tiposAnimales) {
		super(matricula, condcutor, origen, destino);
		this.numAnimales = numAnimales;
		this.tiposAnimales = tiposAnimales;
	}
	
	@Override 
	public double calcularCoste() {		
		
		return COSTO_BASE_ANIMALES + (5 * numAnimales);		
	}


	public int getNumAnimales() {
		return numAnimales;
	}


	public void setNumAnimales(int numAnimales) {
		this.numAnimales = numAnimales;
	}


	public TiposAnimales getTiposAnimales() {
		return tiposAnimales;
	}


	public void setTiposAnimales(TiposAnimales tiposAnimales) {
		this.tiposAnimales = tiposAnimales;
	}


	@Override
	public String toString() {
		return "ANIMALES;" + super.toString() + ";" + numAnimales + ";" + tiposAnimales;
	}
	
	
	
	

}
