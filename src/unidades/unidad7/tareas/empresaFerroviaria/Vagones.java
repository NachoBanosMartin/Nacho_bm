package unidades.unidad7.tareas.empresaFerroviaria;

public class Vagones {

	private int numero;
	private int cargaActual;
	private int cargaMaxima;
	private String tipoMercancia;
	
	
	public Vagones(int numero, int cargaActual, int cargaMaxima, String tipoMercancia) {
		super();
		this.numero = numero;
		this.cargaActual = cargaActual;
		this.cargaMaxima = cargaMaxima;
		this.tipoMercancia = tipoMercancia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getCargaActual() {
		return cargaActual;
	}


	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}


	public int getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public String getTipoMercancia() {
		return tipoMercancia;
	}


	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}


	@Override
	public String toString() {
		return "Vagones [numero=" + numero + ", cargaActual=" + cargaActual + ", cargaMaxima=" + cargaMaxima
				+ ", tipoMercancia=" + tipoMercancia + "]";
	}
	
	
	
	
}
