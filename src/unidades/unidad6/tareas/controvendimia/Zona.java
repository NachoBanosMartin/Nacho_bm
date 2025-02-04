package unidades.unidad6.tareas.controvendimia;

import java.util.Arrays;

public class Zona {

	private int id;
	private double [] recolecciones;
	
	
	public Zona(int id, double[] recolecciones) {
		
		this.id = id;
		this.recolecciones = recolecciones;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double[] getRecolecciones() {
		return recolecciones;
	}


	public void setRecolecciones(double[] recolecciones) {
		this.recolecciones = recolecciones;
	}


	@Override
	public String toString() {
		return "Zona [id=" + id + ", recolecciones=" + Arrays.toString(recolecciones) + "]";
	}
	
	public void insertarCantidadRecoleccion(double cantidad) {
		if (cantidad > 0) {
			recolecciones[obtenerNumRecolecciones()] = cantidad;
		}
		
		
	}
	
	public int obtenerNumRecolecciones() {
		int numeroRecolecciones = 0;
		boolean encontrado = false;
		for (int i = 0;!encontrado && i < recolecciones.length; i++) {
			if (recolecciones[i] == 0) {
				numeroRecolecciones = 1;
				encontrado = true;
			}
		}
		return numeroRecolecciones;
	}


	public double obtenerTotal() {
		double cantidad = 0;
		int numeroRecolecciones = obtenerNumRecolecciones();
		for (int i = 0; i < numeroRecolecciones; i++) {
			cantidad += recolecciones[i];
		}
		return cantidad;
	}

}
