package verano.clase.tareasCurso.piezasProveedores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Pieza pieza1 = new Pieza(101, "Tornillo");
		Pieza pieza2 = new Pieza(102, "Clavo");
		Pieza pieza3 = new Pieza(103, "Arandela");

		Proveedor proveedor1 = new Proveedor(01, "Bruce");
		Proveedor proveedor2 = new Proveedor(02, "Arthur");
		Proveedor proveedor3 = new Proveedor(03, "Anna");

		Suministro suministro1 = new Suministro(101, 01, 100, 0.05);
		Suministro suministro2 = new Suministro(101, 02, 150, 0.04);
		Suministro suministro3 = new Suministro(102, 03, 200, 0.06);

		ArrayList<Pieza> piezas = new ArrayList<>();
		piezas.add(pieza1);
		piezas.add(pieza2);
		piezas.add(pieza3);

		ArrayList<Proveedor> proveedores = new ArrayList<>();
		proveedores.add(proveedor1);
		proveedores.add(proveedor2);
		proveedores.add(proveedor3);

		ArrayList<Suministro> suministros = new ArrayList<>();
		suministros.add(suministro1);
		suministros.add(suministro2);
		suministros.add(suministro3);

		System.out.println("------PIEZAS------");

		for (Pieza pieza : piezas) {
			System.out.println(pieza);
		}

		System.out.println("\n------PROVEEDORES------");

		for (Proveedor proveedor : proveedores) {
			System.out.println(proveedor);
		}

		System.out.println("\n------SUMINISTROS------");

		for (Suministro suministro : suministros) {
			System.out.println(suministro);
		}

		int codigoBuscado = 101;
		System.out.println("PROVEEDOR MÁS BARATO PARA LA PIEZA " + codigoBuscado + ":");
		Proveedor proveedorMasBarato = encontrarProveedorMasBarato(codigoBuscado, suministros, proveedores);
		if (proveedorMasBarato != null) {
			System.out.println("Proveedor más barato: " + proveedorMasBarato);
		} else {
			System.out.println("No se encontró proveedor para esa pieza.");
		}

	}

	public static Proveedor encontrarProveedorMasBarato(int codigoPieza, ArrayList<Suministro> suministros,
			ArrayList<Proveedor> proveedores) {
		Suministro masBarato = null;

		// Buscar el suministro con menor precio para esa pieza
		for (Suministro suministro : suministros) {
			if (suministro.getCodigoPieza() == codigoPieza) {
				if (masBarato == null || suministro.getPrecio() < masBarato.getPrecio()) {
					masBarato = suministro;
				}
			}
		}

		// Si se encontró el suministro más barato, buscar el proveedor correspondiente
		if (masBarato != null) {
			for (Proveedor proveedor : proveedores) {
				if (proveedor.getId() == masBarato.getIdProveedor()) {
					return proveedor;
				}
			}
		}

		// Si no se encontró nada, devolver null
		return null;
	}
}