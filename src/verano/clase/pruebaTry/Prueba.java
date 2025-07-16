package verano.clase.pruebaTry;

public class Prueba {

	public static void main(String[] args) {

		int anio=0;
		
		if (anio < 18) {
			throw new ArithmeticException("Está mal");
			
		}else {
			System.out.println("Muy bien, eres mayor");
		}
	}

}