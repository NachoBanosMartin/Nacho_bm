package unidades.desdeCasa.examenOrdinario;

import java.time.LocalDateTime;

public class Comprobante {
	
	private LocalDateTime fechaHora;
	private String nombreCliente;
	private String tipoProducto;
	private double litros;
	private double precioL;
	private double importeBruto;
	private double descuentos;
	private double importeFinal;
	
	public Comprobante(LocalDateTime fechaHora, String nombreCliente, String tipoProducto, double litros,
			double precioL, double importeBruto, double descuentos, double importeFinal) {
		super();
		this.fechaHora = fechaHora;
		this.nombreCliente = nombreCliente;
		this.tipoProducto = tipoProducto;
		this.litros = litros;
		this.precioL = precioL;
		this.importeBruto = importeBruto;
		this.descuentos = descuentos;
		this.importeFinal = importeFinal;
	}
	
	

}
