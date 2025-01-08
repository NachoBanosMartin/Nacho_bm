package unidades.unidad6.ejemplos.coches;

public class Coche {

	// Atributos (parte estática, miembros, variables...)

	private String marca;
	private String modelo;
	private int matriculacion;
	private String color;
	private char tipoMotor; // G= Gasolina, D=Diesel, E=Electrico
	private double velocidad;
	private int cv;

	public Coche(String marca, String modelo, int matriculacion, String color, char tipoMotor, int cv) {

		this.marca = marca;
		this.modelo = modelo;
		this.matriculacion = matriculacion;
		this.color = color;
		this.tipoMotor = tipoMotor;
		this.velocidad = 100;
		this.cv = cv;

	}

	// Métodos (Dinámica que es la que permite operar ese objeto)
	
	public int getCV() {
		return cv;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {

		if (!marca.equals("Ford")) {

			this.marca = marca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;

	}

	public void acelerar() {
		if (cv>=100) {
			velocidad+=20;
		}else {
			velocidad+=10;
		}
	}

	public void frenar() {
		velocidad -= 5;
	}
}