package unidades.unidad9.ejercicios.ejercicioClase;

public class TransporteMercancia extends Viaje{

	private double pesoCarga;
	private String tipoCarga;
	
	
	public TransporteMercancia(String matriculaCamion, String conductor, String origen, String destino,
			double pesoCarga, String tipoCarga) {
		super(matriculaCamion, conductor, origen, destino);
		this.pesoCarga = pesoCarga;
		this.tipoCarga = tipoCarga;
	}
	
	@Override
	public void mostrarDetalle(){
		System.out.println("Viaje de mercancia - Camion: " + matriculaCamion);
		System.out.println("Conductor: " + conductor);
		System.out.println("Origen: " + origen);
		System.out.println("Destino: " + destino);
		System.out.println("Carga: " + pesoCarga);
		System.out.println("Tipo mercancia: " + tipoCarga);
		System.out.println("Coste del viaje" + calcularCosteViaje());
	}

	@Override
	public double calcularCosteViaje() {
		double costoBase = 50;
		double costoPorTonelada = 0;
		
		switch (tipoCarga.toLowerCase()) {
			case "general":
				costoPorTonelada = 10;
			break;
			case "refrigerada":
				costoPorTonelada = 15;
			break;
			case "pesada":
				costoPorTonelada = 20;
			break;
			default:
				System.out.println("Tipo no reconocido");
		}
		return costoBase +(pesoCarga * costoPorTonelada);		
	}
}
