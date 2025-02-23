package unidades.unidad7.tareas.empresaFerroviariaSolucion;

public class Vagon {

	private int numero;
	private int cargaActual;
	private int cargaMaxima;
	private String tipoMercancia;
	
	
	public Vagon(int numero, int cargaActual, int cargaMaxima, String tipoMercancia) {
		super();
		this.numero = numero;
		this.cargaActual = cargaActual;
		this.cargaMaxima = cargaMaxima;
		this.tipoMercancia = tipoMercancia;
	}


	public int getNumero() {
		return numero;
	}


	public int getCargaActual() {
		return cargaActual;
	}


	public int getCargaMaxima() {
		return cargaMaxima;
	}


	public String getTipoMercancia() {
		return tipoMercancia;
	}


	@Override
	public String toString() {
		return "Vagon [numero=" + numero + ", cargaActual=" + cargaActual + ", cargaMaxima=" + cargaMaxima
				+ ", tipoMercancia=" + tipoMercancia + "]";
	}


	


	
	
}
