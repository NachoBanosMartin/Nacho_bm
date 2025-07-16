package unidades.desdeCasa.cuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private double saldo;
	private List<Operacion> operaciones;
	
	public Cuenta() {
		this.saldo = 0;
		this.operaciones = new ArrayList<>();
	}
	
	public boolean ingresar(double cantidad, String tipoTarjeta) {		
		if (cantidad <= 0) return false;
		saldo += cantidad;		
		operaciones.add(new Operacion("Ingreso", cantidad, tipoTarjeta));		
		return true;		
	}
	
	public boolean retirar(double cantidad, String tipoTarjeta) {
		if (cantidad <= 0 || cantidad > saldo) return false;
		saldo -= cantidad;
		operaciones.add(new Operacion("Retiro", cantidad, tipoTarjeta));
		return true;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public List<Operacion> getOperaciones(){
		return operaciones;		
	}

}
