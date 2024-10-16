package unidades.unidad2.ejemplos;

public class ImprimiendoConFormato {

	public static void main(String[] args) {
		
		double cantidad= 828348.345;
		int valorEntero=56;
		String valorCadena= ("Estamos en clase de Programación");
		
			
		System.out.printf("Total es: %,.2f $%n", cantidad);
		System.out.printf("Total es: %-10.2f", cantidad);
		
		int numeroBinario = 0b100101;
		System.out.printf("El numero en decimal es: %d%n", numeroBinario);
		System.out.printf("El numero en decimal es: %s%n", Integer.toBinaryString(valorEntero));
		double nd = 123.94536;
		System.out.printf("\t%.3f%n\t%.3e%n\t%.3g%n", nd, nd, nd);
	}
}

