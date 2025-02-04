package unidades.unidad7.ejemplos.enumerados;

public class CartaNaipes {

	private PaloNaipes palo;
	private int puntos;
	
	
	public CartaNaipes(PaloNaipes palo, int puntos) {
		super();
		this.palo = palo;
		this.puntos = puntos;
	}


	public PaloNaipes getPalo() {
		return palo;
	}


	public void setPalo(PaloNaipes palo) {
		this.palo = palo;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
}
