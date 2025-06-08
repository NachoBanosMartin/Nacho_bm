package unidades.desdeCasa.gasolinera;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Timer;

public class Comprobante {
	
	private Date fecha;
	private Timer hora;
	private String tipoCombustible;
	private double importe;
	private double litrosSuministrados;
	private double litrosRestantesDeposito;
	
	
	public Comprobante(Date fecha, Timer hora, String tipoCombustible, double importe, double litrosSuministrados,
			double litrosRestantesDeposito) {
		super();
		this.fecha = fecha;
		this.tipoCombustible = tipoCombustible;
		this.importe = importe;
		this.litrosSuministrados = litrosSuministrados;
		this.litrosRestantesDeposito = litrosRestantesDeposito;
	}
	
	
	public Comprobante() {
		super();
		this.fecha = new Date();
		this.hora = new Timer();
		this.tipoCombustible = " ";
		this.importe = 0.0;
		this.litrosSuministrados = 0.0;
		this.litrosRestantesDeposito = 0.0;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Timer getHora() {
		return hora;
	}


	public void setHora(Timer hora) {
		this.hora = hora;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public double getLitrosSuministrados() {
		return litrosSuministrados;
	}


	public void setLitrosSuministrados(double litrosSuministrados) {
		this.litrosSuministrados = litrosSuministrados;
	}


	public double getLitrosRestantesDeposito() {
		return litrosRestantesDeposito;
	}


	public void setLitrosRestantesDeposito(double litrosRestantesDeposito) {
		this.litrosRestantesDeposito = litrosRestantesDeposito;
	}


	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", hora=" + hora + ", tipoCombustible=" + tipoCombustible + ", importe="
				+ importe + ", litrosSuministrados=" + litrosSuministrados + ", litrosRestantesDeposito="
				+ litrosRestantesDeposito + "]";
	}
	
	
	
	

}
