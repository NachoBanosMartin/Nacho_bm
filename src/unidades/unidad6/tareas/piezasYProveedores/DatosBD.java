package unidades.unidad6.tareas.piezasYProveedores;

import java.util.Random;

public class DatosBD {
	
	public static final int NUM_PIEZAS = 10;
	public static final int NUM_PROVEEDORES = 10;
	public static final int NUM_SUMINISTROS = 10;

	public static final int CANTIDAD_MINIMA_SUMINISTRO = 10;
    public static final int CANTIDAD_MAXIMA_SUMINISTRO = 100;
    
	public Pieza[] piezas = new Pieza[10];
    public Proveedores[] proveedores = new Proveedores[10];
    public Suministro2[] suministros = new Suministro2[100];
    


    public DatosBD() {
    	
        // Inicializar piezas con datos reales
        piezas[0] = new Pieza(1, "Tornillo");
        piezas[1] = new Pieza(2, "Tuerca");
        piezas[2] = new Pieza(3, "Arandela");
        piezas[3] = new Pieza(4, "Clavo");
        piezas[4] = new Pieza(5, "Resorte");
        piezas[5] = new Pieza(6, "Engranaje");
        piezas[6] = new Pieza(7, "Rodamiento");
        piezas[7] = new Pieza(8, "Perno");
        piezas[8] = new Pieza(9, "Bisagra");
        piezas[9] = new Pieza(10, "Remache");

        // Inicializar proveedores con datos reales
        proveedores[0] = new Proveedores(101, "Proveedor A");
        proveedores[1] = new Proveedores(102, "Proveedor B");
        proveedores[2] = new Proveedores(103, "Proveedor C");
        proveedores[3] = new Proveedores(104, "Proveedor D");
        proveedores[4] = new Proveedores(105, "Proveedor E");
        proveedores[5] = new Proveedores(106, "Proveedor F");
        proveedores[6] = new Proveedores(107, "Proveedor G");
        proveedores[7] = new Proveedores(108, "Proveedor H");
        proveedores[8] = new Proveedores(109, "Proveedor I");
        proveedores[9] = new Proveedores(110, "Proveedor J");

        // Inicializar suministros con datos reales
       Random randomPieza = new Random();
       for (int i = 0; i < suministros.length; i++) {
    	   Pieza pieza = piezas [randomPieza.nextInt(NUM_PIEZAS)];
    	   Proveedores proveedor = proveedores [randomPieza.nextInt(NUM_PROVEEDORES)];
    	   int cantidad = CANTIDAD_MINIMA_SUMINISTRO + randomPieza.nextInt(CANTIDAD_MAXIMA_SUMINISTRO);
    	   double precio = 0.50 + (randomPieza.nextDouble() * 9.50);
    	   precio = Math.round(precio * 100)/100;
    	   
    	   suministros [i] = new Suministro2 (pieza, proveedor, cantidad,precio);
       }
       
      
    }
}