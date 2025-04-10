package unidades.unidad11.ejemplos.itv;

public class Inspeccion {
	
	private String nombre;
	private Deficiencia resultado;
	private String observacion;
	
	
	public Inspeccion(String nombre, Deficiencia resultado, String observacion) {
		super();
		this.nombre = nombre;
		this.resultado = resultado;
		this.observacion = observacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Deficiencia getResultado() {
		return resultado;
	}


	public void setResultado(Deficiencia resultado) {
		this.resultado = resultado;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	@Override
	public String toString() {
		return "Inspeccion sobre: " + this.nombre + ", Resultado: " + this.resultado + ", Observacion: " + this.observacion;
	}
	
	
	
	

}
