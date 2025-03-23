package unidades.unidad9.ejercicios;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Viaje> listaViaje = new ArrayList<Viaje>();
		
		listaViaje.add(new TransporteMercancia("1234FFF", "Juan Perez", "Madrid", "Bilbao", 10.5, "General"));
		listaViaje.add(new TransportePeligroso("1456FFF", "Juan Perez", "Caceres", "Bilbao", 4, "Quimicos"));
		listaViaje.add(new TransporteAnimales("2344FFF", "Carlos Martín", "Sevilla", "Valencia", 20, "Bovino"));
		
		for(Viaje viaje : listaViaje) {
			viaje.mostrarDetalle();
		}

	}

}
