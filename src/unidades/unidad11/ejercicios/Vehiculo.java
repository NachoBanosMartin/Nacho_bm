package unidades.unidad11.ejercicios;

import java.util.Iterator;
import java.util.List;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int kms;
	private List<Inspeccion> inspecciones;
	
	
	
	public Vehiculo(String matricula, String marca, String modelo, int kms, List<Inspeccion> inspecciones) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
		this.inspecciones = inspecciones;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getKms() {
		return kms;
	}



	public void setKms(int kms) {
		this.kms = kms;
	}



	public List<Inspeccion> getInspecciones() {
		return inspecciones;
	}



	public void setInspecciones(List<Inspeccion> inspecciones) {
		this.inspecciones = inspecciones;
	}



	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kms=" + kms
				+ ", inspecciones=" + inspecciones + "]";
	}
	
	
	
	public void mostrarDatos() {
		System.out.println("________________________");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Kms: " + kms);
		System.out.println("Número de revisiones: " + inspecciones.size());
		
		String resultado = "";
		if(obtenerResultadoUltimaRevision()) {
			resultado = "SIIIIIIIII";
		}else {
			resultado = "NOOOOOOO";
		}
		System.out.println("¿Pasa ITV?: " + resultado);
		
	}



	private boolean obtenerResultadoUltimaRevision() {
		boolean resultado = false;
		int vecesLeve = 0;
		
		
		Inspeccion ultimaInspeccion = inspecciones.get(inspecciones.size() - 1);
		
		Iterator<LineaInspeccion> it = ultimaInspeccion.getLineasInspeccion().iterator();
		
		while(it.hasNext()) {
			LineaInspeccion li = ((LineaInspeccion)it.next());
			if(li.getResultado() == Resultado.LEVE) {
				vecesLeve++;
			}
		}
		return resultado;
	}
	
	

}
