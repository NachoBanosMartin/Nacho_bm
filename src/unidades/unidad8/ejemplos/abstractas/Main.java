package unidades.unidad8.ejemplos.abstractas;

public class Main {

	public static void main(String[] args) {

		Bicicleta bici = new Bicicleta ("Pedaleo", 2, 10, 63);
		Autobus bus = new Autobus ("Diesel", 6, 80, 30, 50);
		
		System.out.println("Velocidad: " + bici.calcularVelocidad() + " km/h");
		bici.sonidoClaxon();
		System.out.println("Velocidad del bus: " + bus.calcularVelocidad() + " km/h");
		bus.sonidoClaxon();
	}

}
