package unidades.desdeCasa.cuentaCorriente;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacion {

	private String tipoOperacion; // Ingreso o Retiro
	private double importe;
	private String tipoTarjeta; // Virtual o Física
	private LocalDateTime fechahora;
	
	public Operacion(String tipoOperacion, double importe, String tipoTarjeta) {
		super();
		this.tipoOperacion = tipoOperacion;
		this.importe = importe;
		this.tipoTarjeta = tipoTarjeta;
		this.fechahora = LocalDateTime.now();
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public double getImporte() {
		return importe;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public LocalDateTime getFechahora() {
		return fechahora;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return "Operacion -> Tipo de Operación: " + tipoOperacion + ", Importe: " + importe + ", Tarjeta: " + tipoTarjeta
				+ ", Fecha y Hora: " + fechahora.format(formato);
	}
	
	
	
}
