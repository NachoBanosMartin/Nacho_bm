package verano.clase.tareasCurso.flotaTransporte;

public class GestorFlota {

	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[8];
		Coche coche1 = new Coche("Audi", "A3", "2345KLJ", 123.34, 5);
		Camion camion1 = new Camion("Mack", "Titan", "7462RTY", 456.34, 568.76);
		Motocicleta motocicleta1 = new Motocicleta("Cecotec", "Skull", "4567TRE", 69.34, "Acuatica");
		Autobus autobus1 = new Autobus("Audi", "A3", "2345KLJ", 876.34, 15);
		Coche coche2 = new Coche("Volvo", "V40", "5678YUH", 153.64, 4);
		Coche coche3 = new Coche("Kia", "Sportage", "2341TRE", 342.54, 3);
		Coche coche4 = new Coche("Seat", "Ibiza", "1973XZA", 153.67, 2);
		Coche coche5 = new Coche("Ford", "Fiesta", "7892TFG", 343.34, 1);

		vehiculos[0] = coche1;
		vehiculos[1] = camion1;
		vehiculos[2] = motocicleta1;
		vehiculos[3] = autobus1;
		vehiculos[4] = coche2;
		vehiculos[5] = coche3;
		vehiculos[6] = coche4;
		vehiculos[7] = coche5;

				
		for (int i = 0; i < vehiculos.length; i++) {
			
			if (vehiculos[i] instanceof Coche) {
				Coche cocheAux = (Coche) vehiculos[i];				
				cocheAux.arrancar();
				System.out.println("Autonomía del vehículo: " + cocheAux.calcularAutonomia() + " km");
				cocheAux.detener();
			}
			
			if (vehiculos[i] instanceof Autobus) {
				Autobus autobusAux = (Autobus) vehiculos[i];
				autobusAux.arrancar();
				System.out.println("Autonomía del vehículo: " + autobusAux.calcularAutonomia() + " km");
				autobusAux.detener();
			}
			
			if (vehiculos[i] instanceof Motocicleta) {
				Motocicleta motocicletaAux = (Motocicleta) vehiculos[i];
				motocicletaAux.arrancar();
				System.out.println("Autonomía del vehículo: " + motocicletaAux.calcularAutonomia() + " km");
				motocicletaAux.detener();
			}
			
			if (vehiculos[i] instanceof Camion) {
				Camion camionAux = (Camion) vehiculos[i];
				camionAux.arrancar();
				System.out.println("Autonomía del vehículo: " + camionAux.calcularAutonomia() + " km");
				camionAux.detener();
			}
			
			
			
			
		}

	}

}
