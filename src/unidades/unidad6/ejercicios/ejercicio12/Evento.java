package unidades.unidad6.ejercicios.ejercicio12;

public class Evento {

	private int numeroInvitados;
	private double precioPorInvitado;
	private static final double PRECIO_MAS_BAJO = 32.0;
	private static final double PRECIO_MAS_ALTO = 35.0;
	
	
	public Evento(int numeroInvitados, double precioPorInvitado) {
		super();
		this.numeroInvitados = numeroInvitados;
		this.precioPorInvitado = precioPorInvitado;
	}


	public int getNumeroInvitados() {
		return numeroInvitados;
	}


	public void setNumeroInvitados(int numeroInvitados) {
		this.numeroInvitados = numeroInvitados;
	}


	public double getPrecioPorInvitado() {
		return precioPorInvitado;
	}


	public void setPrecioPorInvitado(double precioPorInvitado) {
		this.precioPorInvitado = precioPorInvitado;
	}


	public static double getPrecioMasBajo() {
		return PRECIO_MAS_BAJO;
	}


	public static double getPrecioMasAlto() {
		return PRECIO_MAS_ALTO;
	}
	
	public boolean esEventoGrande() {
		if(numeroInvitados >= 50) {
			return true;
		}else {
			return false;
		}
	}
	
	public double calcularPrecioTotal() {
		return numeroInvitados * precioPorInvitado;		
	}
	

	
}
