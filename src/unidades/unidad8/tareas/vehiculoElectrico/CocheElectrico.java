package unidades.unidad8.tareas.vehiculoElectrico;

public class CocheElectrico extends VehiculoElectrico{
	
	private int numeroPuertas;
	private String tipoCarga;

	public CocheElectrico(String marca, String modelo, double capacidadBateria, int autonomiaMaxima,
			int numeroPuertas, String tipoCarga) {
		super(marca, modelo, capacidadBateria, autonomiaMaxima);
		
		this.numeroPuertas = numeroPuertas;
		this.tipoCarga = tipoCarga;

		}
	
	public void calcularAutonomiaReal(double velocidad, String terreno) {
		super.calcularAutonomiaReal(velocidad, terreno) ;
		
		int consumo = 0;
		int autonomia;
		
		if (consumo > 8) {
			autonomia = getAutonomiaMaxima() - 30;
		}else {
			autonomia = getAutonomiaMaxima() - 10;
		}
		
	}
}
