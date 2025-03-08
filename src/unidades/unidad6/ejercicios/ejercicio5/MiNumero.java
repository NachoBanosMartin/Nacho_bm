package unidades.unidad6.ejercicios.ejercicio5;

/*
  Escribe en Java una clase llamada MiNumero que calcule el doble, el triple y el cuádruple de un número y 
  permita sumarlo y restarlo con otros números. Los métodos de la clase deben ser:

	Constructor sin parámetros (establecerá el número a cero)
	Constructor con parámetro entero (asignará ese valor al número)
	Método cambiaNumero(int): permite asignar un nuevo valor al número
	Método suma(int): permite sumar una cantidad al número
	Método resta(int): permite restar una cantidad al número
	Método getValor(): devuelve el valor actual del número
	Método getDoble(): devuelve el doble del valor actual del número
	Método getTriple(): devuelve el triple del valor actual del número
	Método getCuádruple(): devuelve el cuádruple del valor actual del número

  Se debe crear una clase ProgramaMiNumero con un método main() que te permita comprobar que la 
  funcionalidad de la clase MiNumero.
*/

public class MiNumero {
	
	
	private int numero;
	
	// Constructores

	public MiNumero(int numero) {
		
		this.numero = numero;
	}
	
	public MiNumero() {
		this.numero = 0;
	}

	// Gets y Setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Métodos de calculo
	
	public void suma (int cantidad) {
		this.numero += cantidad;
	}
	
	public void resta (int cantidad) {
		this.numero -= cantidad;
	}
	
	public int getDoble() {
		return this.numero * 2;
	}
	
	public int getTriple() {
		return this.numero * 3;
	}
	
	public int getCuadruple() {
		return this.numero * 4;
	}
	
	// Método para mostrar la información
	
	public void mostrarInformacion() {
		System.out.println("Número actual: " + numero);
		System.out.println("Doble del número: " + getDoble());
		System.out.println("Triple del número: " + getTriple());
		System.out.println("Cuádruple del número: " + getCuadruple());
	}
	
	
 
}
