package unidades.desdeCasa.gasolinera;

public class Surtidor {
	
	private String tipoCombustible;
	private double maxLitros;
	private double litrosDisponibles;
	private double precioPorLitro;
	
	public Surtidor(String tipoCombustible, double maxLitros, double litrosDisponibles, double precioPorLitro) {
		super();
		this.tipoCombustible = tipoCombustible;
		this.maxLitros = maxLitros;
		this.litrosDisponibles = litrosDisponibles;
		this.precioPorLitro = precioPorLitro;
	}
	
	public Surtidor() {   //Surtidor vacío
		super();
		this.tipoCombustible = " ";
		this.maxLitros = 0.0;
		this.litrosDisponibles = 0.0;
		this.precioPorLitro = 0.0;
	}
	
	

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getMaxLitros() {
		return maxLitros;
	}

	public void setMaxLitros(double maxLitros) {
		this.maxLitros = maxLitros;
	}

	public double getLitrosDisponibles() {
		return litrosDisponibles;
	}

	public void setLitrosDisponibles(double litrosDisponibles) {
		this.litrosDisponibles = litrosDisponibles;
	}

	public double getPrecioPorLitro() {
		return precioPorLitro;
	}

	public void setPrecioPorLitro(double precioPorLitro) {
		this.precioPorLitro = precioPorLitro;
	}

	@Override
	public String toString() {
		return "Surtidor [tipoCombustible=" + tipoCombustible + ", maxLitros=" + maxLitros + ", litrosDisponibles="
				+ litrosDisponibles + ", precioPorLitro=" + precioPorLitro + "]";
	}
	
	

}
