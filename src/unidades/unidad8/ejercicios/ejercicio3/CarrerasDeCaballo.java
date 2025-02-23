package unidades.unidad8.ejercicios.ejercicio3;

public class CarrerasDeCaballo extends Caballo{

	private int numeroCarreras;

	
	public CarrerasDeCaballo(String nombre, String color, int anoNacimiento, int numeroCarreras) {
		super(nombre, color, anoNacimiento);
		this.numeroCarreras = numeroCarreras;
	}

	public int getNumeroCarreras() {
		return numeroCarreras;
	}

	public void setNumeroCarreras(int numeroCarreras) {
		this.numeroCarreras = numeroCarreras;
	}
	
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Número de Carreras: " + numeroCarreras);
	}
	
}
