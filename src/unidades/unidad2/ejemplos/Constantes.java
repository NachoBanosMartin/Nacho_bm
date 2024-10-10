package unidades.unidad2.ejemplos;

public class Constantes {

	public static void main(String[] args) {
		
		final double IRPF= 0.19;
		
		String nombre= "Ana";
		double sueldo_bruto= 6000;		
		double sueldo_neto= sueldo_bruto*(1-IRPF);
		
		System.out.println(nombre+" va a cobrar este mes:"+ sueldo_neto);
		
		String nombre2= "Tomás";
		double sueldo_bruto2= 4000;		
		double sueldo_neto2= sueldo_bruto2*(1-IRPF);
		
		System.out.println(nombre2+" va a cobrar este mes:"+ sueldo_neto2);


	}

}
