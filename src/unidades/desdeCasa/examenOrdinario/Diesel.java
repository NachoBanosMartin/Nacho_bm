package unidades.desdeCasa.examenOrdinario;

public class Diesel extends Producto{

	public Diesel() {
		super("Diesel", 1.4, 1200);
	}

	@Override
	double calcularImporte(double litros) {
		return litros * precioLitro;
	}

	
	
}
