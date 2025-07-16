package unidades.desdeCasa.reparaciones;

import java.util.ArrayList;

public class Vehiculo {
	
	private String tipo;
	private int numMatricula;
	private String letraMatricula;
	private ArrayList<Integer> aniosReparacion;
	
	
	
	
	public Vehiculo(String tipo, int numMatricula, String letraMatricula) {
		super();
		this.tipo = tipo;
		this.numMatricula = numMatricula;
		this.letraMatricula = letraMatricula;
		this.aniosReparacion = new ArrayList<Integer>();
	}

	public void agregarAno(int anio) {
		aniosReparacion.add(anio);
	}

	public ArrayList<Integer> getAniosReparacion() {
		return aniosReparacion;
	}

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getLetraMatricula() {
		return letraMatricula;
	}

	public void setLetraMatricula(String letraMatricula) {
		this.letraMatricula = letraMatricula;
	}

	@Override
	public String toString() {
		return "- " + tipo + " " + numMatricula + letraMatricula;
	}
	
	
	
	

}
