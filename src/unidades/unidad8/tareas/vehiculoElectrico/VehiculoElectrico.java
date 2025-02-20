package unidades.unidad8.tareas.vehiculoElectrico;

public class VehiculoElectrico {

	private String marca;
	private String modelo;
	private double capacidadBateria;
	private int autonomiaMaxima;
	
	
	public VehiculoElectrico(String marca, String modelo, double capacidadBateria, int autonomiaMaxima) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadBateria = capacidadBateria;
		this.autonomiaMaxima = autonomiaMaxima;
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



	public double getCapacidadBateria() {
		return capacidadBateria;
	}



	public void setCapacidadBateria(double capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}



	public int getAutonomiaMaxima() {
		return autonomiaMaxima;
	}



	public void setAutonomiaMaxima(int autonomiaMaxima) {
		this.autonomiaMaxima = autonomiaMaxima;
	}



	public void calcularAutonomiaReal(double velocidad, String terreno) {
		
		if(velocidad > 120 && terreno.equals("montañoso")){
			autonomiaMaxima = 200;
			if(velocidad < 50 && terreno.equals("llano")) {
				autonomiaMaxima = 400;
			}
			if(velocidad > 150 && terreno.equals("llano")) {
				autonomiaMaxima = 200;
			}
		}else {
			autonomiaMaxima = 500;
		}

	}
}
