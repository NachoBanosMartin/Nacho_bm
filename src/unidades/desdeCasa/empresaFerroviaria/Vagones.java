package unidades.desdeCasa.empresaFerroviaria;

public class Vagones {
	
	protected int numero;
	protected int cargaMax;
	protected int cargaActual;
	protected TipoMercancia tipoMercancia;
	
	
	public Vagones(int numero, int cargaMax, int cargaActual, TipoMercancia tipoMercancia) {
		super();
		this.numero = numero;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.tipoMercancia = tipoMercancia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getCargaMax() {
		return cargaMax;
	}


	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}


	public int getCargaActual() {
		return cargaActual;
	}


	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}


	public TipoMercancia getTipoMercancia() {
		return tipoMercancia;
	}


	public void setTipoMercancia(TipoMercancia tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}


	
	public String toString(int i) {	
		return "Vagon " + i + " | Carga Actual: " + this.cargaActual + "/" + this.cargaMax + " kg | Mercancias: " + this.tipoMercancia;
	}
	
	

}
