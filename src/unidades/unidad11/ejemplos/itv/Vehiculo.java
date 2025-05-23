package unidades.unidad11.ejemplos.itv;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private double km;
	
	
	public Vehiculo(String matricula, String marca, String modelo, double km) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
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


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	@Override
	public String toString() {
		return "Matricula: " + this.matricula + ", Marca: " + this.marca + ", Modelo: " + this.modelo + ", Km: " + this.km;
	}
	
	
	
	
	
}
