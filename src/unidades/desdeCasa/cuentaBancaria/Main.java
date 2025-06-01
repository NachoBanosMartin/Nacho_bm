package unidades.desdeCasa.cuentaBancaria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	public static Cuenta cuenta = new Cuenta();

	public static void main(String[] args) {

		int opcion;

		do {

			opcion = mostrarMenu();

		} while (opcion != 4);

		mostrarResumen();

	}

	private static int mostrarMenu() {
		int opcion;
		System.out.println("------MENÚ INTERCTIVO------");
		System.out.println("1. Ingresar dinero.");
		System.out.println("2. Retirar dinero.");
		System.out.println("3. Consultar saldo.");
		System.out.println("4. Salir.");
		System.out.println("Introduzca la opción deseada: ");
		opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			ingresarDinero();
			break;
		case 2:
			retirarDinero();
			break;
		case 3:
			consultarSaldo();
			break;
		case 4:
			System.out.println("Gracias por usar el menú interactivo. Vuelva pronto");
			break;
		default:
			System.out.println("Opción inválida");
			break;
		}
		return opcion;
	}

	private static void ingresarDinero() {

		System.out.println("Indica la cantidad que desea ingresar: ");
		double cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Indique el tipo de tarjeta (Física o Virtual): ");
		String tipo = entrada.next().toUpperCase();

		try {
			TipoTarjeta tarjeta = TipoTarjeta.valueOf(tipo);
			cuenta.ingresar(cantidad, tarjeta);
		} catch (Exception e) {
			System.out.println("Tipo de tarjeta incorrecto.");
		}

	}

	private static void retirarDinero() {

		System.out.println("Indique la cantidad que desee retirar: ");
		double cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Indique el tipo de tarjeta (Física o Virtual): ");
		String tipo = entrada.next().toUpperCase();

		try {
			TipoTarjeta tarjeta = TipoTarjeta.valueOf(tipo);
			cuenta.retirar(cantidad, tarjeta);
		} catch (Exception e) {
			System.out.println("Tipo de tarjeta incorrecto.");
		}

	}

	private static void consultarSaldo() {

		double saldoActual = cuenta.getSaldo();
		System.out.println("Su saldo actual es: " + saldoActual + " euros.");

	}

	private static void mostrarResumen() {
		
				
		List<Operacion> operaciones = cuenta.getOperaciones();
		
		for (int i = 0; i < operaciones.size(); i++) {
			Operacion operacion = operaciones.get(i);
			System.out.println(operacion);
			
			try {
				
				if(operacion.isEsIngreso() && operacion.getImporte() > 500) {
					guardarEnArchivo("ingresos.txt", operacion);
				}else if (!operacion.isEsIngreso() && operacion.getImporte() > 400){
					guardarEnArchivo("retiros.txt", operacion);
				}
				
			} catch (Exception e) {
				System.out.println("Error al guarda el archivo.");
			}
		}

	}

	private static void guardarEnArchivo(String archivoNombre, Operacion operacion) throws IOException {

		File archivo = new File("src/" + archivoNombre);
		FileWriter escritor = new FileWriter(archivo, true);
		escritor.write(operacion.getFechaHora() + " - " + operacion.getImporte() + "€ - " + operacion.getTarjeta() + "\n");
		escritor.close();
	}

}




















