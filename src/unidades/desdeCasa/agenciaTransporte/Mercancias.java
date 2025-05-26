package unidades.desdeCasa.agenciaTransporte;

public class Mercancias extends Transporte{
	
	private static final int COSTO_BASE_MERCANCIAS = 50;
	private double peso;
	private TiposMercancias tipoMercancia;
	
	
	public Mercancias(String matricula, String condcutor, String origen, String destino, double peso,
			TiposMercancias tipoMercancia) {
		super(matricula, condcutor, origen, destino);
		this.peso = peso;
		this.tipoMercancia = tipoMercancia;
	}
	
	
	public double calcularCosteMercancias() {
		
		double costoTotal = 0;
		
		switch (tipoMercancia) {
		case General:
			costoTotal = COSTO_BASE_MERCANCIAS + (10 * peso);
			System.out.println("El costo es de: " + costoTotal);
			break;
		case Refrigerada:
			costoTotal = COSTO_BASE_MERCANCIAS + (15 * peso);
			System.out.println("El costo es de: " + costoTotal);
			break;
		case Pesada:
			costoTotal = COSTO_BASE_MERCANCIAS + (20 * peso);
			System.out.println("El costo es de: " + costoTotal);
			break;
		default:
			System.out.println("El coste no se puede calcular");
			break;
		}
		
		
		return costoTotal;
		
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public TiposMercancias getTipoMercancia() {
		return tipoMercancia;
	}


	public void setTipoMercancia(TiposMercancias tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}


	@Override
	public String toString() {
		return "Mercancias [peso=" + peso + ", tipoMercancia=" + tipoMercancia + "]";
	}
	
	
	
	

}
