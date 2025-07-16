package verano.clase.tareasCurso.flotaTransporte;

public abstract class Vehiculo {
	
	protected static final double VELOCIDAD_MEDIA = 90.0;
	
	private String marca;
	private String modelo;
	private String matricula;
	private double capacidadDeposito;
	
	public Vehiculo(String marca, String modelo, String matricula, double capacidadDeposito) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.capacidadDeposito = capacidadDeposito;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(double capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}
	
	
	public void arrancar() {
		System.out.println("Arrancando vehículo...");
	}
	
	public void detener() {
		System.out.println("Deteniendo vehículo...");
	}
	
	public abstract double calcularAutonomia();

}
