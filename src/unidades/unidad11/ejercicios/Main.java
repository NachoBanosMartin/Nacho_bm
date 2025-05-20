package unidades.unidad11.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		LineaInspeccion linea1 = new LineaInspeccion ("Identificación", Resultado.OK, "");
		LineaInspeccion linea2 = new LineaInspeccion ("Frenos", Resultado.OK, "");
		LineaInspeccion linea3 = new LineaInspeccion ("Alumbrado", Resultado.LEVE, "");
		LineaInspeccion linea4 = new LineaInspeccion ("Dirección", Resultado.LEVE, "");
		LineaInspeccion linea5 = new LineaInspeccion ("Neumátios", Resultado.OK, "");
		LineaInspeccion linea6 = new LineaInspeccion ("Emisiones", Resultado.OK, "");
		
		
		List<LineaInspeccion> lineas = new ArrayList<LineaInspeccion>();
		
		
		lineas.add(linea1);
		lineas.add(linea2);
		lineas.add(linea3);
		lineas.add(linea4);
		lineas.add(linea5);
		lineas.add(linea6);
		
		Inspeccion inspeccion1 = new Inspeccion (1, lineas);
		Inspeccion inspeccion2 = new Inspeccion (2);
		
			
		inspeccion2.getLineasInspeccion().add(linea1);
		inspeccion2.getLineasInspeccion().add(linea2);
		inspeccion2.getLineasInspeccion().add(linea3);
		inspeccion2.getLineasInspeccion().add(linea4);
		inspeccion2.getLineasInspeccion().add(linea5);
		inspeccion2.getLineasInspeccion().add(linea6);
		
		
		
		
		
		
		
		
		
		List<Inspeccion> inspecciones = new ArrayList<Inspeccion>();
		inspecciones.add(inspeccion1);
		inspecciones.add(inspeccion2);
		
		
		Vehiculo vehiculo1 = new Vehiculo ("8728GHD", "Ford", "Fiesta", 13000, null);

	}

}
