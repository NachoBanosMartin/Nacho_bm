package unidades.unidad8.ejercicios.ejercicio6;


public class GestorFlota {

	public static void main(String[] args) {
		
		Vehiculo mivehiculo = new Coche("Audi", "A3", "2134JYD", 70.3, 5);
		Vehiculo mivehiculo2 = new Camion("Toyota", "Joy2", "3434JYD", 100.4, 200.5);
		Vehiculo mivehiculo3 = new Motocicleta("Ducati", "Speed", "2454JYD", 50.3, "Deportiva");
		Vehiculo mivehiculo4 = new Autobus("Seat", "40T", "2454JYD", 70.3, 5);

		
		Vehiculo vehiculos[] = new Vehiculo[4];
		
		vehiculos[0] = mivehiculo;
		vehiculos[1] = mivehiculo2;
		vehiculos[2] = mivehiculo3;
		vehiculos[3] = mivehiculo4;

		
		gestionarVehiculos(vehiculos);
		

	}

	private static void gestionarVehiculos(Vehiculo[] vehiculos) {
		
		
	}

	

}
