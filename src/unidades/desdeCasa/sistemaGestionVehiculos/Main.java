package unidades.desdeCasa.sistemaGestionVehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

		while (true) {

			System.out.println("Tipo de vehículo: ");
			System.out.println("A. Automóvil");
			System.out.println("M. Motocicleta.");
			System.out.println("C. Camión.");
			System.out.println("S. Salir.");
			System.out.println("Ingrese el tipo de vehiculo: ");
			String tipo = entrada.nextLine().toUpperCase();

			if (tipo.equals("S")) {
				break;
			}

			System.out.print("Marca: ");
			String marca = entrada.nextLine();
			System.out.print("Modelo: ");
			String modelo = entrada.nextLine();
			System.out.print("Año: ");
			int ano = Integer.parseInt(entrada.nextLine());
			System.out.print("Kilometraje: ");
			double km = Double.parseDouble(entrada.nextLine());

			switch (tipo) {
			case "A":
				System.out.print("Número de puertas: ");
				int puertas = Integer.parseInt(entrada.nextLine());
				Automovil auto = new Automovil(marca, modelo, ano, km, puertas);
				listaVehiculos.add(auto);
				break;
			case "M":
				System.out.print("Tipo de motor (2T/4T): ");
				String motor = entrada.nextLine();
				Motocicleta moto = new Motocicleta(marca, modelo, ano, km, motor);
				listaVehiculos.add(moto);
				break;
			case "C":
				System.out.print("Capacidad de carga (toneladas): ");
				double carga = Double.parseDouble(entrada.nextLine());
				Camion camion = new Camion(marca, modelo, ano, km, carga);
				listaVehiculos.add(camion);
				break;
			default:
				System.out.println("Tipo no válido.");
			}

		}
		
		System.out.println("\n===== INFORME DE VEHÍCULOS =====");
        for (Vehiculo v : listaVehiculos) {
            if (v instanceof Automovil) {
                System.out.println("--- Automóvil ---");
                v.mostrarInfo();
                System.out.println("Consumo: " + ((Automovil)v).calcularConsumo() + " km/l");
                System.out.println("Mantenimiento: " + v.calcularMantenimiento());
            } else if (v instanceof Motocicleta) {
                System.out.println("--- Motocicleta ---");
                v.mostrarInfo();
                System.out.println("Consumo: " + ((Motocicleta)v).calcularConsumo(100) + " km/l");
                System.out.println("Mantenimiento: " + v.calcularMantenimiento());
            } else if (v instanceof Camion) {
                System.out.println("--- Camión ---");
                v.mostrarInfo();
                System.out.println("Consumo: " + String.format("%.2f", ((Camion)v).calcularConsumo(50, 200, 5)) + " km/l");
                System.out.println("Mantenimiento: " + v.calcularMantenimiento());
            }
        }
        System.out.println("===== Fin del informe =====");
        entrada.close();
	}

}
