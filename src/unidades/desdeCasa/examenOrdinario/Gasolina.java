package unidades.desdeCasa.examenOrdinario;

public class Gasolina extends Producto  {

	
	public Gasolina() {
		super("Gasolina", 1.5, 1000);
	}

	@Override
	double calcularImporte(double litros) {
		return litros * precioLitro;
	}
	
	

}
