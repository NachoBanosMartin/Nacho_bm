package unidades.unidad2.ejemplos;

public class Números {

	public static void main(String[] args) {
		
		//Número binario
		
		short binario= 0b0101;
		short binario2= 0b0_1_0_1;
		long binario3= 0b1010_000_1111_1110;
		long hex= 0xFF_EC_DC_5E;
		int octal= 07_7_5_2;
		
		
		int binarioSuma= 0b0_1_0_0+ 0b0_1_0_1;
		System.out.println("suma:" +binarioSuma);
		
		long hex1= 0xA;
		long hex2= 0x5;
		long sumaHex= hex1 + hex2;
		System.out.println("\nsuma:" +sumaHex);

	
		
		
		

	}

}
