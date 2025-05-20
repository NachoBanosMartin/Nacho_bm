package unidades.unidad11.ejemplos.itv;

public class Main {

	public static void main(String[] args) {
		

		Vehiculo vehiculo1 = new Vehiculo ("2345-JYD", "Volvo", "V40", 20000.56);
		Vehiculo vehiculo2 = new Vehiculo ("7654-HYT", "Audi", "A1", 127828.56);
		Vehiculo vehiculo3 = new Vehiculo ("9836-OKL", "Kia", "Sportage", 543672.56);
		
		Inspeccion inspeccionV1 = new Inspeccion ("Direccion", Deficiencia.Ok, "Hasta la próxima revisión");
		Inspeccion inspeccionV2 = new Inspeccion ("Frenos", Deficiencia.Leve, "Revisar pastillas de freno");
		Inspeccion inspeccionV3 = new Inspeccion ("Emisiones Contaminantes", Deficiencia.Muy_Grave, "Emisión por las nubes");

		
		
		System.out.println(vehiculo2);
		System.out.println(inspeccionV2);
	}

}
