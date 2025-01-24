package unidades.unidad6.tareas.piezasYProveedores;

public class Main {

	public static void main(String[] args) {
		
		Pieza pieza1 = new Pieza (1000, "Tornillo");
		Pieza pieza2 = new Pieza (1001, "Tuerca");
		
		Pieza [] piezas = new Pieza [2];
		
		piezas[0] = pieza1;
		piezas[1] = pieza2;

		Proveedores proveedor1 = new Proveedores (1, "Tyndal");
		Proveedores proveedor2 = new Proveedores (2, "Ibn");
		
		Proveedores [] proveedores = new Proveedores [2];
		
		proveedores[0] = proveedor1;
		proveedores[1] = proveedor2;
		
		Suministro suministro1 = new Suministro (1000, 2, 20, 12.23);
		Suministro suministro2 = new Suministro (1033, 4, 30, 14.02);
		Suministro suministro3 = new Suministro (1070, 5, 60, 52.34);
		Suministro suministro4 = new Suministro (1040, 3, 10, 13.65);
		
		Suministro [] suministros = new Suministro [4];
		
		suministros[0] = suministro1;
		suministros[1] = suministro2;
		suministros[2] = suministro3;
		suministros[3] = suministro4;
		
		// opción 1

		Datos datos = new Datos();
		Pieza [] tablaPiezas = datos.piezas;
		Proveedores [] tablaProveedores = datos.proveedores;
		Suministro [] tablaSuministros = datos.suministros;
		
		// opción 2
		/*
		Pieza [] tablaPiezas = DatosPiezas.obtenerPiezas();
		Proveedor [] tablaProveedores = datos.proveedores.obtenerProveedores();
		Suministro [] tablaSuministros = datos.suministros.obtenerSuministros();
		*/
		
		System.out.println("\n------PIEZAS------\n");
		for (int i = 0; i < piezas.length; i++) {
			if (piezas[i] != null) {
				System.out.println(piezas[i]);
			}
		}
		
		System.out.println("\n------PROVEEDORES------\n");
		for (int i = 0; i < proveedores.length; i++) {
			if (proveedores[i] != null) {
				System.out.println(proveedores[i]);
			}
		}
		
		System.out.println("\n------SUMINISTROS------\n");
		for (int i = 0; i < suministros.length; i++) {
			if (suministros[i] != null) {
				System.out.println(suministros[i]);
			}
		}
	}

}
