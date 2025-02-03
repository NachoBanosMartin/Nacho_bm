package unidades.unidad7.ejemplos.enumerados;

public class Cartas {

	private Palo palo;
	private int puntos;
	
	
	public Cartas(Palo palo, int puntos) {
		super();
		this.palo = palo;
		this.puntos = puntos;
	}


	public Palo getPalo() {
		return palo;
	}


	public int getPuntos() {
		return puntos;
	}
	
	public String getNombrePalo() {
		String nombre = "";
		
		switch (palo) {
		case PALO_PICAS: 
			nombre ="Picas";
			break;
		case PALO_CORAZONES: 
			nombre ="Corazones";
			break;
		case PALO_TREBOLES: 
			nombre ="Treboles";
			break;
		case PALO_DIAMANTES: 
			nombre ="Diamantes";
			break;
		default:
			System.out.println("Palo Inválido");
		}
		
		return nombre ;
	}
}
