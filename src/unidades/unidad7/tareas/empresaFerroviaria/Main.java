package unidades.unidad7.tareas.empresaFerroviaria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		System.out.println("==== Información del Tren ====");
		
		Locomotora locomotora1 = new Locomotora ("L1234", 5000, 2020, "Mecanico");
		Locomotora locomotora2 = new Locomotora ("T9876", 4000, 2012, "Mecanico");
		Locomotora locomotora3 = new Locomotora ("S5342", 3000, 2017, "Mecanico");

		Maquinista maquinista1 = new Maquinista ("Juan Pérez", "28974312G", 1700.50, "rango");
		Maquinista maquinista2 = new Maquinista ("Pedro García", "28976512P", 1600.50, "rango");
		Maquinista maquinista3 = new Maquinista ("Elena Martín", "12374312T", 1700, "rango");
		
		LocalDate fechaActual = LocalDate.now();
				
		Jefe jefe = new Jefe ("Pedro González", "87654321B", fechaActual);

		
		

	}

}
