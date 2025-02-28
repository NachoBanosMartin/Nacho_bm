package unidades.unidad6.ejercicios.ejercicioPiezasYProveedores;

public class Main {

	public static void main(String[] args) {
		
		// Creación de 2 instancias por cada clase

		Piezas pieza1 = new Piezas (23, "Tornillo");
		Piezas pieza2 = new Piezas (17, "Tuerca");
		
		Proveedores proveedor1 = new Proveedores (023, "Panorámix");
		Proveedores proveedor2 = new Proveedores (017, "Asterix");

		Suministra suministro1 = new Suministra (23, 023, 23.5);
		Suministra suministro2 = new Suministra (17, 017, 17.4);
		
        // Imprimir por pantalla
		
        System.out.println("----Piezas----");
        System.out.println(pieza1);
        System.out.println(pieza2);
        System.out.println("\n----Proveedores----");
        System.out.println(proveedor1);
        System.out.println(proveedor2);
        System.out.println("\n----Suministra----");
        System.out.println(suministro1);
        System.out.println(suministro2);
        
        // Encontrar el proveedor más barato     

        Suministra suministroMasBarato = encontrarSuministroMasBarato(suministro1, suministro2);
        System.out.println("\nEl suministro más barato es: " + suministroMasBarato);
        
    }	

    public static Suministra encontrarSuministroMasBarato(Suministra suministro1, Suministra suministro2) {
        if (suministro1.getPrecio() < suministro2.getPrecio()) {
            return suministro1;
        } else {
            return suministro2;
        }
	}
        
}


