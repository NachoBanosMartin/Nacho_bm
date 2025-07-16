package unidades.desdeCasa.gasolinera;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Timer;

public class Comprobante {
	
	
	private Date fecha;
	private String tipoCombustible;
	private double importe;
	private double litrosSuministrados;
	private double litrosRestantesDeposito;
	
	
	public Comprobante(Date fecha, String tipoCombustible, double importe, double litrosSuministrados,
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
		return "Comprobante [fecha=" + fecha + ", tipoCombustible=" + tipoCombustible + ", importe="
				+ importe + ", litrosSuministrados=" + litrosSuministrados + ", litrosRestantesDeposito="
				+ litrosRestantesDeposito + "]";
	}
	
	public static Comprobante impresion(String linea) {
	    String[] datos = linea.split(";");
	    if (datos.length != 6) return null;

	    Comprobante comprobante = new Comprobante();
	    comprobante.setFecha(new Date(Long.parseLong(datos[1])));
	    comprobante.setTipoCombustible(datos[2]);
	    comprobante.setImporte(Double.parseDouble(datos[3]));
	    comprobante.setLitrosSuministrados(Double.parseDouble(datos[4]));
	    comprobante.setLitrosRestantesDeposito(Double.parseDouble(datos[5]));

	    return comprobante;
	}
	
	public void mostrar() {
	    System.out.println("Fecha: " + fecha);
	    System.out.println("Combustible: " + tipoCombustible);
	    System.out.println("Importe: " + importe + " euros");
	    System.out.println("Litros suministrados: " + litrosSuministrados);
	    System.out.println("Litros restantes en depósito: " + litrosRestantesDeposito);
	}
	
	
	
	

}
