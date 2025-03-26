package unidades.unidad9.ejercicios.ejercicioClase;

public class TransporteAnimales extends Viaje{
	
	private int numAnimales;
	private String tipoAnimal;
	
	
	
	public TransporteAnimales(String matriculaCamion, String conductor, String origen, String destino, int numAnimales,
			String tipoAnimal) {
		super(matriculaCamion, conductor, origen, destino);
		this.numAnimales = numAnimales;
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public double calcularCosteViaje() {
		double costoBase = 80;
		return costoBase * (numAnimales * 5);
	}
	
	@Override
	public void mostrarDetalle() {
		System.out.println("Viaje de mercancia - Camion: " + matriculaCamion);
		System.out.println("Conductor: " + conductor);
		System.out.println("Origen: " + origen);
		System.out.println("Destino: " + destino);
		System.out.println("Numero de animales: " + numAnimales);
		System.out.println("Tipo animal: " + tipoAnimal);
		System.out.println("Coste del viaje" + calcularCosteViaje());		
	}

}
