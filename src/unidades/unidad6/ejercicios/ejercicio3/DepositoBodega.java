package unidades.unidad6.ejercicios.ejercicio3;

//Diseñe una case para representar los datos y funciones que pueden tener depósitos de una bodega de vino.
 

public class DepositoBodega {
	
	private String idDeposito;
	private double capacidadMax;
	private double capacidadActual;
	private String tipoVino;
	private int ano;
	
	
	public DepositoBodega(String idDeposito, double capacidadMax, double capacidadActual, String tipoVino, int ano) {
		
		this.idDeposito = idDeposito;
		this.capacidadMax = capacidadMax;
		this.capacidadActual = capacidadActual;
		this.tipoVino = tipoVino;
		this.ano = ano;
	}


	public String getIdDeposito() {
		return idDeposito;
	}


	public void setIdDeposito(String idDeposito) {
		this.idDeposito = idDeposito;
	}


	public double getCapacidadMax() {
		return capacidadMax;
	}


	public void setCapacidadMax(double capacidadMax) {
		this.capacidadMax = capacidadMax;
	}


	public double getCapacidadActual() {
		return capacidadActual;
	}


	public void setCapacidadActual(double capacidadActual) {
		this.capacidadActual = capacidadActual;
	}


	public String getTipoVino() {
		return tipoVino;
	}


	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}

}
