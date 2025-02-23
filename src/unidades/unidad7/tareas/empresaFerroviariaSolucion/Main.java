package unidades.unidad7.tareas.empresaFerroviariaSolucion;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

			Mecanico mecanico = new Mecanico("Carlos Pérez", "12345678A", "654321987", "Hidráulica");
	        Locomotora locomotora = new Locomotora("L1234", 5000, 2015, mecanico);
	        Maquinista maquinista = new Maquinista("Juan Pérez", "87654321B", 3500.0, Rango.SENIOR);
	        Jefe jefe = new Jefe("Pedro González", "87654321B", "2025-02-09T12:18:17.231457300");
	        
	        Tren tren = new Tren(locomotora, maquinista);
	        tren.agregarVagon(new Vagon(0, 5000, 10000, "Granos"));
	        tren.agregarVagon(new Vagon(1, 4000, 8000, "Minerales"));
	        tren.agregarVagon(new Vagon(2, 6000, 12000, "Productos químicos"));

	        tren.mostrarInformacion();
		

	}

}
