package unidades.desdeCasa.cuentaBancaria;

import java.time.LocalDateTime;

public class Operacion {

	private boolean esIngreso;
	private LocalDateTime fechaHora;
	private double importe;
	private TipoTarjeta tarjeta;
	
	
	public Operacion(boolean esIngreso, double importe, TipoTarjeta tarjeta) {
		super();
		this.esIngreso = esIngreso;
		this.fechaHora = LocalDateTime.now();
		this.importe = importe;
		this.tarjeta = tarjeta;
	}


	public boolean isEsIngreso() {
		return esIngreso;
	}


	public void setEsIngreso(boolean esIngreso) {
		this.esIngreso = esIngreso;
	}


	public LocalDateTime getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public TipoTarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(TipoTarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}


	@Override
	public String toString() {
		String tipo = esIngreso ? "Ingreso" : "Retiro";
		return "Operacion -> Fecha y hora: " + fechaHora + ", Importe: " + importe + "€, Tipo de tarjeta: " + tarjeta;
	}	
	
	// Guardar en archivo (tipo NO incluido)
    public String toFileString() {
        return fechaHora + " - " + importe + "€ - " + tarjeta;
    }
	
	
	
	
	
	
}
