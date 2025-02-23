package unidades.unidad8.ejercicios.ejercicio4;

public class VelaPerfumada extends Vela{
	
	private String aroma;

	public VelaPerfumada(String color, double altura, String aroma) {
		super(color, altura);
		this.aroma = aroma;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	
	public void setAltura(double altura) {
		super.setAltura(altura);
		this.setPrecio(altura * 3.0);
	}
	
	public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Aroma: " + aroma);
    }
	

}
