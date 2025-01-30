package unidades.unidad6.ejercicios.Ejercicio2;

//Diseñe una clase para modelar los datos de un test de covid.

public class Pacientes {

	public static void main(String[] args) {
		
		TestCovid test1 = new TestCovid("Begoña Martín", 37, true, "2025-01-15");
		
		
		System.out.println("-----RESULTADOS-----");
		test1.mostrarInformacion();
	}

}
