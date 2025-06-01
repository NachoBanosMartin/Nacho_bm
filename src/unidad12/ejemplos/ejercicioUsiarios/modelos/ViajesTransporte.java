package unidad12.ejemplos.ejercicioUsiarios.modelos;

public class ViajesTransporte {
	
	private int id;
	private String matricula;
	private String nombreApellidos;
	private String origen;
	private String destino;
	private String carga;
	private double cantidad;
	private String tipoCarga;
	
	
	public ViajesTransporte(String matricula, String nombreApellidos, String origen, String destino, String carga,
			double cantidad, String tipoCarga) {
		super();
		this.matricula = matricula;
		this.nombreApellidos = nombreApellidos;
		this.origen = origen;
		this.destino = destino;
		this.carga = carga;
		this.cantidad = cantidad;
		this.tipoCarga = tipoCarga;
	}


	public ViajesTransporte(int id, String matricula, String nombreApellidos, String origen, String destino,
			String carga, double cantidad, String tipoCarga) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nombreApellidos = nombreApellidos;
		this.origen = origen;
		this.destino = destino;
		this.carga = carga;
		this.cantidad = cantidad;
		this.tipoCarga = tipoCarga;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNombreApellidos() {
		return nombreApellidos;
	}


	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getCarga() {
		return carga;
	}


	public void setCarga(String carga) {
		this.carga = carga;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public String getTipoCarga() {
		return tipoCarga;
	}


	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}


	@Override
	public String toString() {
		return "ViajesTransporte [id=" + id + ", matricula=" + matricula + ", nombreApellidos=" + nombreApellidos
				+ ", origen=" + origen + ", destino=" + destino + ", carga=" + carga + ", cantidad=" + cantidad
				+ ", tipoCarga=" + tipoCarga + "]";
	}
	
	
	
	
	
	
	

}
