package unidades.unidad8.ejemplos.interfaz;

public class Main {

	public static void main(String[] args) {

		System.out.println(ISonido.nombre);
		
		Gato gato = new Gato();
		Perro perro = new Perro();
		Leon leon = new Leon();
		
		
		gato.voz();
		perro.voz();
		leon.voz();
		
		gato.vozDurmiendo();
		perro.vozDurmiendo();
		leon.vozDurmiendo();
	}
}
