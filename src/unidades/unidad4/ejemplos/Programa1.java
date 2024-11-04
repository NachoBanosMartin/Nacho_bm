package unidades.unidad4.ejemplos;

public class Programa1 {

	public static void main(String[] args) {
		
		final int  CUOTA = 15;
		final int TASA = 2; 
		final int NUM_MESES = 3;
		
		double resultado1 = operation (CUOTA, TASA, NUM_MESES, 12);
		double resultado2 = operation (CUOTA, TASA, NUM_MESES, 34);
		double resultado3 = operation (CUOTA, TASA, NUM_MESES, 5);
		double resultado4 = operation (CUOTA, TASA, NUM_MESES, 78);
		double resultado5 = operation (CUOTA, TASA, NUM_MESES, 12);
		
	}

	static double operation (int CUOTA, int TASA, int NUM_MESES, int dato) {
		
				
		double resultado = ((CUOTA + dato) * TASA) / NUM_MESES;
		return resultado;
				
	}
	
	
}
