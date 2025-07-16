package unidades.desdeCasa.examenOrdinario;

public abstract class Producto {
	
	protected String tipo;
	protected double precioLitro;
	protected double capacidad;
	protected double litrosDisponibles;
	
	public Producto(String tipo, double precioLitro, double capacidad) {
		super();
		this.tipo = tipo;
		this.precioLitro = precioLitro;
		this.capacidad = capacidad;
		this.litrosDisponibles = capacidad;
	}
	
    abstract double calcularImporte(double litros);
    
    public void reponer(double litros) {
    	litrosDisponibles += litros;
    	if (litrosDisponibles >= capacidad) {
			litrosDisponibles = capacidad;
		}
    }
    
    public boolean haySuficiente(double litros) {
		return litrosDisponibles >= litros;    	
    }
    
    public void descontar(double litros) {
    	litrosDisponibles -= litros;
    }


}
