package unidades.unidad6.tareas.piezasYProveedores;

public class MainConDatos {

	public static void main(String[] args) {
		
		DatosBD datos = new DatosBD();   // Simulación de una fuente de datos
		
		Pieza piezas [];
		Proveedores proveedores [];
		Suministro2 suministros [];
		
		// Simulamos la carga de los datos de las tablas
		
		piezas = datos.piezas;     			  // SELECT * FROM PIEZAS
		proveedores = datos.proveedores;  	  // SELECT * FROM PROVEEDORES
		suministros = datos.suministros;      // SELECT * FROM SUMINISTROS
		
		
		
		mostrarPiezas(piezas);
		mostrarProveedores(proveedores);
		mostrarSuministros(suministros);
		
		
		
		mostrarSuministros(obtenerSuministrosPorProveedor(suministros, 106));
		
		
		
	}
	
		private static Suministro2[] obtenerSuministrosPorProveedor(Suministro2[] suministros, int idProveedor)
		{
			Suministro2[] suministrosProveedor = new Suministro2[100];
			int numElementos=0;
			
			
			for(int i=0;i<suministros.length;i++) {
				Proveedores proveedor = suministros[i].getProveedor();
				int idProvedorActual = proveedor.getId();
				if(idProvedorActual==idProveedor) {
					suministrosProveedor[numElementos]=suministros[i];
					numElementos++;
				}
			}
			
			
			return suministrosProveedor;
			
		}
		private static void mostrarPiezas(Pieza[] piezas) {
			
			 System.out.println("\n------PIEZAS------\n");
				for (int i = 0; i < piezas.length; i++) {
					if (piezas [i] != null) {
					System.out.println(piezas [i]);
					}
				}
		}
		
		
		private static void mostrarProveedores(Proveedores[] proveedores) {
			System.out.println("\n------PROVEEDORES------\n");
			for (int i = 0; i < proveedores.length; i++) {
				if (proveedores [i] != null) {
					System.out.println(proveedores [i]);
				}
			}
		}
		
		private static void mostrarSuministros(Suministro2[] suministros) {
			
			System.out.println("\n------SUMINISTROS------\n");
			for (int i = 0; i < suministros.length; i++) {
				if (suministros [i] != null) {
					System.out.println(suministros [i]);
				}
			}
		}

}
