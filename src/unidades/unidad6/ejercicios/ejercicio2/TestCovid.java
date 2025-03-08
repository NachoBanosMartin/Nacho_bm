package unidades.unidad6.ejercicios.ejercicio2;

// Diseñe una clase para modelar los datos de un test de covid.

public class TestCovid {
	
	// Atributos de la clase
	
	private String nombrePaciente;
	private int edadPaciente;
	private boolean resultado; // True = Positivo, False = Negativo
	private String fechaTest;
	
	
	
	// Constructor
	
	public TestCovid(String nombrePaciente, int edadPaciente, boolean resultado, String fechaTest) {
		
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.resultado = resultado;
		this.fechaTest = fechaTest;
	}


	// Métodos Getters (Acceso) y Setters (Modificación)

	public String getNombrePaciente() {
		return nombrePaciente;
	}



	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}



	public int getEdadPaciente() {
		return edadPaciente;
	}



	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}



	public boolean isResultado() {
		return resultado;
	}



	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}



	public String getFechaTest() {
		return fechaTest;
	}



	public void setFechaTest(String fechaTest) {
		this.fechaTest = fechaTest;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre del paciente: " + nombrePaciente);
		System.out.println("Edad: " + edadPaciente);
		if (resultado == true) {
			System.out.println("Resultado del test: Positivo");
		} else {
			System.out.println("Resultado del test: Negativo");
		}
		System.out.println("Fecha de realización: " + fechaTest);
	}




}


