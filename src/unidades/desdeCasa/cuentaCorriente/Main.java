package unidades.desdeCasa.cuentaCorriente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static final Scanner entrada = new Scanner(System.in);
	public static final Cuenta cuenta = new Cuenta();

	public static void main(String[] args) {

		int opcion = 0;
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1:
				ingresar();
				break;
			case 2:
				retirar();
				break;
			case 3:
				consultarSaldo();
				break;
			case 4:
				System.out.println("Gracias por usar el simulador de cuenta corriente");
				break;
			default:
				System.out.println("Opción incorrecta.");
			}

		} while (opcion != 4);

	}

	private static int mostrarMenu() {
		System.out.println("-------MENÚ-------");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Salir");
		System.out.print("Elige una opción: ");
		return entrada.nextInt();
	}

	private static void ingresar() {
		System.out.println("Indique la cantidad a ingresar: ");
		double cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Indique el tipo de tarjeta que utilizará: ");
		String tarjeta = entrada.nextLine();

		if (cuenta.ingresar(cantidad, tarjeta)) {
			System.out.println("Ingreso realizado con éxito.");
			if (cantidad > 500) {
				guardarEnArchivo("ingresos", cuenta.getOperaciones().get(cuenta.getOperaciones().size() - 1));
			}
		} else {
			System.out.println("Importe inválido.");
		}
	}

	private static void retirar() {
		System.out.println("Indique la cantidad a retirar: ");
		double cantidad = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Indique el tipo de tarjeta que utilizará: ");
		String tarjeta = entrada.nextLine();

		if (cuenta.retirar(cantidad, tarjeta)) {
			System.out.println("Ingreso realizado con éxito.");
			if (cantidad > 400) {
				guardarEnArchivo("retiros", cuenta.getOperaciones().get(cuenta.getOperaciones().size() - 1));
			}
		} else {
			System.out.println("No se pudo realizar el retiro. Verifica el saldo o el importe.");
		}

	}

	private static void consultarSaldo() {
		System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
	}

    private static void guardarEnArchivo(String tipo, Operacion operacion) {

    	LocalDateTime fecha = operacion.getFechahora();
        String carpeta = tipo + "_" + fecha.getDayOfMonth() + "_" + fecha.getMonthValue();
        File directorio = new File(carpeta);
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        String archivo = tipo.equals("ingresos") ? "ingresos.txt" : "retiros.txt";

        try (FileWriter writer = new FileWriter(new File(directorio, archivo), true)) {
            writer.write(operacion.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }
}
