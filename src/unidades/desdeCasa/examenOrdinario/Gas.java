package unidades.desdeCasa.examenOrdinario;

public class Gas extends Producto{

	public Gas() {
		super("Gas", 0.8, 500);
	}

	@Override
	double calcularImporte(double litros) {
		return litros * precioLitro;
	}
	
	
	
	

}
