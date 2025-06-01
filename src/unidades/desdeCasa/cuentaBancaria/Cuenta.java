package unidades.desdeCasa.cuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double saldo;
	private List<Operacion> operaciones;

	public Cuenta() {
		super();
		this.saldo = 0; // Inicializa la cuenta con saldo 0.
		this.operaciones = new ArrayList<>(); // Crea una lista vacía para almacenar las operaciones.
	}

	public boolean ingresar(double cantidad, TipoTarjeta tarjeta) {

		if (cantidad <= 0) {
			System.out.println("No se puede ingresar una cantidad negativa o cero.");
			return false;
		}

		saldo += cantidad; // Al saldo se le añade la cantidad introducida
		operaciones.add(new Operacion(true, cantidad, tarjeta));
		return true;

	}

	public boolean retirar(double cantidad, TipoTarjeta tarjeta) {

		if (cantidad <= 0) {
			System.out.println("No se puede ingresar una cantidad negativa o cero.");
			return false;
		}
		
		if(cantidad > saldo) {
			System.out.println("Saldo insuficiente.");
	        return false;
		}

		saldo -= cantidad; // Al saldo se le resta la cantidad introducida
		operaciones.add(new Operacion(false, cantidad, tarjeta));
		return true;

	}

	public double getSaldo() {
		return saldo;
	}

	public List<Operacion> getOperaciones() {
		return operaciones;
	}
	

}
