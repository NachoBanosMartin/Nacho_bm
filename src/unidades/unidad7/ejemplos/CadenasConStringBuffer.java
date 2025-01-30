package unidades.unidad7.ejemplos;

public class CadenasConStringBuffer {

	public static void main(String[] args) {
		
		
		StringBuffer sbfVacio = new StringBuffer();
		StringBuffer sbf = new StringBuffer("Desarrollo de aplicaciones web");
		StringBuilder sbb = new StringBuilder("Desarrollo de aplicaciones multiplataforma");

		System.out.println("Longitud: " + sbfVacio.length());
		System.out.println("Longitud: " + sbf.length());
		System.out.println("Longitud: " + sbb.length());
		
		System.out.println("Capacidad: " + sbfVacio.capacity());
		System.out.println("Capacidad: " + sbf.capacity());
		System.out.println("Capacidad: " + sbb.capacity());
		System.out.println("Al revés: " + sbb.reverse());
		
		StringBuffer sbfVacio2 = new StringBuffer();
		sbfVacio2.append("Desarrollo aplicaciones en");
		sbfVacio2.append(" web");
		sbfVacio2.insert(11, "de ");
		sbfVacio2.delete(27, 30);
		
		System.out.println(sbfVacio2);
		
		String ciclo = "Desarrollo de aplicaciones web";
		ciclo = ciclo + " web";
	}

}

