package unidades.unidad6.ejercicios.ejercicio10;

import java.util.Objects;

public class Empleado { 

	private int id;
	private String nombre;
	private String apellidos;
	private double horas;
	private String cargo;
	private double pago_por_horas;
	private String modalidad;
	private double bonificacion;
	private static int contador = 0;

	
	
	public Empleado(String nombre, String apellidos, double horas, String cargo, double pago_por_horas,
			String modalidad, double bonificacion) {
		
		contador++;
		this.id = contador;
		
		//Datos.contadorEmpleados++;
		//this.id= Datos.contadorEmpleados;
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.horas = horas;
		this.cargo = cargo;
		this.pago_por_horas = pago_por_horas;
		this.modalidad = modalidad;
		this.bonificacion = bonificacion;
	
		
	}
	
	public double Sueldo() {
		double sueldo = 0;
		
		sueldo = (horas * pago_por_horas) * Datos.NUM_SEMANAS;
		
		return sueldo;
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		this.horas = horas;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getPago_por_horas() {
		return pago_por_horas;
	}


	public void setPago_por_horas(double pago_por_horas) {
		this.pago_por_horas = pago_por_horas;
	}


	public String getModalidad() {
		return modalidad;
	}


	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}


	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	@Override
	public String toString() {
		return "Empleado [id= " + id +", nombre=" + nombre + ", apellidos=" + apellidos + ", horas=" + horas + ", cargo=" + cargo
				+ ", pago_por_horas=" + pago_por_horas + ", modalidad=" + modalidad + ", bonificacion=" + bonificacion
				+ "]\n\n";
	}
	
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			sonIguales = false;
		}
		Empleado empleado = (Empleado) obj;
		if (nombre.equals(empleado.getNombre()) && apellidos.equals(empleado.getApellidos()) 
				&& cargo.equals(empleado.getCargo())) {
			sonIguales = true;
		}
		return sonIguales;
	}
	
}
	
	

	
	
	
	
	
	
	
	
	

