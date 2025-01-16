package unidades.unidad6.ejemplos.coches;

import java.util.Arrays;

public class Coche { //
	
	// atributos (estatica)
	
	private String marca;
	private String modelo;
	private int matriculacion;
	private String color;
	private Motor motor; //G = gasolina, D = diesel, E = eléctrico
	private double velocidad;
	private Revision [] revisiones;
	
	
	public Coche (String marca, String modelo, int matriculacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.color ="Sin color asignado";
		this.velocidad = 0;
		this.motor = null;
		
	}
	
	public Coche(String marca, String modelo, int matriculacion, String color, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.color = color;
		this.motor = motor;
		velocidad = 100;
	}

	// métodos (dinámica)
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
			this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void acelerar () {
		if(motor.getCv() >= 100) {
			velocidad += 20;
		}else {
			velocidad += 10;
		}
		
	}	
	
	public void frenar () {
		velocidad -= 5;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Motor getMotor() {
		return motor;
	} 
	
	public Revision[] getRevision() {
		return revisiones;
	}

	public void setRevision(Revision[] revision) {
		this.revisiones = revision;
	}

	public void mostrarDatos() {
		
		System.out.println("------DATOS COCHE-----");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Matriculación: " + matriculacion);
		System.out.println("Color: " + color);
		System.out.println("Velocidad: " + velocidad);
		System.out.println(motor);
		System.out.println("Revisiones____");
			for(int i = 0; i <revisiones.length; i++) {
				if (revisiones[i] != null) {
					System.out.println("\n" + revisiones[i]);

				}
			}
		System.out.println("-----------------------");



	}

	@Override
	public String toString() {
		return "\nCoche [marca=" + marca + ", modelo=" + modelo + ", matriculacion=" + matriculacion + ", color=" + color
				+ ", motor=" + motor + ", velocidad=" + velocidad + ", revision=" + Arrays.toString(revisiones) + "]";
	}
	
	public void addRevision (Revision revision) {
		int posicion = obtenerPosicionLibre();
		if (posicion != -1) {
			revisiones[posicion] = revision;
		}else {
			System.out.println("Ha superado el limite de revisiones");
		}
		
	}
	
	private int obtenerPosicionLibre() {
		int posicion = -1;
		for (int i = 0; posicion == -1 && i < revisiones.length; i++) {
			if (revisiones [i] == null) {
				posicion = i;
			}
		}
		return posicion;
	}
	
	public Revision obtenerRevisionPorId(int idRevision) {
		
		Revision revision = null;
		for (int i = 0; revision == null && i < revisiones.length; i++) {
			if (revisiones [i] != null) {
				int id = revisiones[i].getId();
				if (id == idRevision) { 		//Se ha encontrado la revision
					revision = revisiones[i];
				}
			}
		}
		return revision;
	}
	
	public Revision obtenerRevisionPorId2(int idRevision) {
		
		boolean encontrado = false;
		Revision revision = null;
		int i = 0;
		while (!encontrado || i < revisiones.length) {
			if (revisiones [i] != null) {
				if (revisiones[i].getId() == idRevision) {
					revision = revisiones[i];
					encontrado = true;
				}
					
				
			}
		}
		
		return revision;
	}
	
	
		
}




