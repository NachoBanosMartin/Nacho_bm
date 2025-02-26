package unidades.unidad8.ejercicios.ejercicio6;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private String matricula;
	private double capidadDeposito;
	
	
	public Vehiculo(String marca, String modelo, String matricula, double capidadDeposito) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.capidadDeposito = capidadDeposito;
	}
	
	public void arrancar() {
		
	}
	
	public void detener() {
		
	}
	
	public abstract void carcularAutonomia();
		
}
